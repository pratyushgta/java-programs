import java.util.Scanner;
public class Ramanujan
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number you want to check: ");
//reading an integer from the user that we want to check
        int orgNum = sc.nextInt();
        int sum = findSum(orgNum);
        int reverseSum = reverseSum(sum);
//compares the original number (entered by the user) with the product of sum and its reverse
        if( (sum * reverseSum) == orgNum)
//prints the following statement if the above statement returns true
            System.out.println(orgNum +" is a Ramanujan Number.");
//prints the following statement, if the condition returns false
        else
            System.out.println(orgNum+" is not a Ramanujan Number.");
    }
    //user-defined function that finds the sum
    public static int findSum(int number)
    {
//the variable stores the sum of each digit
        int sum = 0;
        while (number > 0)
        {
//determines the remainder and add the resultant in the variable sum
            sum = sum + number % 10;
//removes the last digit from the number
            number = number / 10;
        }
        return sum;
    }
    //user-defined function that reverse the sum returned by the findSum() function
    public static int reverseSum(int number)
    {
//the variable stores the reverse of the variable sum
        int reverse = 0;
//executes until the condition becomes false
        while (number > 0)
        {
//determines the remainder
            int digit = number % 10;
//reverse the sum
            reverse = reverse * 10 + digit;
//removes the last digit from the number
            number = number / 10;
        }
        return reverse;
    }
}



