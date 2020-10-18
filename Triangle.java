/*Program to form the following patterns:

DISPLAY 1:
- - - 1
- - 6 2
-11 8 7
13 7 8 9

DISPLAY 2:
3 4 5 1
-2 - - 2
12 - - 7
13 7 8 9

DISPLAY 3:
To display diagonal elements */

import java.util.*;
class Triangle
{
    Scanner sc= new Scanner (System.in);
    int size, Arr[][];
    Triangle (int n)
    {
        size=n;
        Arr=new int[n][n];
    }

    void input()
    {
        for(int i=0;i<size;i++)
        {
            for (int j=0;j<size;j++)
            {
                System.out.println("Enter a number:");
                Arr[i][j]= sc.nextInt();
            }
        }
    }

    void display1()
    {
        for(int i=0;i<size;i++)
        {
            for (int j=0;j<size;j++)
            {
                if(j<size-i-1)
                    System.out.print("");
                else
                    System.out.print(Arr[i][j]+"");
            }
            System.out.println();
        }  

    }

    void display2()
    {
        for(int i=0;i<size;i++)
        {
            for (int j=0;j<size;j++)
            {
                if(i==0||i==size-1)
                {
                    System.out.print(Arr[i][j]+"");
                }
                else
                {
                    if(j==0||j==size-1)
                        System.out.print(Arr[i][j]+"");
                    else
                        System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

    void display3()
    {
        for (int i=0;i<size;i++)
        {
            for (int j=0;j<size;j++)
            {
                if(i==j||(i+j)==size-1)
                {
                    System.out.print(Arr[i][j]+"\t");
                }
                else
                {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}