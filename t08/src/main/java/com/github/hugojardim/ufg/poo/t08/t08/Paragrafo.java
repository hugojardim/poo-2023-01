package com.github.hugojardim.ufg.poo.t08.t08;
import java.util.ArrayList;

public class Paragrafo {
    private ArrayList<Sentenca> sentencas;

    public Paragrafo() {
        sentencas = new ArrayList<>();
    }

    public void adicionarSentenca(Sentenca sentenca) {
        sentencas.add(sentenca);
    }

    public ArrayList<Sentenca> getSentencas() {
        return sentencas;
    }
}

