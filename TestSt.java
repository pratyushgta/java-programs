import java.io.*;
abstract class student
{
    InputStreamReader isr=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);
    protected String name;
    protected String sex;
    protected int age;
    //to read the values for data members from the user
    void mydetails1() throws IOException
    {
        System.out.println("STUDENT DETAILS");
        System.out.print("Enter student's name: ");
        name=br.readLine();
        System.out.print("Enter gender: ");
        sex=br.readLine();
        System.out.print("Enter age: ");
        age=Integer.parseInt(br.readLine());
    }
    //to display the personal data of the student
    void show1()
    {
        System.out.println("\nStudent Name\t\tAge\tGender");
        System.out.println(name+"\t\t"+age+"\t"+sex);
    }
}

final class marks extends student 
{
    InputStreamReader isr=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);
    int regnum, marks;
    String subject;
    //to read the values for data members from the user
    void mydetails2() throws IOException
    {
        super.mydetails1();
        System.out.println("\nEXAM DETAILS");
        System.out.print("Enter student's register no.: ");
        regnum=Integer.parseInt(br.readLine());
        System.out.print("Enter subject: ");
        subject=br.readLine();
        System.out.print("Enter marks in "+subject+": ");
        marks=Integer.parseInt(br.readLine());
    }
    //to display the exam details of the student
    void show2()
    {
        super.show1();
        System.out.println("\nRegister Number: "+regnum);
        System.out.println("Subject: "+subject);
        System.out.println("Marks: "+marks);
    }
}

public class TestSt
{
    public static void main() throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);

        marks ob=new marks();
        ob.mydetails2();
        ob.show2();
    }
}

