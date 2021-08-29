package academy.devdojo.maratonajava.javacore.Npolymorphism.test;

import academy.devdojo.maratonajava.javacore.Npolymorphism.domain.Avocado;
import academy.devdojo.maratonajava.javacore.Npolymorphism.domain.Computer;
import academy.devdojo.maratonajava.javacore.Npolymorphism.domain.Product;
import academy.devdojo.maratonajava.javacore.Npolymorphism.domain.Sneakers;

public class ProductTest02 {
    public static void main(String[] args) {
        Product product1 = new Computer("MacBook Pro", 2399);
        Product product2 = new Avocado("Type Infante 2", 11.39);
        Product product3 = new Computer("Acer A515", 298);
        Product product4 = new Sneakers("ASICS Men's Gel-Cumulus 22 (2E) Running Shoes ", 87.90);

        System.out.println(product1.getName());
        System.out.println(product1.getPrice());
        System.out.println(product1.calculateTax());

        System.out.println("----------------");

        System.out.println(product2.getName());
        System.out.println(product2.getPrice());
        System.out.println(product2.calculateTax());

        System.out.println("----------------");

        System.out.println(product3.getName());
        System.out.println(product3.getPrice());
        System.out.println(product3.calculateTax());

        System.out.println("----------------");

        System.out.println(product4.getName());
        System.out.println(product4.getPrice());
        System.out.println(product4.calculateTax());
    }
}
