package academy.devdojo.maratonajava.javacore.Labstractclasses.domain;

public class SoftwareEngineer extends Employee {

    public SoftwareEngineer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public String toString() {
        return "SoftwareEngineer{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
