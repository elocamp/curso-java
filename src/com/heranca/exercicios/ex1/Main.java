package com.heranca.exercicios.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o número de funcionários para adicionar: ");
        int num = sc.nextInt(); sc.nextLine();

        List<Funcionario> lista = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            System.out.println("Dados do funcionário #" + (i + 1));

            System.out.println("\nO funcionário é terceirizado? (s/n)");
            char ch = sc.next().charAt(0); sc.nextLine();

            System.out.println("Nome: ");
            String nome = sc.nextLine();
            System.out.println("Horas trabalhadas: ");
            Integer horasTrabalhadas = sc.nextInt();
            sc.nextLine();
            System.out.println("Valor da hora de trabalho: ");
            Double valorHora = sc.nextDouble();
            sc.nextLine();

            if (ch == 's') {
                System.out.println("Valor das despesas adicionais: ");
                Double despesaAdicional = sc.nextDouble();
                sc.nextLine();
                lista.add(new FuncionarioTerceirizado(nome, horasTrabalhadas, valorHora, despesaAdicional));
            } else {
                lista.add(new Funcionario(nome, horasTrabalhadas, valorHora));
            }
        }

        System.out.println("Pagamentos: ");
        for (Funcionario funcionario : lista) {
            System.out.println(funcionario.getNome() + " - $ " + String.format("%.2f", funcionario.pagamento()));
        }

        sc.close();
    }
}
