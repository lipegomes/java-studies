package academy.devdojo.maratonajava.javacore.Oexceptions.runtime.test;

public class RunTimeExceptionTest06 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Inside ArrayIndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Inside IndexOutOfBoundsException");
        } catch (IllegalArgumentException e) {
            System.out.println("Inside IllegalArgumentException");
        } catch (ArithmeticException e) {
            System.out.println("Inside ArithmeticException");
        } catch (RuntimeException e) {
            System.out.println("Inside RuntimeException");
        }
    }
}
