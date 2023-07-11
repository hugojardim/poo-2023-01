package com.github.hugojardim.ufg.poo.t13;

public class MainJogo {
    public static void main(String[] args) {
        Jogo jogo = new Jogo("Jogo");
        jogo.setGenero("Ação");
        jogo.setPlataforma("PC");
        jogo.setDesenvolvedora("EA");
        jogo.setJogadores("10");

        Modalidade modalidade = new Modalidade("FPS");
        jogo.modalidade = modalidade;
        modalidade.setRegras("Free for all");
        modalidade.setCampeonatos("Campeonato de FPS");
        modalidade.setJogadores("10");
        modalidade.setClassificacaoDosJogadores("1º lugar: Fulano");
        modalidade.jogos.add(jogo);
        modalidade.classificacaoDosJogos.add("9 rotten tomatoes");

        System.out.println(jogo.getNomeJogo());
        System.out.println(jogo.getGenero());
        System.out.println(jogo.getPlataforma());
        System.out.println(jogo.getDesenvolvedora());
        System.out.println(jogo.getJogadores());

        System.out.println(modalidade.getNomeModalidade());
        System.out.println(modalidade.getRegras());
        System.out.println(modalidade.getCampeonatos());
        System.out.println(modalidade.getJogadores());
        System.out.println(modalidade.getClassificacaoDosJogadores());
        System.out.println(modalidade.classificacaoDosJogos.get(0));

    }
}
