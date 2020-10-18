import java.util.*;

class x1Remove
{

    Scanner sc  = new Scanner(System.in);

    String str, rem;
    int len;
    String Arr[];
    x1Remove()
    {
        str="";
        rem="";
        len=0;
    }

    void input()
    {  

        System.out.print("Enter a sequence of tokens separated by space: ");
        str = sc.nextLine();
        int len=str.length();
        Arr=new String[len];
    }

    void display()
    {
        StringTokenizer st = new StringTokenizer(str);
        int s = st.countTokens();
        Arr=new String[s];
        for(int i = 0; i < s; i++)
        {
            Arr[i]=st.nextToken();
        }
        for(int j=0;j<Arr.length;j++)
        {
            rem+=Arr[j].substring(1,Arr[j].length()-1)+" ";
        }

        System.out.println(rem);
    }

    void main()
    {
        x1Remove ob=new x1Remove();
        ob.input();
        ob.display();
    }
}