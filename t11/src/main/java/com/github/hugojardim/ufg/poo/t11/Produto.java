package com.github.hugojardim.ufg.poo.t11;

public class Produto {

    private final String nome;
    private final int quantidade;

    public Produto(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }
}