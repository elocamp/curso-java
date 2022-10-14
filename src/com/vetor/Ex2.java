package com.vetor;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        ex2Class[] vetor = new ex2Class[n];

        for (int i = 0; i < vetor.length; i++) {
            sc.nextLine();
            System.out.println("Digite um número: ");
            double num = sc.nextDouble();
            vetor[i] = new ex2Class(num);
        }

        double soma = 0.0;
        System.out.println("Valores: ");
        for (int j = 0; j < vetor.length; j++) {
            System.out.printf("%.1f  ", vetor[j].getNumero());
            soma += vetor[j].getNumero();
        }

        System.out.printf("\nSoma = %.2f%n", soma);

        double media = soma / vetor.length;
        System.out.printf("Média = %.2f%n", media);

        sc.close();
    }
}
