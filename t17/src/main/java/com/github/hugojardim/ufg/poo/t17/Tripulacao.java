package com.github.hugojardim.ufg.poo.t17;

import java.util.ArrayList;
import java.util.List;

public class Tripulacao {

    private final Piloto piloto;
    private final CoPiloto coPiloto;
    private final List<Aeromoca> aeromocas;

    public Tripulacao(Piloto piloto, CoPiloto coPiloto) {
        this.piloto = piloto;
        this.coPiloto = coPiloto;
        this.aeromocas = new ArrayList<>();
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public CoPiloto getCoPiloto() {
        return coPiloto;
    }

    public List<Aeromoca> getAeromocas() {
        return aeromocas;
    }
}