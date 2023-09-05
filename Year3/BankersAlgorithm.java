package Year3;

import java.util.Scanner;

// 2 parts: safety check and resource allocation algo

public class BankersAlgorithm {
    int n; // number of processes = n
    int m; // number of resources = m
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

    void input_max() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Maximum Resources:");
        for (int i = 0; i < n; i++) {
            System.out.print("for process " + i + ": ");
            for (int j = 0; j < m; j++) {
                max[i][j] = sc.nextInt();
            }
        }
    }

    void input_alloc() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter resources currently allocated:");
        for (int i = 0; i < n; i++) {
            System.out.print("to process " + i + ": ");
            for (int j = 0; j < m; j++) {
                allocation[i][j] = sc.nextInt();
                need[i][j] = max[i][j] - allocation[i][j];
            }
        }
    }

    void input_available() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter available resources: ");
        for (int i = 0; i < m; i++) {
            available[i] = sc.nextInt();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of processes: ");
        int p = sc.nextInt();
        System.out.print("Enter number of resources: ");
        int r = sc.nextInt();
        BankersAlgorithm ob = new BankersAlgorithm(p, r);
        ob.input_max();
        ob.input_alloc();
        ob.input_available();
    }
}