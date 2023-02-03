/**
 * This class contains methods for finding prime factors of numbers
 * OOPJ-E3.2-Q2
 *
 * @author Pratyush Kumar (github.com/pratyushgta)
 */

package Year2;

import java.util.*;

public class Prime_factors {
    int[] num;
    int n;

    Prime_factors() {
        num = new int[200];
        n = 0;
    }

    void readsize(int nx) {
        n = nx;
        num = new int[n];
    }

    void get_numbers() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + n + " numbers: ");
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
    }

    void show_primefact() {
        for (int i = 0; i < n; i++) {
            System.out.print("Prime factor of "+num[i]+" are ");
            for (int j = 2; j < num[i]; j++) {
                while (num[i] % j == 0){
                    System.out.print(j+", ");
                    num[i] = num[i]/j;
                }
            }
            if(num[i] >2) {
                System.out.println(num[i]);
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Prime_factors ob = new Prime_factors();
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        ob.readsize(size);
        ob.get_numbers();
        ob.show_primefact();
    }
}
