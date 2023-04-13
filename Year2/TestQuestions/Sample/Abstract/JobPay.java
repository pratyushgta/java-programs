package Year2.TestQuestions.Sample.Abstract;

abstract class Employee{
    abstract void display();
}

class parttime_employee extends Employee{

    int hrsWorked;
    int hourlyRate;

    parttime_employee(int h, int rate){
        hrsWorked = h;
        hourlyRate = rate;
    }
    @Override
    void display() {
        int salary = hrsWorked*hourlyRate;
        System.out.println("Salary is: "+salary);
    }
}

class fulltime_employee extends Employee{

    String job_Class;

    fulltime_employee(String j){
        job_Class = j;
    }
    @Override
    void display() {
        int salary = 0;
        if(job_Class.equals("A"))
            salary = 5000;
        else if(job_Class.equals("B"))
            salary = 4000;
        else if(job_Class.equals("C"))
            salary = 3000;
        else
            salary = 2000;

        System.out.println("Salary is: "+salary);
    }
}
public class JobPay {
    public static void main(String[] args) {
        Employee ob1 = new parttime_employee(20, 15);
        ob1.display();

        Employee ob2 = new fulltime_employee("A");
        ob2.display();
    }
}
