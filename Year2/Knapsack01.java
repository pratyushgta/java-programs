/**
 * This class contains methods for 0/1 Knapsack problem
 * DAA
 *
 * @author Pratyush Kumar (github.com/pratyushgta)
 */
package Year2;

import java.util.Scanner;

public class Knapsack01 {

    static void bubble_sort(int[] w, int[] p) { //w = weights p = profit
        int size = w.length;
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < (size - i - 1); j++) {
                if (w[j] > w[j + 1]) {
                    int temp_r = w[j];
                    w[j] = w[j + 1];
                    w[j + 1] = temp_r;

                    int temp_p = p[j];
                    p[j] = p[j + 1];
                    p[j + 1] = temp_p;

                }

            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] weights;
        int[] prices;
        int[] x;
        int total_w; //to store sum of weights
        int n; //to store size


        System.out.print("Enter the number of items: ");
        n = sc.nextInt();

        weights = new int[n];
        prices = new int[n];
        x = new int[n];

        System.out.print("Enter total weight: ");
        total_w = sc.nextInt();

        System.out.println("\n>>>>Input Weights & Profits<<<<\n");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter weight " + (i + 1) + ": ");
            weights[i] = sc.nextInt();
            System.out.print("Enter price " + (i + 1) + ": ");
            prices[i] = sc.nextInt();
            System.out.println();
        }

        int[][] t = new int[n + 1][total_w + 1]; // Initialize the dynamic programming table

        bubble_sort(weights,prices);

        //Filling the table
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= total_w; j++) {
                // If the weight of the current item is greater than the current maximum weight, skip the item
                if (weights[i - 1] > j) {
                    t[i][j] = t[i - 1][j];
                }
                // Else take the maximum of the value of not taking the item vs taking the item
                else {
                    t[i][j] = Math.max(t[i - 1][j], t[i - 1][j - weights[i - 1]] + prices[i - 1]);
                }
            }
        }

        //Combination of weights to be selected
        int rem_wt = t[n][total_w];
        for (int i = n; i > 0; i--) {
            for (int j = total_w; j > 0; j--) {
                if (t[i][j] != t[i - 1][j] && t[i][j] == rem_wt) {
                    x[i - 1] = 1;
                    rem_wt = t[i][j] - weights[i - 1];
                    break;
                } else if (t[i][j] == t[i - 1][j] && t[i][j] == rem_wt) {
                    x[i - 1] = 0;
                }
            }
            //ALTERNATE METHOD
            /*if (t[i][rem_wt] != t[i - 1][rem_wt]) {
                x[i - 1] = 1;
                rem_wt = rem_wt - weights[i - 1];
            }*/
        }

        //printing the table
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= total_w; j++) {
                System.out.print(t[i][j] + "  ");
            }
            System.out.println();
        }

        //printing the feasible solution
        System.out.print("\nValue of x: ");
        for (int i = 0; i < n; i++) {
            System.out.print(x[i] + "\t\t");
        }

        System.out.println("\nTotal profit: " + t[n][total_w]);
    }

}

