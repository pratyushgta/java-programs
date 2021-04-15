import java.util.*;
import java.io.*;
class bankNotes
{
    InputStreamReader isr=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);
    int amt;

    bankNotes()
    {
        amt=0;
    }

    void input() throws IOException
    {
        System.out.print("Enter amount (only upto 5 digits): ");
        amt=Integer.parseInt(br.readLine());
    }

    void calculate()
    {
        int a=amt;
        int r=0;
        int den[]={1000,500,100,50,20,10,5,2,1}; //available denomination with the banke are of rupees 1000, 500, 100, 50, 20, 10, 5, 2 and 1

        for(int i=0;i<den.length;i++)
        {
            r=a/den[i]; 
            if(r!=0)
            {
                System.out.println(den[i]+" x "+r+" = "+(den[i]*r));
            }
            a=a%den[i];
        }
    }

    void WordAmt()
    {
        String [] words={"ONE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE"};
        int a= amt;
        int digit=0;
        int rev=0;
        int x=0;
        int counter=0;
        while(a>0)//reversing the number because last digit extracts first when extracting integers 
        {
            digit=a%10;
            rev=rev*10+digit;
            a=a/10;
        }
        //extracting integers from the reversed amount
        while(rev>0) //to print the digits of the amount in number format
        {
            x=rev%10;
            System.out.print(words[x-1]+" ");
            rev=rev/10;
        }
    }

    void main() throws IOException
    {
        bankNotes ob=new bankNotes();
        ob.input();
        if(amt>99999){
            System.out.println("Invalid Input");
        }
        else
        {
            ob.WordAmt();
            System.out.println("\nDENOMINATION:");
            ob.calculate();

        }
    }
}
