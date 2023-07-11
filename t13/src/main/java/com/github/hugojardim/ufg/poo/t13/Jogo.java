package com.github.hugojardim.ufg.poo.t13;

public class Jogo {
    //faça set e get para atributos e métodos necessários para a classe Jogo (de videogame) estar funcional e completa
    private String nomeJogo;
    private String genero;
    private String plataforma;
    private String desenvolvedora;
    private String dataLancamento;
    private String classificacao;
    private String modoJogo;
    private String versaoAtual;
    private String Jogadores;
    public Modalidade modalidade;

    public Jogo(String nomeJogo) {
        this.nomeJogo = nomeJogo;
    }

    public String getNomeJogo() {
        return nomeJogo;
    }

    public String getModalidade() {
        return modalidade.getNomeModalidade();
    }

    public String getJogadores() {
        return Jogadores;
    }

    public void setJogadores(String jogadores) {
        Jogadores = jogadores;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getDesenvolvedora() {
        return desenvolvedora;
    }

    public void setDesenvolvedora(String desenvolvedora) {
        this.desenvolvedora = desenvolvedora;
    }

    public String getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(String dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public String getModoJogo() {
        return modoJogo;
    }

    public void setModoJogo(String modoJogo) {
        this.modoJogo = modoJogo;
    }

    public String getVersaoAtual() {
        return versaoAtual;
    }

    public void setVersaoAtual(String versaoAtual) {
        this.versaoAtual = versaoAtual;
    }
}
