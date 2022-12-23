package Year2;

/**
 * This class contains methods for finding fibonacci series between 2 and 7
 * Using recursive and iterative methods
 * DAA-E2-Q6
 * @author Pratyush Kumar (github.com/pratyushgta)
 */

public class FibonacciRange {
    int fibo_rec(int n){
        if(n<=1)
            return n;
        return fibo_rec(n-1) + fibo_rec(n-2);
    }

    void fibo_itr() {
        int firstterm = 0;
        int secondterm = 1;

        System.out.println("Fibonacci using iterative method:");
        for(int i=0;i<10;i++){
            if(i>1 && i<8)
                System.out.print(firstterm+" ");
            int nextterm = firstterm + secondterm;
            firstterm = secondterm;
            secondterm = nextterm;
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
