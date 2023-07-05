package com.github.hugojardim.ufg.poo.t08.t08;
import java.util.ArrayList;

public class Projeto {
    public ArrayList<Pessoa> pessoa;
    public ArrayList<LinguagemProgramacao> linguagem;
    private String nome;

    public Projeto(String name) {
        this.pessoa = new ArrayList<>();
        this.linguagem = new ArrayList<>();
        this.nome = name;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarPessoa(Pessoa pessoa){
        this.pessoa.add(pessoa);
    }
    public ArrayList<Pessoa> getPessoa() {
        return pessoa;
    }

    public void adicionarLinguagens(LinguagemProgramacao linguagem){
        this.linguagem.add(linguagem);
    }

    public ArrayList<LinguagemProgramacao> getLinguagem() {
        return linguagem;
    }
}
