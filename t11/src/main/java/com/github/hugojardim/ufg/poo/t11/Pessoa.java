package com.github.hugojardim.ufg.poo.t11;

public class Pessoa {
    String sexo;

    private Pessoa(String sexo) {
        this.sexo = sexo;
    }

    public static Pessoa criarPessoa(String sexo) {
        return new Pessoa(sexo);
    }
}
