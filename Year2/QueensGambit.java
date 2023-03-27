/**
 * These classes contain methods for implementing n-Queens problem using backtracking algorithm
 * DAA-E9
 * NOTE: Instead of iterating over the rows, iterate over the columns.
 * This ensures that the solutions are generated in lexicographic order.
 *
 * @author Pratyush Kumar (github.com/pratyushgta)
 */

package Year2;


import java.util.Scanner;

public class QueensGambit {
    public static int N;

    boolean findQueens(int[][] board, int col) {
        if (col >= N) //check if all columns have been filled
            return true;
        for (int row = 0; row < N; row++) {
            if (isValid(board, row, col)) {
                board[row][col] = 1;
                if (findQueens(board, col + 1))
                    return true;
                board[row][col] = 0;
            }
        }
        return false;
    }

    boolean isValid(int[][] board, int r, int c) {
        //checking row attacks/ horizontal/ Left - Right
        for (int i = 0; i < c; i++) {
            if (board[r][i] == 1)
                return false;
        }
        //checking column attacks/ vertical/ Up - Down
        for(int i=0;i<r;i++){
            if(board[i][c]==1)
                return false;
        }

        //upper left diagonal
        int tempR = r;
        int tempC = c;
        while (tempR >= 0 && tempC >= 0) {
            if (board[tempR][tempC] == 1)
                return false;
            tempR--;
            tempC--;
        }

        //upper right diagonal
        tempR = r;
        tempC = c;
        while (tempR >= 0 && tempC < N) {
            if (board[tempR][tempC] == 1)
                return false;
            tempR--;
            tempC++;
        }


        //lower left diagonal
        tempR = r;
        tempC = c;
        while (tempC >= 0 && tempR < N) {
            if (board[tempR][tempC] == 1)
                return false;
            tempR++;
            tempC--;
        }

        //lower right diagonal
        tempR = r;
        tempC = c;
        while (tempC  < N && tempR < N) {
            if (board[tempR][tempC] == 1)
                return false;
            tempR++;
            tempC++;
        }

        return true;
    }

    public static void main(String[] args) {
        QueensGambit ob = new QueensGambit();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of queens: ");
        N = sc.nextInt();

        int[][] board = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                board[i][j] = 0;
            }
        }

        if (ob.findQueens(board, 0)) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++)
                    System.out.print(" " + board[i][j] + " ");
                System.out.println();
            }
        } else {
            System.out.println("No solution exists for the given board size");
        }

    }
}
