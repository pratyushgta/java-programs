/**
 * This class contains methods for checking if alphabet is vowel or consonant
 * OOPJ-E1-Q9
 * @author Pratyush Kumar (github.com/pratyushgta)
 */

package Year2;

import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String alpha;

        System.out.print("Enter 1st boolean value: ");
        alpha = sc.nextLine();

        if (alpha.equalsIgnoreCase("a") || alpha.equalsIgnoreCase("e") || alpha.equalsIgnoreCase("i") || alpha.equalsIgnoreCase("o") || alpha.equalsIgnoreCase("u"))
            System.out.println(alpha + " is a vowel!");
        else
            System.out.println(alpha + " is a consonant!");
    }
}
