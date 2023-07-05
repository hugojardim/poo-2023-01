package com.github.hugojardim.ufg.poo.t09.t09;

public class ListaPedidos {
    public String listaPedidos;

    public Armazem armazem;

    public ListaPedidos(String listaPedidos) {
        this.listaPedidos = listaPedidos;
    }

    public String getListaPedidos() {
        return listaPedidos;
    }

    public void setArmazem(Armazem armazem) {
        this.armazem = armazem;
    }

    public Armazem getArmazem() {
        return armazem;
    }

}
