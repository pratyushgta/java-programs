/**
 * This class contains methods for implementing FIFO & LRU- Page Replacement algorithms
 * OS-E9
 *
 * @author Pratyush Kumar (github.com/pratyushgta)
 */
package Year3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PageReplacement {
    int capacity;
    int[] pageRef;
    int size;

    void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter no. of frames in memory: ");
        capacity = scanner.nextInt();
        System.out.print("Enter total no. of page references: ");
        size = scanner.nextInt();

        pageRef = new int[size];
        System.out.println("\n>>>>Input Page References<<<<");

        for (int i = 0; i < size; i++) {
            pageRef[i] = scanner.nextInt();
        }
    }

    void FIFO() {
        Queue<Integer> pageQueue = new LinkedList<>();
        int hits = 0;
        int misses = 0;

        for (int i = 0; i < pageRef.length; i++) {
            int page = pageRef[i];
            if (!pageQueue.contains(page)) {
                if (pageQueue.size() == capacity) {
                    int removedPage = pageQueue.poll();
                    System.out.println("Page " + removedPage + " removed from frame");
                }
                pageQueue.offer(page);
                System.out.println("Page " + page + " added to frame");
                misses++;
            } else {
                hits++;
                System.out.println("Page " + page + " already in frame");
            }
        }
        System.out.println("\nTotal Page Faults: " + misses + "\nTotal Page Hits: " + hits);
    }

    public void LRU() {
        ArrayList<Integer> pageList = new ArrayList<>();
        int hits = 0;
        int misses = 0;

        for (int i = 0; i < pageRef.length; i++) {
            int page = pageRef[i];
            if (!pageList.contains(page)) {
                if (pageList.size() == capacity) {
                    int LRU_page = pageList.get(0);
                    pageList.remove(0);
                    System.out.println("Page " + LRU_page + " removed from frame");
                }
                pageList.add(page);
                System.out.println("Page " + page + " added to frame");
                misses++;
            } else {
                hits++;
                pageList.remove(Integer.valueOf(page));
                pageList.add(page);
                System.out.println("Page " + page + " is already in frame");
            }
        }
        System.out.println("\nTotal Page Faults: " + misses + "\nTotal Page Hits: " + hits);
    }

    void menu() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("\n>>>> PAGE REPLACEMENT ALGORITHMS <<<<\n1. FIFO\n2. LRU\n3. Exit\n\nEnter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    FIFO();
                    break;
                case 2:
                    LRU();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("\nHeh! You thought this hasn't been accounted for?");
            }
        }
    }

    public static void main(String[] args) {
        PageReplacement ob = new PageReplacement();
        ob.input();
        ob.menu();
    }
}
