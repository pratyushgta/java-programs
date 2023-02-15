package Year2.codechef;

import java.util.Scanner;

public class ThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        while (T > 0) {
            String[] input = sc.nextLine().split("\\s+");
            long A = Long.parseLong(input[0]);
            long B = Long.parseLong(input[1]);
            long C = Long.parseLong(input[2]);

            long X = Math.abs(A - B);
            long Y = Math.abs(A - C);
            long Z = Math.abs(B - C);

            if (X % 2 == 1 || Y % 2 == 1 || Z % 2 == 1) {
                System.out.println("-1");
            } else {
                long ans = 0;
                while (true) {
                    if (A == B && B == C) {
                        break;
                    }
                    if (A >= B && A >= C) {
                        long diff = Math.min(A - B, A - C);
                        if (diff == 0) {
                            diff = Math.max(A - B, A - C);
                        }
                        ans += (diff / 2);
                        A -= (diff / 2);
                        B += (diff / 2);
                        C += (diff / 2);
                    } else if (B >= A & B >= C) {
                        long diff = Math.min(B - A, B - C);
                        if (diff == 0) {
                            diff = Math.max(B - A, B - C);
                        }
                        ans += (diff / 2);
                        A += (diff / 2);
                        B -= (diff / 2);
                        C += (diff / 2);
                    } else if (C >= A && C >= B) {
                        long diff = Math.min(C - B, C - A);
                        if (diff == 0) {
                            diff = Math.max(C - B, C - A);
                        }
                        ans += (diff / 2);
                        A += (diff / 2);
                        B += (diff / 2);
                        C -= (diff / 2);
                    }
                }
                System.out.println(ans);
            }
            T--;
        }
    }
}