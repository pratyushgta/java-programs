/**
 * This class contains methods for reversing a string
 * OOPJ-E8-Q1
 * @author Pratyush Kumar (github.com/pratyushgta)
 */

package Year2;

import java.util.Scanner;

public class StringReverse {
    void reverse(String str) {
        String[] temp = str.split(" ");
        String rev = "";
        for (int i = temp.length - 1; i >= 0; i--) {
            rev += temp[i] + " ";
        }
        System.out.println("String in reverse: " + rev);
    }

    public static void main(String[] args) {
        StringReverse ob = new StringReverse();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s = sc.nextLine();
        ob.reverse(s);
    }
}