import java.io.*;
class Inventory
{
    InputStreamReader isr=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);
    String Prod;
    int Rate;
    int Qty;
    int Amt;

    Inventory(String p, int r, int q, int a)
    {
        Prod=p;
        Rate=r;
        Qty=q;
        Amt=a;
    }

    void display() throws IOException {
        System.out.println("PRODUCT DETAILS ");
        System.out.println("Name\t\tRate\tQty\tAmount");
        System.out.println(Prod+"\t\t"+Rate+"\t"+Rate+"\t"+Qty+"\t"+Amt);
    }
}

class Sell extends Inventory
{
    int Sqty;
    int Srate;

    Sell(String P, int R, int Q, int A, int sr, int sq)
    {
        super(P,R,Q,A);
        Sqty=sq;
        Srate=sr;
    }

    void update() throws IOException
    {
        System.out.println("UPDATE INVENTORY");
        System.out.println("Enter new quantity: ");
        Sqty=Integer.parseInt(br.readLine());
        System.out.println("Enter new rate: ");
        Srate=Integer.parseInt(br.readLine());

        Qty+=Sqty;

        if(Srate!=Rate)
        {
            Rate=Srate;
        }
    }

    void display() throws IOException {
        System.out.println("BEFORE UPDATION");
        super.display();
        update();
        System.out.println("AFTER UPDATION");
        super.display();
    }
}

public class TestInventory
{
    public static void main(String args[]) throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.print("Enter array size: ");
        int asize=Integer.parseInt(br.readLine());
        //TestInventory obj=new TestInventory(asize);
        //obj.readarray();
       // obj.find();
        //obj.display();
    }
}     