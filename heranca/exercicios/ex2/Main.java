package com.heranca.exercicios.ex2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos produtos serão adicionados? ");
        int num = sc.nextInt(); sc.nextLine();

        List<Produto> lista = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            System.out.println("Dados do produto #" + (i + 1));
            System.out.println("Nome: ");
            String nome = sc.nextLine();
            System.out.println("Preço: ");
            Double valor = sc.nextDouble(); sc.nextLine();

            System.out.println("O produto é normal, importado ou usado? (n, i, u)");
            char ch = sc.next().charAt(0); sc.nextLine();

            if (ch == 'n') {
                lista.add(new Produto(nome, valor));
            }
            else if (ch == 'i') {
                System.out.println("Qual o valor da taxa de alfândega? ");
                double taxaAlfandega = sc.nextDouble(); sc.nextLine();
                lista.add(new ProdutoImportado(nome, valor, taxaAlfandega));
            }
            else if (ch == 'u') {
                System.out.println("Qual a data de fabricação do produto? ");
                String dataFabricacao = sc.nextLine();
                lista.add(new ProdutoUsado(nome, valor, dataFabricacao));
            }
        }
        for (Produto produto : lista) {
            System.out.println(produto.etiqueta());
        }

        sc.close();
    }
}
