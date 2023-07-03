package com.github.hugojardim.ufg.poo.t07;

public class Permuta {
    public static void Permutacao(String prefixo, String sufixo) {
        if (sufixo.length() <= 1) {
            System.out.println(prefixo + sufixo);
        } else {
            for (int i = 0; i < sufixo.length(); i++) {
                String novoPrefixo = prefixo + sufixo.charAt(i);
                String novoSufixo = sufixo.substring(0, i) + sufixo.substring(i + 1);
                Permutacao(novoPrefixo, novoSufixo);
            }
        }
    }

    public static void main(String[] args) {
        Permutacao(new String(), args[0]);
    }
}
