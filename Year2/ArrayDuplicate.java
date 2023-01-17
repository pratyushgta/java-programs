/**
 * This class contains methods for removing duplicate elements from array
 * OOPJ-E2-Q
 * @author Pratyush Kumar (github.com/pratyushgta)
 */

package Year2;

import java.util.Scanner;

class DuplicateCalc {
    int[] arr;
    int size;
    int count;
    int[] new_arr;

    void duplicate_count() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; i < size; i++) {
                if (arr[i] == arr[j])
                    count++;
            }
        }
    }

    void perform() {
        new_arr = new int[count];
        for (int i = 0; i < size - count; i++) {
            for (int j = 0; i < size - count; j++){
                if (arr[i] == arr[j]) {
                    new_arr[i] = arr[j];
                    break;
                }
                else {

                }
        }
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
        ob.duplicate_count();
        System.out.println("Smallest element in array is: " + ob.count + "\nAddress of smallest element in array is: ");
    }
}
