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
        if (col >= N)
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
        int tempR = r;
        int tempC = c;

        for (int i = 0; i < c; i++) {
            if (board[r][i] == 1)
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
        while (tempC >= 0 && tempR < N) {
            if (board[tempR][tempC] == 1)
                return false;
            tempR++;
            tempC--;
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
