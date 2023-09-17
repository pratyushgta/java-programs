package Year3;

import java.util.Scanner;

public class BankersAlgorithm {
    int n; // number of processes
    int m; // number of resources
    int[][] max; // maximum resource claim of each process
    int[][] allocation; // resources currently allocated to each process
    int[] available; // available resources
    int[][] need; // remaining resources needed for each process

    public BankersAlgorithm(int num_P, int num_R) {
        n = num_P;
        m = num_R;
        max = new int[n][m];
        allocation = new int[n][m];
        available = new int[m];
        need = new int[n][m];
    }

    void input() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n>>Enter Maximum Resources<<");
        for (int i = 0; i < n; i++) {
            System.out.print("for process " + (i + 1) + ": ");
            for (int j = 0; j < m; j++) {
                max[i][j] = sc.nextInt();
            }
        }

        System.out.println("\n>>Enter Allocated Resources<<");
        for (int i = 0; i < n; i++) {
            System.out.print("to process " + (i + 1) + ": ");
            for (int j = 0; j < m; j++) {
                allocation[i][j] = sc.nextInt();
                need[i][j] = max[i][j] - allocation[i][j]; // calculating need matrix
            }
        }

        System.out.print("\nEnter Available Resources: ");
        for (int i = 0; i < m; i++) {
            available[i] = sc.nextInt();
        }
    }

    // checks whether all resources for a process can be allocated
    public boolean AllocateCheck(int process) {
        for (int i = 0; i < m; i++) {
            if (available[i] < need[process][i])
                return false;
        }
        return true;
    }

    public void isSafe() {
        int[] safe_sequence = new int[n];
        boolean[] done = new boolean[n];
        int count = 0;

        while (count < n) {
            boolean allocated = false;
            for (int i = 0; i < n; i++) {
                if (!done[i] && AllocateCheck(i)) {
                    for (int j = 0; j < m; j++) {
                        available[j] += allocation[i][j];
                    }
                    //System.out.println("Allocated process : " + i);
                    allocated = done[i] = true;
                    safe_sequence[count] = i;
                    count++;
                }
            }
            if (!allocated) {
                System.out.println("Unsafe state. Unable to allocate resources.");
                break;
            }
        }
        if (count == n) {
            System.out.println("Safe sequence:");
            for (int i = 0; i < n; i++) {
                System.out.print("P" + safe_sequence[i]);
                if (i != n - 1)
                    System.out.print(" -> ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of processes: ");
        int p = sc.nextInt();
        System.out.print("Enter number of resources: ");
        int r = sc.nextInt();
        BankersAlgorithm ob = new BankersAlgorithm(p, r);
        ob.input();
        ob.isSafe();
    }
}
