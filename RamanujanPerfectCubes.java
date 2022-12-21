import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class RamanujanPerfectCubes {
    // Function to check if N can be represented
    // as sum of two perfect cubes or not
    public static void sumOfTwoPerfectCubes(int N) {

        // Stores the perfect cubes
        // of first N natural numbers
        HashMap<Integer, Integer> cubes = new HashMap<>();
        for (int i = 1; i * i * i <= N; i++)
            cubes.put((i * i * i), i);

        // Traverse the map
        Iterator<Map.Entry<Integer, Integer>> itr
                = cubes.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry<Integer, Integer> entry = itr.next();

            // Stores first number
            int firstNumber = entry.getKey();

            // Stores second number
            int secondNumber = N - entry.getKey();

            // Search the pair for the first
            // number to obtain sum N from the Map
            if (cubes.containsKey(secondNumber)) {
                System.out.println("True");
                return;
            }
        }

        // If N cannot be represented as
        // sum of two positive perfect cubes
        System.out.println("False");
    }

    // Driver code
    public static void main(String[] args) {
        int N = 729;

        // Function call to check if N
        // can be represented as
        // sum of two perfect cubes or not
        sumOfTwoPerfectCubes(N);
    }
}
