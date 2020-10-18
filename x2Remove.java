import java.util.*;

class x2Remove

{

    Scanner sc=new Scanner(System.in);

    String str,rem;

    int len;

    x2Remove()

    {

        str="";

        rem="";

        len=0;

    }

    void read()
    {       
        System.out.print("Enter a sentence in lowercase: ");
        str=sc.nextLine().toLowerCase();
        str=str+"";
        len=str.length();
    }

    void remfandl()
    {
        String s=str;
        String wrd="";
        char c=' ';
        int i=0;
        for (i=0;i<len-1;i++)
        {
            c=s.charAt(i);
            wrd=wrd+c;
            if(c==' ')
            {
                if(wrd.length()<=2)
                {
                    wrd=wrd.substring(i);
                }
                else
                {
                    wrd=wrd.substring(1,((wrd.length()-2)));
                    rem=rem+" "+wrd;
                    wrd="";
                }
            }
        }
    }

    void display()
    {
        System.out.println("Original Sentence: "+str);
        System.out.println("New Sentence: "+rem);
    }

    void main()
    {
        x2Remove ob=new x2Remove();
        ob.read();
        ob.remfandl();
        ob.display();
    }
}