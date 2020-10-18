import java.io.*;
class cFraction
{
    InputStreamReader isr=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);
    int Num, Den;

    cFraction(int n,int d)
    {
        Num=n;
        Den=d;
    }

    int HCF(int n1,int n2)
    {
        if(n2==0)
        {
            return n1;
        }
        return HCF(n2, n1%n2);
    }

    int LCM(int n1,int n2)
    {
        int hcf=HCF(n1,n2);
        return (n1*n2)/hcf;
    }

    void reduce()
    {
        int l=HCF(Num,Den);
        Num=Num/l;
        Den=Den/l;
        System.out.println("Reduced form: "+Num+"/"+Den);
    }

    void main() throws IOException
    {
        System.out.print("Enter Numerator: ");
        int x=Integer.parseInt(br.readLine());
        System.out.print("Enter Denominator: ");
        int y=Integer.parseInt(br.readLine());

        cFraction ob=new cFraction(x,y);
        int hcf=ob.HCF(x,y);
        int lcm=ob.LCM(x,y);
        System.out.println("HCF is: "+hcf+"\nLCM is: "+lcm);
        ob.reduce();
    }
}

