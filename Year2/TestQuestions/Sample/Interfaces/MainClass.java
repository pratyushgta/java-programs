package Year2.TestQuestions.Sample.Interfaces;

class R implements P,Q{

    @Override
    public String methodP() {
        return q+p;
    }

    @Override
    public String methodQ() {
        return p+q;
    }
}
public class MainClass {
    public static void main(String[] args)
    {
        R r = new R();

        System.out.println(r.methodP());

        System.out.println(r.methodQ());
    }
}
