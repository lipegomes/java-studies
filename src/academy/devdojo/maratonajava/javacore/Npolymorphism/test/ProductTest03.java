package academy.devdojo.maratonajava.javacore.Npolymorphism.test;

import academy.devdojo.maratonajava.javacore.Npolymorphism.domain.Avocado;
import academy.devdojo.maratonajava.javacore.Npolymorphism.domain.Computer;
import academy.devdojo.maratonajava.javacore.Npolymorphism.domain.Product;
import academy.devdojo.maratonajava.javacore.Npolymorphism.domain.Sneakers;
import academy.devdojo.maratonajava.javacore.Npolymorphism.service.TaxCalculator;

public class ProductTest03 {
    public static void main(String[] args) {
        Product product1 = new Sneakers("Air Jordan 1 Women's High OG (Silver Toe)", 279.99);
        Product product2 = new Sneakers("Hi-Tec Trail Blazer Mid Wp", 99.99);
        Product product3 = new Computer("ROG Zephyrus S Thin and Portable Gaming laptop", 1899.99);
        Avocado avocado = new Avocado("Type Simmons", 4.43);

        TaxCalculator.calculateTax(product1);

        System.out.println("------------");
        TaxCalculator.calculateTax(product2);

        System.out.println("------------");
        TaxCalculator.calculateTax(product3);

        System.out.println("------------");
        TaxCalculator.calculateTax(avocado);
    }
}
