package academy.devdojo.maratonajava.javacore.Jfinalmodifier.test;

import academy.devdojo.maratonajava.javacore.Jfinalmodifier.domain.Buyer;
import academy.devdojo.maratonajava.javacore.Jfinalmodifier.domain.Car;

public class CarTest01 {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(Car.LIMIT_SPEED);
        System.out.println(car.BUYER);

        car.BUYER.setName("Ferrari");
        System.out.println(car.BUYER);
    }
}
