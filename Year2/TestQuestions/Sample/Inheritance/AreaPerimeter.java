package Year2.TestQuestions.Sample.Inheritance;

import java.util.Scanner;

class Rectangle{
    int length;
    int breadth;
    Rectangle(int l, int b){
        length = l;
        breadth = b;
    }

    void area(){
        System.out.println("Area is: "+(length*breadth));
    }

    void perimeter(){
        System.out.println("Perimeter is: "+2*(length+breadth));
    }
}

class Square extends Rectangle{
    Square(int s){
        super(s,s);

    }
    void area(){
        System.out.println("Area of rectangle is: "+(length*breadth));
    }

    void perimeter(){
        System.out.println("Perimeter of rectangle is: "+2*(length+breadth));
    }
}
public class AreaPerimeter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(">>RECTANGLE<<");
        System.out.print("Enter length: ");
        int l = sc.nextInt();
        System.out.print("Enter breadth: ");
        int b = sc.nextInt();
        Rectangle ob = new Rectangle(l,b);
        ob.area();
        ob.perimeter();

        System.out.println(">>AREA<<");
        System.out.print("Enter side: ");
        int s = sc.nextInt();
        Square ob1 = new Square(s);
        ob1.area();
        ob1.perimeter();
    }
}
