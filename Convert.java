import java.io.*;
class Convert
{

    InputStreamReader isr=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);

    int M;
    int N;
    //to read two numbers in octal form, from the user
    void read() throws IOException
    {
        System.out.println("Enter numbers in octal form");
        System.out.print("Enter  number 1 : ");
        M=Integer.parseInt(br.readLine());
        System.out.print("Enter  number 2 : ");
        N=Integer.parseInt(br.readLine());
    }
    //to convert octal number to decimal form and display the sum in decimal	
    void octtodec()
    {
        int d= 0;
        int base = 1;
        int temp = M;
        while (temp > 0)
        {
            int l= temp % 10;
            temp = temp / 10;
            d=d+ l * base;
            base = base * 8;
        }

        int d1= 0;
        int base1 = 1;
        int temp1 = N;
        while (temp1 > 0)
        {
            int l= temp1 % 10;
            temp1 = temp1 / 10;
            d1=d1+ l * base1;
            base1 = base1 * 8;
        }
        int sum=d+d1;
        System.out.println("\nDecimal form of no.1: "+d);
        System.out.println("Decimal form of no.2: "+d1);
        System.out.println("\nSum in decimal form: "+sum);
        dectohexa(sum);
    }
    //to convert the decimal number to hexadecimal form
    void dectohexa(int sum)
    {
        int n=sum;
        String R="";
        while(n!=0)
        {
            int d=n%16;
            n=n/16;
            if(d<10)
            {
                R=d+R;
            }
            else
            {
                R=(char)(d+55)+R;
            }
        }
        System.out.println("\nSum in hexadecimal form: "+R);
    }

    void main() throws IOException
    {
        Convert ob=new Convert();
        ob.read();
        ob.octtodec();
    }
}

