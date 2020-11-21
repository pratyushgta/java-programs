
import java.util.*;
public class Magics
{
    int n;
    Magics()
    {
        n=0;
    }

    void getnum(int nn)
    {
        n=nn;
    }

    int Sum_of_digits(int n)
    {    
        int sum=0;
        while (n > 0 || sum>9)
        {
            if (n == 0)
            {
                n = sum;
                sum = 0;
            }
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }

    void isMagic()//to check magic number
    {   int n=7;
        int a= Sum_of_digits(n);
        if(a==1)
        {
            System.out.println("magic number");

        }
        else
        {
            System.out.println("not a magic number");
        }

    }
}