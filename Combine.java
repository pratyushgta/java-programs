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
        for(int i=0; i<size;i++)
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
            System.out.println(com[i]);
        }
    }
    //to combine the two arrays and store in the current object
   /* void union(Combine A, Combine B)
    {
        int n=A.com.length;
        int m=B.com.length;
        com=new int[n+m];
        int i,j,k;
        i=j=k=0;

        while(i<n && j<m)
        {
            if(A.com[i]<B.com[j])
            {
                com[k]=A.com[i];
                i++;
            }
            else 
            {
                com[k]=B.com[j];
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
    }*/

    void printUnion(Combine A, Combine B)  
    { 
        // Before finding union, make sure arr1[0..m-1]  
        // is smaller
        int n=A.com.length;
        int m=B.com.length;
        com=new int[n+m];
        //int i,j,k;
        //i=j=k=0;

        if (m > n)  
        { 
            int tempp[] = A.com; 
            A.com = B.com; 
            B.com= tempp; 

            int temp = m; 
            m = n; 
            n = temp; 
        } 

        // Now arr1[] is smaller 
        // Sort the first array and print its elements (these two 
        // steps can be swapped as order in output is not important) 
        Arrays.sort(A.com); 
        for (int i = 0; i < m; i++) 
            System.out.print(A.com[i] + " "); 

        // Search every element of bigger array in smaller array 
        // and print the element if not found 
        for (int i = 0; i < n; i++)  
        { 
            if (binarySearch(A.com, 0, m - 1, B.com[i]) == -1) 
                System.out.print(B.com[i] + " "); 
        } 
    } 
    
    int binarySearch(int arr[], int l, int r, int x)  
    { 
        if (r >= l)  
        { 
            int mid = l + (r - l) / 2; 
  
            // If the element is present at the middle itself 
            if (arr[mid] == x) 
                return mid; 
  
            // If element is smaller than mid, then it can only  
            // be present in left subarray 
            if (arr[mid] > x) 
                return binarySearch(arr, l, mid - 1, x); 
  
            // Else the element can only be present in right subarray 
            return binarySearch(arr, mid + 1, r, x); 
        } 
  
        // We reach here when element is not present in array 
        return -1; 
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

        ob3.printUnion(ob1, ob2);
        System.out.println("\nCombined array:");
        ob3.sort();
    }
}