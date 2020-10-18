import java.io.*;
class Collection
{
    InputStreamReader isr=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);

    int arr[];
    int len;
    //default constructor to initialize data member
    Collection()
    {
        len=100;
        arr=new int[len];
    }
    //parameterized constructor
    Collection(int size)
    {
        len=size;
        arr=new int[len];
    }
    //to return the collection containing common elements of current collection object
    Collection common(Collection T1)
    {
        int temp[]=new int[100];
        int c=0;
        int Arr[]=new int[T1.len];
        for(int y=0;y<T1.len;y++)
        {
            Arr[y]=T1.arr[y];
        }
        for(int i=0;i<len;i++)
        {
            for(int j=0;j<Arr.length;j++)
            {
                if(arr[i]==Arr[j])
                {
                    temp[c++]=Arr[j];
                    int temp1[]=new int[Arr.length-1];
                    int d=0; //Removes common element
                    for(int k=0;k<Arr.length;k++)
                    {
                        if(k!=j)
                        {
                            temp1[d++]=Arr[k];
                        }
                    }
                    Arr=temp1;
                    break;
                }
            }
        }
        Collection t=new Collection(c);
        for(int k=0;k<c;k++)
        {
            t.arr[k]=temp[k];
        }
        return t;
    }
    //to read the array elements
    void input()throws IOException
    {
        System.out.println("Enter "+len+" elements of Array");
        for(int i=0;i<len;i++)
        {
            arr[i]=Integer.parseInt(br.readLine());
        }
    }
    //to sort the array containing common elements
    void arrange()
    {
        for(int i=0;i<len;i++)
        {
            for(int j=0;j<len-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    //to display the array elements
    void display()
    {
        if(len==0)
        {
            System.out.println("None");
        }
        else
        {
            for(int i=0;i<len;i++)
            {
                System.out.println(arr[i]);
            }
        }
    }

    void main() throws IOException
    {
        System.out.print("Enter the size of 1st array: ");
        int size1=Integer.parseInt(br.readLine());
        Collection ob1=new Collection(size1);
        ob1.input();

        System.out.print("\nEnter the size of 2nd array: ");
        int size2=Integer.parseInt(br.readLine());
        Collection ob2=new Collection(size2);
        ob2.input();

        Collection ob3=new Collection();
        ob3=ob1.common(ob2);
        ob3.arrange();
        System.out.println("\nFirst array: ");
        ob1.display();
        System.out.println("\nSecond array: ");
        ob2.display();
        System.out.println("\nCommon Elements: ");
        ob3.display();
    }
}

