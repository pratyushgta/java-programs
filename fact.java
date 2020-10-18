class fact
{
    void factorial(int n, int s)
    {
        if(n==1)
        {
            System.out.print(n+"="+s);
        }
        else
        {      
            System.out.print(n+"*");
            factorial(n-1,s*n);
        }
    }
}