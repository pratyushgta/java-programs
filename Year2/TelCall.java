/**
 * This class contains methods for calculating monthly bill of consumers
 * OOPJ-E3.2-Q1
 * @author Pratyush Kumar (github.com/pratyushgta)
 */

package Year2;

import java.io.*;
import java.text.DecimalFormat;

public class TelCall {
    String phno;
    String name;
    int n;
    double amt;

    TelCall(String x, String y, int k){
        phno = x;
        name = y;
        n = k;
    }

    void compute(){
        if(n>1 && n<=100)
            amt = 500;
        else if(n>100 && n<=200)
            amt = 500 + (n);
        else if(n>200 && n<=300)
            amt = 500 + (1.2*n);
        else
            amt = 500 + (1.5*n);
    }

    void display() {
        System.out.println("Phone number\tName\t\tTotal Calls\t\tAmount");
        System.out.println(phno + "\t\t" + name + "\t\t\t" + n + "\t\t\t" + amt);
    }


    public static void main(String[] args) throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println(">>>Input Details<<<");
        System.out.print("Enter phone number: ");
        String p = br.readLine();
        System.out.print("Enter Name: ");
        String n = br.readLine();
        System.out.print("Enter total calls: ");
        int c = Integer.parseInt(br.readLine());
        TelCall ob = new TelCall(p,n,c);
        ob.compute();
        System.out.println("\n\n>>>Customer Details<<<");
        ob.display();
    }
}
