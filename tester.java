import java.io.*;
import java.util.*;
class tester
{
    InputStreamReader isr=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);
    Scanner sc=new Scanner(System.in);
    int n;

    tester()
    {
        n=0;
    }

    void read() throws IOException
    {
        System.out.print("Enter: ");
        n=Integer.parseInt(br.readLine());
        //n=sc.nextInt();
        System.out.println(n);
    }

    void main() throws IOException
    {
        tester ob=new tester();
        ob.read();
        System.out.println("RAJU'S NO."+n);
    }
}