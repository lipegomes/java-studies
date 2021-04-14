package academy.devdojo.maratonajava.javacore.Aintroductionclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroductionclasses.domain.Car;

public class CarTest02 {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        car1.brand = "Volvo";
        car1.name = "S90 Recharge";
        car1.model = "Sedan";
        car1.year = 2021;
        car1.price = 60050;

        car2.brand = "Volvo";
        car2.name = "V90 Recharge";
        car2.model = "Crossover/Wagon";
        car2.year = 2021;
        car2.price = 67300;

        car1 = car2;

        System.out.println("brand: " + car1.brand);
        System.out.println("name: " + car1.name);
        System.out.println("model: " + car1.model);
        System.out.println("year: " + car1.year);
        System.out.println("price: $" + car1.price);

        System.out.println("-------------------");

        System.out.println("brand: " + car2.brand);
        System.out.println("name: " + car2.name);
        System.out.println("model: " + car2.model);
        System.out.println("year: " + car2.year);
        System.out.println("price: $" + car2.price);
    }
}
