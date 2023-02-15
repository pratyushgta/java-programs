package Year2.codechef;

import java.util.*;

class Concat {
    public static boolean canConcatPalindrome(String a, String b) {
        String s = a + b;
        int oddChars = 0;
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
            if (freq.get(c) % 2 == 1) {
                oddChars++;
            } else {
                oddChars--;
            }
        }
        return oddChars <= 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        while (T > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            sc.nextLine();
            String a = sc.nextLine();
            String b = sc.nextLine();

            if (canConcatPalindrome(a, b)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            T--;
        }
    }
}