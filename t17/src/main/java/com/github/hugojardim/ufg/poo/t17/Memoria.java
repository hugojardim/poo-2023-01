package com.github.hugojardim.ufg.poo.t17;

public class Memoria extends Dispositivo{

    private String velocidade;
    private String tamanho;

    public Memoria(String velocidade, String tamanho) {
        this.velocidade = velocidade;
        this.tamanho = tamanho;
    }

    public String getVelocidade() {
        return velocidade;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void armazenarDados() {
        System.out.println("Armazenando dados na memória!");
    }
}