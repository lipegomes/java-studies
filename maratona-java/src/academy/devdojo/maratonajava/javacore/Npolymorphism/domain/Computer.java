package academy.devdojo.maratonajava.javacore.Npolymorphism.domain;

public class Computer extends Product {
    public static final double PERCENT_TAX = 0.60;

    public Computer(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculateTax() {
        System.out.println("Calculating computer tax");
        return this.price * PERCENT_TAX;
    }

    public static double getPercentTax() {
        return PERCENT_TAX;
    }
}
