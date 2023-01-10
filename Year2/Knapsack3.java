/**
 * This class contains methods for Knapsack problem in increasing order of weights
 * DAA-E3-Q2
 *
 * @author Pratyush Kumar (github.com/pratyushgta)
 */

package Year2;

import java.util.Scanner;

public class Knapsack3 {

    static void bubble_sort(double[] w, double[] p) { //w = weights p = profit
        int size = w.length;
        for (int i = 0; i < size-1; i++) {
            for (int j = 0; j < (size - i - 1); j++) {
                if (w[j] > w[j+1]) {
                    double temp_w = w[j];
                    w[j] = w[j+1];
                    w[j+1] = temp_w;

                    double temp_p = p[j];
                    p[j] = p[j+1];
                    p[j+1] = temp_p;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] weights;
        double[] profit;
        double[] x;
        double total_w; //to store sum of weights
        int n; //to store size

        //Inputs
        System.out.print("****Knapsack problem in decreasing order of profits****Enter size: ");
        n = sc.nextInt();
        weights = new double[n];
        profit = new double[n];
        x = new double[n];

        System.out.print("Enter total weight: ");
        total_w = sc.nextInt();

        System.out.println("\n>>>>Input Weights & Profits<<<<\n");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter weight " + (i + 1) + ": ");
            weights[i] = sc.nextInt();
            System.out.print("Enter profit " + (i + 1) + ": ");
            profit[i] = sc.nextInt();
            System.out.println();
        }

        //Sorting P & W arrays according to increasing order of weights
        bubble_sort(weights, profit);

        //Knapsack Greedy Algo
        int j = 0;
        double sum_w = 0;
        while (sum_w < total_w) {
            if (weights[j] + sum_w < total_w) {
                x[j] = 1;
                sum_w += weights[j];
            } else {
                x[j] = (total_w - sum_w) / weights[j]; //(double) Math.round(((total_w-sum_w)/weights[j])*100)/100;
                System.out.println(total_w+" "+sum_w+" "+weights[j]);
                sum_w = total_w;
                break;
            }
            j++;
        }

        //Calculating Profits
        double total_profit = 0;
        for(int i=0;i<n;i++){
            total_profit += profit[i]*x[i];
        }

        //Output
        System.out.print("Value of x: ");
        for (int i = 0; i < n; i++) {
            System.out.print(x[i] + "\t\t");
        }
        System.out.println("\nTotal profit: "+total_profit);
    }
}
