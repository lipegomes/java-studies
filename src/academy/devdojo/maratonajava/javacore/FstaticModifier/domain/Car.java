package academy.devdojo.maratonajava.javacore.FstaticModifier.domain;

public class Car {
    private String brand;
    private double maximumSpeed;
    public static double limitSpeed = 250;

    public Car(String brand, double maximumSpeed) {
        this.brand = brand;
        this.maximumSpeed = maximumSpeed;
    }

    public void prints() {
        System.out.println("--------------------");
        System.out.println("Brand: " + this.brand);
        System.out.println("Maximum Speed: " + this.maximumSpeed);
        System.out.println("Limit Speed: " + Car.limitSpeed);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getMaximumSpeed() {
        return maximumSpeed;
    }

    public void setMaximumSpeed(double maximumSpeed) {
        this.maximumSpeed = maximumSpeed;
    }
}
