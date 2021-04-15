import java.util.*;
import java.io.*;
class Encryption
{
    InputStreamReader isr=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);

    int n;
    String arr[];

    Encryption()
    {
        n=0;
        arr=new String[n];
    }
    //to enter array size and elements
    void input() throws IOException
    {
        System.out.print("Enter the number of sentences you would like to enter: ");
        while(n<2 || n>9)
        {
            n=Integer.parseInt(br.readLine());
            if(n<2 || n>9)
                System.out.println("Invalid input. Retry.");
        }
        arr=new String[n]; //to initialize the array with new size
        System.out.println("Enter "+n+" sentences");
        for(int i=0;i<n;i++)
        {
            arr[i]=(br.readLine().toUpperCase());
        }
    }
    //to transform the sentence of odd rows and even rows accordingly
    void change()
    {
        for(int i=0;i<n;i++)
        {
            String str; //stores the current string
            char ch; 
            int nextch=0; //stores the new character obtained after shifting character at ch to +2 position
            String word=""; //stores the new word

            if(i%2==0) //if the sentence is of an even row
            {
                str=arr[i];
                for(int j=0;j<str.length();j++)
                {
                    ch=str.charAt(j);
                    nextch=ch+2;//replaces extracted character to next letter
                    if(ch=='Z'||ch=='z')//if letter is Z or z then it'll be replaced by B or b
                    {
                        nextch=nextch-25;
                    }
                    else if(ch=='Y'||ch=='y')//if letter is Y or y then it'll be replaced by A or a
                    {
                        nextch=nextch-26;
                    }
                    else if(ch=='.'||ch=='!'||ch=='?'||ch==' ')
                    {
                        nextch=ch;
                    }
                    word=word+(char)nextch;//combines all replaced letters to form a word
                }

                //following code segment checks if there is a fullstop in the end. If not, it prints one
                if(word.charAt(word.length()-1)!='.') 
                {
                    System.out.print("\n"+word+".");
                }
                else
                {
                    System.out.print("\n"+word);
                }
            }

            if(i%2!=0) //if the sentence is of an odd row
            {
                str=arr[i];
                StringTokenizer st = new StringTokenizer(str);
                int count=st.countTokens();
                String temp[]=new String[count]; //stores the words/tokens in an array
                for(int j=0;j<count;j++)
                {
                    String currenttoken=st.nextToken();
                    temp[j]=currenttoken;
                    //following code segment is to check for fullstops. If there is one, it removes it so that no fullstops appears in middle of the new sentence
                    for(int a=0;a<currenttoken.length();a++)
                    {
                        if(currenttoken.charAt(a)=='.'){
                            temp[j]=currenttoken.substring(0,currenttoken.length()-1);
                        }
                    }
                }
                System.out.println();
                for(int k=temp.length-1;k>=0;k--)
                {
                    System.out.print(temp[k]+" ");
                }
                System.out.print(".");
            }
        }
    }

    void main() throws IOException
    {
        Encryption ob=new Encryption();
        ob.input();
        ob.change();
    }
}

