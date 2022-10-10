package com.heranca;

public class ContaComercial extends Conta{
    private Double limiteEmprestimo;

    public ContaComercial() {
        super();
    }

    public ContaComercial(Integer numero, String proprietario, Double saldo, Double limiteEmprestimo) {
        super(numero, proprietario, saldo);
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public Double getLimiteEmprestimo() {
        return limiteEmprestimo;
    }

    public void setLimiteEmprestimo(Double limiteEmprestimo) {
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public void emprestimo(double valor) {
        if (valor <= limiteEmprestimo) {
            deposito(valor);
            limiteEmprestimo -= valor;
        }
    }

    @Override
    public void saque(double valor) {
        super.saque(valor);
        saldo -= 2.0;
    }

    public static class polimorfismo {
        public static void main(String[] args) {
            Conta x = new Conta(1020, "Alex", 1000.0);
            Conta y = new ContaPoupanca(1023, "Maria", 1000.0, 0.01);

            x.saque(50.0);
            y.saque(50.0);

            System.out.println(x.getSaldo());
            System.out.println(y.getSaldo());
        }
    }
}
