import java.io.*;
class MonoTonic
{
    InputStreamReader isr=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);
    int N, Arr[];
    //to set the default values for all the data members
    MonoTonic()
    {
        N=0;
        Arr=new int[N];
    }
    //to read the size of the Array and take the numbers to store in Array
    void read() throws IOException
    {
        System.out.print("Enter the number of elements: ");
        N = Integer.parseInt(br.readLine());

        Arr= new int[N];

        System.out.println("Enter " + N + " elements: ");

        for(int i=0;i<Arr.length;i++)
        {
            Arr[i]= Integer.parseInt(br.readLine());
        }
    }
    //to display the longest monotonic increasing sequence
    void increasing()
    {
        int s=0;
        int c=1;
        int l=1;
        int i=0;

        for(i=0;i<N-1;i++)
        {
            if(Arr[i]<Arr[i+1]) 
            {
                l++;
            }
            else
            {
                if(l>=c)
                {
                    s=i-l+1;
                    c=l;
                }
                l=1;
            }
        }
        if(l>=c)
        {
            s=i-l+1;
            c=l;
        }
        System.out.print("Longest MonoTonic increasing sequence is: ");

        for(int j=s,k=0;k<c;k++,j++)
        {
            System.out.print(Arr[j]);
            if(k<c-1)
                System.out.print(",");            

        }
        System.out.println();
    }
    //to display the longest monotonic decreasing sequence
    void decreasing()
    {
        int s=0;
        int c=1;
        int l=1;
        int i=0;

        for(i=0;i<N-1;i++)
        {
            if(Arr[i]>Arr[i+1])  
            {
                l++;
            }
            else
            {
                if(l>=c)
                {
                    s=i-l+1;
                    c=l;
                }
                l=1;
            }
        }
        if(l>=c)
        {
            s=i-l+1;
            c=l;
        }
        System.out.print("Longest MonoTonic decreasing sequence is: ");

        for(int j=s,k=0;k<c;k++,j++)
        {
            System.out.print(Arr[j]);
            if(k<c-1)
                System.out.print(",");
        }
    }

    void main() throws IOException
    {
        MonoTonic ob= new MonoTonic();
        ob.read();
        ob.increasing();
        ob.decreasing();
    }
}

