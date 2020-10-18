class pattern
{
    void display(String str, int i)
    {
        if(i<str.length())
        {

            System.out.print(i+"*"+str.charAt(i));
            if(i<str.length()-1)
                System.out.print(",");
            else
                System.out.println();
            display(str,i+1);
            
            if(i==str.length()-1)
                System.out.println();
            System.out.println(str.charAt(i)+"#"+i);
        }

    }
}
