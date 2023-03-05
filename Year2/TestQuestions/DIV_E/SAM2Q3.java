package Year2.TestQuestions.DIV_E;

public class SAM2Q3 {
    public static void main(String[] args){
        try{
            int x = 0;
            int y = 5/x;

        } catch(Exception e){
            System.out.println("Exception");
        } catch(ArithmeticException ae){
            System.out.println("Arithmathc Exception");
        }
        System.out.println("Finished");
    }
}
