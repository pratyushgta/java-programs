/**
 * This class contains methods for rotating a string by exactly 2 places and checking if it matches with another string
 * OOPJ-E8-Q4
 * @author Pratyush Kumar (github.com/pratyushgta)
 */
package Year2;

import java.util.Scanner;

public class StringRotate {
    void rotate(String A, String B) {
        String front_rotation="";//first 2 chars from front of string get attached to back of it
        String back_rotation="";//last 2 chars from back of string get attached to front of it

        front_rotation = A.substring(2)+A.substring(0,2);
        back_rotation = A.substring(A.length()-2)+A.substring(0,A.length()-2);

        System.out.println("\nFront rotation: "+front_rotation+"\nBack rotation: "+back_rotation);

        if(B.equalsIgnoreCase(front_rotation))
            System.out.println("\nString A matches with String B using front rotation!");
        else if(B.equalsIgnoreCase(back_rotation))
            System.out.println("\nString A matches with String B using back rotation!");
        else
            System.out.println("\nString A does not match with String B using any rotation!");
    }

    public static void main(String[] args) {
        StringRotate ob = new StringRotate();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String A: ");
        String s1 = sc.nextLine();
        System.out.print("Enter a String B: ");
        String s2 = sc.nextLine();
        ob.rotate(s1,s2);
    }
}
