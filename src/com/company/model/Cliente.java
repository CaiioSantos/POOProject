package com.company.model;

public class Cliente {
    private String nomeCliente;
    private int codCliente;
    private int telefone;
    private String email;
    private Endereco endereco;
    private int idCliente;

    public Cliente() {
    }

    public Cliente(String nomeCliente, int codCliente, int telefone, String email, Endereco endereco, int idCliente) {
        this.nomeCliente = nomeCliente;
        this.codCliente = codCliente;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
        this.idCliente = idCliente;
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

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nomeCliente='" + nomeCliente + '\'' +
                ", codCliente=" + codCliente +
                ", telefone=" + telefone +
                ", email='" + email + '\'' +
                ", endereco=" + endereco +
                ", idCliente=" + idCliente +
                '}';
    }
}
