/**
 * This class contains methods for randomly selecting a name from list
 * OOPJ-E10-Q1
 *
 * @author Pratyush Kumar (github.com/pratyushgta)
 */

package Year2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ListRandom {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.print("How many names do you wish to enter: ");
        int n = Integer.parseInt(br.readLine());
        ArrayList<String> names = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names.add(br.readLine());
        }

        Random rand = new Random();
        int random = 0;
        random = rand.nextInt(n);

        System.out.println("Winner is: "+names.get(random));
    }
}
