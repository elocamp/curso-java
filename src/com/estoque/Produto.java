package com.estoque;

public class Produto {

    public String nome;
    public double valor;
    public int qnt;

    public double calc_total() {
         return qnt * valor;
    }

    public void adicionar(int add) {
        this.qnt += add;
        System.out.println("Produto atualizado com sucesso! \nNova quantidade: " + qnt);
        System.out.println("Valor total em estoque: " + calc_total());
    }

    public void remover(int rem) {
        this.qnt -= rem;
        System.out.println("Produto atualizado com sucesso! \nNova quantidade: " + qnt);
        System.out.println("Valor total em estoque: " + calc_total());
    }

    public String toString() {
        return nome + ", R$" + String.format("%.2f", valor) + ", " + qnt + " unidades, Total: R$" + String.format("%.2f", calc_total());
    }
}
