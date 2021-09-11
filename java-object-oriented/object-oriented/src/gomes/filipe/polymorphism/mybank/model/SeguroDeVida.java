package gomes.filipe.polymorphism.mybank.model;

import gomes.filipe.polymorphism.mybank.entity.Tributavel;

public class SeguroDeVida implements Tributavel {

    @Override
    public double getValorImposto() {
        return 42;
    }
}
