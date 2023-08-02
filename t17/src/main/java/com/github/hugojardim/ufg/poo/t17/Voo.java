package com.github.hugojardim.ufg.poo.t17;

public class Voo {

    private final String numeroVoo;
    private final Tripulacao tripulacao;

    private final Aviao aviao;

    public Voo(String numeroVoo, Tripulacao tripulacao, Aviao aviao) {
        this.numeroVoo = numeroVoo;
        this.tripulacao = tripulacao;
        this.aviao = aviao;
    }

    public String getNumeroVoo() {
        return numeroVoo;
    }

    public Tripulacao getTripulacao() {
        return tripulacao;
    }

    public Aviao getAviao() {
        return aviao;
    }
}