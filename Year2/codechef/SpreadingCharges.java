//NOT COMPLETE
package Year2.codechef;

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static int countNeutralObjects(String S) {
        int N = S.length();
        char[] arr = S.toCharArray();

        boolean hasChanged = true;
        while (hasChanged) {
            hasChanged = false;
            for (int i = 0; i < N; i++) {
                if (arr[i] == '0') {
                    int countPlus = 0;
                    int countMinus = 0;
                    if (i > 0) {
                        if (arr[i-1] == '+') countPlus++;
                        else if (arr[i-1] == '-') countMinus++;
                    }
                    if (i < N-1) {
                        if (arr[i+1] == '+') countPlus++;
                        else if (arr[i+1] == '-') countMinus++;
                    }
                    if (countPlus == 1 && countMinus == 0) {
                        arr[i] = '+';
                        hasChanged = true;
                    } else if (countPlus == 0 && countMinus == 1) {
                        arr[i] = '-';
                        hasChanged = true;
                    } else if (countPlus == 1 && countMinus == 1) {
                        // Do nothing, leave it as neutral
                    } else if (countPlus == 2 && countMinus == 0) {
                        arr[i] = '+';
                        hasChanged = true;
                    } else if (countPlus == 0 && countMinus == 2) {
                        arr[i] = '-';
                        hasChanged = true;
                    }
                }
            }
        }

        int countNeutral = 0;
        for (char c : arr) {
            if (c == '0') countNeutral++;
        }
        return countNeutral;
    }

    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            String S=sc.next();
            int c=countNeutralObjects(S);
            System.out.println(c);

        }
    }
}