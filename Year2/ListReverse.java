/**
 * This class contains methods for iterating a linked list in reverse order
 * OOPJ-E9-Q4
 *
 * @author Pratyush Kumar (github.com/pratyushgta)
 */
package Year2;

import java.util.*;

public class ListReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();

        LinkedList<String> list_Strings = new LinkedList<>();
        System.out.println("Enter " + n + " words: ");
        for (int i = 0; i < n; i++) {
            list_Strings.add(sc.next());
        }

        System.out.println("Original list: " + list_Strings);

        Iterator<String> it = list_Strings.descendingIterator();

        System.out.print("Reversed list: ");
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }
}
