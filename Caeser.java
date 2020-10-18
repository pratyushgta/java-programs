import java.io.*;
class Caeser
{
    InputStreamReader isr=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);

    int N;
    int A[][];
//default constructor to set default values for all data members
    Caeser()
    {
        N=0;
        A=new int[N][N];
    }
//parameterized constructor to assign value to N and define size of array
    Caeser(int x)
    {
        N=x;
        A=new int[N][N];
    }
//to generate a caeser box 
    void generate()
    {
        boolean rowmaj=true; //if input is row-major order
        boolean forward=true;//if input is forward
        int copy=1;
        int row=N;
        int col=N;
        int rowstart=0;
        int colstart=0;

        while(rowstart<row && colstart<col)
        {
            if(rowmaj==true)
            {
                if(forward==true)
                {
                    for(int x=colstart;x<col;x++)
                    {
                        A[rowstart][x]=copy;
                        copy++;
                    }
                    rowstart++;
                }
                else //backward
                {
                    for(int x=col-1;x>=colstart;x--)
                    {
                        A[N-rowstart][x]=copy;
                        copy++;
                    }
                    row--;
                }
                rowmaj=false; //it will now be column major
            }
            else //column-major
            {
                if(forward==true) 
                {
                    for(int y=rowstart;y<row;y++)
                    {
                        A[y][N-colstart-1]=copy;
                        copy++;
                    }
                    col--;
                    forward=false; //it will now be backward
                }
                else
                {
                    for(int y=row-1;y>=rowstart;y--)
                    {
                        A[y][colstart]=copy;
                        copy++;
                    }
                    colstart++;
                    forward=true;
                }
                rowmaj=true;
            }
        }
    }
//to display the caeser box
    void display()
    {
        System.out.println("\nCaeser Box:\n");
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
                System.out.print(A[i][j]+"\t");
            }
            System.out.println();
        }
    }

    void main() throws IOException
    {
        System.out.print("Enter size of array: ");
        int x=Integer.parseInt(br.readLine());    
        Caeser ob=new Caeser(x);
        ob.generate();
        ob.display();
    }
}

