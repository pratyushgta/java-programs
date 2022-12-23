/**
 * This class contains methods for searching an unsorted array
 * DAA-E2-Q4
 * @author Pratyush Kumar (github.com/pratyushgta)
 */

package Year2;
import java.util.*;
public class LinearSearch {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        //Input
        System.out.print("Enter number of array elements: ");
        int size = sc.nextInt();

        int [] arr = new int[size]; //Initializing the array with given size

        System.out.println("Enter "+size+" elements:");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        //Search
        System.out.print("Enter an element to search for: ");
        int search = sc.nextInt();

        int check = 0;

        for(int i=0;i<size;i++){
            if(arr[i] == search){
                check = 1;
                System.out.println("Element "+search+" found at position "+(i+1));
            }
        }
        if(check==0)
            System.out.println("Element not found in the array!");
    }
}
