/**
 * These classes contain methods for
 * CC-A2-Q1 [STARTER82  on 22-03-2023]
 *
 * @author Pratyush Kumar (github.com/pratyushgta)
 */

package Year2.codechef;

import java.util.Scanner;

public class ReachHome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        while (T > 0) {
            String[] input = sc.nextLine().split("\\s+");
            int X = Integer.parseInt(input[0]);
            int Y = Integer.parseInt(input[1]);

            int canTravel = X * 5;
            if (canTravel < Y) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }

            T--;
        }
    }
}
