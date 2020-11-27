import java.io.*;
import java.util.Arrays; 
class pendulum
{
    InputStreamReader isr=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);

    int size;
    int arr[]=new int[size];

    //default constructor to initialize data members
   /* pendulum()
    {
        size=0;
        arr=new int[size];
    }*/
    //to read array elements
    void input()throws IOException
    {
        System.out.print("Enter the size of 1st array: ");
        size = Integer.parseInt(br.readLine());
        arr=new int[size];
        System.out.println("Enter "+size+" elements: ");
        for(int i=0; i<size;i++)
        {
            arr[i] = Integer.parseInt(br.readLine());   
        }
    }
    //to sort the elements of combined array in ascending order
    void sort()
    {
        for(int i=0; i<size-1;i++)
        {
            int min = arr[i];
            int pos = i;
            for(int j=i+1;j<size;j++)
            { 
                if(min > arr[j])
                {
                    min = arr[j];
                    pos = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[pos];
            arr[pos] = temp;
        }
    }

    void arrange() throws IOException
    {     
        int newarr[]=new int[size];
        int mid=(size-1)/2;
        int pos=1;
        newarr[mid]=arr[0];
        int i=1;

        for(i=1;i<=mid;i++)
        {
            newarr[mid+i]=arr[pos];
            pos++;
            newarr[mid-i]=arr[pos];
            pos++;
        }

        if(size%2==0)
        {
            newarr[mid+i]=arr[pos];
        }
        
        System.out.println("\nPendulum arrangement: ");
        for(i=0;i<size;i++)
        {
            System.out.print(newarr[i]+" ");
        }
    }

    void main()throws IOException
    {

        pendulum ob = new pendulum();
        ob.input();
        ob.sort();
        ob.arrange();

    }
}