/**
 * This class contains methods for implementing Round-Robin (RR) scheduling algorithm
 * OS-E6
 *
 * @author Pratyush Kumar (github.com/pratyushgta)
 */

package Year3;

import java.util.*;

// Defining node of linked list
class Process {
    int id;
    int AT;
    int BT;
    int RT; // store remaining time

    public Process(int id, int AT, int BT) {
        this.id = id;
        this.AT = AT;
        this.BT = BT;
        this.RT = BT;
    }
}

public class RR {

    static void bubble_sort(LinkedList<Process> queue) {
        int size = queue.size();
        for (int i = 0; i < size-1; i++) {
            for (int j = 0; j < (size - i - 1); j++) {
                if (queue.get(j).AT > queue.get(j+1).AT) {
                    Process temp = queue.get(j);
                    queue.set(j,queue.get(j+1));
                    queue.set(j+1,temp);
                }
            }
        }
    }
    public static void main(String[] args) {
        LinkedList<Process> ready_queue = new LinkedList<>();
        int[] WT;
        int[] TAT; //tit-for-tat
        int[] CT;
        int n;
        int Q;
        ArrayList<Integer> order;

        Scanner sc = new Scanner(System.in);

        // Inputs
        System.out.print("Enter size: ");
        n = sc.nextInt();
        WT = new int[n];
        TAT = new int[n];
        CT = new int[n];
        order = new ArrayList<>();

        System.out.print("Enter time slice: ");
        Q = sc.nextInt();

        System.out.println("\n>>>>Input BT & AT<<<<\n");
        for (int i = 0; i < n; i++) {
            int P, AT, BT;
            System.out.print("Enter BT " + (i + 1) + ": ");
            BT = sc.nextInt();
            System.out.print("Enter AT " + (i + 1) + ": ");
            AT = sc.nextInt();
            System.out.println();
            P = i + 1;

            ready_queue.add(new Process(P, AT, BT));
        }

        // Sort the processes in ascending order of arrival time
        bubble_sort(ready_queue); // blob blob blob

        int current_time = 0; // store start time of process

        System.out.println("P\tET\tRT");

        while (!ready_queue.isEmpty()) {
            Process current_process = ready_queue.poll(); //get topmost element

            // Execute the process for a time quantum
            int execution_time = Math.min(Q, current_process.RT);
            current_time += execution_time;
            current_process.RT -= execution_time;

            // Print gnatt chart
            System.out.println("P"+current_process.id + "\t" + execution_time + "\t" + current_process.RT);

            // If the process is not completed, add it back to the queue
            if (current_process.RT > 0) {
                ready_queue.add(current_process);
            } else {
                order.add(current_process.id);
                int i = current_process.id - 1;
                CT[i] = current_time;
                TAT[i] = CT[i] - current_process.AT;
                WT[i] = TAT[i] - current_process.BT;
            }
        }

        // Print the process execution order
        System.out.println("\nProcess execution in order: ");
        for (int i = 0; i < n; i++) {
            System.out.print(order.get(i) + " ");
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
