package com.lanchenlayer;

import org.jetbrains.annotations.NotNull;

public class Circulo {
    private int raio;


    public Circulo(@NotNull Quadrado quadrado) {
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