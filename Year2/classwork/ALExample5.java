package Year2.classwork;

import java.util.Iterator;
import java.util.LinkedList;

public class ALExample5 {
    public static void main(String[] args){
        LinkedList<String> list_Strings = new LinkedList<>();
        list_Strings.add("V 1");
        list_Strings.add("V 2");
        list_Strings.add("V 3");
        list_Strings.add("V 4");
        list_Strings.add("V 5");

        System.out.println("Original: "+list_Strings);
        list_Strings.add(1,"hmm");
        System.out.println("Updated: "+list_Strings);
    }
}
