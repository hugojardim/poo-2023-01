package com.github.hugojardim.ufg.poo.t17;

public class Passageiro {

    private final String nome;
    private final String bilhete;

    public Passageiro(String nome, String bilhete) {
        this.nome = nome;
        this.bilhete = bilhete;
    }

    public String getNome() {
        return nome;
    }

    public String getBilhete() {
        return bilhete;
    }
}