package com.company.model;

public class ClientePf extends Cliente {
    private String cpf;
    private int idade;
    private String CnhTipo;

    public ClientePf() {
    }

    public ClientePf(String cpf, int idade, String cnhTipo) {
        this.cpf = cpf;
        this.idade = idade;
        CnhTipo = cnhTipo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCnhTipo() {
        return CnhTipo;
    }

    public void setCnhTipo(String cnhTipo) {
        CnhTipo = cnhTipo;
    }

    @Override
    public String toString() {
        return "ClientePf{" +
                "cpf='" + cpf + '\'' +
                ", idade=" + idade +
                ", CnhTipo='" + CnhTipo + '\'' +
                '}';
    }
}
