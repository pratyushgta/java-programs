/**
 * This class contains methods for swapping two elements in an arraylist
 * OOPJ-E9-Q3
 *
 * @author Pratyush Kumar (github.com/pratyushgta)
 */
package Year2;

import java.util.*;

public class ListSwap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();

        List<String> list_Strings = new ArrayList<>();
        System.out.println("Enter " + n + " words: ");
        for (int i = 0; i < n; i++) {
            list_Strings.add(sc.next());
        }
        System.out.println("\nBefore swapping: " + list_Strings);

        System.out.print("Swap what? : ");
        int pos1 = sc.nextInt();
        System.out.print("Swap it with? : ");
        int pos2 = sc.nextInt();

        Collections.swap(list_Strings, pos1 - 1, pos2 - 1);
        System.out.println("\nAfter swapping: " + list_Strings);
    }
}
