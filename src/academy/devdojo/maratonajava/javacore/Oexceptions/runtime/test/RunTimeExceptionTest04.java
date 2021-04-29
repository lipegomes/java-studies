package academy.devdojo.maratonajava.javacore.Oexceptions.runtime.test;

public class RunTimeExceptionTest04 {
    public static void main(String[] args) {
        division(30, 0);

        System.out.println("Code finished");
    }

    /**
     * @param a
     * @param b cannot be zero
     * @return
     * @throws IllegalArgumentException if b is zero
     */

    public static int division(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("The denominator cannot be zero");
        }
        return a / b;
    }
}
