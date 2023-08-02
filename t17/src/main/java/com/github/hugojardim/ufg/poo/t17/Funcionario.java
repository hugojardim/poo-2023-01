package com.github.hugojardim.ufg.poo.t17;

import java.util.ArrayList;
import java.util.List;

public class Funcionario {

    private final Funcionario gerente;
    private final List<Funcionario> subordinados;

    public Funcionario(Funcionario gerente) {
        this.gerente = gerente;
        this.subordinados = new ArrayList<>();
    }

    public Funcionario getGerente() {
        return gerente;
    }

    public List<Funcionario> getSubordinados() {
        return subordinados;
    }
}