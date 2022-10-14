package com.heranca.exercicios.ex2;

public class Produto {
    protected String nome;
    protected Double valor;

    public Produto() {
    }

    public Produto(String nome, Double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String etiqueta() {
        return getNome() + "- R$ " + getValor();
    }
}
