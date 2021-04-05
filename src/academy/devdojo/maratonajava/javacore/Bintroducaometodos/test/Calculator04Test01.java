package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain.Calculator04;

public class Calculator04Test01 {
    public static void main(String[] args) {
        Calculator04 calculator = new Calculator04();
        int num1 = 11;
        int num2 = 34;
        calculator.changeNumbers(num1, num2);
        System.out.println("Inside calculator 04:");
        System.out.println("Num1: " + num1);
        System.out.println("Num2: " + num2);
    }
}
