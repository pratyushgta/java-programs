/**
 * This class contains methods for checking if no. is odd or even
 * OOPJ-E1-Q6
 * @author Pratyush Kumar (github.com/pratyushgta)
 */

package Year2;
import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter a number: ");
        num = sc.nextInt();

        if(num%2==0)
            System.out.println("Number is even");
        else
            System.out.println("Number is odd");
    }

}
