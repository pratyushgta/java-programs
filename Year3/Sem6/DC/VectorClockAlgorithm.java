/**
 * This class contains methods to simulate the functioning of Vector clock
 * DC-E8
 *
 * @author Pratyush Kumar (github.com/pratyushgta)
 */
package Year3.Sem6.DC;

import java.util.Arrays;
import java.util.Scanner;

public class VectorClockAlgorithm {
    int[] vector;
    int processId;

    VectorClockAlgorithm(int n, int processId) {
        this.vector = new int[n];
        this.processId = processId;
    }

    public void increment() {
        vector[processId]++;
    }

    public int get(int i) {
        return vector[i];
    }

    public void update(VectorClockAlgorithm local) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = Math.max(vector[i], local.vector[i]);
        }
    }

    public static void main(String[] args) {
        System.out.println(">>VECTOR CLOCK<<");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total processes: ");
        int n = sc.nextInt();

        VectorClockAlgorithm vc0 = new VectorClockAlgorithm(n, 0);
        VectorClockAlgorithm vc1 = new VectorClockAlgorithm(n, 1);

        VectorClockAlgorithm vc2 = new VectorClockAlgorithm(n, 2);

        System.out.println("\nP0 sends message to P1");
        vc0.increment();
        System.out.println("P0: " + Arrays.toString(vc0.vector));

        System.out.println("\nP1 receives message from P0");
        vc1.increment();
        vc1.update(vc0);
        System.out.println("P1: " + Arrays.toString(vc1.vector));

        System.out.println("\nP2 sends message to P0");
        vc2.increment();
        System.out.println("P2: " + Arrays.toString(vc2.vector));
        System.out.println("\nP2 sends message to P1");
        vc2.increment();
        System.out.println("P2: " + Arrays.toString(vc2.vector));

        System.out.println("\nP0 receives message from P2");
        vc0.increment();
        vc0.update(vc2);
        System.out.println("P0: " + Arrays.toString(vc0.vector));
        System.out.println("\nP1 receives message from P2");
        vc1.increment();
        vc1.update(vc2);
        System.out.println("P1: " + Arrays.toString(vc1.vector));

        System.out.println("\n-> Final Clock Values: ");
        System.out.println("P0: " + Arrays.toString(vc0.vector));
        System.out.println("P1: " + Arrays.toString(vc1.vector));
        System.out.println("P2: " + Arrays.toString(vc2.vector));
    }
}
