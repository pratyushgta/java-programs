import java.io.*;
import java.util.Arrays; 
class Combine
{
    InputStreamReader isr=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);

    int com[];
    int size;
    //default constructor to initialize data members
    Combine(int nn)
    {
        size=nn;
        com=new int[size];
    }
    //to read array elements
    void input()throws IOException
    {
        System.out.println("Enter "+size+" elements: ");
        for(int i=0; i<size;i++)
        {
            com[i] = Integer.parseInt(br.readLine());   
        }
    }
    //to sort the elements of combined array in ascending order
    void sort()
    {
        for(int i=0; i<size-1;i++)
        {
            int min = com[i];
            int pos = i;
            for(int j=i+1;j<size;j++)
            { 
                if(min > com[j])
                {
                    min = com[j];
                    pos = j;
                }
            }
            int temp = com[i];
            com[i] = com[pos];
            com[pos] = temp;
        }
        for(int i=0;i<com.length;i++)
        {
            if(com[i]!=0)
                System.out.println(com[i]);
        }
    }
    //to combine the two arrays and store in the current object
    void union(Combine A, Combine B)
    {
        int n=A.com.length;
        int m=B.com.length;
        com=new int[n+m];
        int i,j,k;
        i=j=k=0;

        while(i<n && j<m)
        {
            if(A.com[i]<B.com[j])
            {   com[k]=A.com[i];

                i++;

            }
            else if(A.com[i]>B.com[j]) 
            { 
                com[k]=B.com[j];

                j++;

            }
            else if(A.com[i]==B.com[j])
            {
                com[k]=A.com[i];
                i++;
                j++;
            }
            k++;
        }

        if(i<n)
        {
            while(i<n)
            {
                com[k++]=A.com[i];
                i++;
            }
        }
        if(j<m)
        {
            while(j<m)
            {
                com[k++]=B.com[j];
                j++;
            }
        }

        /*int rem=-1;
        for(int l=0;i<com.length;l++)
        {
        if(com[l]!=0)
        {
        rem=l;
        break;
        }
        }
        for(int q=0;q<com.length-rem;q++)
        {
        int newcom[]=new int[rem+q];
        }
        for(int o=0;o<com.length-rem;o++)
        {
        System.out.print(com[o]+" ");
        }*/
    }

    void main()throws IOException
    {
        System.out.print("Enter the size of 1st array: ");
        int size1 = Integer.parseInt(br.readLine());
        Combine ob1 = new Combine(size1);
        ob1.input();

        System.out.print("\nEnter the size of 2nd array: ");
        int size2 = Integer.parseInt(br.readLine());
        Combine ob2 = new Combine(size2);
        ob2.input();

        Combine ob3 = new Combine(size1 + size2);

        ob3.union(ob1, ob2);
        System.out.println("\nCombined array:");
        ob3.sort();
    }

}