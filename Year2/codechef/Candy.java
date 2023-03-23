/**
 * These classes contain methods for
 * CC-A2-Q1 [STARTER82  on 22-03-2023]
 *
 * @author Pratyush Kumar (github.com/pratyushgta)
 */

package Year2.codechef;

import java.util.Scanner;

public class Candy {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        while(T>0) {
           int N = sc.nextInt();
           if(N%3==0){
               System.out.println("YES");
           } else{
               System.out.println("NO");
           }
            T--;
        }
    }
}
