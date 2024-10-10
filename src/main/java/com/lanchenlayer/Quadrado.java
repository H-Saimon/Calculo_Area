package com.lanchenlayer;

public class Quadrado {
    private int lado;

    public Quadrado(int lado) {
        this.lado = lado;
    }

    public double calcularArea() {
        return lado * lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
}
