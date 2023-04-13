package Year2.TestQuestions.Sample.Basic;

public class StarPattern {
    public static void main(String[] args) {
        int rows = 5;
        int cols = 9;

        for (int i = 1; i <= rows; i++) { //start from row 1
            //print initial spaces
            for (int j = 0; j < rows - i; j++) {
                System.out.print(" ");
            }
            //print initial spaces
            /*for (int j = rows - i; j > 0; j--) {
                System.out.print(" ");
            }*/

            //print stars in odd rows only
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


}
