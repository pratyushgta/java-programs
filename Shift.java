import java.io.*;
class Shift
{
    InputStreamReader isr=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);

    int N;
    int len;
    int Arr[];
    //default constructor to initialize data members
    Shift()
    {
        N=0;
        len=0;
        Arr=new int[len];
    }
    //to display each digit of array
    void display()
    {
        for(int j=Arr.length-1;j>=0;j--)
        {
            System.out.println(Arr[j]);
        }
    }
    //to read N, find its length and store digits in array
    void read() throws IOException
    {
        N=Integer.parseInt(br.readLine());
        len=Integer.toString(N).length();
        Arr=new int[len];
        for(int i=0;i<len;i++)
        {
            Arr[i]=N%10;
            N=N/10;
        }
    }
    //to find and store the members of the object with larger number 
    void Big(Shift S1, Shift S2)
    {
        int n=S1.Arr.length;
        int m=S2.Arr.length;
        int max=0;
        int min=0;

        if(n>m)
        {
            Arr=new int[n];
            for(int i=0;i<n;i++)
            {
                Arr[i]=S1.Arr[i];
            }
        }
        else if(n<m)
        {
            Arr=new int[m];
            for(int j=0;j<m;j++)
            {
                Arr[j]=S2.Arr[j];
            }
        }
        else if(n==m)
        {
            int S1max=0;
            int S2max=0;
            for(int i=0;i<n;i++)
            {
                if(S1.Arr[i]>S2.Arr[i])
                {
                    S1max++;
                }
                else if(S1.Arr[i]<S2.Arr[i])
                {
                    S2max++;
                }
                else
                {
                    S1max++;
                    S2max++;
                }
            }

            if(S1max>S2max)
            {
                Arr=new int[n];
                for(int i=0;i<n;i++)
                {
                    Arr[i]=S1.Arr[i];
                }
            }
            else if(S1max<S2max)
            {
                Arr=new int[m];
                for(int i=0;i<m;i++)
                {
                    Arr[i]=S2.Arr[i];
                }
            }
            else
            {
                Arr=new int[n];
                for(int i=0;i<n;i++)
                {
                    Arr[i]=S1.Arr[i];
                }
            }
        }
    }

    void main() throws IOException
    {
        System.out.print("Enter first number: ");
        Shift ob1 = new Shift();
        ob1.read();

        System.out.print("\nEnter second number: ");
        Shift ob2 = new Shift();
        ob2.read();

        System.out.println("\nDigits of 1st number are: ");
        ob1.display();
        System.out.println("\nDigits of 2nd number are: ");
        ob2.display();

        Shift ob=new Shift();
        System.out.println("\nDigits of greater number are: ");
        ob.Big(ob1,ob2);
        ob.display();
    }
}
