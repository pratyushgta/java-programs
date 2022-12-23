/**
 * This class contains methods for swapping two numbers
 * OOPJ-E1-Q5
 * @author Pratyush Kumar (github.com/pratyushgta)
 */

package Year2;

import java.util.*;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.print("Enter value of A: ");
        a = sc.nextInt();
        System.out.print("Enter value of B: ");
        b = sc.nextInt();

        System.out.println("\nBefore swapping:\nA="+a+"\tB="+b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("\nAfter swapping:\nA="+a+"\tB="+b);
    }

}
