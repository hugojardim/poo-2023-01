package com.github.hugojardim.ufg.poo.t08;

public class Cidade {
    private String nome;
    public Cidade (String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pais pais;
    public Pais getPais() {
        return pais;
    }
    public Pais setPais(Pais pais) {
        this.pais = pais;
        return pais;
    }


    public void vendePara(String outraCidade){
        System.out.println("Vendendo para " + outraCidade);
    }
}
