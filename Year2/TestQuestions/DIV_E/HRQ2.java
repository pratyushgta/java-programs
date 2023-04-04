package Year2.TestQuestions.DIV_E;

import java.util.Scanner;

public class HRQ2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = sc.nextInt();

        for(int i=1;i<11;i++)
            System.out.println(N+"*"+i+"="+(N*i));
    }
}
