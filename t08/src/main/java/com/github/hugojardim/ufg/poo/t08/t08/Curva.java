package com.github.hugojardim.ufg.poo.t08.t08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Curva {
    private List<Ponto> pontos;
    public Curva() {
        pontos = new ArrayList<>();
    }
    public void adicionarPonto(Ponto ponto) {
        pontos.add(ponto);
        Collections.sort(pontos);
    }
    public boolean isCurva() {
        return pontos.size() >= 2;
    }
}
