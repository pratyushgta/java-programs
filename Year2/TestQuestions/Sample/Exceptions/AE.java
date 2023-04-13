package Year2.TestQuestions.Sample.Exceptions;

public class AE {
    public static void main(String[] args){
        int num1= 5;
        int num2= 0;

        try {
            int div = num1/num2;
        } catch (ArithmeticException e){
            System.out.println("Maths issue. "+e);
        }
    }
}
