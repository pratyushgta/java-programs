/* QUEUE
 * QUESTION 2:    [SECTION C only: 5 marks]         (ISC 2019) 
 * 
 * Class : Diary
 * Members: String Q[] , int size , int start , int end 
 * Methods: 
 * Diary(int max) - Parameterized Constructor. Initialize size= max ; start= 0 ; end= 0 
 * void pushadd(String n) - store new element to existing queue. If not possible, return "NO SPACE"
 * String popadd() - remove one element from the array. If not possible, return "?????"
 * void show() - to display all the elements of the array
 * 
 * Specify the class giving details of void pushadd and String popadd only. 
 * Assume all other fn. are already defined. No need to write main fn.  
 * 
 */

class Diary
{
    String Q[];
    int size, start, end;

    Diary(int max)
    {
        size=max;
        Q=new String[size];
        start=0;
        end=0;
    }

    void push(String n)
    {
        if(end<size-1)
            Q[++end]=n;
        else
            System.out.print("No Space");
    }

    String pop()
    {
        if(start<=end)
            return Q[++start]; //front+1 won't work
        else
            return "?????";
    }

    void show()
    {
        for(int i=start+1;i<=end;i++)
        {
            System.out.println(Q[i]);
        }
    }
}

