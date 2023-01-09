import java.io.*;
public class HeadsLegs {

    static String count(int head, int legs) {

        //1chick_head+1cow_head=total_head
        //2chick_legs+4cow_legs=total_legs
        int cows = (legs - 2*head)/2;
        int chickens = head - cows;

        /*if(cows<0)
            cows=-1;
        if(chickens<0)
            chickens=-1;
        return chickens+" "+cows;*/
        if(cows<0 || chickens<0 || legs%2==1) {
            return "-1";
        }
        return chickens+" "+cows;
    }
    public static void main(String[]args) throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        //System.out.println("Enter num: ");
        String str = br.readLine();
        String[] arrOfStr = str.split(" ");
        int h = Integer.parseInt(arrOfStr[0]);
        int l = Integer.parseInt(arrOfStr[1]);
        System.out.println(count(h,l));

    }
}

