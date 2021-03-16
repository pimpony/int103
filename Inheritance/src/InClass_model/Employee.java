package InClass_model;


public class Employee extends Person {

    protected double salary;
    
    public Employee(String name){
        super(name);
    }

    public Employee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    public Employee(String name,String phoneNumber,String emailAddress, double salary) {
        super(name,phoneNumber,emailAddress);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString()+ "\nsalary: " + salary;
    }
    
}
