/**
 * These classes contain methods for
 * CC-A1-Q3 [STARTER 77 on 15-02-2023]
 *
 * @author Pratyush Kumar (github.com/pratyushgta)
 */

package Year2.codechef;

import java.util.Scanner;

public class Tekken {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        while (T > 0) {
            String[] input = sc.nextLine().split("\\s+");
            int A = Integer.parseInt(input[0]);
            int B = Integer.parseInt(input[1]);
            int C = Integer.parseInt(input[2]);

            int min = Math.min(B, C);
            B -= min;
            C -= min;

            if (A > B && A > C) {
                System.out.println("YES");
            } else
                System.out.println("NO");
            T--;
        }
    }
}
