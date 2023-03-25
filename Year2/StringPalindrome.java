/**
 * This class contains methods for checking if a string is Palindrome or not
 * OOPJ-E8-Q3
 * @author Pratyush Kumar (github.com/pratyushgta)
 */
package Year2;

import java.util.Scanner;

public class StringPalindrome {
    void CheckPalindrome(String str) {
        String rev = "";
        for (int i = str.length()-1; i >= 0; i--) {
            rev+=str.charAt(i);
        }
        if(rev.equalsIgnoreCase(str))
            System.out.println("String is PALINDROME!");
        else
            System.out.println("String is NOT PALINDROME!");
    }

    public static void main(String[] args) {
        StringPalindrome ob = new StringPalindrome();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s = sc.nextLine();
        ob.CheckPalindrome(s);
    }
}
