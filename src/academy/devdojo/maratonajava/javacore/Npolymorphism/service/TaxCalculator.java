package academy.devdojo.maratonajava.javacore.Npolymorphism.service;

import academy.devdojo.maratonajava.javacore.Npolymorphism.domain.Avocado;
import academy.devdojo.maratonajava.javacore.Npolymorphism.domain.Computer;
import academy.devdojo.maratonajava.javacore.Npolymorphism.domain.Product;
import academy.devdojo.maratonajava.javacore.Npolymorphism.domain.Sneakers;

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

    public static void calculateSneakersTax(Sneakers sneakers) {
        System.out.println("Sneakers tax amount paid");
        double tax = sneakers.calculateTax();
        System.out.println("Avocado: " + sneakers.getName());
        System.out.println("Price: $" + sneakers.getPrice());
        System.out.println("Tax to be paid: $" + tax);
        System.out.println("Total: $" + (sneakers.getPrice() + tax));
    }

    public static void calculateTax(Product product) {
        System.out.println("*** Tax paid report ***");
        double tax = product.calculateTax();
        System.out.println("Product: " + product.getName());
        System.out.println("Price: $" + product.getPrice());
        System.out.println("Tax paid: $" + tax);
        System.out.println("Total: $" + (product.getPrice() + tax));
        if (product instanceof Avocado) {
            Avocado avocado = (Avocado) product;
            System.out.println("Expiration date: " + avocado.getExpirationDate());
        }
    }
}
