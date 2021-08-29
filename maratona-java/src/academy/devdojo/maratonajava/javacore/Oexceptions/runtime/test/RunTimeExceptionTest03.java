package academy.devdojo.maratonajava.javacore.Oexceptions.runtime.test;

public class RunTimeExceptionTest03 {
    public static void main(String[] args) {
        division(1, 0);
    }

    public static int division(int a, int b) {
        if (b == 0) {
            throw new RuntimeException("The denominator cannot be zero");
        }
        try {
            return a / b; // ArithmeticException
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
