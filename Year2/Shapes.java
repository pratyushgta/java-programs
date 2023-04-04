package Year2;

import java.util.*;

class Box{
    double width, length, height;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter width, length, height of the box: ");
        width = sc.nextDouble();
        length = sc.nextDouble();
        height = sc.nextDouble();
    }
    void volume(){
        double volume = width*length*height;
        System.out.print("The valume is: "+volume);
    }
}
public class Shapes {
    public static void main(String[] args) {
        Box ob = new Box();
        ob.input();
        //System.out.println(ob.width+" "+ob.length+" "+ob.height);
        ob.volume();
    }
}