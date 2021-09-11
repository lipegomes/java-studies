package gomes.filipe.polymorphism.mybank.model;

import java.util.Locale;
import java.util.Random;

public abstract class Conta extends Banco {

    private int agencia;
    private static final Random numero = new Random();
    private int conta = 1 + numero.nextInt(999999999);
    private Cliente titular;
    private static int total = 0;
    protected double saldo;

    Locale localeBrazil = new Locale("pt", "BR");

    public Conta(String nomeBanco, int idBanco) {
        super(nomeBanco, idBanco);
    }

    public Conta(String nomeBanco, int idBanco, int agencia) {
        super(nomeBanco, idBanco);
        Conta.total++;
        this.agencia = agencia;
        this.saldo = 0;
    }

    public abstract void deposita(double valor);

    public boolean saca(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino) {
        if (this.saca(valor)) {
            destino.deposita(valor);
            return true;
        }
        return false;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia<= 0) {
            System.out.println("O número da conta não pode ser menor ou igual a 0");
            return;
        }
        this.agencia = agencia;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        if (conta <= 0) {
            System.out.println("O número da conta não pode ser menor ou igual a 0");
            return;
        }
        this.conta = conta;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotal(){
        return Conta.total;
    }

    public double getSaldo(){
        return saldo;
    }
}
