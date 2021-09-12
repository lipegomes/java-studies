package gomes.filipe.exceptions;

public class TestExceptions {

    public static void main(String[] args) {
        tabuada();
        divisao(10, 0);
    }

    private static void tabuada() {
        System.out.println("\n--- inicio da tabuada ---");
        for (int i = 0 ; i <= 10; i++) {
            try {
                for (int j = 0 ; j <= 10; j++) {
                    int calc = j * i ;
                    System.out.println(calc);
                }
            } catch (ArithmeticException e) {
                e.printStackTrace();
            }
            System.out.println();
        }
        System.out.println("\n--- Fim da tabuada ---");
    }

    private static void divisao(int x, int y) {
        try {
            System.out.println("\n--- inicio da divisao ---");
            int resultado = x / y;
            System.out.println(resultado);
            System.out.println("\n--- fim da divisao ---");
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }
}
