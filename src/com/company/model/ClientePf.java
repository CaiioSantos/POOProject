package com.company.model;

public class ClientePf extends Cliente {

    private String cpf;
    private int idade;
    private String cnhTipo;
    private Endereco endereco;

    public ClientePf(String nome ,String cpf, String cnhTipo) {
        this.nome = nome;
        this.cpf = cpf;
        this.cnhTipo = cnhTipo;
    }

    public String getNome(){ return nome; }
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
        return cnhTipo;
    }
    public void setCnhTipo(String cnhTipo) {
        this.cnhTipo = cnhTipo;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public void Pagar() {
    }
}
