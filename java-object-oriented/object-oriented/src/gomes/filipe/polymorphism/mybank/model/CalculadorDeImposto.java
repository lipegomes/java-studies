package gomes.filipe.polymorphism.mybank.model;

import gomes.filipe.polymorphism.mybank.entity.Tributavel;

import java.text.NumberFormat;
import java.util.Locale;

public class CalculadorDeImposto {

    private double totalImposto;

    Locale localeBrazil = new Locale("pt", "BR");

    public void registra(Tributavel t) {
        double valor = t.getValorImposto();
        this.totalImposto += valor;
    }

    public double getTotalImposto() {
        return totalImposto;
    }

    public void totalImposto() {
        System.out.println(NumberFormat.getCurrencyInstance(localeBrazil).format(totalImposto));
    }
}
