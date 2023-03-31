package Year2.classwork;

import java.util.*;
public class ALExample1 {
    public static void main (String[] args) {
        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add( "Red");
        list_Strings.add( "Green" ) ;
        list_Strings.add( "Orange" ) ;
        list_Strings.add( "White" ) ;
        list_Strings.add( "Black" ) ;
        System.out.println("Original list: "+list_Strings);
        List<String> sublist = list_Strings.subList(1,3);
        System.out.println("List of first 3 elements: "+sublist);
    }
}