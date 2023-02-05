package Year2;
/**
 * This class contains methods for implementing stack using single LL
 * OOPJ-E2-HW1
 * @author Pratyush Kumar (github.com/pratyushgta)
 */

class StackOperations{
    int size = 100;
    class Node{
        int data;
        Node next;
    }

    Node top;
    StackOperations(){
        top = null;
    }

    public void push(int value){
        Node newnode = new Node();
        newnode.data = value;
        newnode.next = top;
        top = newnode;

        System.out.println(value+" added to the stack!");
    }

    public int pop(){
        if(top == null)
            System.out.println("\nUNDERFLOW!");
        else{

        }
        return 0;
    }
}
public class Stack {
}
