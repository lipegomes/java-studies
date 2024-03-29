package academy.devdojo.maratonajava.javacore.Labstractclasses.domain;

public class SoftwareEngineer extends Employee {

    public SoftwareEngineer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void calculateBonus() {
        this.salary = this.salary + this.salary * 0.05;
    }

    @Override
    public String toString() {
        return "SoftwareEngineer{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
