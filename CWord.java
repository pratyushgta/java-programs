import java.io.*;
class CWord
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
        String[] sd = { "zero", "one",  "two", "three", "four",   "five", "six", "seven", "eight", "nine"}; 

        String[] td = { "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen","eighteen", "nineteen"};  

        String[] tens ={"twenty", "thirty", "forty",  "fifty","sixty", "seventy",  "eighty", "ninety"};

        String[] tens_power = new String[] {"hundred", "thousand"}; 
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
            if((len-x)==5)
            {
                System.out.print(td[digit[x+1]]+" ");                
                System.out.print(tens_power[len - 4-x]+" "); 
                x++;
            }
            else if ((len-x) == 4 || (len-x)==3) 
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

    public static void main(String[] args) throws IOException
    {
        CWord ob=new CWord();
        ob.read();
        ob.convert();
    }
}
