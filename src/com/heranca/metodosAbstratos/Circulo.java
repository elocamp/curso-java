package com.heranca.metodosAbstratos;

public class Circulo extends Formato{
    protected Double raio;

    public Circulo() {
        super();
    }

    public Circulo(Color cor, Double raio) {
        super(cor);
        this.raio = raio;
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(raio, 2);
    }
}
