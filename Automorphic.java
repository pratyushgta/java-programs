import java.io.*;
class Automorphic
{
    InputStreamReader isr=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);
    int N;
    Automorphic()
    {
        N=0;
    }
    //default constructor to initialize data members
    Automorphic(int n) 
    {
        N=n;
    }
    //to read a number from the user

    void read() throws IOException
    {
        System.out.print("Enter a number : ");
        N=Integer.parseInt(br.readLine());
    }
    //to find and return the square of the number
    int square(int n)
    {
        int sq=N*N;
        return sq;
    }
    //to check whether the number is Automorphic no. or not
    void check()
    {
        int sq=square(N);
        String num=Integer.toString(N);
        String sqr=Integer.toString(sq);

        if(sqr.endsWith(num))
        {
            System.out.println(N+" is an Automorphic Number");
        }
        else
        {
            System.out.println(N+" is not an Automorphic Number");
        }
    }

    void main() throws IOException
    {
        Automorphic ob=new Automorphic();

        ob.read();

        ob.check();
    }
}

