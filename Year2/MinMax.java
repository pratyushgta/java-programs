/**
 * This class contains methods for finding Minimum and Maximum element in array using Divide & Conquer algo
 * DAA-E6
 *
 * @author Pratyush Kumar (github.com/pratyushgta)
 */

package Year2;

import java.util.Scanner;

public class MinMax {
    //naive method
    void nm_maxmin(int[] A) {
        int max = A[0];
        int min = A[0];

        for (int i = 1; i < A.length; i++) {
            if (A[i] > max)
                max = A[i];
            else if (A[i] < min)
                min = A[i];
        }
        System.out.println("\n>>Naive Method<<\nMinimum element is: " + min + "\nMaximum element is: " + max);
    }

    int[] dnc_minmax(int[] A, int i, int j) { //i= first element in array | j= last element in array
        int[] result = new int[2]; //result[0] holds min and result[1] holds max
        int mid;

        if (i == j) { //if there is only 1 element in array
            result[0] = A[i];
            result[1] = A[i];
        } else if (j == i + 1) { //if there are 2 elements in array
            if (A[i] > A[j]) {
                result[0] = A[j];
                result[1] = A[i];
            } else {
                result[0] = A[i];
                result[1] = A[j];
            }
        } else { //if there are more than 2 elements in array then divide array into 2 halves
            mid = (i + j) / 2;
            int[] leftResult = dnc_minmax(A, i, mid);
            int[] rightResult = dnc_minmax(A, mid + 1, j);

            result[0] = Math.min(leftResult[0], rightResult[0]);//compare minimums of two parts
            result[1] = Math.max(leftResult[1], rightResult[1]);//compare maximums of two parts
        }
        return result;
    }

    public static void main(String[] args) {
        MinMax ob = new MinMax();
        Scanner sc = new Scanner(System.in);

        int size;
        System.out.print("Enter size: ");
        size = sc.nextInt();

        int[] arr;
        arr = new int[size];

        System.out.println("Enter " + size + " elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        ob.nm_maxmin(arr);
        int[] result = ob.dnc_minmax(arr, 0, size - 1);
        System.out.println("\n>>Divide & Conquer Method<<\nMinimum element is: " + result[0] + "\nMaximum element is: " + result[1]);
    }
}
