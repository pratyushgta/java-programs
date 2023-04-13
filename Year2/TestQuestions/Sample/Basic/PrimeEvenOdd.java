package Year2.TestQuestions.Sample.Basic;

import java.util.Scanner;

public class PrimeEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        //prime numbers
        System.out.println("Prime numbers");
        for (int i = 2; i <= num; i++) {
            int counter = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    counter = 1;
                    break;
                }
            }
            if (counter == 0)
                System.out.print(i+" ");
        }
        System.out.println();

        //even numbers
        System.out.println("Even numbers");
        for (int i = 1; i < num; i++) {
            if (i % 2 == 0)
                System.out.print(i + " ");
        }
        System.out.println();

        //odd numbers
        System.out.println("Odd numbers");
        for (int i = 1; i < num; i++) {
            if (i % 2 != 0)
                System.out.print(i + " ");
        }
        System.out.println();

    }
}

