/**
 * This class contains methods for removing duplicate elements from array
 * OOPJ-E2-Q5
 * @author Pratyush Kumar (github.com/pratyushgta)
 */

package Year2;

import java.util.Scanner;

class DuplicateCalc {
    int[] arr;
    int size;
    int count;
    int[] new_arr;

    void bubble_sort(int[] a) {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < (size - i - 1); j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    void perform(int[] a){
        System.out.println("Original Array:");
        for(int i=0;i<size;i++){
            System.out.print(a[i]+" ");
        }

        new_arr = new int[size];
        int j=0;
        for(int i=0;i<size-1;i++){
            if(a[i] != a[i+1]) {
                new_arr[j] = a[i];
                j++;
            }
        }
        new_arr[j++] = arr[size-1];

        System.out.println("\nAfter removing duplicates:");
        for(int i=0;i<j;i++){
            System.out.print(new_arr[i]+" ");
        }
    }
}

public class ArrayDuplicate {
    public static void main(String[] args) {
        DuplicateCalc ob = new DuplicateCalc();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        ob.size = sc.nextInt();

        ob.arr = new int[ob.size];

        System.out.println("Enter " + ob.size + " elements");
        for (int i = 0; i < ob.size; i++) {
            ob.arr[i] = sc.nextInt();
        }
        ob.bubble_sort(ob.arr);
        ob.perform(ob.arr);
    }
}
