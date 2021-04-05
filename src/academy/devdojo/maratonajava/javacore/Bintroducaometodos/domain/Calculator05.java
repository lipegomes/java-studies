package academy.devdojo.maratonajava.javacore.Bintroducaometodos.domain;

public class Calculator05 {
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

    public void changeNumbers(int num1, int num2) {
        num1 = 27;
        num2 = 48;

        System.out.println("Change Numbers: ");
        System.out.println("Num1 change to: " + num1);
        System.out.println("Num2 change to: " + num2);
    }

    public void sumArray(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println(sum);
    }

    public void sumVarArgs(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println(sum);
    }
}
