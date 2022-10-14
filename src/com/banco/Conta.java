package com.banco;

public class Conta {
    private Integer numero;
    private String nome;
    private double saldo;

    public Conta() {
    }

    public Conta(Integer numero, String nome, double saldo) {
        this.numero = numero;
        this.nome = nome;
        this.saldo = saldo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void saque(double valor) {
        saldo -= valor;
    }

    public void deposito(double valor) {
        saldo += valor;
    }
}
