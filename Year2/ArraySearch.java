/**
 * This class contains methods for searching an element in array
 * OOPJ-E2-Q
 * @author Pratyush Kumar (github.com/pratyushgta)
 */

package Year2;

import java.util.Scanner;

class LinearSearchCalc {
    int[] arr;
    int size;
    int search;
    int found = 0;

    void perform() {
        for (int i = 0; i < size; i++) {
            if (arr[i] == search) {
                found = 1;
                break;
            }
        }
    }
}


public class ArraySearch {
    public static void main(String[] args) {
        LinearSearchCalc ob = new LinearSearchCalc();

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
        if(ob.found==1)
            System.out.println("Element " + ob.search + " found!");
        else
            System.out.println("Element " + ob.search + " NOT found!");
    }
}
