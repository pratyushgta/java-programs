package Year2.TestQuestions.Sample.Abstract;

import java.util.Scanner;

abstract class Account {
    public abstract void deposit(double amt);

    public abstract void withdraw(double amt);

}

class CurrentAccount extends Account {

    public void deposit(double a) {
        if (a > 5000)
            System.out.println("You cannot deposit more than 5000!");
        else
            System.out.println("Deposited!");

    }

    public void withdraw(double a) {
        if (a > 2000)
            System.out.println("You cannot withdraw more than 2000!");
        else
            System.out.println("Withdrawn!");
    }
}

class SavingsAccount extends Account {
    public void deposit(double a) {
        if (a > 5000)
            System.out.println("You cannot deposit more than 5000!");
        else
            System.out.println("Deposited!");
    }

    public void withdraw(double a) {
        if (a > 2000)
            System.out.println("You cannot withdraw more than 2000!");
        else
            System.out.println("Withdrawn!");
    }
}

public class AccountMain {
    public static void main(String[] args) {
        CurrentAccount ob = new CurrentAccount();
        SavingsAccount ob1 = new SavingsAccount();

        Scanner sc = new Scanner(System.in);
        System.out.println("\n>>Welcome back!<<\n1. Savings\n2. Current");
        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.println("\n>>Savings<<\n1. Withdraw\n2. Deposit");
            int ch = sc.nextInt();
            if (ch == 1) {
                System.out.print("Enter amount to withdraw: ");
                int a = sc.nextInt();
                ob.withdraw(a);
            } else if (ch == 2) {
                System.out.print("Enter amount to deposit: ");
                int a = sc.nextInt();
                ob.deposit(a);
            }
        } else if (choice == 2) {
            System.out.println("\n>>Current<<\n1. Withdraw\n2. Deposit");
            int ch = sc.nextInt();
            if (ch == 1) {
                System.out.print("Enter amount to withdraw: ");
                int a = sc.nextInt();
                ob1.withdraw(a);
            } else if (ch == 2) {
                System.out.print("Enter amount to deposit: ");
                int a = sc.nextInt();
                ob1.deposit(a);
            }
        }
    }
}
