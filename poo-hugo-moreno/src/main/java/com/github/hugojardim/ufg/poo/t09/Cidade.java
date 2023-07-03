package com.github.hugojardim.ufg.poo.t09;

import java.util.ArrayList;

public class Cidade {
    public String cidade;

    public ArrayList<Armazem> armazens;

    public Cidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }


}
