package com.heranca.metodosAbstratos;


public abstract class Formato {
    protected Color cor;

    public Formato() {
    }

    public Formato(Color cor) {
        this.cor = cor;
    }

    public Color getCor() {
        return cor;
    }

    public void setCor(Color cor) {
        this.cor = cor;
    }

    public abstract double area();
}
