import java.io.*;
import java.util.*;
class Decoder
{
    InputStreamReader isr=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);
    //to  decode the encoded text having sequence of ASCII values
    String decode(String s) throws IOException
    {
        int len=s.length();
        char ch;
        String storech="";
        float num=0;
        String word="";
        for(int i=0;i<len;i++)
        {
            ch=s.charAt(i);
            storech=storech+ch; //keeps on storing characters until it forms ascii

            num=Float.parseFloat(storech);

            if(num>=65&&num<=90||num>=97&&num<=122)
            {
                word=word+(char)num;
                num=0;
                storech="";
            }
            else if(num==32)
            {
                word=word+(char)num;
                num=0;
                storech="";
            }
            else
            {
            }
        }
        return word;
    }
    //to change the case of the decoded text
    void caseChange(String str)
    {
        str=str.toLowerCase();
        StringTokenizer st = new StringTokenizer(str);
        int count=st.countTokens();
        String newstr=""; //new string with decoded words in correct case
        for(int i=0;i<count;i++)
        {
            String currenttoken=st.nextToken();
            newstr+=Character.toUpperCase(currenttoken.charAt(0))+currenttoken.substring(1)+" ";
        }
        System.out.println("Decoded text: "+newstr);
    }

    void main() throws IOException
    {
        Decoder ob=new Decoder();
        System.out.print("Enter Coded text : ");
        String str=br.readLine();

        StringTokenizer st = new StringTokenizer(str);
        int count=st.countTokens();

        for(int i=0;i<count;i++)
        {
            if(count>1)
            {
                System.out.println("Coded text without spaces is only allowed. Try again...\n");
                main();
            }
        }
        String decoded= ob.decode(str); //string with decoded words
        ob.caseChange(decoded);
    }
}

