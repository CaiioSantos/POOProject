package com.company.model;

public class ClientePj extends Cliente {
    private String cnpj;
    private Funcionario motorista;


    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public int getTelefone(){
        return  telefone;
    }
    public void setTelefone(int telefone){
        this.telefone=telefone;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Funcionario getMotorista() {
        return motorista;
    }

    public void setMotorista(Funcionario motorista) {
        this.motorista = motorista;
    }

    @Override
    public void Pagar() {

    }
}
