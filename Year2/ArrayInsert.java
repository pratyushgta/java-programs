package Year2;

import java.util.Scanner;

/**
 * This class contains methods for performing I/O in Arrays
 * E1-Q1
 * @author Pratyush Kumar (pratyushgta@gmail.com)
 */

public class ArrayInsert {
    public static void main(String[] args){
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
        System.out.println("\nArray:");
        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}

