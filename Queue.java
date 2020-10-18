class Queue
{
    protected int Que[];
    protected int front, rear;
    protected int size;
    public Queue(int mm)
    {
        size=mm;
        front=-1;
        rear=-1;
        Que=new int[size]; 
    }

    boolean isempty()
    {
        return front==-1;
    }

    public void addele(int v)
    {
        if(rear==-1)
        {
            front=0;rear=0;
            Que[rear]=v;
        }
        else if(rear+1<Que.length)
            Que[++rear]=v;
        else
            System.out.println("OVERFLOE!");
    }

    public int delete()
    {
        int element;
        if(isempty())
            return -9999;
        else
        {
            element=Que[front];
            if(front==rear)
                front=rear=-1;
            else
                front++;
            return element;
        }
    }

    void display()
    {
        for(int i=front;i<rear;i++)
        {
            System.out.println(Que[i]);
        }
    }
}