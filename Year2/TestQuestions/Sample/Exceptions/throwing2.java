package Year2.TestQuestions.Sample.Exceptions;

public class throwing2 {
    void check(int num) throws Exception {
        if (num < 0)
            throw new Exception("Number cannot be negative!");
        System.out.println("Numbe is: "+num);

}

    public static void main(String[] args) {
        throwing2 ob = new throwing2();
        try{
            ob.check(-1);
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
