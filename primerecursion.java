class primerecursion
{
    boolean prime(int N, int f)
    {
        if(N==f)
            return true;
        else if(N%f==0)
            return false;
        else
            return prime(N,f+1);
    }
}