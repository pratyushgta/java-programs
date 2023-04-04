/**
 * This class contains methods for finding the largest subsequence of consecutive integers in list
 * OOPJ-E10-Q3
 *
 * @author Pratyush Kumar (github.com/pratyushgta)
 */

package Year2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ListLargest {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print("Enter size: ");
        int n = Integer.parseInt(br.readLine());

        ArrayList<Integer> numArr = new ArrayList<>();
        System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            numArr.add(Integer.parseInt(br.readLine()));
        }


        ArrayList<Integer> current = new ArrayList<>();
        ArrayList<Integer> largest = new ArrayList<>();
        //current.add(numArr.get(0));
        for (int i = 0; i < n; i++) {
            if (i > 0 && numArr.get(i) == current.get(current.size()-1) + 1)
                current.add(numArr.get(i));
            else {
                if (current.size() > largest.size()) {
                    largest = new ArrayList<>(current);
                }
                current = new ArrayList<>();
                current.add(numArr.get(i));
            }
        }

        if (current.size() > largest.size()) {
            largest = new ArrayList<>(current);
        }

        System.out.println("Largest subsequence is:");
        for (int i = 0; i < largest.size(); i++) {
            System.out.print(largest.get(i) + " ");
        }
        System.out.println();
    }
}
