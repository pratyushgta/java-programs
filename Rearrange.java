import java.io.*;
class Rearrange
{
    InputStreamReader isr=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);

    int Arr[];
    int N;
    //default constructor to initialize data members 
    Rearrange()
    {
        N=0;
        Arr=new int[N];
    }
    //to enter size of array followed by array elements
    void enter() throws IOException
    {
        System.out.print("Enter size of array: ");
        N=Integer.parseInt(br.readLine());
        System.out.println("Enter "+N+" elements: ");

        Arr= new int[N];

        for(int i=0;i<Arr.length;i++)
        {
            Arr[i]= Integer.parseInt(br.readLine());
        }
    }
    //to display array elements
    void display()
    {
        for(int i=0;i<N;i++)
        {
            System.out.println(Arr[i]);
        }
    }
    //to insert an item at a specified position in the array
    void insert(int p, int item) throws IOException
    {
        if(p>N||p<=0)
        {
            System.out.println("Invalid Position"); //error if insert position exceeds array le
        }
        else
        {
            N++;
            int newArr[]=new int[N];
            for(int i=0;i<N;i++)
            {
                if(i<p-1)
                {
                    newArr[i]=Arr[i];
                }
                else if(i==p-1)
                {
                    newArr[i]=item;
                }
                else
                {
                    newArr[i]=Arr[i-1];
                }
            }
            Arr=new int[N];
            for(int j=0;j<N;j++)
            {
                Arr[j]=newArr[j];
            }
        }
    }
    //to delete an item at specified position from the array
    void remove(int p) throws IOException
    {
        if(p<0 || p>N)
        {
            System.out.println("Invalid Position"); //error if item position doesn't exists/ exceeds array length
        }
        else
        {
            N--;
            for(int m=p-1;m<N;m++)
            {
                Arr[m]=Arr[m+1];
            }
        }
    }
}

