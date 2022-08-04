package com.vetor;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        ex1Class[] vetor = new ex1Class[n];

        for (int i = 0; i < vetor.length; i++) {
            sc.nextLine();
            System.out.println("Digite um número: ");
            int num = sc.nextInt();
            vetor[i] = new ex1Class(num);
        }

        System.out.println("Números negativos: ");
        for (int j = 0; j < vetor.length;) {
            if (vetor[j].getNumero() < 0) {
                vetor[j].getNumero();
            }
        }

        sc.close();

    }
}
