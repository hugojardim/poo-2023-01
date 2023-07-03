package com.github.hugojardim.ufg.poo.t09;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Fornecedor {
    public String fornecedor;

    public ArrayList<Transacao> transacoes;

    public Fornecedor(String fornecedor){
        this.fornecedor = fornecedor;
    }

    public String getFornecedor(){
        return fornecedor;
    }

    public Fornecedor() {
        transacoes = new ArrayList<>();
    }

    private void adicionarTransacao(Transacao transacao) {
        transacoes.add(transacao);
    }
}
