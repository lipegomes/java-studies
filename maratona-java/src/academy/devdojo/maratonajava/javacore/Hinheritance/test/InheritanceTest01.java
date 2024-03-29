package academy.devdojo.maratonajava.javacore.Hinheritance.test;

import academy.devdojo.maratonajava.javacore.Hinheritance.domain.Address;
import academy.devdojo.maratonajava.javacore.Hinheritance.domain.Employee;
import academy.devdojo.maratonajava.javacore.Hinheritance.domain.Person;

public class InheritanceTest01 {
    public static void main(String[] args) {
        Address address = new Address();
        address.setStreet("Lincoln Avenue 44");
        address.setPostalCode("21302-1515");
        Person person = new Person("Hanna Barbera");
//        person.setName();
        person.setId("013744623");
        person.setAddress(address);
        person.prints();

        System.out.println();

        Employee employee = new Employee("Jackie Chan");
//        employee.setName();
        employee.setId("CH01P304");
        employee.setAddress(address);
        employee.setSalary(12000);
        employee.prints();
        employee.paymentReport();
    }
}
