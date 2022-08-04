package com.estoque;

import com.estoque.Produto;

import java.util.Scanner;

public class produtoClass {
    public static void main(String[] args) {

        Produto produto1;
        produto1 = new Produto();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o nome do produto: ");
        produto1.nome = scanner.nextLine();

        System.out.println("Insira o valor do produto: ");
        produto1.valor = scanner.nextDouble();

        System.out.println("Insira a quantidade em estoque do produto: ");
        produto1.qnt = scanner.nextInt();

        System.out.println("Dados do produto: " + produto1);

        System.out.println("Insira quantos produtos você quer adicionar: ");
        int add = scanner.nextInt();
        produto1.adicionar(add);

        System.out.println("Insira quantos produtos você quer remover: ");
        int rem = scanner.nextInt();
        produto1.remover(rem);

        scanner.close();
    }
}