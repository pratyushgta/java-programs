//NOT COMPLETE
package Year2.codechef;

import java.util.*;

class Concat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // number of test cases
        while (T-- > 0) {
            int n = sc.nextInt(); // number of strings
            String[] arr = new String[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.next();
            }
            int numEven = 0, numOdd = 0;
            for (int i = 0; i < n; i++) {
                if (isPalindrome(arr[i])) {
                    numEven++;
                } else {
                    numOdd++;
                }
            }
            int ans = numEven * (numEven - 1) / 2 + numEven * numOdd;
            System.out.println(ans);
        }
    }

    // utility method to check if a string is a palindrome
    private static boolean isPalindrome(String s) {
        int n = s.length();
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
