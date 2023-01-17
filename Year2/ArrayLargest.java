/**
 * This class contains methods for finding largest element in array
 * OOPJ-E2-Q
 * @author Pratyush Kumar (github.com/pratyushgta)
 */

package Year2;

import java.util.*;


class LargestCalc {
    int[] arr;
    int size;
    int max;

    void perform() {
        max = arr[0];
        for (int i = 0; i <size;i++){
            if(arr[i] > max)
                max = arr[i];
        }
    }
}

public class ArrayLargest {
    public static void main(String[] args) {
        LargestCalc ob = new LargestCalc();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        ob.size = sc.nextInt();

        ob.arr = new int[ob.size];

        System.out.println("Enter " + ob.size + " elements");
        for (int i = 0; i < ob.size; i++) {
            ob.arr[i] = sc.nextInt();
        }
        ob.perform();
        System.out.println("Largest element in array is: "+ob.max);
    }
}
