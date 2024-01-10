package Year3.Sem6.CS;

import java.util.Arrays;
import java.util.Scanner;

public class caesar {
    String a, a1, a2;
    int n;
    //private char[] arr1;
    //char []arr1;

    void input1() {
        Scanner sc = new Scanner(System.in);
        //String a;
        System.out.println("Enter Plain Text:");
        a = sc.nextLine();
        a1 = a.replaceAll(" ", "").toLowerCase();
        System.out.println(a1);
        //int n;
        System.out.println("enter key:");
        n = sc.nextInt();
        main(new String[]{});
    }

    void encryption() {
        //System.out.println(a1);
        char arr1[] = new char[a1.length()];
        char[] ch = new char[a1.length()];


        for (int i = 0; i < a1.length(); i++) {
            ch[i] = a1.charAt(i);
            //int n= ch[i]+3;
            if (a1.charAt(i) >= 120)
                arr1[i] = (char) (a1.charAt(i) - (20 + n));
            else
                arr1[i] = (char) (a1.charAt(i) + n);
        }
        a2 = String.valueOf(arr1);
        System.out.println("Encrypted Text:");
        for (char c : arr1) {
            System.out.print(c);
        }
        main(new String[]{});
    }

    void decryption() {
        char[] ch2 = new char[a1.length()];
        char[] arr2 = new char[a1.length()];

        for (int i = 0; i < a1.length(); i++) {
            ch2[i] = a2.charAt(i);
            //int n= ch[i]+3;
            if (a2.charAt(i) >= 120)
                arr2[i] = (char) (a2.charAt(i) + (20 + n));
            else
                arr2[i] = (char) (a2.charAt(i) - n);
        }
        System.out.println(" ");
        //System.out.println(arr2);
        System.out.println("Decrypted Text:");
        for (char C : arr2) {
            System.out.print(C);
        }
        main(new String[]{});
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        caesar ob = new caesar();
        int i = 0;
        System.out.println("--:WELCOME TO CAESAR CIPHER:--");
        while (i == 0) {
            System.out.println("\n 1.INPUT \n 2.ENCRYPTION \n 3.DECRYPTION \n 4.EXIT");
            i = sc.nextInt();
            switch (i) {
                case 0:
                    break;
                case 1:
                    ob.input1();
                    break;
                case 2:
                    ob.encryption();
                    break;
                case 3:
                    ob.decryption();
                    break;
                case 4:
                    i = 1;
                    break;
            }
        }

        /*Scanner sc = new Scanner(System.in);
        String a;
        System.out.println("Enter Plain Text:");
        a = sc.nextLine();
        String a1=a.replaceAll(" ","").toLowerCase();
        System.out.println(a1);
        int n;
        System.out.println("enter key:");
        n=sc.nextInt();

        char arr1 []= new char[a1.length()];
        char[] ch = new char[a1.length()];


        for (int i = 0; i < a1.length(); i++) {
            ch[i] = a1.charAt(i);
            //int n= ch[i]+3;
            if(a1.charAt(i) >=120)
                arr1[i]=(char) (a1.charAt(i)-(20+n));
            else
                arr1[i]=(char) (a1.charAt(i)+n);
        }

        for (char c : arr1) {
            System.out.print(c);
        }

        char[] ch2=new char[a1.length()];
        char[] arr2=new char[a1.length()];

        for (int i = 0; i < a1.length(); i++) {
            String a2= String.valueOf(arr1);
            //System.out.println(a2);
            ch2[i] = a2.charAt(i);
            //int n= ch[i]+3;
            if(a2.charAt(i)>=120)
                arr2[i]=(char) (a2.charAt(i)+(20+n));
            else
                arr2[i]=(char) (a2.charAt(i)-n);
        }
        System.out.println(" ");
        //System.out.println(arr2);
        for (char C : arr2) {
            System.out.print(C);
        }*/
    }

}
