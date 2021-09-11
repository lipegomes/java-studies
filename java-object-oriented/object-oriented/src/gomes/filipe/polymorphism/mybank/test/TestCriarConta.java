package gomes.filipe.polymorphism.mybank.test;

import gomes.filipe.polymorphism.mybank.model.ContaCorrente;
import gomes.filipe.polymorphism.mybank.model.ContaPoupanca;

public class TestCriarConta {

    public static void main(String[] args) {


        ContaCorrente cc1 = new ContaCorrente("Mercado Pago", 323, 1);

        cc1.deposita(1000);

        System.out.println(cc1);
        System.out.println(cc1.getSaldo());

        ContaPoupanca cp1 = new ContaPoupanca("Mercado Pago", 323, 1);

        cc1.transfere(500, cp1);
        System.out.println(cp1.getSaldo());

        ContaCorrente cc2 = new ContaCorrente("Mercado Pago", 323, 1);
        System.out.println(cc2);
        System.out.println(cc2.getSaldo());

        cc1.transfere(100, cc2);
        System.out.println(cc2.getSaldo());
    }
}
