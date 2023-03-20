package Year2.classwork;

import java.util.Scanner;

class OrderException extends Exception {
    OrderException(String message) {
        super(message);
    }
}

class Car {
    private String name;
    private double price;

    Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class GarageDealer {
    private Car[] inventory;
    private int count;

    GarageDealer() {
        inventory = new Car[20];
        count = 0;
    }

    void placeOrder(Car car) throws OrderException {
        if (count >= 20) {
            throw new OrderException("Cannot accept order, garage is full.");
        }
        if (car.getPrice() > 30000000) {
            throw new OrderException("Cannot accept order, car price exceeds limit.");
        }
        inventory[count] = car;
        count++;
        System.out.println("Order placed for " + car.getName() + " at Rs." + car.getPrice() + ".");
    }

    void showInventory() {
        if (count == 0) {
            System.out.println("Garage is empty.");
        } else {
            System.out.println("Inventory:");
            for (int i = 0; i < count; i++) {
                System.out.println("- " + inventory[i].getName() + " (Rs." + inventory[i].getPrice() + ")");
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        GarageDealer dealer = new GarageDealer();
        for (int i = 0; i < 5; i++) {
            Car ob = new Car("Maruti 800", 100000);
            try {
                dealer.placeOrder(ob);
            } catch (OrderException e) {
                System.out.println(e.getMessage());
            }
        }
        dealer.showInventory();
        for (int i = 0; i < 5; i++) {
            Car ob = new Car("Nano", 200000);
            try {
                dealer.placeOrder(ob);
            } catch (OrderException e) {
                System.out.println(e.getMessage());
            }
        }
        dealer.showInventory();
        for (int i = 0; i < 12; i++) {
            Car ob = new Car("Micro", 300000);
            try {
                dealer.placeOrder(ob);
            } catch (OrderException e) {
                System.out.println(e.getMessage());
            }
        }
        dealer.showInventory();
    }
}
