package com.github.hugojardim.ufg.poo.t08;

import java.util.ArrayList;
public class Pais {
    public ArrayList<Cidade> cidades;
    public Pais(ArrayList<Cidade> cidades) {
        this.cidades = cidades;
    }

    public ArrayList<Cidade> getCidades() {
        return cidades;
    }

    public void setCidades(ArrayList<Cidade> cidades) {
        this.cidades = cidades;
    }

    public Cidade capital;
    public Pais(Cidade capital) {
        this.capital = capital;
    }

    public Cidade getCapital() {
        return capital;
    }

    public void setCapital(Cidade capital) {
        this.capital = capital;
    }
}
