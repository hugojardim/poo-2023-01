package com.github.hugojardim.ufg.poo.t17;

import java.util.ArrayList;
import java.util.List;

public class NotaFiscal {

    private final List<Item> itens;

    public NotaFiscal(List<Item> itens) {
        this.itens = itens;
    }

    public List<Item> getItens() {
        return itens;
    }
}