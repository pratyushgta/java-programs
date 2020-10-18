import java.util.*;
class b2d_rec
{
    Scanner sc=new Scanner(System.in);
    int convert(int n, int i) 
    { 
        if(n == 0)
            return 0;
        if(n == 1)
           return ((int)Math.pow(2, i));
        return (n % 10 * (int)Math.pow(2, i) + convert(n / 10, 1+i));
    }
}

