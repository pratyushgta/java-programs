/**
 * These classes contain methods for
 * OOPJ
 * @author Pratyush Kumar (github.com/pratyushgta)
 */


package Year2;
abstract class Shape{
    final int b =20;
    public void display(){
        System.out.println("This is aa display method");
    }
    abstract public void calculateArea();
}
class Rectangle extends Shape{
    public static void main(String[] args){
        Rectangle obj = new Rectangle();
        obj.display();
        obj.calculateArea();
    }
    public void calculateArea() {
        int l = 10;
        int b = 20;
        int area = l*b;
        System.out.println("Area: "+area);
    }
}
