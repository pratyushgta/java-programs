package Year2.codechef;

import java.util.Scanner;

public class ValidExpression {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            int x = input.nextInt();
            if (x < n || x > n * (n + 1) / 2 || x < n * (1 - n) / 2) {
                System.out.println("-1");
            } else {
                StringBuilder sb = new StringBuilder();
                int sum = n * (n + 1) / 2;
                int diff = sum - x;
                int sign = 1;
                for (int i = 1; i <= n; i++) {
                    if (diff >= i) {
                        sb.append(sign == 1 ? "+" : "-");
                        diff -= i;
                    } else {
                        sb.append("*");
                        sign = -1;
                    }
                }
                System.out.println(sb);
            }
        }
        input.close();
    }
}
