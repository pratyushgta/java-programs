package Year2.TestQuestions.Sample.Inheritance;

class Member {
    String name = "";
    int age = 0;
    double salary = 0;

    void printSalary() {
        System.out.println("Salary: "+salary);
    }
}

class Employee extends Member {
    String specialization="";
}

class Manager extends Member{
    String dept="";
}

public class SalaryChronicles {
    public static void main(String[] args){
        Employee ob = new Employee();
        ob.name="John";
        ob.age=42;
        ob.salary=1200;
        ob.specialization="Cheif Sleeping Officer";
        System.out.println("\n>>EMPLOYEE<<\nName: "+ob.name+"\nAge: "+ob.age+"\nSalary: "+ob.salary+"\nSpecialization: "+ob.specialization);

        Manager ob1 = new Manager();
        ob1.name="Hmm man";
        ob1.age=63;
        ob1.salary=10000;
        ob1.dept="Lazyheads";
        System.out.println("\n>>MANAGER<<\nName: "+ob1.name+"\nAge: "+ob1.age+"\nSalary: "+ob1.salary+"\nSpecialization: "+ob1.dept);

    }
}
