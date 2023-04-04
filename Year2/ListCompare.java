/**
 * This class contains methods for to comparing two arraylists
 * OOPJ-E9-Q2
 *
 * @author Pratyush Kumar (github.com/pratyushgta)
 */

package Year2;

import java.util.*;

public class ListCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> list_1 = new ArrayList<>();
        System.out.print("Enter size of list 1: ");
        int n1 = sc.nextInt();
        System.out.println("Enter " + n1 + " words: ");
        for (int i = 0; i < n1; i++) {
            list_1.add(sc.next());
        }
        System.out.println("\nList 1: " + list_1);

        List<String> list_2 = new ArrayList<>();
        System.out.print("\nEnter size of list 2: ");
        int n2 = sc.nextInt();
        System.out.println("Enter " + n1 + " words: ");
        for (int i = 0; i < n2; i++) {
            list_2.add(sc.next());
        }
        System.out.println("\nList 2: " + list_2);


        boolean boolval = list_1.equals(list_2);
        if (boolval)
            System.out.println("\n---------------------\nBoth lists match :D\n---------------------");
        else
            System.out.println("\n---------------------\nLists do not match :(\n---------------------");
    }
}
