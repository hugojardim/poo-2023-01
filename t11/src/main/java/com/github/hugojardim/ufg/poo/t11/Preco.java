package com.github.hugojardim.ufg.poo.t11;

public class Preco {

    private int valor;
    private String moeda;

    public Preco(int valor, String moeda) {
        this.valor = valor;
        this.moeda = moeda;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getMoeda() {
        return moeda;
    }

    public void setMoeda(String moeda) {
        this.moeda = moeda;
    }
}