package com.github.hugojardim.ufg.poo.t11;

import java.util.ArrayList;

public class Carne {

    private final String compra;
    private final ArrayList<Produto> produtos;
    private final ArrayList<Prestacao> prestacoes;

    public Carne(String compra) {
        this.compra = compra;
        this.produtos = new ArrayList<Produto>();
        this.prestacoes = new ArrayList<Prestacao>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void adicionarPrestacao(Prestacao prestacao) {
        prestacoes.add(prestacao);
    }

    public void exibirCarne() {
        System.out.println("Compra: " + compra);
        System.out.println("Produtos:");
        for (Produto produto : produtos) {
            System.out.println("- " + produto.getQuantidade() + "x " + produto.getNome());
        }
        System.out.println("Prestações:");
        for (Prestacao prestacao : prestacoes) {
            System.out.println("- Valor: R$" + prestacao.getValor() + ", Data Limite: " + prestacao.getDataLimite());
        }
    }
}
