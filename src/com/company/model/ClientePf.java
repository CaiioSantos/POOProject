package com.company.model;

public class ClientePf extends Cliente {
    private String cpf;
    private int idade;
    private String CnhTipo;
    private String sexo;

    public ClientePf(String nome, String email, String cpf, int idade, String cnhTipo) {
        super(nome, email);
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public ClientePf(String nome, String email) {
        super(nome, email);
    }
}
