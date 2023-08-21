/**
 * This class contains methods for implementing Priority scheduling algorithm
 * OS-5
 *
 * @author Pratyush Kumar (github.com/pratyushgta)
 */
package Year3;

import java.util.Scanner;

public class PrioritySA {
    public static void main(String[] args) {
        int[] P;
        int[] BT;
        int[] AT;
        int[] WT;
        int[] TAT;
        int[] CT;
        int[] PR;
        int n;
        int[] completed; // array to store executed processes

        Scanner sc = new Scanner(System.in);

        //Inputs
        System.out.print("Enter size: ");
        n = sc.nextInt();
        P = new int[n];
        BT = new int[n];
        AT = new int[n];
        WT = new int[n];
        TAT = new int[n];
        CT = new int[n];
        PR = new int[n];
        completed = new int[n];

        System.out.println("\n>>>>Input BT & AT<<<<\n");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter BT " + (i + 1) + ": ");
            BT[i] = sc.nextInt();
            System.out.print("Enter AT " + (i + 1) + ": ");
            AT[i] = sc.nextInt();
            System.out.print("Enter PR " + (i + 1) + ": ");
            PR[i] = sc.nextInt();
            System.out.println();
            P[i] = i + 1;
        }

        int start_time = 0; // store start time of process
        int completed_count = 0; // store count of completed processes

        while (completed_count < n) {
            int shortest_process = n; // process # with shortest BT
            int minPR = Integer.MAX_VALUE; // stores shortest BT

            for (int i = 0; i < n; i++) {
                if (AT[i] <= start_time && completed[i] == 0 && PR[i] < minPR) { // if arrival time within the start time
                    minPR = PR[i]; // process with the lowest priority
                    shortest_process = i;
                }
            }
            if (shortest_process == n) {
                start_time++;
            } else {
                completed[shortest_process] = 1; // mark that process as completed
                CT[shortest_process] = start_time + BT[shortest_process];
                start_time += BT[shortest_process]; // update start time for next process which is equal to time of completion of previous process
                TAT[shortest_process] = CT[shortest_process] - AT[shortest_process];
                WT[shortest_process] = TAT[shortest_process] - BT[shortest_process];
                P[completed_count] = shortest_process + 1;
                completed_count++;
            }
        }

        System.out.println("Process execution in order: ");
        for (int i = 0; i < n; i++) {
            System.out.print(P[i] + " ");
        }
        System.out.println();


        //Calculate Average Turnaround Time
        double sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum2 += TAT[i];
        }
        double ATAT = sum2 / n;

        //Calculate Await Time
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += WT[i];
        }
        double AWT = sum / n;

        //Outputs
        System.out.println("Completion Time:");
        for (int i = 0; i < n; i++) {
            System.out.print(CT[i] + " ");
        }
        System.out.println();
        System.out.println("Wait Time:");
        for (int i = 0; i < n; i++) {
            System.out.print(WT[i] + " ");
        }
        System.out.println();
        System.out.println("Turnaround Time:");
        for (int i = 0; i < n; i++) {
            System.out.print(TAT[i] + " ");
        }
        System.out.println();
        System.out.println("Await Time: " + AWT + "\nAverage Turnaround Time: " + ATAT);

    }
}
