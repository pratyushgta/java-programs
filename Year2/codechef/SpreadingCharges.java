/**
 * These classes contain methods for
 * CC-A1-Q6 [STARTER 77 on 15-02-2023]
 *
 * @author Pratyush Kumar (github.com/pratyushgta)
 */

package Year2.codechef;
import java.util.*;
import java.lang.*;

class SpreadingCharges
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            String s = scanner.next();
            int c1 = 0, c = 0, S = 0, E = 0;
            boolean check = true;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '0') {
                    c1++;
                }
                if (s.charAt(i) == '0' && check) {
                    S = i;
                    E = i;
                    check = false;
                } else {
                    if (s.charAt(i) == '0') {
                        E = i;
                    } else {
                        check = true;
                        if (S != 0 && E != n - 1) {
                            if ((s.charAt(S - 1) == '+' && s.charAt(E + 1) == '-') || (s.charAt(S - 1) == '-' && s.charAt(E + 1) == '+')) {
                                if ((E - S + 1) % 2 != 0) {
                                    c++;
                                }
                            }
                        }
                        S = E = 0;
                    }
                }
            }
            if (c1 == n) {
                c = c1;
            }
            System.out.println(c);
        }
    }
}