import java.io.*;
import java.util.*;
class SpecialFashion
{
    InputStreamReader isr=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);
    //to replace specific words by the next character in circular fashion
    String replace(String s)
    {
        int len=s.length();
        int nextch=0;
        char ch;
        String word="";

        for(int i=0;i<len;i++)
        {
            ch=s.charAt(i);
            nextch=ch+1;//replaces extracted character to next letter
            if(ch=='Z'||ch=='z')//if letter is Z or z then it'll be replaced by A or a
            {
                nextch=nextch-26;
            }
            else if(ch=='.'||ch=='!'||ch=='?')
            {
                nextch=ch;
            }
            word=word+(char)nextch;//combines all replaced letters to form a word
        }
        return word;
    }

    void main() throws IOException
    {
        SpecialFashion ob=new SpecialFashion();
        System.out.print("Enter a sentence : ");
        String str=br.readLine();

        StringTokenizer st = new StringTokenizer(str);
        int count=st.countTokens();

        String newstr=""; //new string with replaced words

        String replacedword="";

        System.out.print("\nEnter 1st word position: ");
        int x=Integer.parseInt(br.readLine());

        System.out.print("Enter 2nd word position: ");
        int y=Integer.parseInt(br.readLine());

        if(x<1||y<1||x>count||y>count)
        {
            System.out.println("No word exists at entered position");
        }
        else
        {
            for(int i=0;i<count;i++)
            {
                String currenttoken=st.nextToken();
                if(i==y-1||i==x-1)
                {
                    replacedword=ob.replace(currenttoken);
                    newstr+=replacedword+" ";
                }
                else
                {
                    newstr+=currenttoken+" ";
                }
            }  
        }
        System.out.print("\nNew sentence: "+newstr);
    }
}

