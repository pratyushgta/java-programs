package Year2.classwork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ALExample3 {
    public static void main(String[] args)
    {
        List<String> list_Strings = new ArrayList<>();
        list_Strings.add("Item 1");
        list_Strings.add("Item 2");
        list_Strings.add("Item 3");
        list_Strings.add("Item 4");
        list_Strings.add("Item 5");
        System.out.println("Before swapping: "+list_Strings);

        Collections.swap(list_Strings,1,2);
        System.out.println("After swapping: "+list_Strings);
    }
}