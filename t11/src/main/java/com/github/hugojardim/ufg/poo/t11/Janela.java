package com.github.hugojardim.ufg.poo.t11;

public abstract class Janela {
    double areaJanela;

    public Janela(double areaJanela) {
        this.areaJanela = areaJanela;
    }

    double getAreaJanela() {
        return areaJanela;
    }

    void setAreaJanela(double areaJanela) {
        this.areaJanela = areaJanela;
    }

}
