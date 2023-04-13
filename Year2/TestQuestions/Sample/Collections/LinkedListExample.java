package Year2.TestQuestions.Sample.Collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListExample {
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        System.out.println("Keep entering numbers or enter 'F' to stop: ");
        while (!exit){
            String num=sc.nextLine();
            if (num.equalsIgnoreCase("F")){
                exit=true;
            } else {
                list.add(Integer.parseInt(num));
            }
        }
        System.out.println("\nList elements: ");
        Iterator<Integer> i =list.iterator();
        while(i.hasNext()){
            System.out.println(i.next()+" ");
        }
    }
}
