package com.github.hugojardim.ufg.poo.t07;
import java.util.TreeSet;
public class Festa {
    private final TreeSet convidados = new TreeSet();
    public void novoConvidado(Convidado c) {
        convidados.add(c);
    }

    public Festa(Convidado c) {
        convidados.add(c);
    }
}
