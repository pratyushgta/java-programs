import java.io.*;
import java.util.*;
class Remove
{
    InputStreamReader isr=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);

    String str;
    String rem;
    int len;
    //default constructor to initialize data members
    Remove()
    {
        str="";
        rem="";
        len=0;
    }
    //to read a sentence from the user
    void read() throws IOException
    {
        System.out.print("Enter a sentence: ");
        str=br.readLine().toLowerCase();
        len=str.length();
    }
    //to extract each word and remove first and last alphabet of word
    void remfand1()
    {
        StringTokenizer st = new StringTokenizer(str);
        int count=st.countTokens();

        for(int i=0;i<count;i++)
        {
            String currenttoken=st.nextToken();
            if(currenttoken.length()<=2)
            {
                rem+="";
            }
            else
            {
                rem+= currenttoken.substring(1, currenttoken.length() - 1) + " ";
            }
        }
    }
    //to display the original and new sentence
    void display()
    {
        System.out.println("\nOriginal Sentence: "+str);
        System.out.println("New  Sentence    : "+rem);
    }

    void main() throws IOException
    {
        Remove ob=new Remove();
        ob.read();
        ob.remfand1();
        ob.display();
    }
}

