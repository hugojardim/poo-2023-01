package com.github.hugojardim.ufg.poo.t13;

import java.util.ArrayList;

public class Modalidade {
    //faça set e get para atributos e métodos necessários para a classe Modalidade (de jogo) estar funcional e completa

    private String nomeModalidade;
    public String descricaoModalidade;
    private String regras;
    private String campeonatos;
    private String jogadores;
    private String classificacaoDosJogadores;

    public ArrayList<String> classificacaoDosJogos = new ArrayList<String>();

    public ArrayList<Jogo> jogos = new ArrayList<Jogo>();

    public String getNomeModalidade() {
        return nomeModalidade;
    }

    public Modalidade(String nomeModalidade) {
        this.nomeModalidade = nomeModalidade;
    }

    public String getDescricaoModalidade() {
        return descricaoModalidade;
    }

    public void setDescricaoModalidade(String descricaoModalidade) {
        this.descricaoModalidade = descricaoModalidade;
    }

    public String getRegras() {
        return regras;
    }

    public void setRegras(String regras) {
        this.regras = regras;
    }

    public String getCampeonatos() {
        return campeonatos;
    }

    public void setCampeonatos(String campeonatos) {
        this.campeonatos = campeonatos;
    }

    public String getJogadores() {
        return jogadores;
    }

    public void setJogadores(String jogadores) {
        this.jogadores = jogadores;
    }

    public ArrayList<String> getClassificacaoDosJogos() {
        return classificacaoDosJogos;
    }

    public void setClassificacaoDosJogos(ArrayList<String> classificacaoDosJogos) {
        this.classificacaoDosJogos = classificacaoDosJogos;
    }

    public String getClassificacaoDosJogadores() {
        return classificacaoDosJogadores;
    }

    public void setClassificacaoDosJogadores(String classificacaoDosJogadores) {
        this.classificacaoDosJogadores = classificacaoDosJogadores;
    }

    public ArrayList<Jogo> getJogos() {
        return jogos;
    }

    public void setJogos(ArrayList<Jogo> jogos) {
        this.jogos = jogos;
    }
}
