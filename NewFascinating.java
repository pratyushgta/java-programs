/*import java.util.*; //ORIGINAL SOLUTION
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
{
res=1;
freq=0;
}
else
{
res=0;
}
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
for(int i=ob.m;i<=ob.n;i++)
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

import java.util.*;
import java.io.*;
class NewFascinating
{
    InputStreamReader isr=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);
    int m,n;
    //default constructor
    NewFascinating()
    {
        m=0;
        n=0;
    }
    //to check if a number is a fascinating number or not
    int calculate(int x)
    {
        int no=x; //to temporarily store the number
        int prod=0; //to store the result after multiplying the number with 1, 2 and 3
        String num=""; //to store the value of prod in String form
        String concat=""; //to store the concatenated string
        int numChar=0; //to store the integer form of character extracted from string
        int freq=0; //to count the number of times a number is repeated
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
            for(int j=0;j<=concat.length()-1;j++)
            {
                numChar=Integer.parseInt(String.valueOf(concat.charAt(j))); //ADDED THIS EXPRESSION
                if(numChar==i)
                {
                    freq++;
                }
            }
            if(freq!=1) //MADE CHANGES HERE
                return 0;
            freq=0;
        }
        return 1;
    }
    //to enter the starting and endinig values of the range
    void input() throws IOException
    {
        while(n<m || n>9999 || m>9999 || n<100 || m<100)
        {
            System.out.println("ENTER RANGE- ");
            System.out.print("Enter first no. of the range: ");
            m=Integer.parseInt(br.readLine());
            System.out.print("Enter last no. of the range: ");
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
        System.out.println("\nFASCINATING NUMBERS ARE: ");
        for(int i=ob.m;i<=ob.n;i++)
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
            System.out.println("\nFREQUENCY OF FASCINATING NUMBERS: "+count);
        }
        else
        {
            System.out.println("\nFREQUENCY OF FASCINATING NUMBERS: "+count);
        }
    }
}