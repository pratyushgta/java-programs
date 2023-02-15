package Year2.codechef;

import java.util.Scanner;

public class Airlines {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        while(T>0) {
            String[] input = sc.nextLine().split("\\s+");
            int X = Integer.parseInt(input[0]);
            int Y = Integer.parseInt(input[1]);
            int Z = Integer.parseInt(input[2]);

            int cap = X * 10;
            if(Y <= cap){
                System.out.println(Y*Z);
            } else {
                System.out.println(10*X*Z);
            }
            T--;
        }
    }
}
