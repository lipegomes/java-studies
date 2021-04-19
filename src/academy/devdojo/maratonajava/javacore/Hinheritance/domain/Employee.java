package academy.devdojo.maratonajava.javacore.Hinheritance.domain;

public class Employee extends Person {
    private double salary;

    public Employee(String name) {
        super(name);
    }

    public void prints() {
        super.prints();
        System.out.println("Salary: $" + this.salary);
    }

    public void paymentReport() {
        System.out.println("Me " + this.name + ", received the salary in the amount of " + this.salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
