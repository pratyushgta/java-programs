package Year2;

import java.util.*;
/**
 * This class contains methods for printing sum of digits of a number
 * OOPJ
 * @author Pratyush Kumar (github.com/pratyushgta)
 */
public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 0;

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        int rev = 0;
        int temp = num;
        while(temp > 0){
            int digit = temp%10;
            rev = rev*10 + digit;
            temp = temp / 10;
        }
        System.out.println("OG number: "+num+"\nReverse: "+rev);
    }
}