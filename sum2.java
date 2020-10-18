class sum2
{
    int sumn(int n)
    {
        if(n==1)
            return 1;
        else
            return n+sumn(n-1);
    }
}
