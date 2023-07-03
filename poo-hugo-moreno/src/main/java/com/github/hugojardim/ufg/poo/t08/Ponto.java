package com.github.hugojardim.ufg.poo.t08;
import java.util.Collections;
public abstract class Ponto implements Comparable<Ponto>{
    private double x;
    private double y;
    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
