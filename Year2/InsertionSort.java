/**
 * This class contains methods for performing Insertion Sort
 * DAA-E1-Q6 | DAA-E2-Q3
 * @author Pratyush Kumar (github.com/pratyushgta)
 */

package Year2;

import java.util.*;
public class InsertionSort {

    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);

        //Input
        //System.out.print("Enter number of array elements: ");
        //int size = sc.nextInt();
        int size = 3;

        int [] arr = new int[size];

        System.out.println("Enter "+size+" elements:");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        //Sort
        for (int i = 1; i < size; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }


        //Output
        System.out.println("\nSorted Array:");
        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
