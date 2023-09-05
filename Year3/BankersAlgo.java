package Year3;

import java.util.Scanner;

public class BankersAlgo {
    private int[][] maximum;      // Maximum resource claim of each process
    private int[][] allocation;   // Resources currently allocated to each process
    private int[] available;      // Available resources
    private int[][] need;           // Remaining resources needed for each process
    private int numProcesses;     // Number of processes
    private int numResources;     // Number of resource types

    public BankersAlgo(int numProcesses, int numResources) {
        this.numProcesses = numProcesses;
        this.numResources = numResources;
        this.maximum = new int[numProcesses][numResources];
        this.allocation = new int[numProcesses][numResources];
        this.available = new int[numResources];
        this.need = new int[numProcesses][numResources];
    }

    // Input the maximum resource claim for each process
    public void inputMaximum() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numProcesses; i++) {
            System.out.print("Enter maximum resources for process " + i + ": ");
            for (int j = 0; j < numResources; j++) {
                maximum[i][j] = scanner.nextInt();
            }
        }
    }

    // Input the resources currently allocated to each process
    public void inputAllocation() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numProcesses; i++) {
            System.out.print("Enter resources currently allocated to process " + i + ": ");
            for (int j = 0; j < numResources; j++) {
                allocation[i][j] = scanner.nextInt();
                need[i][j] = maximum[i][j] - allocation[i][j];
            }
        }
    }

    // Input the available resources
    public void inputAvailable() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter available resources: ");
        for (int i = 0; i < numResources; i++) {
            available[i] = scanner.nextInt();
        }
    }

    // Check if the system is in a safe state
    public boolean isSafe() {
        boolean[] finish = new boolean[numProcesses];
        int[] work = new int[numResources];
        System.arraycopy(available, 0, work, 0, numResources);

        int count = 0;
        while (count < numProcesses) {
            boolean found = false;
            for (int i = 0; i < numProcesses; i++) {
                if (!finish[i] && canAllocate(i, work)) {
                    for (int j = 0; j < numResources; j++) {
                        work[j] += allocation[i][j];
                    }
                    finish[i] = true;
                    found = true;
                    count++;
                }
            }
            if (!found) {
                return false; // System is not in a safe state
            }
        }
        return true; // System is in a safe state
    }

    // Check if a process can be allocated resources
    private boolean canAllocate(int process, int[] work) {
        for (int i = 0; i < numResources; i++) {
            if (need[process][i] > work[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of processes: ");
        int numProcesses = scanner.nextInt();

        System.out.print("Enter the number of resource types: ");
        int numResources = scanner.nextInt();

        BankersAlgo banker = new BankersAlgo(numProcesses, numResources);

        banker.inputMaximum();
        banker.inputAllocation();
        banker.inputAvailable();

        if (banker.isSafe()) {
            System.out.println("System is in a safe state.");
        } else {
            System.out.println("System is not in a safe state.");
        }
    }
}
