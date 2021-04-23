package academy.devdojo.maratonajava.javacore.Labstractclasses.test;

import academy.devdojo.maratonajava.javacore.Labstractclasses.domain.Manager;
import academy.devdojo.maratonajava.javacore.Labstractclasses.domain.SoftwareEngineer;

public class EmployeeTest01 {
    public static void main(String[] args) {
        Manager manager = new Manager("John", 26000);
        SoftwareEngineer softwareEngineer = new SoftwareEngineer("Scott", 12000);
        System.out.println(manager);
        System.out.println(softwareEngineer);
    }
}
