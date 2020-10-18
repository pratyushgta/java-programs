class reverse
{
    String rev(String str, int i)
    {
        {
            if(i == str.length())
                return "";
            else
                return rev(str,i+1)+""+str.charAt(i);
        }

    }
}

