import java.util.*;
import java.io.*;
class frequency
{
    InputStreamReader isr=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);

    int n;
    String str;
    String strArr[];
    String s;
    String sArr[];
    int freq[];
int index=0;
    frequency()
    {
        n=0;
        str="";
        sentence=new int[n];
    }

    void input()
    {
        System.out.print("Enter the sentences");
        str=br.readLine();
        st=new StringTokenizer(str,",.? ");
        n=st.countTokens();
        if(n<=1 || n>4)
        {
            System.out.println("Invalid Input");
        }
        else
        {
            sArr=new String[n];
            strArr=new String[n];
            freq=new int[n];
            
            while(st.hasMoreTokens())
            {
                sArr[index++]=st.nextToken();
                //strArr[
            }
        }
    }
}
            
 