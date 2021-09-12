package gomes.filipe.exceptions;

public class TestExceptions {

    public static void main(String[] args) {
        tabuada();
        soma(20, 35);
        subtracao(44, Math.sqrt(1444));
        divisao(5, 0);
        multiplicacao(7, 7);
    }

    private static void tabuada() {
        System.out.println("--- inicio da tabuada ---");
        for (int i = 0 ; i <= 10; i++) {
            try {
                for (int j = 1 ; j <= 10; j++) {
                    int calc = j * i ;
                    System.out.println(i + " * " + j + " = " + calc);
                }
            } catch (ArithmeticException e) {
                e.printStackTrace();
            }
            System.out.println();
        }
        System.out.println("--- Fim da tabuada ---\n");
    }

    private static void soma(double x, double y) {
        try {
            System.out.println("--- inicio da soma ---");
            double resultado = x + y;
            System.out.println(resultado);
            System.out.println("--- fim da soma ---\n");
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }

    private static void subtracao(double x, double y) {
        try {
            System.out.println("--- inicio da subtracao ---");
            double resultado = x - y;
            System.out.println(resultado);
            System.out.println("--- fim da subtracao ---\n");
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }

    private static void divisao(int x, int y) {
        try {
            System.out.println("--- inicio da divisao ---");
            int resultado = x / y;
            System.out.println(resultado);
            System.out.println("--- fim da divisao ---\n");
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }

    private static void multiplicacao(double x, double y) {
        try {
            System.out.println("--- inicio da multiplicacao ---");
            double resultado = x * y;
            System.out.println(resultado);
            System.out.println("--- fim da multiplicacao ---\n");
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }
}
