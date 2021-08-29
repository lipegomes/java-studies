package academy.devdojo.maratonajava.javacore.Bintroductionmethods.test;

import academy.devdojo.maratonajava.javacore.Bintroductionmethods.domain.Calculator03;

public class Calculator03Test01 {
    public static void main(String[] args) {
        Calculator03 calculator = new Calculator03();
        calculator.sumNumbers(25, 48);
        calculator.subNumbers(120, 100);
        calculator.multiNumbers(4, 12);
        double resultDiv1 = calculator.divNumbers(365, 8.8);
        System.out.println(resultDiv1);
        double resultDiv2 = calculator.divNumbers(2, 0);
        System.out.println(resultDiv2);
    }
}
