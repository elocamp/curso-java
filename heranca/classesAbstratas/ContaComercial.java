package com.heranca.classesAbstratas;

public class ContaComercial extends Conta {
    private Double limiteEmprestimo;

    public ContaComercial() {
        super();
    }

    public ContaComercial(Integer numero, String proprietario, Double saldo, Double limiteEmprestimo) {
        super(numero, proprietario, saldo);
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public Double getLimiteEmprestimo() {
        return limiteEmprestimo;
    }

    public void setLimiteEmprestimo(Double limiteEmprestimo) {
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public void emprestimo(double valor) {
        if (valor <= limiteEmprestimo) {
            deposito(valor);
            limiteEmprestimo -= valor;
        }
    }

    @Override
    public void saque(double valor) {
        super.saque(valor);
        saldo -= 2.0;
    }
}
