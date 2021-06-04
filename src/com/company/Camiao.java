package com.company;

public class Camiao {
    private String marca;
    private String matricula;
    private float tara;
    private float capacidade;

    public Camiao(String marca, String matricula, float tara, float capacidade) {
        this.marca = marca;
        this.matricula = matricula;
        this.tara = tara;
        this.capacidade = capacidade;
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public float getTara() {
        return tara;
    }

    public void setTara(float tara) {
        this.tara = tara;
    }

    public float getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(float capacidade) {
        this.capacidade = capacidade;
    }

    @Override
    public String toString() {
        return "Camiao{" +
                "marca='" + marca + '\'' +
                ", matricula='" + matricula + '\'' +
                ", tara=" + tara +
                ", capacidade=" + capacidade +
                '}';
    }
}
