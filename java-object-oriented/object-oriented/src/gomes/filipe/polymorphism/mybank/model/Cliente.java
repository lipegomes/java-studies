package gomes.filipe.polymorphism.mybank.model;

public class Cliente {

    private String nomeDoTitular;
    private String cpf;
    private String profissao;

    public Cliente(String nomeDoTitular, String cpf, String profissao) {
        this.nomeDoTitular = nomeDoTitular;
        this.cpf = cpf;
        this.profissao = profissao;
    }

    public String getNomeDoTitular() {
        return nomeDoTitular;
    }

    public void setNomeDoTitular(String nomeDoTitular) {
        this.nomeDoTitular = nomeDoTitular;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nomeDoTitular='" + nomeDoTitular + '\'' +
                ", cpf='" + cpf + '\'' +
                ", profissao='" + profissao + '\'' +
                '}';
    }
}
