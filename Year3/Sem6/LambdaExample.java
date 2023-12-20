/**
 * This class contains methods for understanding Lambda Expressions in Java
 * MSA-Lab-2 [20-12-2023] Practise 1
 *
 * @author Pratyush Kumar (github.com/pratyushgta)
 */

package Year3.Sem6;

interface Printable {
    public void print();
}

interface Addable {
    int add(int x, int y);
}

public class LambdaExample {
    public static void main(String[] args) {
        Printable ob = new Printable() {
            public void print() {
                System.out.println("Without using lambda");
            }
        };
        ob.print();

        Printable ob1 = () -> System.out.println("Using lambda");
        ob1.print();

        Addable ob2 = new Addable() {
            @Override
            public int add(int x, int y) {
                return x + y;
            }
        };
        int r1 = ob2.add(10, 20);
        System.out.println("Without using lambda: " + r1);
        Addable ob3 = (x, y) -> (x + y);
        int r3 = ob3.add(10, 20);
        System.out.println("Using lambda: " + r3);


    }
}
