package academy.devdojo.maratonajava.javacore.Labstractclasses.test;

import academy.devdojo.maratonajava.javacore.Labstractclasses.domain.Manager;
import academy.devdojo.maratonajava.javacore.Labstractclasses.domain.SoftwareEngineer;

public class EmployeeTest01 {
    public static void main(String[] args) {
        Manager manager = new Manager("John", 26000);
        SoftwareEngineer softwareEngineer1 = new SoftwareEngineer("Scott", 12000);
        SoftwareEngineer softwareEngineer2 = new SoftwareEngineer("Petter", 9000);
        SoftwareEngineer softwareEngineer3 = new SoftwareEngineer("Gracie", 12000);
        System.out.println(manager);
        System.out.println(softwareEngineer1);
        System.out.println(softwareEngineer2);
        System.out.println(softwareEngineer3);
    }
}
