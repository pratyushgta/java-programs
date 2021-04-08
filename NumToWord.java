import java.io.*;
class NumToWord
{
    InputStreamReader isr=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);

    int N;

    void read() throws IOException
    {
        System.out.print("Enter a number: ");
        N=Integer.parseInt(br.readLine());
    }

    void convert()
    {
        int len=(N+"").length();

        int []digit=new int[len];
        String[] sd = { "Zero", "One",  "Two", "Three", "Four",   "Five", "Six", "Seven", "Eight", "Nine"};

        String[] td = { "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen","Eighteen", "Nineteen"};  

        String[] tens ={"Twenty", "Thirty", "Forty",  "Fifty","Sixty", "Seventy",  "Eighty", "Ninety"};

        String[] tens_power = new String[] {"Hundred", "Thousand"};
        if (len == 1)  
        {
            System.out.println(sd[N]);
            return;
        }
        for(int i=len-1,k=N;i>=0;i--)
        {
            digit[i]=k%10;
            k=k/10;
        }
        int x = 0;
        while (x < len)  
        {

            if ((len-x) == 4 || (len-x)==3)
            {
                if(digit[x]!=0)
                {
                    System.out.print(sd[digit[x]]+" ");                
                    System.out.print(tens_power[len - 3-x]+" ");  
                }
            }
            else
            {
                if(digit[x]==1)
                    System.out.print(td[digit[x+1]]+" ");  
                else if(digit[x]!=0)
                    System.out.print(tens[digit[x]-2]+" "+sd[digit[x+1]]);  
                else if(digit[x+1]!=0)
                    System.out.print(sd[digit[x+1]]);  
                break;
            }    
            x++;
        }
    }

    void main() throws IOException
    {
        NumToWord ob=new NumToWord();
        ob.read();
        if(N>999)
            System.out.println("Invalid Input");
        else
            ob.convert();
    }
}