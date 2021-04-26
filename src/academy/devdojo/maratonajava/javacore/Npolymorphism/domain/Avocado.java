package academy.devdojo.maratonajava.javacore.Npolymorphism.domain;

public class Avocado extends Product {
    public static final double PERCENT_TAX = 0.09;

    public Avocado(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateTax() {
        System.out.println("Calculating computer tax");
        return this.price * PERCENT_TAX;
    }
}
