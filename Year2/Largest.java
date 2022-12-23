/**
 * This class contains methods for finding largest of 3 numbers
 * OOPJ-E1-Q7
 * @author Pratyush Kumar (github.com/pratyushgta)
 */

package Year2;
import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, n3;
        System.out.print("Enter number 1: ");
        n1 = sc.nextInt();
        System.out.print("Enter number 2: ");
        n2 = sc.nextInt();
        System.out.print("Enter number 3: ");
        n3 = sc.nextInt();
        System.out.println();

        if (n1 > n2 && n1 > n3)
            System.out.println(n1 + " is largest number!");
        else if (n2 > n1 && n2 > n3)
            System.out.println(n2 + " is largest number!");
        else
            System.out.println(n3 + " is largest number!");
    }
}
