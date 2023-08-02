package com.github.hugojardim.ufg.poo.t17;

import java.util.ArrayList;
import java.util.List;

public class Garçonete {

    private final String nome;
    private final List<Pedido> pedidos;

    public Garçonete(String nome) {
        this.nome = nome;
        this.pedidos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }
}