import java.io.*;
class Matrix
{
    InputStreamReader isr=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);
    int arr[][];
    int m,n;

    Matrix(int mm, int nn)
    {
        m=mm;
        n=nn;
        arr=new int[m][n];
    }

    void fillarray() throws IOException
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=Integer.parseInt(br.readLine());
            }
        }
    }

    Matrix SubMat(Matrix A)
    {
        Matrix diff=new Matrix(m,n);
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                diff.arr[i][j]=A.arr[i][j]-arr[i][j];
            }
        }
        return diff;
    }

    void display()
    {
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }

    void main() throws IOException
    {
        int m=0;
        int n=0;

        System.out.print("Enter no. of rows: ");
        m=Integer.parseInt(br.readLine());

        System.out.print("Enter no. of columns: ");
        n=Integer.parseInt(br.readLine());

        if(m>25||n>25||m<0||n<0)
        {
            System.out.println("\nInvalid Size. Re-enter");
            main();
        }
        
        Matrix ob1=new Matrix(m,n);
        System.out.println("\nEnter "+m*n+" elements of 1st array: ");
        ob1.fillarray();
        Matrix ob2=new Matrix(m,n);
        System.out.println("\nEnter "+m*n+" elements of 2nd array: ");
        ob2.fillarray();
        Matrix ob3=new Matrix(m,n);
        ob3=ob1.SubMat(ob2);
        System.out.println("\nFirst Array: ");
        ob1.display();
        System.out.println("\nFirst Array: ");
        ob2.display();
        System.out.println("\nMatrix after substracting: ");
        ob3.display();
    }
}

