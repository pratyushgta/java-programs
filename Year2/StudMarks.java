package Year2;

import java.util.*;

public class StudMarks {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sum = 0, avg = 0, marks = 0;
        int count = 5;

        System.out.println("Enter student marks: ");
        while(count > 0){
            System.out.println("Enter marks for subject "+(count+1));
            marks = sc.nextInt();

            sum+=marks;
            count--;
        }

        System.out.println("Total marks: "+sum+"\nAverage marks: "+(sum/count));
    }
}

