package Year2.TestQuestions.Sample.COM;

import java.util.Scanner;

class Salesperson{
    String name="";
    double basic = 0;
    int units = 0;
    double incentive=0;

    void calculate_incentive_method(){
        if(units>500){
            incentive = 0.2*basic;
        } else {
            incentive = 0.1*basic;
        }

        System.out.println("Incentive: "+incentive);
    }
}
public class Demo2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Salesperson ob = new Salesperson();
        System.out.println(">>INPUT DETAILS<<");
        for(int i=0;i<5;i++){
            System.out.println("\nSalesperson: "+(i+1));
            System.out.print("Enter name: ");
            ob.name = sc.nextLine();
            sc.nextLine();
            System.out.print("Enter basic pay: ");
            ob.basic = sc.nextInt();
            System.out.print("Enter units sold: ");
            ob.units = sc.nextInt();

            System.out.println("\n>>EMPLOYEE DETAILS<<");
            System.out.println(">>DETAILS<<\nName: " + ob.name + "\nBasic: " + ob.basic + "\nUnit sold: " + ob.units);
            ob.calculate_incentive_method();
        }
    }
}
