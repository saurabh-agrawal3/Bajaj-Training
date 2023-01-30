package inheritance;

public class Emp implements Salary, Department {
    public void name(){
        System.out.println("Department name is Java Microservices.");
    }
    public void amount()
    {
        System.out.println("Salary amount is 1280000 rupees.");
    }
}
