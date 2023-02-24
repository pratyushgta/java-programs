package Year2;

import java.util.Scanner;

public class BacktrackingQueens {
    public static int N;

    boolean findQueens(int[][] board, int row) {
        if (row == N)
            return true;
        for (int col = 0; col < N; col++) {
            if (isValid(board, row, col)) {
                board[row][col] = 1;
                if (findQueens(board, row + 1))
                    return true;
                board[row][col] = 0;
            }
        }
        return false;
    }

    boolean isValid(int[][] board, int r, int c) {
        int tempR = r;
        int tempC = c;

        for (int i = 0; i < r; i++) {
            if (board[i][c] == 1)
                return false;
        }

        while (tempR >= 0 && tempC >= 0) {
            if (board[tempR][tempC] == 1)
                return false;
            tempR--;
            tempC--;
        }

        tempR = r;
        tempC = c;
        while (tempC >= 0 && tempR < board.length) {
            if (board[tempR][tempC] == 1)
                return false;
            tempR++;
            tempC--;
        }
        return true;
    }

    public static void main(String[] args) {
        BacktrackingQueens ob = new BacktrackingQueens();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of queens: ");
        N = sc.nextInt();

        int[][] board = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                board[i][j] = 0;
            }
        }
        ob.findQueens(board, 0);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(" " + board[i][j]
                        + " ");
            System.out.println();
        }

    }
}
