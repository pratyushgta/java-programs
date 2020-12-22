class test
{
    void calling()
    {
        int f=2;
        int n=39;
        System.out.println (show(n , f));
    }

    int show(int n, int f)
    {
        if(n== f)
        return 1;
        if ( n % f == 0 || n == 1)
        return 0;
        return show( n , f + 1 );
    }
}