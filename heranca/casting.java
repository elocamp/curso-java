package com.heranca;

public class casting {
    public static void main(String[] args) {
        Conta acc = new Conta(1001, "Alex", 0.0);
        ContaComercial bacc = new ContaComercial(1002, "Maria", 0.0, 500.0);

        //Upcasting
        Conta acc1 = bacc;
        Conta acc2 = new ContaComercial(1003, "Bob", 0.0, 200.0);
        Conta acc3 = new ContaPoupanca(1004, "Ana", 0.0, 0.01);

        //Downcasting
        ContaComercial acc4 = (ContaComercial) acc2;
        acc4.emprestimo(100);
    }
}
