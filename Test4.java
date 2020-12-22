import java.io.*;
abstract class Account
{
    InputStreamReader isr=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);

    protected int accountNumber;
    protected double principal;

    Account(int accno, double p)
    {
        accountNumber=accno;
        principal=p;
    }

    void put()
    {
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Principal amount :"+principal);
    }
}

abstract class Simple extends Account
{
    double rate;
    int time;
    double SI;
    Simple(int accno,double p, double r, int t)
    {
        super(accno,p);
        //super.principal();
        rate=r;
        time=t;
    }

    void calculate()
    {
        SI=(principal*rate*time)/100;
    }

    void put()
    {
        System.out.println("Simple Interest is: "+SI);
        System.out.println("@ Rate: "+rate);
        System.out.println("for Time: "+time);
        super.put();
    }
}

final class Compound extends Account
{
    double rate;
    int time;
    double CI;
    Compound(int accno,double p, double r, int t)
    {
        super(accno,p);
        //super.principal();
        rate=r;
        time=t;
    }

    void calculate()
    {
        CI=principal*Math.pow(((1+rate)/100),time)-principal;
    }

    void put()
    {
        System.out.println("Compound Interest is: "+CI);
        System.out.println("@ Rate: "+rate);
        System.out.println("for Time: "+time);
        super.put();
    }
}

public class Test4
{
    public static void main() throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        int ACNO;
        double R;
        int T;
        double P;

        System.out.print("Enter Account number: ");
        ACNO=Integer.parseInt(br.readLine());
        System.out.print("Enter Rate of interest p.a.: ");
        R=Double.parseDouble(br.readLine());
        System.out.print("Enter Time in years: ");
        T=Integer.parseInt(br.readLine());
        System.out.print("Enter Principal amount :");
        P=Double.parseDouble(br.readLine());
        
        Compound obj=new Compound(ACNO,P,R,T);

        obj.calculate();
        obj.put();
    }
}