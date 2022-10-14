package com.listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> list = new ArrayList<>();

        System.out.println("Quantos funcionários serão cadastrados? ");
        int num = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < num; i++) {
            System.out.println("\nFuncionário #" + (i + 1) + ":");
            System.out.println("Id: ");
            Integer id = sc.nextInt();
            sc.nextLine();
            System.out.println("Nome: ");
            String nome = sc.nextLine();
            System.out.println("Salário: R$ ");
            Double salario = sc.nextDouble();

            Employee funcionario = new Employee(id, nome, salario);
            list.add(funcionario);
        }

        System.out.println("Qual funcionário você deseja aumentar o salário? ");
        Integer idAumento = sc.nextInt();

        Integer posicao = buscaId(list, idAumento);
        if (posicao == null) {
            System.out.println("O Id informado não existe!");
        }
        else {
            System.out.println("Insira a porcentagem em que o salário vai ser aumentado: ");
            double porcentagem = sc.nextDouble();
            list.get(posicao).increaseSalary(porcentagem);
            System.out.println("O novo salário do funcionário " + idAumento + " é de: R$" + list.get(posicao).getSalary());
        }

        System.out.println("\nLista de funcionários: ");
        for (Employee funcionario : list) {
            System.out.println(funcionario);
        }

        sc.close();
    }
    public static Integer buscaId(List<Employee> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }
}
