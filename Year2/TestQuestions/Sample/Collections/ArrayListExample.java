package Year2.TestQuestions.Sample.Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<>();

    void add() {
        System.out.print("Enter element to add: ");
        int num = sc.nextInt();
        list.add(num);
        System.out.println("Element added!");
        menu();
    }

    void remove() {
        if (list.size() < 1) {
            System.out.println("I'm afraid you're gonna break the matrix if you do this");
            menu();
        }
        else {
            System.out.println("\n>>LIFE OPTIONS<<\n1. Remove all\n2. Remove specific\n3. Go Back");
            int choice = sc.nextInt();
            if (choice == 1) {
                list.clear();
                System.out.println("Entire list cleared!");
                menu();
            } else if (choice == 2) {
                System.out.print("Enter index of element to remove: ");
                int rem = sc.nextInt();
                try {
                    list.remove(rem);
                    System.out.println("Element deleted!");
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("Bruh. Number does not exist in the list");
                    remove();
                } finally {
                    menu();
                }
            } else if (choice == 3) {
                menu();
            } else {
                System.out.println("Bruh.");
            }
        }
    }

    void size() {
        System.out.println("Size of arraylist: " + list.size());
        menu();
    }

    void display() {
        if (list.size() < 1) {
            System.out.println("List is empty!");
            menu();
        } else {
            System.out.println("\n>>ARRAY ELEMENTS<<");
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
            menu();
        }
    }

    void menu() {
        System.out.print("\n>>OH HOY!<<\n1. Add\n2. Remove\n3. Size\n4. Display\n5. Exit\nEnter: ");
        int choice = sc.nextInt();
        if (choice == 1)
            add();
        else if (choice == 2)
            remove();
        else if (choice == 3)
            size();
        else if (choice == 4)
            display();
        else if (choice == 5)
            System.exit(0);
        else {
            System.out.println("Hmm i suppose the menu only has options 1 through 5");
            menu();
        }
    }

    public static void main(String[] args) {
        ArrayListExample ob = new ArrayListExample();
        ob.menu();
    }
}
