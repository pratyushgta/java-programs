import java.io.*;
class Repeat
{
    int st[];
    int cap;
    int front;
    int rear;
    //parameterized constructor to initialize data members
    Repeat(int s)
    {
        st=new int[100];
        cap=s;
        front=-1;
        rear=-1;
    }
    //to add an element to the rear of the array, if possible
    void push(int x)
    {
        if(rear==-1)
        {
            front=0;
            rear=0;
            st[rear]=x;
        }
        else if(rear==cap-1)
        {
            System.out.println("Array is full"); 
        }
        else
        {
            st[rear+1]=x;
            rear++;  
        }
    }
    //to remove and return the element from front, if possible
    int pop()
    {
        if(front<=rear)
        {
            return  st[front++];
        }
        else
        {
            return -111;
        }
    }

    void print()
    {
        System.out.println("ARRAY ELEMENTS: ");
        for(int i=front;i<=rear;i++)
        {
            System.out.println(st[i]);
        }
    }

    void main() throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("Enter number of elements in array: ");
        int no=Integer.parseInt(br.readLine());
        Repeat ob=new Repeat(no);
        System.out.println("Enter "+no+" elements");
        for(int i=0;i<no;i++)
        {
            st[i]=Integer.parseInt(br.readLine());
        }
        System.out.println("Enter an element to add: ");
        int add=Integer.parseInt(br.readLine());
        ob.push(add);
        int res=ob.pop();
        System.out.println("RES:"+res);
        ob.print();
    }
}

