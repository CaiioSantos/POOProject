package com.company.model;

public class Cliente {
    private String nomeCliente;
    private int codCliente;
    private int telefone;
    private String email;
    private Endereco endereco;

    public Cliente() {
    }

    public Cliente(String nomeCliente, int codCliente, int telefone, String email, Endereco endereco) {
        this.nomeCliente = nomeCliente;
        this.codCliente = codCliente;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
