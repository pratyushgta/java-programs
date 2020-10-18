class show//To print 0A1B2C3D D1C1B1A1 pattern
{
    void display(String str, int i)
    {
        if(i<str.length())
        {
            System.out.print(i+""+str.charAt(i));
            display(str,i+1);
            if(i==str.length()-1)
                System.out.println();
            System.out.print(str.charAt(i)+""+1);

        }
    }
}
