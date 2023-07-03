package com.github.hugojardim.ufg.poo.t09;

import java.util.ArrayList;

public class Armazem {
    public String armazem;

    public Viagem viagem;

    public ArrayList<ListaPedidos> listaPedidos;

    public Armazem(String armazem) {
        this.armazem = armazem;
    }

    public String getArmazem() {
        return armazem;
    }

    public void setListaPedidos(ListaPedidos listaPedidos) {
        this.listaPedidos.add(listaPedidos);
    }

    public ArrayList<ListaPedidos> getListaPedidos() {
        return listaPedidos;
    }

    public void setViagem(Viagem viagem) {
        this.viagem = viagem;
    }

    public Viagem getViagem() {
        return viagem;
    }
}
