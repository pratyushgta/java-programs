package Year3;

import java.util.Scanner;

public class RR2 {
    public static void main(String[] args) {
        int[] P;
        int[] BT;
        int[] AT;
        int[] WT;
        int[] TAT;
        int[] CT;
        int n;
        int[] completed; // array to store executed processes

        Scanner sc = new Scanner(System.in);

        // Inputs
        System.out.print("Enter size: ");
        n = sc.nextInt();
        P = new int[n];
        BT = new int[n];
        AT = new int[n];
        WT = new int[n];
        TAT = new int[n];
        CT = new int[n];
        completed = new int[n];

        System.out.println("\n>>>>Input BT & AT<<<<\n");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter BT " + (i + 1) + ": ");
            BT[i] = sc.nextInt();
            System.out.print("Enter AT " + (i + 1) + ": ");
            AT[i] = sc.nextInt();
            System.out.println();
            P[i] = i + 1;
        }

        int timeQuantum = 3; // Time quantum for Round Robin
        int currentTime = 0; // Current time

        while (true) {

            for (int i = 0; i < n; i++) {
                if (AT[i] <= currentTime && completed[i] == 0) {
                    // Execute the process for the time quantum or remaining burst time, whichever is smaller
                    int executionTime = Math.min(BT[i], timeQuantum);

                    // Update current time
                    currentTime += executionTime;

                    // Update remaining burst time
                    BT[i] -= executionTime;

                    // If the process is completed, calculate completion time, turnaround time, and waiting time
                    if (BT[i] == 0) {
                        completed[i] = 1;
                        CT[i] = currentTime;
                        TAT[i] = CT[i] - AT[i];
                        WT[i] = TAT[i] - BT[i];
                    }
                }
            }

            // If all processes are completed, exit the loop

            System.out.println("Process execution in order: ");
            for (int i = 0; i < n; i++) {
                System.out.print(P[i] + " ");
            }
            System.out.println();

            // Calculate Average Turnaround Time
            double sum2 = 0;
            for (int i = 0; i < n; i++) {
                sum2 += TAT[i];
            }
            double ATAT = sum2 / n;

            // Calculate Average Waiting Time
            double sum = 0;
            for (int i = 0; i < n; i++) {
                sum += WT[i];
            }
            double AWT = sum / n;

            // Outputs
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
            System.out.println("Average Waiting Time: " + AWT);
            System.out.println("Average Turnaround Time: " + ATAT);
        }
    }
}

