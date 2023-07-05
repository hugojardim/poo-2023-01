package com.github.hugojardim.ufg.poo.t11;

public class Prateleira {
    public Compartimento compartimentos;
    private int quantidadeLivros;

    private int quantidadeCDs;

    public Prateleira(Compartimento compartimento) {
        this.compartimentos = compartimento;
        this.quantidadeLivros = 0;
        this.quantidadeCDs = 0;
    }

    public void adicionarLivro(Livro livro) {
        if (quantidadeLivros < 3) {
            compartimentos.adicionarLivro(livro);
            quantidadeLivros++;
        } else {
            System.out.println("Limite máximo de livros atingido na prateleira.");
        }
    }
    public void adicionarCDs(CD cd) {
        if (quantidadeCDs == 3 || quantidadeCDs == 5 || quantidadeCDs >= 7) {
            compartimentos.adicionarCD(cd);
            quantidadeCDs++;
        } else {
            System.out.println("Quantidade errada de CDs.");
        }
    }
    public void adicionarCompartimento(Compartimento compartimento) {
        compartimento.adicionarCompartimento(compartimento);
    }
}
