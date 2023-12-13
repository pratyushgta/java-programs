/**
 * This class contains methods for understanding ArrayLists
 * MSA-Lab Practise 3
 *
 * @author Pratyush Kumar (github.com/pratyushgta)
 */

package Year3.Sem6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Demo3 {
    ArrayList<String> names = new ArrayList<>();

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements to add: ");
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            String ele = sc.next();
            names.add(ele);
        }
    }

    void output() {
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
    }

    public static void main(String[] args) {
        Demo3 ob = new Demo3();
        ob.input();
        ob.output();
    }
}