package Year3;

import java.util.Scanner;

public class RR3 {
    public static void main(String[] args) {
        int[] P;
        int[] BT;
        int[] AT;
        int[] WT;
        int[] TAT;
        int[] CT;
        int n;
        int Q;
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

        System.out.print("Enter time slice: ");
        Q = sc.nextInt();

        System.out.println("\n>>>>Input BT & AT<<<<\n");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter BT " + (i + 1) + ": ");
            BT[i] = sc.nextInt();
            System.out.print("Enter AT " + (i + 1) + ": ");
            AT[i] = sc.nextInt();
            System.out.println();
            P[i] = i + 1;
        }

        int current_time = 0; // store start time of process

        while (true) {
            boolean all_comp = true;
            for (int i = 0; i < n; i++) {
                if (AT[i] <= current_time && completed[i] == 0) {
                    all_comp = false;
                    int execution_time = Math.min(BT[i], Q);
                    current_time += execution_time;

                    if (BT[i] == 0) {
                        completed[i] = 1;
                        CT[i] = current_time + BT[i];
                        TAT[i] = CT[i] - AT[i];
                        WT[i] = TAT[i] - BT[i];
                    } else {
                        BT[i] -= execution_time;
                    }
                }
            }
            if(all_comp){
                break;
            }
        }

        // Print the process execution order
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
        System.out.println("Average Waiting Time: " + AWT + "\nAverage Turnaround Time: " + ATAT);
    }
}
