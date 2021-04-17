package academy.devdojo.maratonajava.javacore.Bintroductionmethods.test;

import academy.devdojo.maratonajava.javacore.Bintroductionmethods.domain.Calculator02;

public class Calculator02Test01 {
    public static void main(String[] args) {
        Calculator02 calculator = new Calculator02();
        calculator.sumNumbers(10, 30);
        calculator.subNumbers(77, 23);
        calculator.multiNumbers(2, 7);
        double resultDiv = calculator.divNumbers(275, 2.5);
        System.out.println(resultDiv);
    }
}
