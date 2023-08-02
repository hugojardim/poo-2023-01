package com.github.hugojardim.ufg.poo.t17;

import java.util.ArrayList;
import java.util.List;

public class Computador {

    private final List<Dispositivo> dispositivos;
    private final Teclado teclado;
    private final Mouse mouse;
    private final PlacaMae placaMae;

    public Computador(Teclado teclado, Mouse mouse, PlacaMae placaMae) {
        this.teclado = teclado;
        this.mouse = mouse;
        this.placaMae = placaMae;
        this.dispositivos = new ArrayList<>();
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public PlacaMae getPlacaMae() {
        return placaMae;
    }

    public void iniciarComputador(){
        System.out.println("Computador iniciado!");
    }

}