package com.github.hugojardim.ufg.poo.t17;

public class Mouse extends Dispositivo{

    private final String marca;
    private final String modelo;

    public Mouse(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void iniciarMouse(){
        System.out.println("Mouse iniciado!");
    }
}