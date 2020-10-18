import java.io.*; 
import java.util.*;  
class largest
{ 
    int max(int arr[], int i, int m) 
    {    if(i==arr.length)
            return m;   
        if(arr[i]>m)
            m=arr[i];
        return max(arr, i+1, m);
    }

    void main()
    {
        //int Arr[]={5,7,14,26,21};
        int Arr[]={5,15,7,25,14};
        System.out.println(max(Arr,0,0));

    }
}
 