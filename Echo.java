import java.io.*;
class Echo
{
    String names[];
    int cap;
    int top;

    Echo(int s)
    {
        names=new String[100];
        cap=s;
        top=-1;
    }
    //to add a name to the array at the top position, if possible
    void push(String S)
    {
        if(top==cap-1)
        {
            System.out.println("Array is full"); //pushing/ insertion can only occur at the top
        }
        else
        {
            top++;
            names[top]=S;
        }
    }
    //to remove and return the element from the top, if possible 
    String pop()
    {
        String element;
        if(top==-1)
        {
            return "Underflow"; 
        }
        else
        {
            element=names[top];
            top--;
            return element;
        }
    }

    void print()
    {
        System.out.println("ARRAY ELEMENTS: ");
        for(int i=0;i<=top;i++)
        {
            System.out.println(names[i]);
        }
    }
}