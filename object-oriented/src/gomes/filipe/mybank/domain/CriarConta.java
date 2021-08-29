package gomes.filipe.mybank.domain;

public class CriarConta {
    public static void main(String[] args) {
        Conta contaFulano = new Conta(
                "Mercado Pago",
                323,
                "0001",
                "00000000011",
                "Fulano Silva",
                "11122233344",
                12045);

        contaFulano.imprimeDadosDoCliente("00000000011");

        contaFulano.deposita(500);

        System.out.println("--- Novo saldo ---");
        contaFulano.saldo();

        contaFulano.imprimeDadosDoCliente("00000000011");
    }
}
