import java.util.*;
class Number
{
    protected int n;
    Number (int x)
    {
        n=x;
    }
    int factorial(int x)
    {
        int r=1;
        while (x>0)
        {
            r=r*x;
            x--;
        }
        return r;
    }
    void display()
    {
        System.out.println("The number is: " +n);
    }
}

class series extends Number
{
    int sum;
    series(int a)
    {
        super(a);
        sum=0;
    }
    void calSum()
    {
        for (int i=1;i<=n;i++)
        {
            sum=sum+factorial(i);
        }
    }
    void display()
    {
        super.display();
        System.out.println("The sum is: " +sum);
    }
}

public class Test1
{
    void main()
    {
        Scanner sc= new Scanner (System.in);
        System.out.print("Enter a number: ");
        int d=sc.nextInt();
        series obj= new series(d);
        obj.calSum();
        obj.display();
    }
}