package gomes.filipe.mybank.model;

import gomes.filipe.mybank.entity.Tributavel;

import java.text.NumberFormat;

public class ContaCorrente extends Conta implements Tributavel {

    public ContaCorrente(String nomeBanco, int idBanco, int agencia) {
        super(nomeBanco, idBanco, agencia);
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
    public double getValorImposto() {
    	return super.saldo * 0.01;
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
