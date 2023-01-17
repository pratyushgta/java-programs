/**
 * This class contains methods for adding two numbers
 * OOPJ
 * @author Pratyush Kumar (github.com/pratyushgta)
 */

package Year2;
class SecondLargest
{
    int arr[];
    int size;
    int Second_max;
    public void sort(int arr[])
    {
        for(int i=0;i< size-1;i++)
        {
            for(int j=0;j < size-1 ;j++)
            {
                if(arr[j]<arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public void perform()
    {
        Second_max=arr[1];
    }
}



public class ObjectDemo2
{
    public static void main (String[] args)
    {
        SecondLargest obj=new SecondLargest();
        obj.size=4;
        obj.arr = new int[] {3,5,2,7};
        obj.sort(obj.arr);
        obj.perform();
        System.out.println("Second Largest is = "+obj.Second_max);
    }
}