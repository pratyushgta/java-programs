/*import java.util.*;
import java.io.*;
class NewFascinating
{
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
int m,n;

NewFascinating()
{
m=0;
n=0;
}

int calculate(int x)
{
int no=x;
int prod=0;
String num="";
String concat="";
int concatNum=0;
int freq=0;
int res=0;
for(int i=1;i<4;i++)
{
prod=no*i;
num=Integer.toString(prod);
concat+=num;
prod=0;
num="";
}

for(int i=1;i<10;i++)
{
for(int j=0;j<concat.length();j++)
{
if(concat.charAt(j)==i)
{
freq++;
}
}
if(freq>1)
res=1;
else 
res=0;
}
return res;
}

void input() throws IOException
{
while(n<m || n>9999 || m>9999 || n<100 || m<100)
{
System.out.println("ENTER RANGE: ");
System.out.println("Enter first no. of the range: ");
m=Integer.parseInt(br.readLine());
System.out.println("Enter last no. of the range: ");
n=Integer.parseInt(br.readLine());

if(m<n || n>9999 || m>9999 || n<100 || m<100)
{
System.out.println("Invalid Input");
}
}
}

void main() throws IOException
{
NewFascinating ob=new NewFascinating();
ob.input();
int res=0;
int count=0;
System.out.println("FASCINATING NUMBERS ARE: ");
for(int i=m;i<=n;i++)
{
res=ob.calculate(i);
if(res==1)
{
System.out.print(i+"   ");
count++;
}
}

if(count==0)
{
System.out.println("NIL");
System.out.println("FREQUENCY OF FASCINATING NUMBERS: "+count);
}
else
{
System.out.println("FREQUENCY OF FASCINATING NUMBERS: "+count);
}
}
}*/

import java.io.*;
class CompPracticalFascinating
{
    InputStreamReader isr=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);

    int m, n;

    CompPracticalFascinating()
    {
        m=0;
        n=0;
    }

    int check(int n)
    {
        int no=n;
        int prod;
        String num; 
        String concat="";
        int freq=0;
        int zero=0;

        for(int i=1;i<4;i++)
        {
            prod=no*i;
            num=Integer.toString(prod);
            concat+=num;
            prod=0;
            num="";
        }

        for(int i=0;i<concat.length();i++)
        {
            for(int j=0;j<concat.length();j++)
            {
                if(concat.charAt(i)=='0')
                {
                    zero++;
                }

                if(concat.charAt(i)==concat.charAt(j) && concat.charAt(i)!='0')
                {
                    freq++;
                }
            }
        }

        if(freq+zero>concat.length())
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }

    void main() throws IOException
    {
        CompPracticalFascinating ob=new CompPracticalFascinating();

        System.out.println("ENTER RANGE- ");
        while(n<m || n>9999 || m>9999 || n<100 || m<100)
        {
            System.out.print("Enter the first number of the range: ");
            m=Integer.parseInt(br.readLine());
            System.out.println("Enter the second number of the range: ");
            n=Integer.parseInt(br.readLine());
            if(n<m || n>9999 || m>9999 || n<100 || m<100)
                System.out.println("Invalid Input. Retry!");
        }
        int count=0;
        System.out.println("\nFASCINATING NUMBERS ARE: ");
        for(int i=m;i<=n;i++)
        {
            int res=ob.check(i);
            if(res==1)
            {
                System.out.print(i+"    ");
                count++;
            }
        }

        if(count==0)
        {
            System.out.println("NIL");
            System.out.println("\nFREQUENCY OF FASCINATING NUMBERS: "+count);
        }
        else
        {
            System.out.println("\nFREQUENCY OF FASCINATING NUMBERS: "+count);
        }
    }
}

