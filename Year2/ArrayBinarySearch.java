/**
 * This class contains methods for performing binary search
 * OOPJ-E2-Q7
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

        while(left <= right){
            int mid = (left + right)/2;
            if(search > arr[mid])
                left = mid + 1;
            else if(search < arr[mid])
                right = mid - 1;
            else{
                found = 1;
                break;
            }
        }
    }
}


public class ArrayBinarySearch {
    public static void main(String[] args) {
        BinarySearchCalc ob = new BinarySearchCalc();
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




































