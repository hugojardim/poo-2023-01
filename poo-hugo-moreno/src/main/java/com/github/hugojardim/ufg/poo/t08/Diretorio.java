package com.github.hugojardim.ufg.poo.t08;
import java.util.ArrayList;
import java.util.List;

public class Diretorio {
    private String nome;
    private List<UsuarioDiretorio> usuariosAutorizados;

    public Diretorio(String nome) {
        this.nome = nome;
        this.usuariosAutorizados = new ArrayList<>();
    }

    public void adicionarUsuarioAutorizado(UsuarioDiretorio usuario) {
        usuariosAutorizados.add(usuario);
    }

    public String getNome() {
        return nome;
    }

    public List<UsuarioDiretorio> getUsuariosAutorizados() {
        return usuariosAutorizados;
    }
}
