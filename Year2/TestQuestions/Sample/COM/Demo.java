package Year2.TestQuestions.Sample.COM;

import java.util.Scanner;

class Order {
    String name = "";
    int cust_no = 0;
    int qty = 0;
    int unit_price = 0;
    int total = 0;

    void computePrice(){
        total = qty*unit_price;
        System.out.println("Total: "+total);
    }

    void display(){
        System.out.println(">>DETAILS<<\nNumber: " + cust_no + "\nName: " + name + "\nQty ordered: " + qty + "\nUnit price: " + unit_price);
    }
}

public class Demo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Order ob = new Order();
        System.out.print("Enter customer number: ");
        ob.cust_no = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter name: ");
        ob.name = sc.nextLine();
        System.out.print("Enter qty: ");
        ob.qty = sc.nextInt();
        System.out.print("Enter Unit price: ");
        ob.unit_price = sc.nextInt();

        ob.display();
        ob.computePrice();
    }
}
