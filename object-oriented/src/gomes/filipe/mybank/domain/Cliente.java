package gomes.filipe.mybank.domain;

import java.util.HashMap;
import java.util.List;

public class Cliente{
    HashMap<Integer, List<Conta>> conta = new HashMap<>();
    private int i = 0;

    public int deposita(List<Conta> saldo) {
        conta.put(++i, saldo);
        return i;
    }

//    public void depositaNaContaPoupanca(double valor, Conta contaPoupanca) {
//        if (saldo >= valor) {
//            saldo -= valor;
//            contaPoupanca.deposita(valor);
//        }
//    }
//
//    public boolean saca(double valor) {
//        if (saldo >= valor) {
//            saldo -= valor;
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    public boolean transfere(double valor, Conta destino) {
//        if (saldo >= valor ) {
//            saldo -= valor;
//            destino.deposita(valor);
//            return true;
//        }
//        return false;
//    }


    public void imprimirDadosDaContaCorrente() {
        System.out.println("--- Dados Conta Corrente ---");
        for (Integer i : conta.keySet()) {
            List<Conta> listaDadosConta = conta.get(i);
            for (Conta conta : listaDadosConta) {
                System.out.println(conta.toString());
            }
        }
    }

    public void deposita(int i) {
    }
}
