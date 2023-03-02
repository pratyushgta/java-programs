package Year2.TestQuestions.DIV_E;

class Bank {
    public void roi() {
        System.out.println("Default ROI is: 0");
    }
}

class SBI extends Bank {
    public void roi() {
        System.out.println("SBI ROI is: 8.4%");
    }
}

class ICICI extends Bank {
    public void roi() {
        System.out.println("ICICI ROI is: 7.3%");
    }
}

class AXIS extends Bank {
    public void roi() {
        System.out.println("AXIS ROI is: 9.7%");
    }
}

public class SAM2Q2 {
    public static void main(String[] args) {
        Bank ob1 = new SBI();
        Bank ob2 = new AXIS();
        Bank ob3 = new ICICI();
        ob1.roi();
        ob2.roi();
        ob3.roi();

    }
}
