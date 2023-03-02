package Year2.TestQuestions.DIV_E;

import java.util.Scanner;

public class SBM2Q3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a noomber: ");
        int a = sc.nextInt();
        try{
           int sum = a/0;
        } catch (Exception e){
            System.out.println("Can't divide by zero!");
        }
    }
}
