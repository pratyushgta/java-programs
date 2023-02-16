/**
 * These classes contain methods for implementing inheritance to calculate salary
 * OOPJ-E4-Q4
 *
 * @author Pratyush Kumar (github.com/pratyushgta)
 */
package Year2;

import java.util.Scanner;

class Employee {
    int empc;
    double bpay;

    Employee() {
        empc = 0;
        bpay = 0;
    }

    Employee(int c, double b) {
        empc = c;
        bpay = b;
    }

    void Display() {
        System.out.println("\n>>>SALARY DETAILS<<<");
        System.out.println("Employee code: " + empc + "\nBaisc pay: " + bpay);
    }
}

class Overtime extends Employee {
    int nd;
    float rate;

    Overtime(int n, float r) {
        nd = n;
        rate = r;
    }

    double Calculate() {
        return super.bpay + (nd * rate); //gross salary
    }

    void Show() {
        System.out.println("Amount paid for extra hours: " + (nd * rate));
    }
}

public class RunEmployee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(">>>INPUT<<<");
        System.out.print("Enter employee code: ");
        int ec = sc.nextInt();
        System.out.print("Enter basic salary: ");
        double bp = sc.nextDouble();
        System.out.print("Enter extra hours worked: ");
        int n = sc.nextInt();
        System.out.print("Enter rate: ");
        float r = sc.nextFloat();

        Overtime ob = new Overtime(n, r);
        ob.empc = ec;
        ob.bpay = bp;
        double gross = ob.Calculate();

        Employee ob1 = new Employee(ec, gross);
        ob1.Display();

        ob.Show();


    }
}
