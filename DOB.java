import java.io.*;
import java.util.*;
class DOB
{
    InputStreamReader isr=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);

    int dd, mm, yy;

    DOB()
    {
        dd=0;
        mm=0;
        yy=0;
    }
    //to check whether the entered date if birth is valid or not
    void input() throws IOException
    {
        System.out.println("Enter your date of birth in dd mm yyyy format: ");
        dd=Integer.parseInt(br.readLine());
        mm=Integer.parseInt(br.readLine());
        yy=Integer.parseInt(br.readLine());
        int dayNo=0;
        int y=0;
        y=isLeapYear(yy); //checks if the entered year is a leap year or not
        if(y==1){ //if it is a leap year, then Feb has 29 days
            int [] month={31,29,31,30,31,30,31,31,30,31,30,31};
            if(mm<=12 && dd>=1 && dd<=month[dd])
            {
                for(int i=0;i<mm-1;i++){
                    dayNo+=month[i];
                }
                dayNo+=dd; //to add the number of days passed until the entered DOB/ to print the day number of the year for the entered DOB
                System.out.println("\nVALID DATE\nDay number: "+dayNo);
            }
        }

        else if(y==0){ //if it is not a leap year, then feb has 28 days
            int [] month={31,28,31,30,31,30,31,31,30,31,30,31};
            if(mm<=12 && dd>=1 && dd<=month[dd])
            {
                for(int i=0;i<mm-1;i++){
                    dayNo+=month[i];
                }
                dayNo+=dd;
                System.out.println("\nVALID DATE\nDay number: "+dayNo);
            }
        }

        else 
        {
            System.out.println("INVALID DATE");
        }
    }
    //to check for leap year
    int isLeapYear(int year)
    {
        if(year%4==0 && year%100==0 && year%400==0)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }

    void main() throws IOException
    {
        DOB ob=new DOB();
        ob.input();
    }
}
 