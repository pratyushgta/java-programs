import java.io.*;
class Series
{
    InputStreamReader isr=new InputStreamReader(System.in);
    BufferedReader br= new BufferedReader(isr);

    int x;
    //to calculate and return the factorial of an integer
    int fact(int i)
    {
        if(i==1)
            return 1;
        else
            return(i*fact(i-1));
    }
    //to calculate the base raised to the power of exponent
    int power(int i, int pow)
    {
        if(pow==1)
            return i;
        else
            return(i*power(i,--pow));
    }
    //to read the value of x
    void read() throws IOException
    {
        System.out.print("Enter a number: ");
        x=Integer.parseInt(br.readLine());
    }

    void main() throws IOException
    {
        Series ob=new Series();
        ob.read();
        double sum=0.0;
        int sign=1;
        for(int i=1;i<=6;i++)
        {
            sum=sum+sign*((double)ob.power(ob.x,i)/ob.fact(i));
            sign*=-1;
        }
        System.out.println("Sum is: "+sum);
    }
}