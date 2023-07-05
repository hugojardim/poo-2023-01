package com.github.hugojardim.ufg.poo.t08.t08;

public class Usuario extends Grupo{
    private String nome;
    private String id;
    public Usuario(String nome, String id) {
        this.nome = nome;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
