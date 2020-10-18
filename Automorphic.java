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

    Automorphic(int n) 
    {
        N=n;
    }

    void read() throws IOException
    {
        System.out.print("Enter a number : ");
        N=Integer.parseInt(br.readLine());
    }

    int square(int n)
    {
        int sq=N*N;
        return sq;
    }

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

