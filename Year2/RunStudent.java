/**
 * These classes contain methods for implementing inheritance to find class marks
 * OOPJ-E4-Q1
 * @author Pratyush Kumar (github.com/pratyushgta)
 */

package Year2;

import java.util.*;

class student {
    String name;
    int roll;
    String dob;

    /*void student(String n, int r, String d){
        name = n;
        roll = r;
        dob = d;
    }*/
    void inputdata() {

        Scanner sc = new Scanner(System.in);
        System.out.println(">>> Input Student Data <<<");
        System.out.print("Enter name: ");
        name = sc.next();
        System.out.print("Enter roll no.: ");
        roll = sc.nextInt();
        System.out.print("Enter d.o.b: ");
        dob = sc.next();
    }

    void printdata() {
        System.out.println(">>> Student details <<<\nName: " + name +
                "Roll no.: " + roll + "DOB: " + dob);
    }
}

class marks extends student {
    float p, c, m, cts, e, tot, per;
    char gd;

    /*void marks(){
        super()
    }*/
    void readdata() {
        super.inputdata();
        Scanner sc = new Scanner(System.in);
        System.out.println("\n>>> Input Marks <<<");
        System.out.print("Physics: ");
        p = sc.nextInt();
        System.out.print("Chemistry: ");
        c = sc.nextInt();
        System.out.print("Maths: ");
        m = sc.nextInt();
        System.out.print("CS: ");
        cts = sc.nextInt();
        System.out.print("English: ");
        e = sc.nextInt();
    }

    void compute() {
        tot = p + c + m + cts + e;
        per = (tot / 500) * 100;

        if (per >= 90)
            gd = 'A';
        else if (per >= 60)
            gd = 'B';
        else if (per >= 40)
            gd = 'C';
        else
            gd = 'D';
    }

    void showdata() {
        super.printdata();
        System.out.println("Maths: "+m+"\nPhysics: "+p+"\nChemistry: "+c+
                "\nCS: "+cts+"\nEnglish"+e+"\nTotal: "+tot+"\nPercentage: "+per+"\nGrade: "+gd);
    }
}

public class RunStudent{
    public static void main(String[] args){
        marks ob = new marks();
        ob.readdata();
        ob.compute();
        ob.showdata();
    }
}

