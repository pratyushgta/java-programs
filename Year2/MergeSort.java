/**
 * This class contains methods for performing Merge Sort
 * DAA-E5
 *
 * @author Pratyush Kumar (github.com/pratyushgta)
 */

package Year2;

import java.util.*;

public class MergeSort {

    //function to merge left and right subarrays into og array
    void merge(int[] left, int[] right, int[] arr) {
        int sizeL = left.length;
        int sizeR = right.length;

        int i = 0, j = 0, k = 0;
        //i= smallest unpicked in L, j= smallest unpicked in R, k= index to fill in A

        while(i<sizeL && j<sizeR){
            if(left[i] < right[j]){
                arr[k] = left[i];
                i++;
                k++;
            } else{
                arr[k] = right[j];
                j++;
                k++;
            }
        }
        // after above while loop, only one of below while loops will work
        // because only one subarray will have left over numbers
        while(i<sizeL){
            arr[k] = left[i];
            i++;
            k++;
        }

        while(j<sizeR){
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    //recursive function to sort array
    void mergeSort(int[] A) {
        int size = A.length;
        if (size < 2)
            return; //exit call for recursion

        int mid = size / 2;
        int[] L = new int[mid];
        int[] R = new int[size - mid];

        for (int i = 0; i < mid; i++) {
            L[i] = A[i]; //creating left subarray
        }
        for (int i = mid; i < size; i++) {
            R[i - mid] = A[i]; //creating right subarray
        }

        //recursive calls to sort left and right halves
        mergeSort(L);
        mergeSort(R);
        merge(L, R, A); //merge sorted halves
    }


    void display(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        MergeSort ob = new MergeSort();
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

        System.out.println("Unsorted array: ");
        ob.display(arr);
        ob.mergeSort(arr);
        System.out.println("Sorted array: ");
        ob.display(arr);
    }
}
