import java.io.*;
class node
{
    int data;
    node left, right; //left and right are objects of type node
    String str;

    node()
    {
        data=0;
        left=null; //when anything is non primitive datatype, the default value for any reference data type/objects should always be null
        right=null;//if it is pointing to null, means no further sub-nodes
    }
}

class binary
{
    node root; //type of root must be node only. each node is a type node

    binary()
    {
        root=null;//reference datatype so initial value is null
    }

    node insert(node b, int k)
    {
        node t=new node();
        t.data=k;//t is type node(). node()has got 3 variables.
        if(b==null)
        {
            b=t; //applicable only if tree is completely vacant
        }
        else if(k<b.data)//if condition true, then data is to be stored on left of tree
        {
            b.left=insert(b.left,k);
        }
        else// if above condition is falsem then data is greater and has to be stored on right of tree
        {
            b.right=insert(b.right,k);
        }
        return b;
    }

    void preorder(node b)//to display in preorder
    {
        if(b!=null)
        {
            System.out.print(b.data+",");
            preorder(b.left);
            preorder(b.right);
        }
    }

    void inorder(node b)//to display in inorder
    {
        if(b!=null)
        {
            inorder(b.left);
            System.out.print(b.data+",");
            inorder(b.right);
        }
    }

    void postorder(node b)//to display in postorder
    {
        if(b!=null)
        {         
            postorder(b.left);
            postorder(b.right);
            System.out.print(b.data+",");
        }
    }

    int smallest(node b)
    {
        if(b==null)
        {
            return -1;
        }
        else
        {
            if(b.left==null)
            {
                return b.data;
            }
            else
            {
                return smallest(b.left);
            }
        }
    }

    int largest(node b) 
    {
        if(b==null)
        {
            return -1;
        }
        else
        {
            if(b.right==null)
            {
                return b.data;
            }
            else
            {
                return largest(b.right);
            }
        }
    }

    void path(node b,int d)
    {
        if(b!=null)
        {
            if(b.data==d)
            {
                System.out.println(d);
            }
            else if(d<b.data)
            {
                System.out.println(b.data);
                path(b.left,d);                
            }
            else if(d>b.data)
            {
                System.out.println(b.data);
                path(b.right,d);                
            }
        }
    }

    void leaf(node b)
    {
        if(b!=null)
        {
            if(b.left==null && b.right==null)
            {
                System.out.println(b.data);
            }
            leaf(b.left);
            leaf(b.right);
        }
    }

    void both(node b)
    {
        if(b!=null)
        {
            if(b.left!=null && b.right!=null)
            {
                System.out.println(b.data);
                both(b.left);
                both(b.right);
            }
        }
    }

    void left(node b)
    {
        if(b!=null)
        {
            if(b.left!=null && b.right==null)
            {
                System.out.println(b.data);
                left(b.left);
                left(b.right);
            }
        }
    }

    int sumNode(node b)
    {
        if(b!=null){
            return b.data+sumNode(b.left)+sumNode(b.right);
        }
        else{
            return 0;
        }
    }

    int countNode(node b)
    {
        if(b!=null)
        {
            return 1+countNode(b.left)+countNode(b.right);
        }
        else{
            return 0;
        }
    }

    boolean search(node b, int k)//k is search element
    {
        if(b!=null)
        {
            if(b.data==k)
            {
                return true;
            }
            else if(k<b.data)
            {
                return search(b.left, k);
            }
            else
            {
                return search(b.right, k);
            }     
        }
        return false;
    }

    void mirror(node b)
    {
        if(b!=null)
        {
            mirror(b.left);
            mirror(b.right);

            node temp=b.left;
            b.left=b.right;
            b.right=temp;
        }
    }

    int height(node b)
    {
        if(b!=null)
        {
            if(b.left==null && b.right==null)
            {
                return 1;
            }
            else
            {
                return height(b.left)>height(b.right)?1+height(b.left):1+height(b.right);
            }
        }
        return 0;
    }        
}

public class BTest
{
    InputStreamReader isr= new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);

    void main() throws IOException
    {
        binary bt=new binary();
        int ch=0;
        while(ch!=10)
        {
            System.out.println("\nMENU");
            System.out.println("1.To add\n2.Pre-order Dispaly\n3.In-order Display\n4.Post-Order Display\n5.Smallest Node\n6.Largest Node\n7.Path\n8.Leaf Nodes\n9.Both Side Nodes\n10.Left Node\n11.Sum of Nodes\n12.Count Nodes\n13.Search\n14.Mirror of Tree\n15.Height\n16.Exit");
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

                case 5: System.out.println("Smallest Node");
                int x=bt.smallest(bt.root);
                System.out.println(x);
                break;

                case 6: System.out.println("Largest Node");
                int y=bt.largest(bt.root);
                System.out.println(y);
                break;

                case 7: System.out.println("Enter a node whose path is to be displayed : ");
                int num=Integer.parseInt(br.readLine());
                bt.path(bt.root,num);
                break;

                case 8: System.out.println("Leaf nodes are : ");
                bt.leaf(bt.root);
                break;

                case 9: System.out.println("Both Side Nodes: ");
                bt.both(bt.root);
                break;

                case 10: System.out.println("Node with only left node: ");
                bt.left(bt.root);
                break;

                case 11: System.out.println("Sum of nodes: ");
                int sum=bt.sumNode(bt.root);
                System.out.println("Sum is: "+sum);
                break;

                case 12: System.out.println("Total no. of nodes in tree: ");
                int count=bt.countNode(bt.root);
                System.out.println("Count is: "+count);
                break;

                case 13: System.out.println("Search: ");
                System.out.print("Enter node to be searched: ");
                int search=Integer.parseInt(br.readLine());
                if(bt.search(bt.root, search)==true)
                {
                    System.out.println("Found!");
                }
                else
                {
                    System.out.println("Not Found!");
                }
                break;

                case 14: System.out.println("Mirror: ");
                bt.mirror(bt.root);
                break;

                case 15: System.out.println("Height: ");
                int height=bt.height(bt.root);
                System.out.println("Height of tree is: "+height);
                break;

                case 16: System.out.println("Goodbye");
                break;

                default: System.out.println("Invalid Input");
                break;
            }
        }
    }
}

