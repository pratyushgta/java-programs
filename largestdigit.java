class largestdigit
{
  int max(int n, int m)
    {
        if(n == 0)
            return m;
        if(n % 10 > m)
            return max(n/10,n%10);
        else
            return max(n/10,m);
    }
}  