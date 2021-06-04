package com.company;

public class Armazem {
    private String localizacao;
    private String nome;
    private Cais cais;

    public Armazem(String localizacao, String nome, Cais cais) {
        this.localizacao = localizacao;
        this.nome = nome;
        this.cais = cais;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cais getCais() {
        return cais;
    }

    public void setCais(Cais cais) {
        this.cais = cais;
    }

    @Override
    public String toString() {
        return "Armazem{" +
                "localizacao='" + localizacao + '\'' +
                ", nome='" + nome + '\'' +
                ", cais=" + cais +
                '}';
    }
}
