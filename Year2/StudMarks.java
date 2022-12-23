/**
 * This class contains methods for finding sum and average of marks in 5 subj.
 * OOPJ-E1-Q3
 * @author Pratyush Kumar (github.com/pratyushgta)
 */

package Year2;

import java.util.*;

public class StudMarks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sum = 0, marks;

        System.out.println("---INPUT MARKS---");
        for(int i=0;i<5;i++){
            System.out.print("Enter marks for subject "+(i+1)+": ");
            marks = sc.nextInt();
            sum+=marks;
        }

        System.out.println("Total marks: "+sum+"\nAverage marks: "+(sum/5));
    }
}

