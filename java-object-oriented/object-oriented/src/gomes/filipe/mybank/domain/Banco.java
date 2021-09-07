package gomes.filipe.mybank.domain;

public class Banco {
    private final String nomeBanco;
    private final int agencia;

    public Banco(String nomeBanco, int idBanco) {
        this.nomeBanco = nomeBanco;
        this.agencia = idBanco;
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

    public int getIdBanco() {
        return agencia;
    }
}
