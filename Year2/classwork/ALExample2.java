package Year2.classwork;

import java.util.ArrayList;
import java.util.List;

public class ALExample2 {
    public static void main (String[] args) {
        List<String> list_Strings = new ArrayList<>();
        list_Strings.add( "Apple");
        list_Strings.add( "Pears" ) ;
        list_Strings.add( "Guava" ) ;
        list_Strings.add( "Mango" ) ;
        System.out.println(list_Strings);

        List<String> list_Strings2 = new ArrayList<String>();
        list_Strings2.add( "Apple");
        list_Strings2.add( "Pears" ) ;
        list_Strings2.add( "Guava" ) ;
        list_Strings2.add( "Mango" ) ;
        System.out.println(list_Strings2);

        boolean boolval = list_Strings.equals(list_Strings2);
        System.out.println(boolval);
    }
}
