package Year2.classwork;

public class A7 implements printable, Showable {

    @Override
    public void show() {
        System.out.println("Welcome");
    }

    @Override
    public void print() {
        System.out.println("Hello");
    }

    public static void main(String[] args){
        A7 ob = new A7();
        ob.print();
        ob.show();
    }
}
