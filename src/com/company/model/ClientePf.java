package com.company.model;

public class ClientePf extends Cliente {
    private int cpf;
    private int idade;
    private String CnhTipo;

    public ClientePf() {
    }

    public ClientePf(String nomeCliente, int codCliente, int telefone, String email, Endereco endereco, int idCliente, int cpf, int idade, String cnhTipo) {
        super(nomeCliente, codCliente, telefone, email, endereco, idCliente);
        this.cpf = cpf;
        this.idade = idade;
        CnhTipo = cnhTipo;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
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
