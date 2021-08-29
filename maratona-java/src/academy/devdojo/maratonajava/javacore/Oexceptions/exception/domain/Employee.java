package academy.devdojo.maratonajava.javacore.Oexceptions.exception.domain;

import java.io.FileNotFoundException;

public class Employee extends Person{
    public void save() throws InvalidLoginException, ArithmeticException {
        System.out.println("Saving employee");
    }
}
