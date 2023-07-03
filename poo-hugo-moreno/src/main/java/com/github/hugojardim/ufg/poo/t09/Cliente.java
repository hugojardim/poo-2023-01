package com.github.hugojardim.ufg.poo.t09;

import java.util.ArrayList;

public class Cliente {
    public String cliente;
    public ArrayList<Transacao> transacoes;

    public Cliente(String cliente) {
        this.cliente = cliente;
    }

    public String getCliente() {
        return cliente;
    }

    public Cliente() {
        transacoes = new ArrayList<>();
    }

    private void adicionarTransacao(Transacao transacao) {
        transacoes.add(transacao);
    }
}
