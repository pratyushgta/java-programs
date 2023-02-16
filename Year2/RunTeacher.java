/**
 * These classes contain methods for implementing inheritance to sort & display teacher details
 * OOPJ-E4-Q3
 *
 * @author Pratyush Kumar (github.com/pratyushgta)
 */

package Year2;

import java.util.Scanner;

class Teacher {
    String[] name = new String[3];
    String[] dob = new String[3];
    String[] doj = new String[3];

    void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.println(">>>INPUT<<<");
        for (int i = 0; i < 3; i++) {
            System.out.println("> TEACHER " + (i + 1));
            System.out.print("Enter name: ");
            name[i] = sc.nextLine();
            System.out.print("Enter DOB: ");
            dob[i] = sc.next();
            sc.nextLine();
            System.out.print("Enter DOJ: ");
            doj[i] = sc.next();
            sc.nextLine();
        }
    }

    void show_getdata() {
        System.out.println("\n>>> TEACHER DETAILS <<<");
        System.out.println("\tName\t\tDOB\t\tDOJ");
        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + ".\t" + name[i] + "\t\t" + dob[i] + "\t\t" + doj[i]);
        }
    }
}

class Principal extends Teacher {
    void sortdata() {
        super.getdata();
        //sort array
        int size = super.name.length;
        for (int i = 0; i <= size - 1; i++) {
            for (int j = 0; j < (size - i - 1); j++) {
                if (super.name[j].compareTo(super.name[j + 1]) > 0) {
                    String temp = super.name[j];
                    super.name[j] = super.name[j + 1];
                    super.name[j + 1] = temp;

                    String temp2 = super.dob[j];
                    super.dob[j] = super.dob[j + 1];
                    super.dob[j + 1] = temp2;

                    String temp3 = super.doj[j];
                    super.doj[j] = super.doj[j + 1];
                    super.doj[j + 1] = temp3;
                }
            }
        }
    }

    void display() {
        super.show_getdata();
    }

    void searchdata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n>>> SEARCH TEACHER <<<");
        System.out.print("Enter name to search: ");
        String search = sc.nextLine();

        int check = 0;
        for (int i = 0; i < super.name.length; i++) {
            if (search.equalsIgnoreCase(super.name[i])) {
                System.out.println("Teacher found!\nName: " + super.name[i] + "\nDOB: " + super.dob[i] + "\nDOJ: " + super.doj[i]);
                check = 1;
                break;
            }
        }
        if (check == 0)
            System.out.println(search + " not found in the database!");
    }
}

public class RunTeacher {
    public static void main(String[] args) {
        Principal ob = new Principal();
        Scanner sc = new Scanner(System.in);
        ob.sortdata();
        ob.display();
        ob.searchdata();
    }
}
