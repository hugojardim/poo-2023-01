package com.github.hugojardim.ufg.poo.t07;
import java.util.ArrayList;
public class Religiao {
    private final ArrayList<Devoto> devotos = new ArrayList();

    public void novoFiel(Devoto d) {
        devotos.add(d);
    }
}
