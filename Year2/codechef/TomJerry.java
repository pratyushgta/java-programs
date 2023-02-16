/**
 * These classes contain methods for
 * CC-A1-Q1 [STARTER 77 on 15-02-2023]
 *
 * @author Pratyush Kumar (github.com/pratyushgta)
 */

package Year2.codechef;

import java.util.Scanner;

public class TomJerry {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        while(T>0) {
            String[] input = sc.nextLine().split("\\s+");
            int X = Integer.parseInt(input[0]);
            int Y = Integer.parseInt(input[1]);
            if (X < Y) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            T--;
        }
    }
}
