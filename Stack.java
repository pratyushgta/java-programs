/* STACK
 * QUESTION 5:    [SECTION C only: 5 marks]          
 * 
 * Class : Stack  
 * Members: String stud[] , int cap , int top
 * Methods: 
 * Register(int max) - Parameterized Constructor. Initialize cap= max ; top= 0
 * void push(String n) - store new element to existing queue. If not possible, print "OVERFLOW"
 * String pop() - remove one element from the array. If not possible, return "$$"
 * void display() - to display all the elements of the array
 * 
 * Specify the class giving details of void push and String pop only. 
 * Assume all other fn. are already defined. No need to write main fn.  
 * 
 */

class Stack
{
    String stud[];
    int cap, top;

    Stack(int max)
    {
        cap=max;
        stud=new String[cap];
        top=0; 
    }

    void push(String n)
    {
        if(top<cap-1)
            stud[++top]=n;
        else
            System.out.print("OVERFLOW");
    }

    String pop()
    {
        if(top>0)
            return stud[--top]; 
        else
            return "$$";
    }

    void display()
    {
        for(int i=1;i<=top;i++)
        {
            System.out.println(stud[i]);
        }
    }
}

