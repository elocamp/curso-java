package com.listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        // Adiciona na próxima posição disponível
        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add("Peter");
        list.add("Brian");
        list.add("Franklin");
        // Sobrecarga / Adiciona no index especificado
        list.add(2, "Marco");

        System.out.println("O tamanho da lista é: " + list.size());
        for (String nome : list) {
            System.out.println(nome);
        }
        System.out.println("------------------------------------");

        // Para filtrar todos os elementos que começam com a letra A
        // É criada uma nova lista
        // Converte a list para stream, realiza a operação lambda e converte novamente para list
        List<String> filtrado = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

        for (String nome : filtrado) {
            System.out.println(nome);
        }
        System.out.println("------------------------------------");

        // Remove pela String
        list.remove("Anna");
        // Remove pelo index
        list.remove(1);
        // Remove pelo predicado
        list.removeIf(x -> x.charAt(0) == 'M');

        System.out.println("O tamanho da lista é: " + list.size());
        for (String nome : list) {
            System.out.println(nome);
        }
        System.out.println("------------------------------------");

        System.out.println("Index de Peter: " + list.indexOf("Peter"));
        System.out.println("Index de Maria: " + list.indexOf("Maria"));

        System.out.println("------------------------------------");
        // Retorna o primeiro elemento que começa com a letra especificada ou retorna null
        String name = filtrado.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);

    }
}
