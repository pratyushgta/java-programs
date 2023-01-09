/**
 * This class contains methods for performing I/O in Arrays
 * DAA-E3-Q2
 * @author Pratyush Kumar (github.com/pratyushgta)
 */

package Year2;
import java.util.Scanner;
public class Knapsack {

    static void bubble_sort(double[] w, double[] p) {
        int size = p.length;
        for (int i = 0; i < size; i++) {
            for (int j = 1; j < (size - i); j++) {
                if (p[j - 1] < p[j]) {
                    double temp_p = p[j - 1];
                    p[j - 1] = p[j];
                    p[j] = temp_p;

                    double temp_w = w[j - 1];
                    w[j - 1] = w[j];
                    w[j] = temp_w;
                }

            }
        }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double [] weights;
        double [] profit;
        double [] x = new double[3];
        double total_w=0.0;
        int n = 0;


        System.out.print("Enter size: ");
        n = sc.nextInt();
        weights = new double[n];
        profit = new double[n];
        System.out.print("Enter total weight: ");
        total_w = sc.nextInt();

        System.out.println("\n>>>>Input Weights & Profits<<<<\n");
        for(int i=0;i<n;i++){
            System.out.print("Enter weight "+(i+1)+": ");
            weights[i] = sc.nextInt();
            System.out.print("Enter profit "+(i+1)+": ");
            profit[i] = sc.nextInt();
            System.out.println();
        }
        bubble_sort(weights,profit);
        int j = 0;
        double sum_w = 0;
        while(sum_w < total_w){
            if(weights[j] + sum_w < total_w){
                x[j] = 1;
                sum_w += weights[j];
            }
            else {
                x[j] = (double) Math.round(((total_w-sum_w)/weights[j])*100)/100;//(total_w-sum_w)/weights[j];
                sum_w = total_w;
                break;
            }
            j++;
        }

        for(int i=0;i<n;i++){
            System.out.print(x[i]+"\t");
        }
    }
}
