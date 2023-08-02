package com.github.hugojardim.ufg.poo.t17;

import java.util.ArrayList;
import java.util.List;

public class Item {

    private final List<Detalhe> detalhes;

    private final int quantidade;
    private final float precoUnitario;

    public Item(int quantidade, float precoUnitario) {
        this.detalhes = new ArrayList<>();
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    public List<Detalhe> getDetalhes() {
        return detalhes;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public float getPrecoUnitario() {
        return precoUnitario;
    }
}