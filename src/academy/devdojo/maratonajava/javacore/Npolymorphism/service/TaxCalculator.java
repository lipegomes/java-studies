package academy.devdojo.maratonajava.javacore.Npolymorphism.service;

import academy.devdojo.maratonajava.javacore.Npolymorphism.domain.Avocado;
import academy.devdojo.maratonajava.javacore.Npolymorphism.domain.Computer;

public class TaxCalculator {
    public static void calculateComputerTax(Computer computer) {
        System.out.println("Computer tax amount paid");
        double tax = computer.calculateTax();
        System.out.println("Computer: " + computer.getName());
        System.out.println("Price: $" + computer.getPrice());
        System.out.println("Tax to be paid: $" + tax);
        System.out.println("Total: $" + (computer.getPrice() + tax));
    }

    public static void calculateAvocadoTax(Avocado avocado) {
        System.out.println("Avocado tax amount paid");
        double tax = avocado.calculateTax();
        System.out.println("Avocado: " + avocado.getName());
        System.out.println("Price: $" + avocado.getPrice());
        System.out.println("Tax to be paid: $" + tax);
        System.out.println("Total: $" + (avocado.getPrice() + tax));
    }
}
