package academy.devdojo.maratonajava.javacore.Bintroductionmethods.test;

import academy.devdojo.maratonajava.javacore.Bintroductionmethods.domain.Calculator05;

public class Calculator05Test01 {
    public static void main(String[] args) {
        Calculator05 calculator = new Calculator05();
        int[] numbers = {1, 2, 3, 4, 5};
        calculator.sumArray(numbers);
        calculator.sumVarArgs(2, 4, 6);
    }
}
