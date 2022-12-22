package Year2;

import java.util.*;

/**
 * This class contains methods for performing Insertion Sort
 * Includes outputs with underlying steps
 * DAA-E1-Q6
 * @author Pratyush Kumar (pratyushgta@gmail.com)
 */
public class InsertionSortSteps {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Input
        System.out.print("Enter number of array elements: ");
        int size = sc.nextInt();

        int[] arr = new int[size]; //Initializing the array with given size

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int swap = 0;
        int comparison = 0;

        System.out.println("\nUn-sorted Array:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        //Sort
        System.out.println("\n\nSorting steps:");

        for (int i = 1; i < size; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
                comparison++;
                swap++;
            }

            arr[j + 1] = key;
            if(j>=0) { // Incrementing comparison variable to include false condition of while loop
                // / final comparison which did not trigger while loop
                if (arr[j] < key)
                    comparison++;
            }

                System.out.println();
                for (int k = 0; k < size; k++) {
                    System.out.print(arr[k] + " ");
                }
        }

        //Output
        System.out.println();
        System.out.println("\nSorted Array:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("\nNumber of comparisons: " + comparison + "\nNumber of swaps: " + swap);
    }
}
