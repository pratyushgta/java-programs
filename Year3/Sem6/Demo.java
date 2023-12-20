/**
 * This class contains methods for understanding 9 types of basic methods & object calling
 * MSA-Lab-1 [13-12-2023] Practise 1 & Lab 2 [20-12-2023] Practise 1
 *
 * @author Pratyush Kumar (github.com/pratyushgta)
 */

package Year3.Sem6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Demo {

    void meth1() {
        System.out.println("This is under Demo class");
    }

    String meth2(String str) {
        return str;
    }

    void meth3(int[] array) {
        System.out.println(array[0]);
    }

    String[] meth4() {
        String[] str_arr = {"Jim", "Tommy", "Mickey", null};
        return str_arr;
    }

    ABC meth5() {
        ABC ob = new ABC();
        return ob;
    }

    void meth6(ABC ob1) {
        ob1.m();
    }

    ABC[] meth7() {
        ABC a1 = new ABC();
        ABC a2 = new ABC();
        ABC a3 = new ABC();

        ABC[] arr = {a1, a2, a3};
        return arr;
    }

    List<ABC> meth8() {
        ABC a1 = new ABC();
        ABC a2 = new ABC();
        ABC a3 = new ABC();

        List<ABC> list = new ArrayList<>();
        list.add(a1);
        list.add(a2);
        list.add(a3);

        return list;
    }

    Map<Integer, ABC> meth9() {
        ABC a1 = new ABC();
        ABC a2 = new ABC();
        ABC a3 = new ABC();

        HashMap<Integer, ABC> map = new HashMap<>();
        map.put(1, a1);
        map.put(2, a2);
        map.put(3, a3);

        return map;
    }

    public static void main(String[] args) {
        Demo ob = new Demo();

        System.out.println("Output of meth1:");
        ob.meth1();

        System.out.println("\nOutput of meth2:");
        String res = ob.meth2("Apples");
        System.out.println(res);

        System.out.println("\nOutput of meth3:");
        int[] arr = {1, 2, 3, 4};
        ob.meth3(arr);

        System.out.println("\nOutput of meth4:");
        String[] arr1 = ob.meth4();
        System.out.println(arr1[0]);

        System.out.println("\nOutput of meth5:");
        ABC obj = ob.meth5();
        obj.m();

        System.out.println("\nOutput of meth6:");
        ABC obj1 = new ABC();
        ob.meth6(obj1);

        System.out.println("\nOutput of meth7:");
        ABC[] arr2 = ob.meth7();
        System.out.println(arr2[1]);
        arr2[1].m();

        System.out.println("\nOutput of meth8:");
        List<ABC> l = ob.meth8();
        System.out.println(l);
        l.get(0).m();

        System.out.println("\nOutput of meth9:");
        Map<Integer, ABC> map = ob.meth9();
        System.out.println(map);
        map.get(1).m();


    }
}

class ABC {
    void m() {
        System.out.println("This is under ABC class");
    }
}
