package com.github.hugojardim.ufg.poo.t08;

public abstract class Ponto implements Comparable<Ponto>{
    private final double x;
    private final double y;
    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
