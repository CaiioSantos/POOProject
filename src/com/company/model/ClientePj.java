package com.company.model;

public class ClientePj extends Cliente {
    private String cnpj;
    private Motorista motorista;

     public ClientePj(){

     }
    public ClientePj(String cnpj, Motorista motorista) {
        this.cnpj = cnpj;
        this.motorista = motorista;
    }

    public ClientePj(String nomeCliente, int codCliente, int telefone, String email, Endereco endereco, int idCliente, String cnpj, Motorista motorista) {
        super(nomeCliente, codCliente, telefone, email, endereco, idCliente);
        this.cnpj = cnpj;
        this.motorista = motorista;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    @Override
    public String toString() {
        return "ClientePj{" +
                "cnpj='" + cnpj + '\'' +
                ", motorista=" + motorista +
                '}';
    }
}
