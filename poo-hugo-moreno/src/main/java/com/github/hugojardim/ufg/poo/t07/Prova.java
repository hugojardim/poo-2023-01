package com.github.hugojardim.ufg.poo.t07;

public abstract class Prova implements Identificacao {
    private byte numQuestoes;

    public byte numQuestoes() {
        return numQuestoes;
    }

    public void setNumQuestoes(byte n){
        if(n > 0) {
            numQuestoes = n;
        }
    }
}
