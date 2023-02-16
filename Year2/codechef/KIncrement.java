/**
 * These classes contain methods for
 * CC-A1-Q7 [STARTER 77 on 15-02-2023]
 * GIVES WRONG OUTPUT FOR ALL HIDDEN TEST CASES
 * @author Pratyush Kumar (github.com/pratyushgta)
 */

package Year2.codechef;

import java.util.Scanner;

public class KIncrement {
    public static boolean canMakePalindrome(int[] A, int K) {
        int oddCount = 0;
        for (int x : A) {
            if (x % 2 == 1) {
                oddCount++;
            }
        }
        if (oddCount > 1) {
            return false;
        }
        if (K > A.length) {
            return false;
        }
        if (K == 1) {
            return true;
        }
        if (K % 2 == 0) {
            boolean allEven = true;
            for (int x : A) {
                if (x % 2 == 1) {
                    allEven = false;
                    break;
                }
            }
            if (allEven) {
                return true;
            }
        } else {
            boolean hasEven = false;
            for (int x : A) {
                if (x % 2 == 0) {
                    hasEven = true;
                    break;
                }
            }
            if (!hasEven) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt();
            int K = scanner.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = scanner.nextInt();
            }
            if (canMakePalindrome(A, K)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
