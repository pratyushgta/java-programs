/**
 * This class contains methods for understanding Interfaces in java
 * OOPJ
 * @author Pratyush Kumar (github.com/pratyushgta)
 */

package Year2.classwork;

public class A6 implements printable {
    public void print(){
        System.out.println("Hello!");
    }

    public static void main(String[] args){
        A6 obj = new A6();
        obj.print();
    }
}
