package Year2.TestQuestions.DIV_E;

public class SBM2Q1a implements calculate {
    public void area(int l, int b) {
        System.out.println("Area of rectangle is: "+(l*b));
    }

    public static void main(String[] args){
        SBM2Q1a ob = new SBM2Q1a();
        ob.area(3,4);
    }
}
