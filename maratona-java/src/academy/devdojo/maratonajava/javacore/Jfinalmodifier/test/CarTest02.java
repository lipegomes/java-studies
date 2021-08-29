package academy.devdojo.maratonajava.javacore.Jfinalmodifier.test;

import academy.devdojo.maratonajava.javacore.Jfinalmodifier.domain.Car;
import academy.devdojo.maratonajava.javacore.Jfinalmodifier.domain.Volvo;

public class CarTest02 {
    public static void main(String[] args) {
        Car car = new Car();

        System.out.println(Car.LIMIT_SPEED);
        System.out.println(car.BUYER);
        car.BUYER.setName("Filipe");
        System.out.println(car.BUYER);

        Volvo volvo = new Volvo();
        volvo.setName("V90");
        volvo.prints();
    }
}
