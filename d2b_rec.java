import java.util.*; 
class d2b_rec  
{ 
    Scanner sc=new Scanner(System.in);

    int calculate(int n) 
    { 
        if (n == 0)  
            return 0;  

        else

            return (n % 2 + 10 *calculate(n/ 2)); 
    } 

    void main()
    {
        d2b_rec ob= new d2b_rec();
        int dn=0;
        System.out.println("Enter decimal number : ");
        dn=sc.nextInt();
        ob.calculate(dn);
    }
}

