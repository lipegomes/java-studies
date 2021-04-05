package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.Employee;

public class EmployeeTest01 {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();

        employee1.name = "Wolfgang Mozart";
        employee1.age = 68;
        employee1.occupation = "Musician";
        employee1.wages = new double[]{22000, 17750, 38426};

        employee2.name = "Nikki Oslo";
        employee2.age = 18;
        employee2.occupation = "Musician";
        employee2.wages = new double[]{1200, 1200, 1200};

        employee1.prints();
        employee1.averageWage();

        employee2.prints();
        employee2.averageWage();
    }
}
