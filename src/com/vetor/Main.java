package com.vetor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o tamanho do vetor: ");
        int n = scanner.nextInt();

        Produto[] vetor = new Produto[n];

        for (int i = 0; i < vetor.length; i++) {
            scanner.nextLine();
            System.out.println("Insira o nome do Produto: ");
            String nome = scanner.nextLine();
            System.out.println("Insira o valor do Produto: ");
            double valor = scanner.nextDouble();
            vetor[i] = new Produto(nome, valor);
        }

        double soma = 0.0;
        for (int j = 0; j < vetor.length; j++) {
            soma += vetor[j].getValor();
        }

        double media = soma / vetor.length;
        System.out.printf("Média dos preços = R$ %.2f%n", media);

        scanner.close();
    }
}