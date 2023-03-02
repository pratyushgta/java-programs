package Year2.TestQuestions.DIV_E;

class shapes {
    public void draw() {
        System.out.println("Drawing a shape");
    }

    public void erase() {
        System.out.println("Erasing a shape");
    }
}

class circle extends shapes{
    public void draw() {
        System.out.println("Drawing circle");
    }

    public void erase() {
        System.out.println("Erasing circle");
    }
}

class triangle extends shapes{
    public void draw() {
        System.out.println("Drawing triangle");
    }

    public void erase() {
        System.out.println("Erasing triangle");
    }
}

class square extends shapes{
    public void draw() {
        System.out.println("Drawing square");
    }

    public void erase() {
        System.out.println("Erasing square");
    }
}

public class SBM2Q2 {
    public static void main(String[] args){
        shapes ob1 = new square();
        shapes ob2 = new triangle();
        shapes ob3 = new circle();
        ob1.draw();
        ob1.erase();
        ob2.draw();
        ob2.erase();
        ob3.draw();
        ob3.erase();
    }
}