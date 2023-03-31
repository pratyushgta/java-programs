package Year2.classwork;

import java.util.*;
public class ALExample4 {
    public static void main(String[] args){
        LinkedList<String> list_Strings = new LinkedList<>();
        list_Strings.add("V 1");
        list_Strings.add("V 2");
        list_Strings.add("V 3");
        list_Strings.add("V 4");
        list_Strings.add("V 5");

        System.out.println("Original: "+list_Strings);

        Iterator<String> it = list_Strings.descendingIterator();

        System.out.println("In reverse: ");
        while (it.hasNext()){
            System.out.println(it.next()+", ");
        }
    }
}
