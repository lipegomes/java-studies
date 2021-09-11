package gomes.filipe.mybank.model;

import java.text.NumberFormat;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(String nomeBanco, int idBanco, int agencia){
        super(nomeBanco, idBanco, agencia);
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
                ", Conta Poupança: '" + String.valueOf(getConta()).substring(0, 7) + "-" + String.valueOf(getConta()).substring(8) + '\'' +
                ", Saldo: " + NumberFormat.getCurrencyInstance(localeBrazil).format(getSaldo());
    }
}
