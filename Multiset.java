import java.io.*;
class Multiset
{
    InputStreamReader isr=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);

    int arr[];
    int size;

    Multiset()
    {
        size=0;
        arr=new int[size];
    }

    void readList() throws IOException
    {
        System.out.print("Enter size of the array : ");
        size=Integer.parseInt(br.readLine());
        arr=new int[size];
        System.out.println("Enter "+size+" elements : ");
        for(int i=0;i<size;i++)
        {
            arr[i]=Integer.parseInt(br.readLine());
        }
    }

    void displayList()
    {
        for(int i=0;i<size;i++)
        {
            System.out.println(arr[i]+" ");
        }
    }

    int Set()
    {
        for(int i=0;i<size;i++)
        {
            for(int j=i+1;j<size;j++)
            {
                if(arr[i]==arr[j])
                {
                    return 0;
                }
            }
        }
        return 1;
    }

    void convert()
    {
        for(int i=0;i<size;i++)
        {
            for(int j=i+1;j<size;j++)
            {
                if(arr[i]==arr[j])
                {
                    int temp[]=new int[--size];
                    int d=0;
                    for(int k=0;k<size+1;k++)

                        if(k!=j)
                        {
                            temp[d++]=arr[k];
                        }
                    arr=temp;

                }
            }
        }
    }

    void main() throws IOException
    {
        Multiset ob=new Multiset();
        ob.readList();
        System.out.println("\nOriginal Array: "); 
        ob.displayList();
        if(ob.Set()==0)
        {
            System.out.println("\nIt is a Multiset");
            ob.convert();
            System.out.println("\nArray after converting Multiset to Set: "); 
            ob.displayList();
        }
        else
        {
            System.out.println("\nIt is a Set");
        }
    }
}

