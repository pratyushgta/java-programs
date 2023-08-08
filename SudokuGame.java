import java.io.*;
import java.util.*;

public class SudokuGame {
    private static SudokuGame game;
    static int[][] board = new int[9][9];
    static char[][] boardConvert = new char[9][9];
    static char[][] Sudokuinput;

    /////////////////////
    private static boolean isValid(int[][] board, int row, int col, int num) {

        for (int i = 0; i < 9; i++) {
            if (board[row][i] == num || board[i][col] == num) {
                return false;
            }
        }

        int boxRow = (row / 3) * 3;

        int boxCol = (col / 3) * 3;
        for (int i = boxRow; i < boxRow + 3; i++) {
            for (int j = boxCol; j < boxCol + 3; j++) {
                if (board[i][j] == num) {
                    return false;
                }
            }
        }
        return true;
    }

    public void GenerateBoard() {
        GenerateBoardHelper(board, 0, 0);
    }

    /////////////////////Generate board helper code/////////////////////
    private static boolean GenerateBoardHelper(int[][] board, int row, int col) {
        if (row == 9) {
            return true;
        }
        int nextRow = (col == 8) ? row + 1 : row;
        int nextCol = (col + 1) % 9;
        if (board[row][col] != 0) {
            return GenerateBoardHelper(board, nextRow, nextCol);
        }
        List<Integer> options = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            if (isValid(board, row, col, i)) {
                options.add(i);
            }
        }
        Collections.shuffle(options);
        for (int num : options) {
            board[row][col] = num;
            if (GenerateBoardHelper(board, nextRow, nextCol)) {
                return true;
            }
        }
        board[row][col] = 0;
        return false;
    }

    /////////////////////Display Board Code/////////////////////
    public void DisplayBoard() {
        int hideHor = 0;
        int hideVer = 0;
        for (int i = 0; i < 9; i++) {
            if (i % 3 == 0 && i != 0) {
                System.out.println("---------------------");
            }
            for (int j = 0; j < 9; j++) {
                if (j % 3 == 0 && j != 0) {
                    System.out.print("| ");
                }
                if (board[i][j] == 0) {
                    System.out.print("  ");
                } else {
                    if (hideHor < 6 && hideVer < 6) {
                        if (Math.random() >= 0.5) {
                            //System.out.print('\u2610'+" ");
                            System.out.print("_ ");
                            hideHor++;
                            hideVer++;
                        } else {
                            System.out.print(board[i][j] + " ");
                        }
                    } else {
                        System.out.print(board[i][j] + " ");
                    }
                }
            }
            hideHor = 0;
            hideVer = 0;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        SudokuGame.game = new SudokuGame();

        game.GenerateBoard();

        game.DisplayBoard();


        for (int i = 0; i <= game.board.length - 1; i++) { //this checks it horizontally for dublicated numbers
            for (int j = 0; j <= game.board[i].length - 1; j++) {
                boardConvert[i][j] = Integer.toString(game.board[i][j]).charAt(0);
            }

        }
        //boardConvert[1][1] = 1;
        //boardConvert[1][2] = 1;


    }

    public static void takeInput() throws IOException {
        Sudokuinput = input();
        if (Uservalid(Sudokuinput)) {
            System.out.println("Is Valid");
        } else {
            System.out.println("Is not Valid");
        }
    }
    /////////////////////User INPUT code/////////////////////

    public static char[][] input() throws IOException {
        char[][] inputUser = new char[9][9];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i <= inputUser.length - 1; i++) {
            for (int j = 0; j <= inputUser[i].length - 1; j++) {
                inputUser[i][j] = br.readLine().charAt(0);
            }
            br.readLine();
        }

        return inputUser;
    }

    /////////////////////User INPUT Validation code/////////////////////

    public static boolean Uservalid(char[][] board) {
        int[] counter = new int[9]; //initializing a counter with 10 empty spaces
        //check each row
        for (int i = 0; i <= board.length - 1; i++) { //this checks it horizontally for dublicated numbers
            counter = new int[9];
            for (int j = 0; j <= board[i].length - 1; j++) {
                char c = board[i][j];
                if (c != '.') {
                    int num = c - '0';
                    counter[num]++;
                    if (counter[num] > 1) {
                        return false;
                    }
                }
            }
        }
        // Check each column
        for (int i = 0; i < 9; i++) {
            counter = new int[9];
            for (int j = 0; j < 9; j++) {
                char c = board[j][i];
                if (c != '.') {
                    int num = c - '0';
                    counter[num]++;
                    if (counter[num] > 1) {
                        return false;
                    }
                }
            }
        }

        // Check each 3x3 sub-box
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                counter = new int[9];
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        char c = board[i + k][j + l];
                        if (c != '.') {
                            int num = c - '0';
                            counter[num]++;
                            if (counter[num] > 1) {
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
}

