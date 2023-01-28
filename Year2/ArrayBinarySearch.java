/**
 * This class contains methods for performing binary search
 * OOPJ-E2-Q
 * @author Pratyush Kumar (github.com/pratyushgta)
 */

package Year2;

import java.util.Scanner;

class BinarySearchCalc {
    int[] arr;
    int size;
    int search;
    int found = 0;

    void perform() {
        int left = 0;
        int right = size-1;
        int mid = 0;

        while(right - left > 1){
            mid = (left + right)/2;
            if(mid == search)
                found=1;
            else if(arr[mid] < search)
                left = mid+1;
            else
                right = mid;

        }
    }
}


public class ArrayBinarySearch {
    public static void main(String[] args) {
        BinarySearchCalc ob = new BinarySearchCalc();

        ob.size =5;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        ob.size = sc.nextInt();

        ob.arr = new int[ob.size];

        System.out.println("Enter " + ob.size + " elements");
        for (int i = 0; i < ob.size; i++) {
            ob.arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        ob.search = sc.nextInt();

        ob.perform();
        if (ob.found == 1)
            System.out.println("Element " + ob.search + " found!");
        else
            System.out.println("Element " + ob.search + " NOT found!");
    }
}




































