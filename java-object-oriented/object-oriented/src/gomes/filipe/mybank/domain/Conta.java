package gomes.filipe.mybank.domain;

import java.text.NumberFormat;
import java.util.Locale;

public class Conta extends Banco {
    String agencia;
    String contaCorrente;
    String nomeDoTitular;
    String cpf;
    double saldo;

    Locale localeBrazil = new Locale("pt", "BR");

    public Conta(String nomeBanco, int idBanco) {
        super(nomeBanco, idBanco);
    }

    public Conta(String nomeBanco, int idBanco, String agencia, String contaCorrente, String nomeDoTitular, String cpf, double saldo) {
        super(nomeBanco, idBanco);
        this.agencia = agencia;
        this.contaCorrente = contaCorrente;
        this.nomeDoTitular = nomeDoTitular;
        this.cpf = cpf;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "nomeBanco='" + nomeBanco + '\'' +
                ", idBanco=" + idBanco +
                ", agencia='" + agencia + '\'' +
                ", contaCorrente='" + contaCorrente + '\'' +
                ", nomeDoTitular='" + nomeDoTitular + '\'' +
                ", cpf=" + cpf +
                ", saldo=" + saldo +
                '}';
    }

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public void depositaNaContaPoupanca(double valor, Conta contaPoupanca) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            contaPoupanca.deposita(valor);
        }
    }

    public boolean saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino) {
        if (this.saldo >= valor ) {
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }
        return false;
    }

    public void nomeBanco() {
        System.out.println("Banco: " + nomeBanco);
    }

    public void idBanco() {
        System.out.println("Id banco: " + idBanco);
    }

    public void agencia() {
        System.out.println("Agência: " + agencia);
    }

    public void contaCorrente() {
        System.out.println("Conta corrente: " + contaCorrente.substring(0, 9) + "-" + contaCorrente.charAt(10));

    }

    public void nomeDoTitular() {
        System.out.println("Nome do titular: " + nomeDoTitular);
    }

    public void cpf() {
        System.out.println("CPF: " + cpf.substring(0, 3) + "." + cpf.substring(2, 5) + "." + cpf.substring(5, 8) + "-" + cpf.charAt(9) + cpf.charAt(10));
    }

    public void saldo() {
        System.out.println("Saldo: " + NumberFormat.getCurrencyInstance(localeBrazil).format(saldo));
    }

    public void imprimeDadosDoCliente(String contaCorrente) {
        System.out.println("--- Dados do Cliente ---");
        System.out.println("Banco: " + nomeBanco);
        System.out.println("Id banco: " + idBanco);
        System.out.println("Agência: " + agencia);
        System.out.println("Conta corrente: " + contaCorrente.substring(0, 9) + "-" + contaCorrente.charAt(10));
        System.out.println("CPF: " + cpf.substring(0, 3) + "." + cpf.substring(2, 5) + "." + cpf.substring(5, 8) + "-" + cpf.charAt(9) + cpf.charAt(10));
        System.out.println("Saldo: " + NumberFormat.getCurrencyInstance(localeBrazil).format(saldo));
    }
}
