package Year2;

import java.util.*;
import java.lang.*;
public class StudentMain
{
    public static void main(String[] args)
    {
        String nm;
        int roll;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll no:= ");
        roll = sc.nextInt();
        System.out.print("Enter Name:= ");
        nm = sc.next();
        int m1,m2,m3;
        System.out.print("Enter 3 sub mark:= ");
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();
        Student s = new Student( roll,nm,m1,m2,m3);
        s.display();
    }
}
class Student
{
    public int r_no;
    public String name;
    public int a,b,c;
    int sum=0;
    public Student(int roll, String nm, int m1,int m2,int m3)
    {
        r_no = roll;
        name = nm;
        a = m1;
        b = m2;
        c = m3;
        sum = a+b+c;
    }
    public void display()
    {
        System.out.println("Roll_no : "+r_no);
        System.out.println("Name    : "+name);
        System.out.println("-----MARKS-------");
        System.out.println("Sub 1     : "+a);
        System.out.println("Sub 2     : "+b);
        System.out.println("Sub 3     : "+c);
        System.out.println("Total     : "+sum);
        System.out.println("percentage: "+sum/3);
        System.out.println("------------------");
    }
}
