/**
 * This class contains methods to check if 2 of 3 boolean variables are true
 * OOPJ-E1-Q8
 * @author Pratyush Kumar (github.com/pratyushgta)
 */

package Year2;

import java.util.*;

public class BooleanCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean b1, b2, b3;

        System.out.print("Enter 1st boolean value: ");
        b1 = sc.nextBoolean();

        System.out.print("Enter 2nd boolean value: ");
        b2 = sc.nextBoolean();

        System.out.print("Enter 3rd boolean value: ");
        b3 = sc.nextBoolean();

        int counter = 0;

        if(b1==true)
            counter++;
        if(b2==true)
            counter++;
        if(b3==true)
            counter++;

        if(counter==2)
            System.out.println("\n2 out of 3 bool values are true!");
        else
            System.out.println("\n2 out of 3 bool values are NOT true!");
    }
}
