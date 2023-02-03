/**
 * This class contains methods for showing type casting in java
 * OOPJ-E3.1-Q1
 * @author Pratyush Kumar (github.com/pratyushgta)
 */
package Year2;

public class Casting {
    public static void main(String[] args){
        int x= 420;
        double y = 13.37;
        String z = "8008";
        char w = '8';

        long l = x;
        System.out.println("Original Integer number: "+x+"\nCasted to Double: "+(double)x+"\nCasted to String: "+String.valueOf(x)
                +"\nCasted to long: "+l);

        byte b = (byte) y;
        System.out.println("\n\nOriginal Double number: "+y+"\nCasted to Integer: "+(int)y+"\nCasted to Byte: "+b
                +"\nCasted to float: "+(float)y);

        System.out.println("\n\nOriginal String number: "+z+"\nCasted to Integer: "+Integer.parseInt(z));

        double d = (double) (w-'0');
        int i = (int) (w-'0');
        System.out.println("\n\nOriginal Character number: "+w+"\nCasted to String: "+String.valueOf(w)+"\nCasted to Integer: "+i
                +"\nCasted to double: "+d);
    }
}
