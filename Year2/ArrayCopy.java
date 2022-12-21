package Year2;

import java.util.Scanner;

public class ArrayCopy {
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

        //Copying
        int [] new_arr = new int[size];
        for (int i = 0; i < size; i++) {
            new_arr[i] = arr[i];
        }

        //Output
        System.out.println("\nOriginal Array:");
        for (int i = 0; i < size ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nCopy of Array 1:");
        for (int i = 0; i < size ; i++) {
            System.out.print(new_arr[i] + " ");
        }
    }
}

