package Year2.TestQuestions.Sample.Exceptions;

import java.util.Scanner;

public class tcf {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        System.out.print("Enter index of element to access: ");
        int i = sc.nextInt();

        try {
            System.out.println(arr[i]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index not in range!"+e);
        } finally{
            System.out.println("Please enter an index from 0 to "+(arr.length-1));
        }
    }
}
