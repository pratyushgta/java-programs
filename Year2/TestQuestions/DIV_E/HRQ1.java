/**
 * This class contains methods for implementing abstract classes
 * OOPJ-DIV_E-HackerRank-Q1
 *
 * @author Pratyush Kumar (github.com/pratyushgta)
 */


package Year2.TestQuestions.DIV_E;

abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}

class MyBook extends Book{
    @Override
    void setTitle(String s) {
        title = s;
    }
}

public class HRQ1{
 public static void main(String[] args){
     MyBook ob = new MyBook();
     ob.setTitle("A tale of two cities");
     String result = ob.getTitle();
     System.out.println("The title is: "+result);

 }
}