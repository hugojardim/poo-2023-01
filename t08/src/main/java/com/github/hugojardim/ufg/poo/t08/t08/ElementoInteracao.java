package com.github.hugojardim.ufg.poo.t08.t08;

public abstract class ElementoInteracao  {
    public static ElementoInteracao criarMenu() {
        return new Menu();
    }

    public static ElementoInteracao criarBarraRolagem() {
        return new BarraRolagem();
    }

    public static ElementoInteracao criarBotao() {
        return new Botao();
    }
}
