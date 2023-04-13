package Year2.TestQuestions.Sample.Exceptions;

public class NPE {
    void display(){
        System.out.println("hElLo wOOOOOOrLD!");
    }
    public static void main(String[] args){
        NPE ob = null;
        try{
            ob.display();
        } catch (NullPointerException e){
            System.out.println("Some error "+e);
        }
    }
}
