package com.heranca.metodosAbstratos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Formato> lista = new ArrayList<>();

        System.out.println("Insira o número de formas: ");
        int num = sc.nextInt(); sc.nextLine();

        for (int i = 0; i < num; i++) {
            System.out.println("Informações da Forma #" + (i + 1));

            System.out.print("Retângulo ou círculo? (r/c) ");
            char ch = sc.next().charAt(0); sc.nextLine();

            System.out.print("Cor (BLACK/BLUE/RED): ");
            Color cor = Color.valueOf(sc.next());

            if (ch == 'r') {
                System.out.print("Base: ");
                Double base = sc.nextDouble();

                System.out.print("Altura: ");
                Double altura = sc.nextDouble();

                lista.add(new Retangulo(cor, base, altura));
            }

            else if (ch == 'c') {
                System.out.print("Raio: ");
                Double raio = sc.nextDouble();

                lista.add(new Circulo(cor, raio));
            }
        }
        System.out.println("Área das Formas: ");
        int cont = 1;
        for (Formato formato : lista) {
            System.out.println("Área da Forma #" + cont + ": " + String.format("%.2f", formato.area()));
            cont += 1;
        }
    }
}
