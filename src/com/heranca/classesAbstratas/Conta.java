package com.heranca.classesAbstratas;

public abstract class Conta {
    protected Integer numero;
    protected String proprietario;
    protected Double saldo;

    private double taxaSaque = 5.0;

    public Conta() {
    }

    public Conta(Integer numero, String proprietario, Double saldo) {
        this.numero = numero;
        this.proprietario = proprietario;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public double getSaldo() {
        return saldo;
    }

    public void saque(double valor) {
        saldo -= (valor + taxaSaque);
    }

    public void deposito(double valor) {
        saldo += valor;
    }
}
