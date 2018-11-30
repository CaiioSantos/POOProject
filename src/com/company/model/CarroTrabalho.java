package com.company.model;

public class CarroTrabalho extends VeiculoTrabalho  {

    public CarroTrabalho(String placa, String modelo){
        this.placa = getPlaca();
        this.modelo = getModelo();

    }

    public int getCodRastreio(){
        return  codRastreio;
    }
    public void setCodrastreio(){
        this.codRastreio = codRastreio;
    }
    public String getPlaca(){
        return placa;
    }
    public void setPlaca(){
        this.placa=placa;
    }
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo=modelo;
    }
}
