/**
 * These classes contain methods for
 * CC-A2-Q1 [STARTER 78 on 22-02-2023]
 *
 * @author Pratyush Kumar (github.com/pratyushgta)
 */
package Year2.codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class PassingMarks {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        PassingMarks ob = new PassingMarks();
        int T = sc.nextInt();
        while (T > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int[] scores = new int[n];
            for (int i = 0; i < n; i++) {
                scores[i] = sc.nextInt();
            }
            ob.bubble_sort(scores);
            int passingMark = scores[n - x];
            System.out.println(passingMark-1);
            T--;
        }
    }

    void bubble_sort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < (a.length - i - 1); j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }
}
