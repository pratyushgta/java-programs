package Year2.TestQuestions.Sample.Basic;

import java.util.Scanner;

class details {
    String name = "";
    int roll = 0;
    int age = 0;

    void set(String n, int r, int a) {
        name = n;
        roll = r;
        age = a;
    }

    String getName() {
        return name;
    }

    int getRoll() {
        return roll;
    }

    int getAge() {
        return age;
    }


}

public class EncapsulationExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        details ob = new details();
        System.out.print("Enter a name: ");
        String n = sc.nextLine();
        System.out.print("Enter roll: ");
        int r = sc.nextInt();
        System.out.print("Enter age: ");
        int a = sc.nextInt();

        ob.set(n, r, a);
        System.out.println("\n>>DETAILS<<\nName: " + ob.getName() + "\nRoll no.: " + ob.getRoll() + "\nAge: " + ob.getAge());


    }
}
