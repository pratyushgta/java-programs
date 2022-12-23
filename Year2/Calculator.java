/**
 * This class contains methods to perform basic calculations
 * OOPJ-E1-Q4
 * @author Pratyush Kumar (github.com/pratyushgta)
 */

package Year2;

import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1, n2;

        System.out.print("-----SIMPLE CALCI-----\nEnter 1st number: ");
        n1 = sc.nextInt();

        System.out.print("Enter 2nd number: ");
        n2 = sc.nextInt();

        int choice = 0;
        while (choice <= 5) {
            System.out.println("\nSelect a command:\n1. Add (+)\n2. Subtract (-)\n3. Multiply (*)\n4. Divide (/)\n5. Exit");
            choice = sc.nextInt();

            if (choice == 1)
                System.out.println(n1+"+"+n2+"="+(n1+n2));
            else if (choice == 2)
                System.out.println(n2+"-"+n1+"="+(n2-n1));
            else if (choice == 3)
                System.out.println(n1+"*"+n2+"="+(n1*n2));
            else if (choice == 4)
                System.out.println(n2+"/"+n1+"="+(n2/n1));
            else if(choice == 5) {
                System.out.println("gg");
                break;
            }
            else
                System.out.println("Invalid Input!");
        }
    }
}
