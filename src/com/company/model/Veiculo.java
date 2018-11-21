package com.company.model;

public class Veiculo {
    private String marca;
    private String modelo;
    private String placa;
    private String tipo;
    private boolean arCondicionado;
    private boolean direçãoHidraulica;
    private boolean cambioAutomatico;


    public Veiculo() {
    }

    public Veiculo(String marca, String modelo, String placa, String tipo, boolean arCondicionado, boolean direçãoHidraulica, boolean cambioAutomatico) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.tipo = tipo;
        this.arCondicionado = arCondicionado;
        this.direçãoHidraulica = direçãoHidraulica;
        this.cambioAutomatico = cambioAutomatico;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isArCondicionado() {
        return arCondicionado;
    }

    public void setArCondicionado(boolean arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    public boolean isDireçãoHidraulica() {
        return direçãoHidraulica;
    }

    public void setDireçãoHidraulica(boolean direçãoHidraulica) {
        this.direçãoHidraulica = direçãoHidraulica;
    }

    public boolean isCambioAutomatico() {
        return cambioAutomatico;
    }

    public void setCambioAutomatico(boolean cambioAutomatico) {
        this.cambioAutomatico = cambioAutomatico;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", placa='" + placa + '\'' +
                ", tipo='" + tipo + '\'' +
                ", arCondicionado=" + arCondicionado +
                ", direçãoHidraulica=" + direçãoHidraulica +
                ", cambioAutomatico=" + cambioAutomatico +
                '}';
    }
}
