package com.heranca.classesAbstratas;

import java.util.ArrayList;
import java.util.List;

public class Programa {
    public static void main(String[] args) {
        List<Conta> lista = new ArrayList<>();

        lista.add(new ContaPoupanca(1001, "Alex", 500.0, 0.01));
        lista.add(new ContaComercial(1002, "Maria", 1000.0, 400.0));
        lista.add(new ContaPoupanca(1003, "Bob", 300.0, 0.01));
        lista.add(new ContaComercial(1004, "Ana", 500.0, 500.0));

        double soma = 0.0;
        for (Conta acc : lista) {
            soma += acc.getSaldo();
        }
        System.out.printf("Saldo total = %.2f%n", soma);

        for (Conta acc : lista) {
            acc.deposito(10.0);
        }
        for (Conta acc : lista) {
            System.out.printf("Saldo atualizado da conta %d: %.2f%n", acc.getNumero(), acc.getSaldo());
        }
    }
}
