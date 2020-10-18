import java.io.*;
class Kaprekar
{
    InputStreamReader isr=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);
    int p, q;
    //default constructor to initialize data members
    Kaprekar()
    {
        p=0;
        q=0;
    }
    //to read the range from the users
    void read() throws IOException
    {
        System.out.println("ENTER THE RANGE");
        System.out.print("Enter start position: ");
        p=Integer.parseInt(br.readLine());
        System.out.print("Enter end position: ");
        q=Integer.parseInt(br.readLine());
    }
    //to check if a number is Kaprekar number not
    int check(int n)
    {
        if(n==0)
        {
            return 0;
        }
        else
        {
            int N=n*n;
            int temp=n;
            int c=0;
            while(temp!=0)
            {
                temp=temp/10;
                c++;
            }
            int left=(int)(N/Math.pow(10,c)); //left hand piece
            int right=(int)(N%Math.pow(10,c)); //right hand piece
            if(left+right==n)
            {
                return 1;
            }
            else
            {
                return 0;
            }
        }
    }
    //to search and display the Kaprekar numbers in the specified range
    void kaprekar_numbers()
    {
        int freq=0;
        System.out.println("\nKaprekar Numbers are between "+p+" & "+q+" are: ");
        for(int i=p;i<q;i++)
        {
            int r=check(i);
            if(r==1)
            {
                freq++;
                System.out.println(i);
            }
        }
        System.out.println("\nFrequency of Kaprekar Numbers: "+freq);
    }

    void main() throws IOException
    {
        Kaprekar ob=new Kaprekar();
        ob.read();
        ob.kaprekar_numbers();
    }
}