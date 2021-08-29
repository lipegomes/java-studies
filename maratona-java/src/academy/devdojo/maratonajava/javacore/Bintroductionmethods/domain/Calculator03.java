package academy.devdojo.maratonajava.javacore.Bintroductionmethods.domain;

public class Calculator03 {
    public void sumNumbers(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    public void subNumbers(int num1, int num2) {
        System.out.println(num1 - num2);
    }

    public void multiNumbers(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public double divNumbers(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }
}
