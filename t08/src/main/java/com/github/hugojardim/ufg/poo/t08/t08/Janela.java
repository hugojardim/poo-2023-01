package com.github.hugojardim.ufg.poo.t08.t08;
import java.util.ArrayList;

public class Janela {
    private final ArrayList<ElementoInteracao> elementos;

    private Janela() {
        elementos = new ArrayList<>();
    }

    private void adicionarElemento(ElementoInteracao elemento) {
        elementos.add(elemento);
    }
    private void removerrElemento(ElementoInteracao elemento) {
        elementos.remove(elemento);
    }
}
