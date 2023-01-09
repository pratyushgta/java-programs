/**
 * This class contains methods for printing all possible combinations of truth values
 * DAA-E2-Q2
 * @author Pratyush Kumar (github.com/pratyushgta)
 */

package Year2;

import java.util.*;

public class Combinations {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //Input
        System.out.print("Enter number of variables: ");
        int n = sc.nextInt();

        //Converting decimal to binary
        String  zero="";
        for (int i = 0; i < Math.pow(2,n); i++) { // ------ T: 2^n
            String bin = Integer.toBinaryString(i);
            if(bin.length()<n){
                for(int j=0;j<(n-bin.length());j++){
                    zero+="0";
                }
            }
            //Adding extra 0's (False)
            String combined = zero+bin;
            String final_bin="";
            for(int k=0;k<combined.length();k++){
                if(combined.charAt(k) == '1'){
                    final_bin+="True\t";
                }
                else {
                    final_bin+="False\t";
                }
            }

            //Output
            System.out.println(final_bin);
            zero = "";
        }
    }
}



