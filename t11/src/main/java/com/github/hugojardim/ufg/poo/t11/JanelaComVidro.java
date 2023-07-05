package com.github.hugojardim.ufg.poo.t11;

public class JanelaComVidro extends Janela{

    double areaJanela;

    double janelaComVidro;

    double areaSemVidro;

    double getJanelaComVidro() {
        return janelaComVidro;
    }

    double setJanelaComVidro(double janelaComVidro) {
        return this.janelaComVidro = janelaComVidro;
    }

    public JanelaComVidro(double areaJanela, double janelaComVidro) {
        super(areaJanela);
        this.areaJanela = areaJanela;
        this.areaSemVidro = areaJanela - janelaComVidro;
    }

    double getAreaSemVidro() {
        return areaSemVidro;
    }
}
