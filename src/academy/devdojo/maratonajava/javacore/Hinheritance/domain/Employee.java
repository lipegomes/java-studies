package academy.devdojo.maratonajava.javacore.Hinheritance.domain;

public class Employee extends Person {
    private double salary;

    public void prints() {
        super.prints();
        System.out.println("Salary: $" + this.salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
