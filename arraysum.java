import java.io.*; 
import java.util.*;  
class arraysum
{ 
    int sum(int arr[], int i)
    {
        if(i<arr.length)
        {
            return arr[i]+sum(arr,i+1);
        }
        else
        {
            return 0;
        }
    }
     void main()
    {
        //int Arr[]={5,7,14,26,21};
        int Arr[]={5,15,7,25,14};
        System.out.println(sum(Arr,0));

    }
}
 