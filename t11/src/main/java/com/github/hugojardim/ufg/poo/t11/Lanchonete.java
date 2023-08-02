package com.github.hugojardim.ufg.poo.t11;
import java.util.ArrayList;

public class Lanchonete {

    private final ArrayList<Funcionario> funcionarios;

    public Lanchonete() {
        this.funcionarios = new ArrayList<Funcionario>();
    }

    public void contratarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void exibirFuncionarios() {
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
        }
    }
}