package com.excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        method1();
        System.out.println("Fim do programa!");

    }

    public static void method1() {
        System.out.println("Início do método 1");
        method2();
        System.out.println("Fim do método 1");
    }
    public static void method2() {
        System.out.println("Início do método 2");
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Insira os nomes para adicionar: ");
            String[] vetor = sc.nextLine().split(" ");

            System.out.println("Insira a posição desejada: ");
            int posicao = sc.nextInt(); sc.nextLine();
            System.out.println(vetor[posicao]);
        }
        catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Posição inválida!");
        }
        catch (InputMismatchException exception) {
            System.out.println("Erro de entrada!");
        }
        sc.close();
        System.out.println("Fim do método 2");
    }
}
