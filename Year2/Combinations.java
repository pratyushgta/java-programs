package Year2;

public class Combinations {
    public static void main(String[] args) {
        int n = 4;
        String  zero="";
        for (int i = 0; i < Math.pow(2,n); i++) {
            String bin = Integer.toBinaryString(i);
            if(bin.length()<n){
                for(int j=0;j<(n-bin.length());j++){
                    zero+="0";
                }
            }
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
            System.out.println(final_bin);
            zero = "";
        }
    }
}
