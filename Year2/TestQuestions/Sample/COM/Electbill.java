package Year2.TestQuestions.Sample.COM;

import java.util.Scanner;

public class Electbill {
    int cust_no = 0;
    String name = "";
    String address = "";
    int units = 0;

    void display() {
        System.out.println(">>CUSTOMER DETAILS<<\nNumber: " + cust_no + "\nName: " + name + "\nAddress: " + address + "\nUnits Consumed: " + units);
    }

    void calculate() {
        double rate = 0;
        if (units >= 1 && units <= 100) {
            rate = 500;
        } else if (units > 100 && units <= 200) {
            rate = units + 500;
        } else if (units > 200 && units <= 300) {
            rate = (1.20 * units) + 500;
        } else {
            rate = 0;
        }

        System.out.println("Rate: " + rate);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Electbill ob = new Electbill();
        System.out.print("Enter number: ");
        ob.cust_no = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter name: ");
        ob.name = sc.nextLine();
        System.out.print("Enter address: ");
        ob.address = sc.nextLine();
        System.out.print("Enter units: ");
        ob.units = sc.nextInt();

        ob.display();
        ob.calculate();
    }
}
