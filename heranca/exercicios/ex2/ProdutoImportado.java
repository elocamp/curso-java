package com.heranca.exercicios.ex2;

public class ProdutoImportado extends Produto{
    private Double taxaAlfandega;

    public ProdutoImportado() {
        super();
    }

    public ProdutoImportado(String nome, Double valor, Double taxaAlfandega) {
        super(nome, valor);
        this.taxaAlfandega = taxaAlfandega;
    }

    public Double getTaxaAlfandega() {
        return taxaAlfandega;
    }

    public void setTaxaAlfandega(Double taxaAlfandega) {
        this.taxaAlfandega = taxaAlfandega;
    }

    @Override
    public String etiqueta() {
        return super.etiqueta() + " - Taxa: R$ " + taxaAlfandega;
    }
}
