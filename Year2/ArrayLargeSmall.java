/**
 * This class contains methods for finding largest and smallest element in array
 * OOPJ-E2-Q3
 * @author Pratyush Kumar (github.com/pratyushgta)
 */

package Year2;

import java.util.*;


class LargeSmallCalc {
    int[] arr;
    int size;
    int max;
    int min;

    void perform() {
        max = arr[0];
        min = arr[0];
        for (int i = 0; i <size;i++){
            if(arr[i] > max)
                max = arr[i];
            else if(arr[i] < min)
                min = arr[i];
        }
    }
}

public class ArrayLargeSmall {
    public static void main(String[] args) {
        LargeSmallCalc ob = new LargeSmallCalc();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        ob.size = sc.nextInt();

        ob.arr = new int[ob.size];

        System.out.println("Enter " + ob.size + " elements");
        for (int i = 0; i < ob.size; i++) {
            ob.arr[i] = sc.nextInt();
        }
        ob.perform();
        System.out.println("Largest element in array is: "+ob.max+"\nSmallest element in array is: "+ob.min);
    }
}
