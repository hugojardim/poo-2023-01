package com.github.hugojardim.ufg.poo.t17;

public class Questao {

        private String enunciado;
        private String resposta;

        public Questao(String enunciado, String resposta) {
            this.enunciado = enunciado;
            this.resposta = resposta;
        }

        public String getEnunciado() {
            return enunciado;
        }

        public String getResposta() {
            return resposta;
        }
}