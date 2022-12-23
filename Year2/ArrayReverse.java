/**
 * This class contains methods for reversing array elements
 * DAA-E1-Q2
 * @author Pratyush Kumar (github.com/pratyushgta)
 */

package Year2;

import java.util.Scanner;
public class ArrayReverse {
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

        //Output
        System.out.println("\nOriginal Array:");
        for (int i = 0; i < size ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nReversed Array:");
        for (int i = size-1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

