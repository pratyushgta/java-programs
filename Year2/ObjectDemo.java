/**
 * This class contains methods for adding two numbers
 * OOPJ
 * @author Pratyush Kumar (github.com/pratyushgta)
 */

package Year2;
class Calc {
    int num;
    int num_2;
    int res;

    public void perform() {
        res = num + num_2;
    }
}

public class ObjectDemo {
    public static void main(String[] args) {
        Calc ob = new Calc();
        ob.num = 5;
        ob.num_2 = 3;
        ob.perform();
        System.out.println("Addition is: " + ob.res);
    }
}
