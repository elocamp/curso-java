package com.excecoes.exercicios;

import model.excecoes.solucoes.boa.BusinessException;

public class Conta {
    private Integer numConta;
    private String titular;
    private Double saldo;
    private Double limiteSaque;

    public Conta() {
    }

    public Conta(Integer numConta, String titular, Double saldo, Double limiteSaque) {
        this.numConta = numConta;
        this.titular = titular;
        this.saldo = saldo;
        this.limiteSaque = limiteSaque;
    }

    public Integer getNumConta() {
        return numConta;
    }

    public void setNumConta(Integer numConta) {
        this.numConta = numConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Double getLimiteSaque() {
        return limiteSaque;
    }

    public void setLimiteSaque(Double limiteSaque) {
        this.limiteSaque = limiteSaque;
    }

    public void deposito(Double valor) {
        saldo += valor;
    }

    public void saque(Double valor) throws BusinessException {
        validarSaque(valor);
        saldo -= valor;
    }

    private void validarSaque(Double valor) throws BusinessException {
        if (valor > limiteSaque) {
            throw new BusinessException("Erro de saque: O valor excede o limite de saque");
        }
        if (valor > saldo) {
            throw new BusinessException("Erro de saque: Saldo insuficiente");
        }
    }
}
