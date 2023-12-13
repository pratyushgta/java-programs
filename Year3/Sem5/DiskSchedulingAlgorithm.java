/**
 * This class contains methods for implementing FCFS & SSTF- Disk Scheduling algorithms
 * OS-E10
 *
 * @author Pratyush Kumar (github.com/pratyushgta)
 */
package Year3.Sem5;

import java.util.Scanner;

public class DiskSchedulingAlgorithm {
    int size, head;
    int[] diskReq;

    void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter total no. of disk requests: ");
        size = scanner.nextInt();

        diskReq = new int[size];
        System.out.println("\n>>>>Input Disk Request Queue<<<<");
        for (int i = 0; i < size; i++) {
            diskReq[i] = scanner.nextInt();
        }

        System.out.print("Enter initial head position: ");
        head = scanner.nextInt();
    }

    void FCFS() {
        int totalSeekTime = 0;
        int currentHead = head;

        for (int i = 0; i < size; i++) {
            int request = diskReq[i];
            totalSeekTime += Math.abs(request - currentHead);
            currentHead = request;
        }

        System.out.println("Total seek time using FCFS: " + totalSeekTime);
    }

    void SSTF() {
        int totalSeekTime = 0;
        int currentHead = head;

        boolean[] visited = new boolean[size];
        int requestsLeft = size;

        while (requestsLeft > 0) {
            int minSeek = Integer.MAX_VALUE;
            int nextIndex = -1;

            for (int i = 0; i < size; i++) {
                if (!visited[i]) {
                    int seek = Math.abs(diskReq[i] - currentHead);
                    if (seek < minSeek) {
                        minSeek = seek;
                        nextIndex = i;
                    }
                }
            }

            visited[nextIndex] = true;
            totalSeekTime += minSeek;
            currentHead = diskReq[nextIndex];
            requestsLeft--;
        }

        System.out.println("Total seek time using SSTF: " + totalSeekTime);
    }

    void menu() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("\n>>>> DISK SCHEDULING ALGORITHMS <<<<\n1. FCFS\n2. SSTF\n3. Exit\n\nEnter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    FCFS();
                    break;
                case 2:
                    SSTF();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("\nHeh! You thought this hasn't been accounted for?");
            }
        }
    }

    public static void main(String[] args) {
        DiskSchedulingAlgorithm ob = new DiskSchedulingAlgorithm();
        ob.input();
        ob.menu();
    }
}
