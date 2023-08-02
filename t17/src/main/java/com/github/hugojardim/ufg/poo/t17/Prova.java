package com.github.hugojardim.ufg.poo.t17;

import java.util.List;

public class Prova {

    private final List<Resposta> respostas;

    public Prova(List<Resposta> respostas) {
        this.respostas = respostas;
    }

    public List<Resposta> getRespostas() {
        return respostas;
    }

    public void adicionarResposta(Resposta resposta){
        respostas.add(resposta);
    }

    public void removerResposta(Resposta resposta){
        respostas.remove(resposta);
    }
}