package Year2.TestQuestions.Sample.Abstract;

abstract class ShapeX {
    abstract void area();

    abstract void perimeter();
}

class CircleX extends ShapeX {
    int r = 5;

    void area() {
        System.out.println("Area of Circle is: " + (Math.PI * r * r));
    }

    public void perimeter() {
        System.out.println("Perimeter of Circle is: " + (2 * Math.PI * r));
    }
}

class RectangleX extends ShapeX {
    int l;
    int b;

    public void area() {
        System.out.println("Area of Rectangle is: " + (l * b));
    }


    public void perimeter() {
        System.out.println("Perimeter of Rectangle is: " + (2 * (l + b)));
    }
}

public class SampleX {
    public static void main(String[] args) {
        ShapeX ob = new CircleX();
       // ob.r = 5;
        ob.area();
        ob.perimeter();

        RectangleX ob1 = new RectangleX();
        ob1.l = 3;
        ob1.b = 2;
        ob1.area();
        ob1.perimeter();
    }
}