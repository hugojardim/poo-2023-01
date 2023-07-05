package com.github.hugojardim.ufg.poo.t11;

import java.util.ArrayList;

public class Casa {
    public ArrayList<Area> areas = new ArrayList<Area>();
    public ArrayList<Garagem> garagens = new ArrayList<Garagem>();
    public ArrayList<Sala> salas = new ArrayList<Sala>();
    public ArrayList<Quarto> qartos = new ArrayList<Quarto>();
    public ArrayList<Banheiro> banheiros = new ArrayList<Banheiro>();

    public void addArea(Area area) {
        this.areas.add(area);
    }

    public void addGaragem(Garagem garagem) {
        this.garagens.add(garagem);
    }

    public void addSala(Sala sala) {
        this.salas.add(sala);
    }

    public void addQuarto(Quarto quarto) {
        this.qartos.add(quarto);
    }

    public void addBanheiro(Banheiro banheiro) {
        this.banheiros.add(banheiro);
    }

    public void removeArea(Area area) {
        this.areas.remove(area);
    }

    public void removeGaragem(Garagem garagem) {
        this.garagens.remove(garagem);
    }

    public void removeSala(Sala sala) {
        this.salas.remove(sala);
    }

    public void removeQuarto(Quarto quarto) {
        this.qartos.remove(quarto);
    }

    public void removeBanheiro(Banheiro banheiro) {
        this.banheiros.remove(banheiro);
    }
}
