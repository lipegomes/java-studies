package gomes.filipe.mybank.domain;

public class VerificaTotalDeContas {
    private static int totalDeContas;

    public static void getTotalDeContasPorAgencia(int agencia) {
        System.out.println("\n--- Total de contas por Agência ---");
        System.out.println("Agência: " + agencia);
        System.out.println("Total: " + totalDeContas + " conta(s)");
    }

}
