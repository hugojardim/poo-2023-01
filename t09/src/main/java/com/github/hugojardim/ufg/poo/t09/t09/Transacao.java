package com.github.hugojardim.ufg.poo.t09.t09;

public class Transacao {
    private String transacao;

    private Cliente cliente;

    private Fornecedor fornecedor;

    private Transacao(String transacao){
        this.transacao = transacao;
    }

    private Transacao() {
        cliente = new Cliente();
        fornecedor = new Fornecedor();
    }

    public String getTransacao(){
        transacao = cliente.getCliente() + " comprou " + fornecedor.getFornecedor();
        return transacao;
    }
}
