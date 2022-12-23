package Year2;

import java.util.*;
/**
 * This class contains methods for printing sum of digits of a number
 * OOPJ
 * @author Pratyush Kumar (github.com/pratyushgta)
 */
public class DigitSum {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a noomber: ");
        int num = sc.nextInt();
        int rem, sum=0;
        int temp = num;

        while(temp > 0){
            rem = temp % 10;
            sum+=rem;
            temp = temp/10;
        }

        System.out.println("Sum of digit is: "+sum);
    }
}
