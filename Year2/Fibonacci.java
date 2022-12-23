package Year2;

import java.util.*;

/**
 * This class contains methods for finding fibonacci series
 * Using recursive and iterative methods
 * DAA
 * @author Pratyush Kumar (github.com/pratyushgta)
 */

public class Fibonacci {
    int fibo_rec(int n){
        if(n<=1)
            return n;
        return fibo_rec(n-1) + fibo_rec(n-2);
    }

    void fibo_itr(int n){
        int firstterm = 0;
        int secondterm = 1;
        int count = 0;
        System.out.println("Fibonacci using iterative method:");
        for(int i=0;i<n;i++){
            System.out.print(firstterm+" ");
            int nextterm = firstterm + secondterm;
            firstterm = secondterm;
            secondterm = nextterm;
        }
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        Fibonacci ob = new Fibonacci();
        ob.fibo_itr(num);

        System.out.println("\nFibonacci using recursive method:");
        for(int i=0;i<num;i++)
            System.out.print(ob.fibo_rec(i)+" ");
    }
}