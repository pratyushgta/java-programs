/**
 * This class contains methods for testing basic functions
 * OOPJ
 * @author Pratyush Kumar (github.com/pratyushgta)
 */

package Year2;

import java.util.*;
 class hello {
     Scanner sc = new Scanner(System.in);


    public static void main(String[]args) {
        int a = 20;
        int b = 10;
        int c = a + b;
        System.out.println("Hello World\nSum is: " + c);
        System.out.println(a + " " + b);

        if (c % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");

        for(int i=0; i<5;i++){
            System.out.print(i+" ");
        }
    }
}

