package com.github.hugojardim.ufg.poo.t17;

import java.util.ArrayList;
import java.util.List;

public class Sanduiche {

    private final List<Item> itens;

    public Sanduiche() {
        this.itens = new ArrayList<>();
    }

    public List<Item> getItens() {
        return itens;
    }

}