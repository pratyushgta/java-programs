/**
 * This class contains methods for calculating simple interest/ investment payout
 * OOPJ-E1-Q10
 * @author Pratyush Kumar (github.com/pratyushgta)
 */

package Year2;

import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double p, r, t;

        System.out.print("Enter Principal amount: ");
        p = sc.nextDouble();

        System.out.print("Enter rate of interest (in %): ");
        r = sc.nextDouble();

        System.out.print("Enter time/ period (in years): ");
        t = sc.nextDouble();

        double amt = p*(r/100)*t;

        System.out.println("\nFuture amount= "+amt+" for Principal= "+p+", Rate= "+r+"%, Period= "+t+" years");
    }
}
