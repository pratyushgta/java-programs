/**
 * This class contains methods for finding smallest element in array
 * OOPJ-E2-Q4
 * @author Pratyush Kumar (github.com/pratyushgta)
 */

package Year2;

import java.util.*;


class SmallestCalc {
    int[] arr;
    int size;
    int index;
    int min;

    void perform() {
        min = arr[0];
        for (int i = 0; i <size;i++){
            if(arr[i] < min) {
                min = arr[i];
                index = i;
            }
        }
    }
}

public class ArraySmallest {
    public static void main(String[] args) {
        SmallestCalc ob = new SmallestCalc();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        ob.size = sc.nextInt();

        ob.arr = new int[ob.size];

        System.out.println("Enter " + ob.size + " elements");
        for (int i = 0; i < ob.size; i++) {
            ob.arr[i] = sc.nextInt();
        }
        ob.perform();
        System.out.println("Smallest element in array is: "+ob.min+"\nAddress of smallest element in array is: "+(ob.index+1));
    }
}
