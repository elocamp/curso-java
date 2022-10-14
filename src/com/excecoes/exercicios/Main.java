package com.excecoes.exercicios;

import model.excecoes.solucoes.boa.BusinessException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws BusinessException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informações bancárias");
        System.out.print("Insira o número da conta: ");
        Integer numConta = sc.nextInt(); sc.nextLine();
        System.out.print("Insira o nome do titular: ");
        String titular = sc.nextLine();
        System.out.print("Insira o saldo da conta: ");
        Double saldo = sc.nextDouble(); sc.nextLine();
        System.out.print("Insira o limite de saque: ");
        Double limiteSaque = sc.nextDouble(); sc.nextLine();

        Conta conta = new Conta(numConta, titular, saldo, limiteSaque);

        System.out.print("\nDepósito:\nInsira o valor a ser depositado na conta: ");
        Double valor = sc.nextDouble(); sc.nextLine();
        conta.deposito(valor);
        System.out.println("Valor depositado com sucesso!");
        System.out.println("Saldo atual: " + conta.getSaldo());

        System.out.print("\nSaque:\nInsira o valor a ser sacado da conta: ");
        valor = sc.nextDouble(); sc.nextLine();

        try {
            conta.saque(valor);
            System.out.println("Valor sacado com sucesso!");
            System.out.println("Saldo atual: " + conta.getSaldo());
        }
        catch (BusinessException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
