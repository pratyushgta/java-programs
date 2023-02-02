/**
 * This class contains methods for finding 2nd largest element in array
 * OOPJ-E2-Q2
 * @author Pratyush Kumar (github.com/pratyushgta)
 */

package Year2;

import java.util.*;


class SecondLargestCalc {
    int[] arr;
    int size;
    int second_max;

    void bubble_sort(int[] a) {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < (size - i - 1); j++) {
                if (a[j] < a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    void perform() {
        second_max = arr[1];
    }
}

public class ArraySecondLargest {
    public static void main(String[] args) {
        SecondLargestCalc ob = new SecondLargestCalc();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        ob.size = sc.nextInt();

        ob.arr = new int[ob.size];

        System.out.println("Enter " + ob.size + " elements");
        for (int i = 0; i < ob.size; i++) {
            ob.arr[i] = sc.nextInt();
        }
        ob.bubble_sort(ob.arr);
        ob.perform();
        System.out.println("Second largest element in array is: "+ob.second_max);
    }
}
