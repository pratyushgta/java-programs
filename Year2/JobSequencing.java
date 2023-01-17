/**
 * This class contains methods for implementing Job Sequencing using Greedy Algorithm
 * DAA-E4-Q2
 *
 * @author Pratyush Kumar (github.com/pratyushgta)
 */


package Year2;

import java.util.Scanner;

public class JobSequencing {
    static void bubble_sort(int[] d, int[] p, int[] job) { //d = deadlines p = profit
        int size = p.length;
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < (size - i - 1); j++) {
                if (p[j] < p[j + 1]) {
                    int temp_p = p[j];
                    p[j] = p[j + 1];
                    p[j + 1] = temp_p;

                    int temp_d = d[j];
                    d[j] = d[j + 1];
                    d[j + 1] = temp_d;

                    int temp_job = job[j];
                    job[j] = job[j + 1];
                    job[j + 1] = temp_job;
                }

            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] duration;
        int[] profit;
        int[] job;
        int[] x;
        int n; //to store size

        //Inputs
        System.out.print("Enter size: ");
        n = sc.nextInt();
        duration = new int[n];
        profit = new int[n];
        job = new int[n];
        x = new int[n];

        System.out.println("\n>>>>Input Durations & Profits<<<<\n");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter duration " + (i + 1) + ": ");
            duration[i] = sc.nextInt();
            System.out.print("Enter profit " + (i + 1) + ": ");
            profit[i] = sc.nextInt();
            System.out.println();
            job[i] = i+1;
        }

        //Sorting D, P, J arrays according to decreasing increasing order of profits
        bubble_sort(duration, profit, job);

        //Finding largest duration
        int max = duration[0];
        for(int i = 1; i<n; i++){
            if(duration[i] > max){
                max = duration[i];
            }
        }

        //Job Sequencing algorithm
        for(int i=0;i<n;i++){
            for(int j=duration[i]-1;j>=0;j--){
                if(x[j] == 0){
                    x[j] = job[i];
                }
            }
        }

        //Calculating Profits
        double total_profit = 0;
        for(int i=0;i<max;i++){
            for(int j=0;j<n;j++){
                if(x[i] == job[j])
                    total_profit += profit[j];
            }
        }

        System.out.print("\nJob Sequence: ");
        for(int i=0;i<max;i++){
            System.out.print("J"+x[i]+"  ");
        }
        System.out.println("\nTotal profit: "+total_profit);
    }
}
