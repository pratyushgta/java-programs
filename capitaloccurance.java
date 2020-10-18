import java.io.*; 
import java.util.*;  
class capitaloccurance 
{ 
    InputStreamReader isr=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);
    int capital(String str, int i) 
    {
        System.out.println(str.length());
        if (Character.isUpperCase(str.charAt(i))) 
            return i; 
        else if(i==str.length()-1)
            return -1; 
        else
            return capital(str,i+1);
    }
}
