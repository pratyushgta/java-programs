import java.io.*;
abstract class base //super class
{
    double rad;

    base(double newrad)
    {
        rad=newrad;
    }

    void show()
    {
        System.out.println("Radius: "+rad);
    }
}

final class CalVol extends base //child class
{
    double ht;
    CalVol(double r, double h)
    {
        super(r);
        ht=h;
    }

    double volume()
    {
        return 3.14*rad*rad*ht;
    }

    void show()
    {
        super.show();
        System.out.println("Height: "+ht);
        double vol=volume();
        System.out.println("Volume: "+vol);
    }
}

public class Test2
{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.print("Enter radius: ");
        double rr=Double.parseDouble(br.readLine());
        System.out.print("Enter height: ");
        double hh=Double.parseDouble(br.readLine());
        CalVol ob=new CalVol(rr,hh);
        ob.show();
    }
}
 