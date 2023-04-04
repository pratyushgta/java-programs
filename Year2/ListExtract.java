/**
 * This class contains methods for extracting a portion of an arraylist
 * OOPJ-E9-Q1
 *
 * @author Pratyush Kumar (github.com/pratyushgta)
 */
package Year2;

import java.util.*;

public class ListExtract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();

        List<String> list_Strings = new ArrayList<>();
        System.out.println("Enter " + n + " words: ");
        for (int i = 0; i < n; i++) {
            list_Strings.add(sc.next());
        }

        System.out.println("\nOriginal list: " + list_Strings);

        System.out.print("How many words do you wanna extract: ");
        int num = sc.nextInt();
        List<String> sublist = list_Strings.subList(0, num);
        System.out.println("\nList of first " + num + " elements: " + sublist);
    }
}
