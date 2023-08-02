package com.github.hugojardim.ufg.poo.t17;

public class Tarefa {

    private final Pagamento pagamento;

    public Tarefa(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }
}