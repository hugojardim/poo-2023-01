package com.github.hugojardim.ufg.poo.t09.t09;

import java.util.ArrayList;

public class Pessoa {
    private String nome;
    public Byte idade;
    public ArrayList<Habito> habitos;
    public Pessoa(){
        this.habitos = new ArrayList<>();
    }

    public ArrayList<Habito> getHabitos() {
        return habitos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Byte getIdade() {
        return idade;
    }

    public void setIdade(Byte idade) {
        this.idade = idade;
    }
}
