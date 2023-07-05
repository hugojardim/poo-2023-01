package com.github.hugojardim.ufg.poo.t10.t10;

public class Bicicleta extends Objeto{
    public String roda;

    public Byte marcha;

    public double velocidade;

    public String guidao;

    public String marca;

    public String getRoda() {
        return roda;
    }

    public void setRoda(String roda) {
        this.roda = roda;
    }

    public Byte getMarcha() {
        return marcha;
    }

    public void setMarcha(Byte marcha) {
        this.marcha = marcha;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public String getGuidao() {
        return guidao;
    }

    public void setGuidao(String guidao) {
        this.guidao = guidao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void pedalar() {
        System.out.println("Pedalando...");
    }

    public void frear() {
        System.out.println("Freando...");
    }

    public void virar() {
        System.out.println("Virando...");
    }

    public void empinar() {
        System.out.println("Empinando...");
    }
}
