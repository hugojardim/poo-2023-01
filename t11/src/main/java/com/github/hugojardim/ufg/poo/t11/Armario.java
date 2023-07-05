package com.github.hugojardim.ufg.poo.t11;

public class Armario {
    public Prateleira[] prateleiras;

    public Armario(int quantidadePrateleiras) {
        this.prateleiras = new Prateleira[quantidadePrateleiras];
    }

    public void adicionarPrateleira(int indice, Prateleira prateleira) {
        this.prateleiras[indice] = prateleira;
    }
}
