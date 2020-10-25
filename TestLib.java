import java.io.*;
abstract class library
{
    protected String title;
    protected String author;
    protected double price;
    //parameterized constructor to assign values to data members
    library(String t,String a, double p)
    {
        title=t;
        author=a;
        price=p;
    }
    //to display the details of the book
    void show()
    {
        System.out.println("\nBook Name\t\tAuthor\t\tPrice");
        System.out.println(title+"\t\t"+author+"\t"+price);
    }
}

final class compute extends library
{
    int d;
    double f;
    //parameterized constructor to assign values to data members
    compute(String t, String a, double p, int days)
    {
        super(t,a,p);
        d=days;
        f=0;
    }
    //to calculate the fine applicable for the excess days
    void fine()
    {
        if(d>7)
        {
            d=d-7;
            if(d<=5)
            {
                f=2*d;
            }
            else if(d<=10)
            {
                f=10+((d-5)*3);
            }
            else
            {
                f=10+15+((d-10)*5);
            }
            d=d+7;
        }
    }
    //to display the book details along with fine and total amount
    void display()
    {
        double total=((0.02*price)*d)+f;
        super.show();
        System.out.println("\nBook taken for: "+d+" days");
        System.out.println("Total fine: Rs."+f);
        System.out.println("Total amount: Rs."+total);
    }
}

public class TestLib
{
    public static void main() throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        String t;
        String a;
        double p;
        int days;

        System.out.print("Enter Name of the book: ");
        t=br.readLine();
        System.out.print("Enter Author's Name: ");
        a=br.readLine();
        System.out.print("Enter Price: ");
        p=Double.parseDouble(br.readLine());
        System.out.print("Enter the days book is taken for: ");
        days=Integer.parseInt(br.readLine());

        compute ob=new compute(t,a,p,days);

        ob.fine();
        ob.display();
    }
}

