package com.github.hugojardim.ufg.poo.t11;
import java.util.Date;

public class Prestacao {

    private final double valor;
    private final Date dataLimite;

    public Prestacao(double valor, Date dataLimite) {
        this.valor = valor;
        this.dataLimite = dataLimite;
    }

    public double getValor() {
        return valor;
    }

    public Date getDataLimite() {
        return dataLimite;
    }
}
