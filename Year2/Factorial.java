package Year2;

import java.util.*;

/**
 * This class contains methods for finding factorial of a number
 * Using recursive and iterative methods
 * DAA-E2-Q5
 * @author Pratyush Kumar (github.com/pratyushgta)
 */
public class Factorial {

    int fact_rec(int n){
        if(n==0)
            return 1;
        else
            return (n*fact_rec(n-1));
    }

    int fact_itr(int n){
        int fact=1;
        for(int i=n;i>0;i--){
            fact*=i;
        }
        return fact;
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
