/**
 * These classes contain methods for implementing a simple calculator
 * OOPJ
 * @author Pratyush Kumar (github.com/pratyushgta)
 */

package Year2;
import java.util.*;
public class calculator2 implements calculate{
    public void add(int x, int y) {
        System.out.println("\nAddition is: "+(x+y));

    }
    public void sub(int x, int y) {
        System.out.println("Difference is: "+(x-y));
    }

    public void prod(int x, int y) {
        System.out.println("Product is: "+(x*y));
    }

    public void div(int x, int y) {
        System.out.println("Division is: "+(x/y));
    }

    public static void main(String[] args){
        calculator2 ob = new calculator2();
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        a= sc.nextInt();
        System.out.print("Enter number 2: ");
        b= sc.nextInt();

        ob.add(a,b);
        ob.sub(a,b);
        ob.prod(a,b);
        ob.div(a,b);

    }
}
