package academy.devdojo.maratonajava.javacore.Npolymorphism.test;

import academy.devdojo.maratonajava.javacore.Npolymorphism.domain.Avocado;
import academy.devdojo.maratonajava.javacore.Npolymorphism.domain.Computer;
import academy.devdojo.maratonajava.javacore.Npolymorphism.service.TaxCalculator;

public class ProductTest01 {
    public static void main(String[] args) {
        Computer computer = new Computer("Alienware m15 R4", 1599);
        Avocado avocado = new Avocado("Type Kahaluu", 23.70);

        TaxCalculator.calculateComputerTax(computer);

        System.out.println("-----------------------------------");

        TaxCalculator.calculateAvocadoTax(avocado);
    }
}
