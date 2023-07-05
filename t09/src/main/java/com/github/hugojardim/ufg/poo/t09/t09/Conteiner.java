package com.github.hugojardim.ufg.poo.t09.t09;
import java.util.ArrayList;

public class Conteiner extends Elemento{
    public ArrayList<Elemento> elementos;

    public Elemento elemento;

    public Conteiner() {
        this.elementos = new ArrayList<>();
    }

    public void adicionarElemento(){
        elementos.add(elemento);
    }

    public void removerElemento(){
        elementos.remove(elemento);
    }

    public ArrayList<Elemento> getElementos() {
        return elementos;
    }
}
