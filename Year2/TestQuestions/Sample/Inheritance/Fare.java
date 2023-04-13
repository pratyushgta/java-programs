package Year2.TestQuestions.Sample.Inheritance;

import java.util.Scanner;

class Vehicle{
    int seating_capacity;

    Vehicle(int cap){
        seating_capacity = cap;
    }
    double getFare(){
        return seating_capacity*100;
    }
}

class Bus extends Vehicle{
    Bus(int cap){
        super(cap);
    }
    double getFare(){
        return (super.getFare()+(super.getFare()*0.1));
    }
}

class Bike extends Vehicle{
    Bike(int cap){
        super(cap);
    }
    double getFare(){
        return super.getFare();
    }
}
public class Fare {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter seating capacity: ");
        int s_cap = sc.nextInt();

        Bus ob = new Bus(s_cap);
        System.out.println("Fare of bus: "+ob.getFare());
        Bike ob1 = new Bike(s_cap);
        System.out.println("Fare of bike: "+ob1.getFare());
    }
}
