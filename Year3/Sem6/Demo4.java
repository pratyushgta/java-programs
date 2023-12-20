/**
 * This class contains methods for understanding Java Collections: HashMaps
 * MSA-Lab-2 [20-12-2023] Practise 1
 *
 * @author Pratyush Kumar (github.com/pratyushgta)
 */

package Year3.Sem6;

import java.util.HashMap;
import java.util.Map;

public class Demo4 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "cow");
        map.put(2, "lion");
        ABC2 ob = new ABC2();
        map.put(3, ob.m());
        System.out.println(map);

    }
}

class ABC2 {
    String m() {
        return "Inside ABC class";
    }
}

