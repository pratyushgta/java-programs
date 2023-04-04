/**
 * This class contains methods for inserting an element at specified position in the linked list
 * OOPJ-E9-Q5
 *
 * @author Pratyush Kumar (github.com/pratyushgta)
 */
package Year2;

import java.util.LinkedList;
import java.util.Scanner;

public class ListInsert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();

        LinkedList<String> list_Strings = new LinkedList<>();
        System.out.println("Enter " + n + " words: ");
        for (int i = 0; i < n; i++) {
            list_Strings.add(sc.next());
        }

        System.out.println("\nOriginal: " + list_Strings);
        System.out.print("Insert what? : ");
        String insert = sc.next();
        System.out.print("Insert where? : ");
        int pos = sc.nextInt();

        list_Strings.add(pos-1, insert);
        System.out.println("\nAfter insertion: " + list_Strings);
    }
}
