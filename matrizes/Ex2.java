package com.matrizes;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o número de linhas da matriz: ");
        int linhas = sc.nextInt(); sc.nextLine();
        System.out.println("Insira o número de colunas da matriz: ");
        int colunas = sc.nextInt(); sc.nextLine();

        int[][] matriz = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("Insira um número na matriz: ");
        int num = sc.nextInt(); sc.nextLine();

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (matriz[i][j] == num) {
                    System.out.println("Posição: " + i + ", " + j);

                    if (j > 0) {
                        System.out.println("À esquerda: " + matriz[i][j-1]);
                    }

                    if (i > 0) {
                        System.out.println("Acima: " + matriz[i-1][j]);
                    }

                    if (j < colunas) {
                        System.out.println("À direita: " + matriz[i][j+1]);
                    }

                    if (i < linhas) {
                        System.out.println("Abaixo: " + matriz[i+1][j]);
                    }
                }
            }
        }
        sc.close();
    }
}
