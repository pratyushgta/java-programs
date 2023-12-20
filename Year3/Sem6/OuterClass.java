/**
 * This class contains methods for understanding ArrayLists
 * MSA-THEORY [19-12-2023] Practise 1
 *
 * @author Pratyush Kumar (github.com/pratyushgta)
 */

package Year3.Sem6;

public class OuterClass {
    int num = 10;

    void outer() {
        System.out.println("This is outer class: " + num);
    }

    // non-static inner class
    public class InnerClass {
        void inner() {
            int num1 = 8;
            System.out.println("This is non-static inner class: " + num + " and " + num1);
        }
    }

    // static inner class
    public static class InnerClass2 {
        void inner2() {
            System.out.println("This is static inner class: ");
        }
    }

    // local inner class. class created inside a method
    public void InnerClassMethod() {
        class InnerClass3 {
            String str = "This is local inner class.";

            public void get() {
                System.out.println(str);
            }
        }
        // we can use the local inner class from inside the method only
        InnerClass3 ob3 = new InnerClass3();
        ob3.get();
    }


    public static void main(String[] args) {
        OuterClass ob = new OuterClass();
        ob.outer();

        // since it is not static, we will use instance of outer class to call constructor and create instance of inner class
        OuterClass.InnerClass ob1 = ob.new InnerClass();
        ob1.inner();

        // we don't need instance of outer class to create instance of inner class
        OuterClass.InnerClass2 ob2 = new OuterClass.InnerClass2();
        ob2.inner2();

        // local inner class is class inside a method
        ob.InnerClassMethod();
    }
}
