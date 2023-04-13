package Year2.TestQuestions.Sample.Abstract;


abstract class Multiply {

    public abstract int MultiplyTwo(int n1, int n2);

    public abstract int MultiplyThree(int n1, int n2, int n3);

    public void show() {
        System.out.println("Method of abstract class Multiply");
    }
}

class AbstractMethodEx1 extends Multiply {
    public int MultiplyTwo(int num1, int num2) {
        return num1 * num2;
    }

    public int MultiplyThree(int num1, int num2, int num3) {
        return num1 * num2 * num3;
    }

    public static void main(String[] args) {
        Multiply ob = new AbstractMethodEx1();
        System.out.println("Multiplication of 2 numbers: " + ob.MultiplyTwo(10, 50));
        System.out.println("Multiplication of 3 numbers: " + ob.MultiplyThree(5, 8, 10));
        ob.show();
    }
}
