package Year2;

import java.util.*;
public class add {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a noomber: ");
        int num = sc.nextInt();
        int rem, sum=0;
        int temp = num;

        while(temp > 0){
            rem = temp % 10;
            sum+=rem;
            temp = temp/10;
        }

        System.out.println("Sum of digit is: "+sum);
    }
}
