/**
 * This class contains methods for finding fibonacci series between 2 and 7
 * Using recursive and iterative methods
 * DAA-E2-Q6
 * @author Pratyush Kumar (github.com/pratyushgta)
 */

package Year2;
public class FibonacciRange {
    int fibo_rec(int n){  // ------ S: n for n
        if(n<=1)
            return n; // ------ T: 1
        return fibo_rec(n-1) + fibo_rec(n-2); // ------ T(n-1)+T(n-2)+3
        // ------ T(n) = T(n-1)+T(n-2)+4 -> O(2^n)
        // ------ S(n) = 3 -> O(1)
    }

    void fibo_itr() {
        int firstterm = 0; // ------ S: 1
        int secondterm = 1; // ------ S: 1

        System.out.println("Fibonacci using iterative method:");
        for(int i=0;i<10;i++){ // ------ T: n+1 & S: 1 for i
            if(i>1 && i<8)
                System.out.print(firstterm+" "); // ------ T: 1
            int nextterm = firstterm + secondterm; // ------ T: n & S: 1 for nextterm
            firstterm = secondterm;
            secondterm = nextterm;
            // ------ T(n) = 2n+2 -> O(n)
            // ------ S(n) = 3 -> O(1)
        }
    }

    public static void main(String [] args){
        FibonacciRange ob = new FibonacciRange();
        ob.fibo_itr();

        System.out.println("\nFibonacci using recursive method:");
        for(int i=2;i<8;i++)
            System.out.print(ob.fibo_rec(i)+" ");
    }
}
