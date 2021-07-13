package academy.devdojo.maratonajava.javacore.Oexceptions.exception.test;

import academy.devdojo.maratonajava.javacore.Oexceptions.exception.domain.Employee;
import academy.devdojo.maratonajava.javacore.Oexceptions.exception.domain.InvalidLoginException;
import academy.devdojo.maratonajava.javacore.Oexceptions.exception.domain.Person;

import java.io.FileNotFoundException;

public class OverridingExceptionTest01 {
    public static void main(String[] args) {
        Person person = new Person();
        Employee employee = new Employee();

        try {
            employee.save();
        } catch (InvalidLoginException e) {
            e.printStackTrace();
        }
    }
}
