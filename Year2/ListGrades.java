/**
 * This class contains methods for entering marks in a list and finding the grade
 * OOPJ-E10-Q2
 *
 * @author Pratyush Kumar (github.com/pratyushgta)
 */

package Year2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class ListGrades {
    ArrayList<Double> scores = new ArrayList<>();
    int n;

    void readdata() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print("How many scores do you wish to enter: ");
        n = Integer.parseInt(br.readLine());

        System.out.println("\n>>> Input Marks <<<");
        for (int i = 0; i < n; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            scores.add(Double.parseDouble(br.readLine()));
        }
    }

    void compute() {
        double total = 0, avg = 0;
        char grade;
        for (int i = 0; i < n; i++) {
            total += scores.get(i);
        }

        avg = (total / n);


        if (avg >= 90)
            grade = 'A';
        else if (avg >= 80)
            grade = 'B';
        else if (avg >= 60)
            grade  = 'C';
        else if (avg >= 40)
            grade  = 'D';
        else
            grade  = 'F';

        System.out.println("\nAverage marks: "+avg+"\nGrade: "+grade);
    }
    public static void main(String[] args) throws IOException {
        ListGrades ob = new ListGrades();
        ob.readdata();
        ob.compute();
    }
}


