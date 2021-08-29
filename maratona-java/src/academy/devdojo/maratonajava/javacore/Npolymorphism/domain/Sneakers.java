package academy.devdojo.maratonajava.javacore.Npolymorphism.domain;

public class Sneakers extends Product {
    public static final double PERCENT_TAX = 0.25;

    public Sneakers(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateTax() {
        System.out.println("Calculating sneakers tax");
        return this.price * PERCENT_TAX;
    }
}
