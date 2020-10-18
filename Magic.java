import java.io.*;
class Magic
{
    InputStreamReader isr=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);
    int n;
    //default constructor to assign value to default constructor 
    Magic()
    {
        n=0;
    }
    //to assign the parameter value to number n
    void getnum(int nn)
    {
        n=nn;
    }
    //to return the sum of the digits of a number
    int Sum_of_digits(int x)
    {
        int sum=0;
        if(x>=10)
        {
            String y=Integer.toString(x);
            for(int i=0;i<y.length();i++)
            {
                sum+=Double.valueOf(y.substring(i,i+1));
            }
            return Sum_of_digits(sum);
        }
        return x;
    }
    //to check if the given number is a magic number or not
    void isMagic()
    {
        if(Sum_of_digits(n)==1)
        {
            System.out.println("It is a Magic number");
        }
        else
        {
            System.out.println("It is not a Magic number");
        }
    }
}
 