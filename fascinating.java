import java.io.*;
class fascinating
{
    InputStreamReader isr=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);

    int check(int n)
    {
        int no=n;
        int A=no*1;
        int B=no*2;
        int C=no*3;

        String a=Integer.toString(A);
        String b=Integer.toString(B);
        String c=Integer.toString(C);

        String num=a+b+c;
        System.out.println(num);
        System.out.println(num.length());
        int freq=0;
        int zero=0;
        for(int i=0;i<num.length();i++)
        {
            if(num.charAt(i)=='0')
            {
                zero++;
            }
            for(int j=0;j<num.length();j++)
            {
                if(num.charAt(i)==num.charAt(j)&&num.charAt(i)!='0')
                {
                    freq++;
                }
            }
        }

        if(freq+zero>num.length())
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }
}

