class uppercase
{ 
    int count(String str, int i) 
    {
       if(i==str.length())
       return 0;
       else if (Character.isUpperCase(str.charAt(i))) 
            return 1+count(str,i+1); 
        else
            return count(str,i+1);
    }
}

