package com.heranca.exercicios.ex3;

public class PessoaJuridica extends Pessoa{
    protected Integer numFuncionarios;

    public PessoaJuridica() {
        super();
    }

    public PessoaJuridica(String nome, Double rendaAnual, Integer numFuncionarios) {
        super(nome, rendaAnual);
        this.numFuncionarios = numFuncionarios;
    }

    public Integer getNumFuncionarios() {
        return numFuncionarios;
    }

    public void setNumFuncionarios(Integer numFuncionarios) {
        this.numFuncionarios = numFuncionarios;
    }

    @Override
    public double imposto() {
        if (numFuncionarios > 10) {
            return 0.14 * rendaAnual;
            }
        else {
            return 0.16 * rendaAnual;
        }
    }
}
