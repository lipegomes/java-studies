package gomes.filipe.mybank.domain;

import java.text.NumberFormat;

public class ContaCorrente extends Conta {

    public ContaCorrente(String nomeBanco, int idBanco, int agencia) {
        super(nomeBanco, idBanco, agencia);
        System.out.println("Criado conta corrente de número " + String.valueOf(getConta()).substring(0, 7) + "-" + String.valueOf(getConta()).substring(8));
    }

    @Override
    public boolean saca(double valor) {
        double valorSaca = valor;
        return super.saca(valor);
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }

    @Override
    public String toString() {
        return  "Nome Banco: '" + getNomeBanco() + '\'' +
                ", Id Banco: " + getIdBanco() +
                ", Agência: '" + getAgencia() + '\'' +
                ", Conta Corrente: '" + String.valueOf(getConta()).substring(0, 7) + "-" + String.valueOf(getConta()).substring(8) + '\'' +
                ", Saldo: " + NumberFormat.getCurrencyInstance(localeBrazil).format(getSaldo());
    }

    //    public void imprimeDadosDoContaCorrente() {
//        System.out.println("\n--- Dados do Cliente ---");
//        System.out.println("Banco: " + getNomeBanco());
//        System.out.println("Id banco: " + getIdBanco());
//        System.out.println("Agência: " + agencia);
//        System.out.println("Conta corrente: " + String.valueOf(conta).substring(0, 7) + "-" + String.valueOf(conta).substring(8));
//        System.out.println("Nome: " + nomeDoTitular);
//        System.out.println("CPF: " + cpf.substring(0, 3) + "." + cpf.substring(2, 5) + "." + cpf.substring(5, 8) + "-" + cpf.charAt(9) + cpf.charAt(10));
//        System.out.println("Saldo: " + NumberFormat.getCurrencyInstance(localeBrazil).format(saldo));
//    }
}
