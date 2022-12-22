package Year2;

import java.util.Scanner;

/**
 * This class contains methods for finding average of 10 array elements
 * DAA-E1-Q5
 * @author Pratyush Kumar (github.com/pratyushgta)
 */
public class ArrayAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Input
        int size = 10;
        int[] arr = new int[size]; //Initializing the array with given size

        System.out.println("Enter 10 elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        //Average
        double sum = 0;
        for(int i=0;i<size;i++){
            sum+=arr[i];
        }
        double avg = sum/size;
        System.out.println("Average is: "+avg);
    }
}
