import java.io.*;
class Performance
{
    InputStreamReader isr=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);
    int Marks[], Mode, FreqOfMode;
    //default constructor to initialize the data members
    Performance()
    {
        Marks=new int[100];
        Mode=0;
        FreqOfMode=0;
    }
    //to read the marks of students
    void readMarks() throws IOException
    {
        System.out.println("Enter marks of 10 students: ");

        for(int i=0;i<10;i++)
        {
            Marks[i]=Integer.parseInt(br.readLine());
        }
    }
    //to calculate and return the mode
    int getMode()
    {
        int mode=Marks[0];
        int c=1;
        for(int i=0;i<10;i++)
        {
            int count=0;
            for(int j=i;j<10;j++)
            {
                if(Marks[i]==Marks[j])
                {
                    count++;
                }
            }

            if(count>c)
            {
                c=count;
                mode=Marks[i];
            }
            else if(count==c)
            {
                mode=mode>Marks[i]?mode:Marks[i];
            }
        }
        return mode;
    }
    //to calculate mode and its frequency
    void calcFreqAndMode()
    {
        Mode=getMode();
        for(int i=0;i<100;i++)
        {
            if(Marks[i]==Mode)
            {
                FreqOfMode++;
            }
        }
    }

    void main() throws IOException
    {
        Performance ob=new Performance();
        ob.readMarks();
        ob.calcFreqAndMode();
        System.out.println("Mode: "+ob.Mode+" | Frequency: "+ob.FreqOfMode);
    }
}

