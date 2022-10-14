package com.banco;

public class ContaNegocios extends Conta {
    private double limiteEmprestimo;

    public ContaNegocios() {
    }

    public ContaNegocios(Integer numero, String nome, double saldo, double limiteEmprestimo) {
        super(numero, nome, saldo);
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public double getLimiteEmprestimo() {
        return limiteEmprestimo;
    }

    public void setLimiteEmprestimo(double limiteEmprestimo) {
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public void emprestimo(double valor) {
        if (valor <= limiteEmprestimo) {
            deposito(valor);
        }
    }
}
