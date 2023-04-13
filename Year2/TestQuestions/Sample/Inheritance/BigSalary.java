package Year2.TestQuestions.Sample.Inheritance;

class Employee2{
    String name="";
    int id=0;
    String dept="";

    Employee2(String n, int i, String d){
        name = n;
        id = i;
        dept = d;
    }

}

class Salary extends Employee2{
    double gross;
    double payable;

    Salary(String name, int id, String dept, double gp){
        super(name,id,dept);
        gross = gp;
        payable = 0;
    }
    void calculate(){
        payable = gross-500; //assumption
    }
}

class self_appraisal extends Salary{
    double appraisal;
    double increments;
     self_appraisal(String name, int id, String dept, double gross, double app, double inc){
         super(name,id,dept,gross);
         appraisal = app;
         increments = inc;
     }

     void display(){
         System.out.println(">>Employee Details<<");
         System.out.println("Name: "+name+"\nID: "+id+"\nDept: "+dept+"\nGross: "+gross+"\nPayable: "+payable+"\nAppraisal"+appraisal+"\nIncrements: "+increments);
     }
}
public class BigSalary {
    public static void main(String[] args){
        self_appraisal ob = new self_appraisal("John",1010,"Lazyhead",5000,100,200);
        ob.calculate();
        ob.display();
    }
}
