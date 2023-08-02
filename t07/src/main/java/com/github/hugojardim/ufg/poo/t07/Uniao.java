package com.github.hugojardim.ufg.poo.t07;
import java.util.ArrayList;

public class Uniao {
    private final ArrayList filhos;
    private final Pessoa[] parceiros;

    public void novoFilho(Pessoa filho) {
        filhos.add(filho);
    }
    public Uniao(Pessoa parceiro1, Pessoa parceiro2) {
        filhos = new ArrayList();
        parceiros = new Pessoa[2];
        parceiros[0] = parceiro1;
        parceiros[1] = parceiro2;
    }
}
