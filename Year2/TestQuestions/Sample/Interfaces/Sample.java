package Year2.TestQuestions.Sample.Interfaces;

class Circle implements Shape{
    int r;
    @Override
    public void area() {
        System.out.println("Area of Circle is: "+(Math.PI*r*r));
    }

    @Override
    public void perimeter() {
        System.out.println("Perimeter of Circle is: "+(2*Math.PI*r));
    }
}

class Rectangle implements Shape{
    int l;
    int b;
    @Override
    public void area() {
        System.out.println("Area of Rectangle is: "+(l*b));
    }

    @Override
    public void perimeter() {
        System.out.println("Perimeter of Rectangle is: "+(2*(l+b)));
    }
}
public class Sample{
    public static void main(String[] args){
        Circle ob = new Circle();
        ob.r = 5;
        ob.area();
        ob.perimeter();

        Rectangle ob1 = new Rectangle();
        ob1.l = 3;
        ob1.b = 2;
        ob1.area();
        ob1.perimeter();
    }
}
