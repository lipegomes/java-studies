package gomes.filipe.polymorphism.mybank.test;

import gomes.filipe.polymorphism.mybank.model.CalculadorDeImposto;
import gomes.filipe.polymorphism.mybank.model.ContaCorrente;
import gomes.filipe.polymorphism.mybank.model.SeguroDeVida;

public class TestTributaveis {

    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente("Mercado Pago", 323, 1);
        cc.deposita(25000);

        SeguroDeVida seguro = new SeguroDeVida();

        CalculadorDeImposto calc = new CalculadorDeImposto();
        calc.registra(cc);
        calc.registra(seguro);

        calc.totalImposto();
    }
}
