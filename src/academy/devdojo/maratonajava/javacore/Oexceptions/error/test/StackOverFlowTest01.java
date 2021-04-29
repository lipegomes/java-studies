package academy.devdojo.maratonajava.javacore.Oexceptions.error.test;

public class StackOverFlowTest01 {
    public static void main(String[] args) {
        recursion();
    }

    public static void recursion() {
        recursion();
    }
}
