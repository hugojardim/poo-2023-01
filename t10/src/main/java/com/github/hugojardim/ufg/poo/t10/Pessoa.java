package com.github.hugojardim.ufg.poo.t10;

import java.util.ArrayList;

public class Pessoa {
    public String nome;

    public String cabelo;

    public Membro membros;

    public String corPele;

    public String corOlhos;

    public double altura;

    public double peso;

    public Bicicleta bicicleta;

    public Mochila mochila;

    public Roupa roupa;

    public Estudo escola;

    public ArrayList<Objeto> objetos;

    public ArrayList<Membro> membro;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCabelo() {
        return cabelo;
    }

    public void setCabelo(String cabelo) {
        this.cabelo = cabelo;
    }

    public String getCorPele() {
        return corPele;
    }

    public void setCorPele(String corPele) {
        this.corPele = corPele;
    }

    public String getCorOlhos() {
        return corOlhos;
    }

    public void setCorOlhos(String corOlhos) {
        this.corOlhos = corOlhos;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Bicicleta getBicicleta() {
        return bicicleta;
    }

    public void setBicicleta(Bicicleta bicicleta) {
        this.bicicleta = bicicleta;
    }

    public Mochila getMochila() {
        return mochila;
    }

    public void setMochila(Mochila mochila) {
        this.mochila = mochila;
    }

    public Roupa getRoupa() {
        return roupa;
    }

    public void setRoupa(Roupa roupa) {
        this.roupa = roupa;
    }

    public Estudo getEscola() {
        return escola;
    }

    public void setEscola(Estudo escola) {
        this.escola = escola;
    }

    public ArrayList<Objeto> getObjetos() {
        return objetos;
    }

    public void setObjetos(ArrayList<Objeto> objetos) {
        this.objetos = objetos;
    }

    public ArrayList<Membro> getMembro() {
        return membro;
    }

    public void setMembro(ArrayList<Membro> membro) {
        this.membro = membro;
    }

    public Membro getMembros() {
        return membros;
    }

}
