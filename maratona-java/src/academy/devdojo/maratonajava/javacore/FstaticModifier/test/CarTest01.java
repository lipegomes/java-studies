package academy.devdojo.maratonajava.javacore.FstaticModifier.test;

import academy.devdojo.maratonajava.javacore.FstaticModifier.domain.Car;

public class CarTest01 {
    public static void main(String[] args) {
        Car.setLimitSpeed(220);
        Car car01 = new Car("Mercedes-Benz", 298);
        Car car02 = new Car("Ferrari", 310);
        Car car03 = new Car("Porsche", 335);

        car01.prints();
        car02.prints();
        car03.prints();
    }
}
