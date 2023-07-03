package com.github.hugojardim.ufg.poo.t08;

import java.util.ArrayList;

public class Pessoa {
    private Projeto projeto;
    private String nome;
    public ArrayList<Emprego> empregos;

    public Pessoa() {
        this.empregos = new ArrayList<>();
    }
}
