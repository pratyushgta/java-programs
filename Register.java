/* STACK
 * QUESTION 4:    [SECTION C only: 5 marks]         (ISC 2018) 
 * 
 * Class : Register   
 * Members: String stud[] , int cap , int top
 * Methods: 
 * Register(int max) - Parameterized Constructor. Initialize cap= max ; top= -1
 * void push(String n) - store new element to existing queue. If not possible, print "OVERFLOW"
 * String pop() - remove one element from the array. If not possible, return "$$"
 * void display() - to display all the elements of the array
 * 
 * a) Specify the class giving details of void push and String pop only. 
 * Assume all other fn. are already defined. No need to write main fn.  
 * b) Name the entity used in the above data structure arrangement. Ans: FILO or LIFO
 */

class Register
{
    String stud[];
    int cap, top;

    Register(int max)
    {
        cap=max;
        stud=new String[cap];
        top=-1; 
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
        if(top>=0)
            return stud[top--]; 
        else
            return "$$";
    }

    void display()
    {
        for(int i=0;i<=top;i++)
        {
            System.out.println(stud[i]);
        }
    }
}

