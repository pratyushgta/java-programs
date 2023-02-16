/**
 * These classes contain methods for
 * CC-A1-Q7 [STARTER 77 on 15-02-2023]
 * GIVES WRONG OUTPUT FOR ALL HIDDEN TEST CASES
 *
 * @author Pratyush Kumar (github.com/pratyushgta)
 */

package Year2.codechef;

import java.util.Arrays;
import java.util.Scanner;

public class XORsort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            int maxBit = 31 - Integer.numberOfLeadingZeros(a[n - 1]);
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                b[i] = a[i] ^ ((1 << maxBit) - 1);
            }
            Arrays.sort(b);
            for (int i = 0; i < n; i++) {
                System.out.print((a[i] ^ b[i]) + " ");
            }
            System.out.println();
        }
    }
}
