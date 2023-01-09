/**
 * This class contains methods for finding factorial of a number
 * Using recursive and iterative methods
 * DAA-E2-Q5
 * @author Pratyush Kumar (github.com/pratyushgta)
 */

package Year2;

import java.util.*;

public class Factorial {

    int fact_rec(int n){ // ------ S: n for n
        if(n==0)
            return 1; // ------ T: 1
        else
            return (n*fact_rec(n-1)); // ------ T: T(n-1)+2
        // ------ T(n) = T(n-1)+3 -> 3n+1 -> O(n)
        // ------ S(n) = 1 -> O(n)
    }

    int fact_itr(int n){ // ------ S: 1 for n
        int fact=1; // ------ S: 1
        for(int i=n;i>0;i--){ // ------ T: n+1 & S: 1 for i
            fact*=i; // ------ T: n
        }
        return fact; // ------ T: 1
        // ------ T(n) = 2n+2 -> O(n)
        // ------ S(n) = 3 -> O(1)
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        Factorial ob = new Factorial();
        System.out.println("Factorial using recursive method: "+ob.fact_rec(num));
        System.out.println("Factorial using iterative method: "+ob.fact_itr(num));
    }
}
