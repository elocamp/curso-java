package com.heranca.exercicios.ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Pessoa> lista = new ArrayList<>();

        System.out.print("Insira o número de pessoas para consultar os impostos: ");
        int num = sc.nextInt(); sc.nextLine();

        for (int i = 0; i < num; i++) {
            System.out.println("\nInformações do Pagador #" + (i + 1));
            System.out.print("Pessoa física ou jurídica? (f/j) ");
            char ch = sc.next().charAt(0); sc.nextLine();

            System.out.print("Insira o nome: ");
            String nome = sc.nextLine();

            System.out.print("Insira a renda Anual: ");
            Double rendaAnual = sc.nextDouble(); sc.nextLine();

            if (ch == 'f') {
                System.out.print("Insira o valor das despesas médicas: ");
                Double gastosSaude = sc.nextDouble(); sc.nextLine();

                lista.add(new PessoaFisica(nome, rendaAnual, gastosSaude));
            }

            else if (ch == 'j') {
                System.out.print("Insira o número de funcionários: ");
                Integer numFuncionarios = sc.nextInt(); sc.nextLine();

                lista.add(new PessoaJuridica(nome, rendaAnual, numFuncionarios));
            }
        }

        System.out.println("\nValor dos impostos: ");
        Double valorTotal = 0.0;
        for (Pessoa pessoa : lista) {
            System.out.println(pessoa.getNome() + ": R$ " + String.format("%.2f", pessoa.imposto()));
            valorTotal += pessoa.imposto();
        }
        System.out.println("Valor total dos impostos: R$ " + String.format("%.2f", valorTotal));
    }
}
