package com.github.hugojardim.ufg.poo.t09.t09;

import java.util.ArrayList;

public class CaixeiroViajante {
    public String caixeiro;

    public ArrayList<Viagem> viagens;

    public CaixeiroViajante(String caixeiro) {
        this.caixeiro = caixeiro;
    }

    public String getCaixeiro() {
        return caixeiro;
    }

    public CaixeiroViajante() {
        viagens = new ArrayList<>();
    }

    public void adicionarViagem(Viagem viagem) {
        viagens.add(viagem);
    }

    public void removerViagem(Viagem viagem) {
        viagens.remove(viagem);
    }

    public ArrayList<Viagem> getViagens() {
        return viagens;
    }
}
