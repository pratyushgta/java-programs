/**
 * This class contains methods for displaying sum of array elements
 * DAA-E1-Q3
 * @author Pratyush Kumar (github.com/pratyushgta)
 */
package Year2;

import java.util.Scanner;
public class ArraySum {
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

        //Sum
        int sum = 0;
        for(int i=0;i<size;i++){
            sum+=arr[i];
        }

        //Output
        System.out.print("Sum is: "+sum);
    }
}