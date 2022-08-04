package com.banco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Conta conta;

        int numeroConta;
        String nomeTitular;
        double depositoInicial;

        System.out.println("Insira o número da conta: ");
        numeroConta = scanner.nextInt(); scanner.nextLine();

        System.out.println("Insira o nome do titular: ");
        nomeTitular = scanner.nextLine();

        System.out.println("Você deseja fazer um depósito inicial? (s/n)");
        String op = scanner.nextLine();
        if (op.equals("s")) {
            System.out.println("Insira o valor do depósito inicial: ");
            depositoInicial = scanner.nextInt(); scanner.nextLine();
            conta = new Conta(numeroConta, nomeTitular, depositoInicial);
        } else {
            conta = new Conta(numeroConta, nomeTitular);
        }

        System.out.println("Número da conta: " + conta.getNumeroConta() +
                "\nNome do Titular: " + conta.getNomeTitular() +
                "\nValor do depósito inicial: " + conta.getSaldo());

        System.out.println("Insira o valor que deseja depositar: ");
        double valor = scanner.nextDouble();
        conta.deposito(valor);
        System.out.println("Valor depositado com sucesso! Saldo atual: " + conta.getSaldo());

        System.out.println("Insira o valor que deseja sacar: ");
        valor = scanner.nextDouble();
        conta.saque(valor);
        System.out.println("Saque realizado com sucesso! Novo valor em conta: R$ " + conta.getSaldo());

        scanner.close();
    }
}
