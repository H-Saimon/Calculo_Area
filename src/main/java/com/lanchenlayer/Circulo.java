package com.lanchenlayer;

public class Circulo {
    private int raio;


    public Circulo(Quadrado quadrado) {
        this.raio = quadrado.getLado() / 2;
    }

    public double calculaArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }
}
