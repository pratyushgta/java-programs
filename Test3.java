import java.io.*;
class records
{
    InputStreamReader isr=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);
    String n[];
    int m[];
    int size;
    records(int cap)
    {
        size=cap;
        n=new String[cap];
        m=new int[cap];
    }

    void readarray() throws IOException
    {
        System.out.println("STUDENT DETAILS ");
        //size=Integer.parseInt(br.readLine());
        for(int i=0;i<size;i++)
        {
            System.out.print("Enter name: ");
            n[i]=br.readLine();
            System.out.print("Enter marks: ");
            m[i]=Integer.parseInt(br.readLine());
            System.out.println();
        }
    }

    void display()
    {
        System.out.println("NAMES"+"\t"+"MARKS");
        for(int i=0;i<size;i++)
        {
            System.out.println(n[i]+"\t"+m[i]);
        }
        System.out.println();
    }
}

class highest extends records
{
    int ind=0;

    highest(int capp)
    {
        super(capp);
        ind=0;
    }

    void find()
    {
        int scholar=m[0];
        for(int i=1;i<size;i++)
        {
            if(scholar<m[i])
            {
                scholar=m[i];
                ind=i;
            }
        }
    }

    void display()
    {
        super.display();
        System.out.println("THE STUDENT WHO TOPPED IS..."+n[ind]+" WITH "+m[ind]+" MARKS!!");
    }
}

public class Test3
{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.print("Enter array size: ");
        int asize=Integer.parseInt(br.readLine());
        highest obj=new highest(asize);
        obj.readarray();
        obj.find();
        obj.display();
    }
}     


