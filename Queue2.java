/* QUEUE
 * QUESTION 3:    [SECTION C only: 5 marks]         
 * 
 * Class : Queue2
 * Members: int cq[] , int cap , int front , int rear
 * Methods: 
 * Queue(int c) - Parameterized Constructor. Initialize cap= c ; front= -1 ; rear= -1 
 * void push(int n) - store new element to existing queue
 * int pop() - remove one element from the array
 * void show() - to display all the elements of the array
 * 
 * Specify the class giving details of void push and int pop only. 
 * Assume all other fn. are already defined. No need to write main fn.  
 * 
 */

class Queue2
{
    int cq[];
    int cap, front, rear;

    Queue2(int c)
    {
        cap=c;
        cq=new int[cap];
        front=-1; 
        rear=-1;
    }

    void push(int n)
    {
        if(rear<cap-1)
            cq[++rear]=n;
        else
            System.out.print("No Space");
    }

    int pop()
    {
        if(front<rear)
            return cq[++front]; 
        else
            return -111;
    }

    void show()
    {
        for(int i=front;i<rear;i++)
        {
            System.out.println(cq[i]);
        }
    }
}

