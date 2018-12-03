package com.company.model;

public class Carro extends VeiculoPasseio {


    public  Carro(String modelo){
        
        this.modelo = getModelo();

    }

    public String getCodigoSeguroCarro(){
        return codigoSeguroCarro;
    }
    public void setCodigoSeguroCarro(){
        this.codigoSeguroCarro = codigoSeguroCarro;
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
