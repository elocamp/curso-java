package com.vetor;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        ex3Class[] vetor = new ex3Class[n];

        for (int i = 0; i < vetor.length; i++) {
            sc.nextLine();
            System.out.println("\nDados da " + (i + 1) + "a pessoa: ");

            System.out.println("Nome: ");
            String nome = sc.nextLine();

            System.out.println("Idade: ");
            int idade = sc.nextInt();

            System.out.println("Altura: ");
            double altura = sc.nextDouble();

            vetor[i] = new ex3Class(nome, idade, altura);
        }

        double soma = 0.0;
        for (int j = 0; j < vetor.length; j++) {
            soma += vetor[j].getAltura();
        }

        double media = soma / vetor.length;
        System.out.printf("Altura média: %.2f%n", media);

        int cont = 0;
        for (int k = 0; k < vetor.length; k++) {
            if (vetor[k].getIdade() < 16) {
                cont++;
            }
        }

        System.out.println(cont);
        double porcentagem = cont * 100.0 / vetor.length;
        System.out.println("Pessoas com menos de 16 anos: " + porcentagem + "%");
    }
}
