package Year3.Sem6;

// class with no name which you can instantiate only 1 object.
class Animal {
    public void makeNoise() {
        System.out.println("Method inside Animal Class");
    }
}

public class AnonymousInnerClasses {
    public static void main(String[] args) {
        Animal ob = new Animal();
        ob.makeNoise();

        Animal ob2 = new Animal() {
            public void makeNoise() {
                System.out.println("NEW METHOD");
            }
        };
        ob2.makeNoise();

        Runnable anonymousRunnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Method inside runnable");
            }
        };
    }
}
