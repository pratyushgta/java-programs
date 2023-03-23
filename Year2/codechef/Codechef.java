/**
 * These classes contain methods for
 * CC-A2-Q4 [STARTER82  on 22-03-2023]
 *
 * @author Pratyush Kumar (github.com/pratyushgta)
 */

package Year2.codechef;

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int A[] = new int[n];
            boolean X = false;
            boolean Y = false;

            for (int i = 0; i < n; i++) {
                A[i] = sc.nextInt();
                if (A[i] == 1) {
                    X = true;
                }
            }
            int B[] = new int[n];
            for (int i = 0; i < n; i++) {
                B[i] = sc.nextInt();
                if (B[i] == 1) {
                    Y = true;
                }
            }
            boolean result = true;
            if (A[0] != B[0]) {
                result = false;
            }
            if (A[n - 1] != B[n - 1]) {
                result = false;
            }
            int vx = 0;
            int vy = 0;
            for (int i = 0; i < n; i++) {
                if (A[i] == 0)
                    vx++;
                else
                    vy++;
            }
            for (int i = 1; i < n - 1; i++) {
                if (A[i] != B[i] && A[i] == 0 && vy == 0) {
                    result = false;
                } else if (A[i] != B[i] && A[i] == 1) {
                    result = false;
                }
            }
            if (result) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
