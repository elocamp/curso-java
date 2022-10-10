package com.heranca.exercicios.ex2;

import java.util.Date;

public class ProdutoUsado extends Produto{
    private String dataFabricacao;

    public ProdutoUsado() {
        super();
    }

    public ProdutoUsado(String nome, Double valor, String dataFabricacao) {
        super(nome, valor);
        this.dataFabricacao = dataFabricacao;
    }

    public String getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(String dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public String etiqueta() {
        return super.etiqueta() + " - Data: " + dataFabricacao;
    }
}
