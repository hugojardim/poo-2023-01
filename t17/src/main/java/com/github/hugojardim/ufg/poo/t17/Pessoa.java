package com.github.hugojardim.ufg.poo.t17;

public class Pessoa {

    private final String nome;
    private final String sexo;

    private final Automovel automovel;

    public Pessoa(String nome, String sexo, Automovel automovel) {
        this.nome = nome;
        this.sexo = sexo;
        this.automovel = automovel;
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void dirigirAutomovel(){
        System.out.println("Dirigindo meu carro! Bibi bibi!");
    }
}
