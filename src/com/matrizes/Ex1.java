package com.matrizes;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o número de linhas e colunas na matriz: ");
        int num = sc.nextInt();sc.nextLine();

        int[][] matriz = new int[num][num];

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("Diagonal principal: ");
        for (int i = 0; i < num; i++) {
            System.out.print(matriz[i][i] + " ");
        }

        int count = 0;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (matriz[i][j] < 0) {
                    count += 1;
                }
            }
        }

        System.out.println("\nNúmeros negativos: " + count);

        sc.close();
    }
}
