package gomes.filipe.mybank.model;

import gomes.filipe.mybank.entity.Tributavel;

public class SeguroDeVida implements Tributavel {

    @Override
    public double getValorImposto() {
        return 42;
    }
}
