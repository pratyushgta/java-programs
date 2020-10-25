import java.io.*;
class NODE
{
    int data;
    NODE left, right; //left and right are objects of type node
    String str;
    //default constructor to initialize data members
    NODE()
    {
        data=0;
        left=null; 
        right=null;//if it is pointing to null, means no further sub-nodes
    }
}

class Binary
{
    NODE root; //type of root must be node only. each node is a type node
    //default constructor to initialize data members
    Binary()
    {
        root=null; //reference datatype so initial value is null
    }
    //to add an integer in the binary tree 
    NODE insert(NODE b, int k)
    {
        NODE t=new NODE();
        t.data=k;//t is type node(). node()has got 3 variables.
        if(b==null)
        {
            b=t; //applicable only if tree is completely vacant
        }
        else if(k<b.data)//if condition true, then data is to be stored on left of tree
        {
            b.left=insert(b.left,k);
        }
            else// if above condition is false then data is greater and has to be stored on right of tree
        {
            b.right=insert(b.right,k);
        }
        return b;
    }
    //to display in preorder
    void preorder(NODE b)
    {
        if(b!=null)
        {
            System.out.print(b.data+",");
            preorder(b.left);
            preorder(b.right);
        }
    }
    //to display in inorder
    void inorder(NODE b)
    {
        if(b!=null)
        {
            inorder(b.left);
            System.out.print(b.data+",");
            inorder(b.right);
        }
    }
    //to display in postorder
    void postorder(NODE b)
    {
        if(b!=null)
        {         
            postorder(b.left);
            postorder(b.right);
            System.out.print(b.data+",");
        }
    }
}

public class TestBin
{
    InputStreamReader isr= new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);

    void main() throws IOException
    {
        Binary bt=new Binary();
        int ch=0;
        while(ch!=5)
        {
            System.out.println("\nMENU");
            System.out.println("1.Insert\n2.Pre-order Dispaly\n3.In-order Display\n4.Post-Order Display\n5.Exit");
            System.out.println("\nEnter your choice");
            ch=Integer.parseInt(br.readLine());

            switch(ch)
            {
                case 1: System.out.println("Enter a number to be inserted in the tree");
                int k=Integer.parseInt(br.readLine());
                bt.root=bt.insert(bt.root,k);//bt.root=referring to a variable with type node because type of bt is binary
                break;

                case 2: System.out.println("Pre-Order");
                bt.preorder(bt.root);
                break;

                case 3:System.out.println("In-Order");
                bt.inorder(bt.root);
                break;

                case 4:System.out.println("Post-Order");
                bt.postorder(bt.root);
                break;

                case 5: System.out.println("Goodbye");
                break;

                default: System.out.println("Invalid Input");
                break;
            }
        }
    }
}

