package gomes.filipe.mybank.test;

import gomes.filipe.mybank.model.CalculadorDeImposto;
import gomes.filipe.mybank.model.ContaCorrente;
import gomes.filipe.mybank.model.SeguroDeVida;

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
