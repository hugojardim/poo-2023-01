package com.github.hugojardim.ufg.poo.t17;

public class Trabalhador {

    private final String nome;
    private final Profissao profissao;

    private final Tarefa tarefa;

    public Trabalhador(String nome, Profissao profissao, Tarefa tarefa) {
        this.nome = nome;
        this.profissao = profissao;
        this.tarefa = tarefa;
    }

    public Profissao getProfissao() {
        return profissao;
    }
}