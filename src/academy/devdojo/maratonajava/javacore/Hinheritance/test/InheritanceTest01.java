package academy.devdojo.maratonajava.javacore.Hinheritance.test;

import academy.devdojo.maratonajava.javacore.Hinheritance.domain.Address;
import academy.devdojo.maratonajava.javacore.Hinheritance.domain.Employee;
import academy.devdojo.maratonajava.javacore.Hinheritance.domain.Person;

public class InheritanceTest01 {
    public static void main(String[] args) {
        Address address = new Address();
        address.setStreet("Lincoln Avenue 44");
        address.setPostalCode("21302-1515");
        Person person = new Person();
        person.setName("Hanna Barbera");
        person.setId("013744623");
        person.setAddress(address);
        person.prints();

        System.out.println();

        Employee employee = new Employee();
        employee.setName("Jackie Chan");
        employee.setId("CH01P304");
        employee.setAddress(address);
        employee.prints();
    }
}
