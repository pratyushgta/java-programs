import java.io.*; 
class Fraction 
{ 
    InputStreamReader isr=new InputStreamReader(System.in); 
    BufferedReader br=new BufferedReader(isr); 

    int Num, Den; 

    //Parameterized constructor to initialize Num & Den with given values 
    Fraction(int n, int d) 
    {
        Num=n; 
        Den=d; 
    } 
    //To find and return the HCF of two numbers 
    int HCF(int n1, int n2) 
    {
        if (n1==0) 
        {
            return n2; 
        }
        if (n2==0) 
        {
            return n1; 
        } 
        if (n1==n2)
        { 
            return n1; 
        } 
        if(n1>n2) 
        {
            return HCF(n1-n2, n2); 
        }
        else 
        { 
            return HCF(n1, n2-n1); 
        }
    }
    //To find and return the LCM of two numbers 
    int LCM(int n1, int n2) 
    {
        int hcf=HCF(n1,n2);
        return (n1*n2)/hcf; 
    } 
    //To reduce the current fraction to its lowest term 
    void reduce() 
    {
        int h = HCF(Num,Den); 
        Num = Num/ h; 
        Den= Den/ h; 
        System.out.println("Lowest form: "+Num+"/"+Den); 
    }

    void main() throws IOException 
    {
        System.out.print("Enter Numerator: ");
        int x=Integer.parseInt(br.readLine());
        System.out.print("Enter Denominator: ");
        int y=Integer.parseInt(br.readLine());

        Fraction ob=new Fraction(x,y);
        int hcf=ob.HCF(x,y);
        int lcm=ob.LCM(x,y);
        System.out.println("HCF is: "+hcf+"\nLCM is: "+lcm);
        ob.reduce();
    }
}

