package com.heranca.exercicios.ex3;

public class PessoaFisica extends Pessoa{
    protected Double gastosSaude;

    public PessoaFisica(){
        super();
    }

    public PessoaFisica(String nome, Double rendaAnual, Double gastosSaude) {
        super(nome, rendaAnual);
        this.gastosSaude = gastosSaude;
    }

    public Double getGastosSaude() {
        return gastosSaude;
    }

    public void setGastosSaude(Double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }

    @Override
    public double imposto() {
        if (rendaAnual < 20000.0) {
            if (gastosSaude > 0) {
                return 0.15 * rendaAnual - 0.5 * gastosSaude;
            }
            else {
                return 0.15 * rendaAnual;
            }
        } else  {
            if (gastosSaude > 0) {
                return 0.25 * rendaAnual - 0.5 * gastosSaude;
            }
            else {
                return 0.25 * rendaAnual;
            }
        }
    }
}
