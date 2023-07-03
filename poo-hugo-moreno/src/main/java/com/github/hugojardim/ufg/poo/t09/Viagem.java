package com.github.hugojardim.ufg.poo.t09;

import java.util.ArrayList;

public class Viagem {
    public ArrayList<Cidade> viagem;

    public ArrayList<ListaPedidos> listasPedidos;

    public Viagem() {
        this.viagem = new ArrayList<Cidade>();
    }

    public void addCidade(Cidade cidade) {
        this.viagem.add(cidade);
    }

    public void removeCidade(Cidade cidade) {
        this.viagem.remove(cidade);
    }

    public ArrayList<Cidade> getViagem() {
        return viagem;
    }

    public void setListasPedidos(ListaPedidos listaPedidos) {
        this.listasPedidos.add(listaPedidos);
    }

    public ArrayList<ListaPedidos> getListasPedidos() {
        return listasPedidos;
    }
}