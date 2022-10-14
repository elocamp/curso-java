package com.heranca.classesAbstratas;

public class ContaPoupanca extends Conta {
    private Double taxaJuros;

    public ContaPoupanca() {
        super();
    }

    public ContaPoupanca(Integer numero, String proprietario, Double saldo, Double taxaJuros) {
        super(numero, proprietario, saldo);
        this.taxaJuros = taxaJuros;
    }

    public Double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(Double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    public void atualizarSaldo() {
        saldo += saldo * taxaJuros;
    }

    @Override
    public void saque(double valor) {
        saldo -= valor;
    }
}
