import java.io.*;
import java.util.*;
class StringTok
{
    InputStreamReader isr=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);
    Scanner sc=new Scanner(System.in);

    String str;
    //to read a sequence of tokens
    void input() throws IOException
    {
        System.out.print("Enter a string : ");
        str=br.readLine();
    }
    //to display each token on a separate line
    void display()
    {    
        StringTokenizer st = new StringTokenizer(str);
        int count=st.countTokens();
        System.out.println("Total number of Tokens: "+count);
        for(int i=0;i<count;i++)
        {
            System.out.println(st.nextToken());
        }
    }
    //to find the longest token present in the String
    void longest() 
    {
        StringTokenizer st = new StringTokenizer(str);
        int n=st.countTokens();
        int longestwordlen=0;
        String currenttoken="";
        String longestword="";
        for(int i=0;i<n;i++)
        {
            currenttoken=st.nextToken();

            if(currenttoken.length()>longestwordlen)
            {
                longestwordlen=currenttoken.length();
                longestword=currenttoken;
            }
            if(currenttoken.length()==longestwordlen)
            {
                longestwordlen=currenttoken.length();
                longestword=currenttoken;
            }
        }
        System.out.println("\nLongest Word: "+longestword);
    }
    //to find and return sum of tokens only if all tokens are integers
    int sum()
    {
        int sum=0;
        StringTokenizer st = new StringTokenizer(str);
        int n=st.countTokens();

        for(int i=0;i<n;i++)
        {
            String currenttoken=st.nextToken();
            for(int j=0;j<currenttoken.length();j++)
            {
                char ch=str.charAt(j);
                int ascii=(int)ch;
                if(ascii>=97 && ascii<=122 || ascii>=65 && ascii<=90)
                {
                    sum=-1;
                }
            }
            if(sum!=-1)
            {
                int num=Integer.valueOf(currenttoken);
                sum=sum+num;
            }
        }
        return sum; 
    }

    void main() throws IOException
    {
        StringTok ob=new StringTok();
        ob.input();
        ob.display();
        ob.longest();
        int res=ob.sum();
        System.out.println("Sum is : "+res);
    }
}

