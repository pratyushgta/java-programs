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
            int sq=n*n;
            int temp=n;
            int c=0;
            while(temp!=0)
            {
                temp=temp/10;
                c++;
            }
            int left=(int)(sq/Math.pow(10,c)); //left hand piece
            int right=(int)(sq%Math.pow(10,c)); //right hand piece
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
        System.out.println("\nKaprekar Numbers between "+p+" & "+q+" are: ");
        for(int i=p;i<q;i++)
        {
            int r=check(i);
            if(r==1)
            {
                if(i>p && freq>0)
                {
                    System.out.print(", ");
                }
                System.out.print(i);
                freq++;
            }
        }
        System.out.println("\n\nFrequency of Kaprekar Numbers: "+freq);
    }

    void main() throws IOException
    {
        Kaprekar ob=new Kaprekar();
        ob.read();
        ob.kaprekar_numbers();
    }
}