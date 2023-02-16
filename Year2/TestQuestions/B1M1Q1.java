/**
 * These classes contain methods for finding prime and non-prime numbers
 * OOPJ-B1-M1-Q1
 *
 * @author Pratyush Kumar (github.com/pratyushgta)
 */

package Year2.TestQuestions;

import java.util.*;
public class B1M1Q1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter: ");
        int n = sc.nextInt();

        if(n%2==0) {
            //even
        }
        if(n==0 || n==1)
            System.out.println("Not prime");
        else{
            int counter = 0;
            for(int i=2;i<n/2;i++){
                if(n%i==0){
                    counter = 1;
                    break;
                }
            }

            if(counter == 1)
                System.out.println("Not prime");
            else
                System.out.println("Prime");
        }
    }
}
