package com.company.model;

public class ClientePf extends Cliente {
    private String idClientepf;
    private String cpf;
    private int idade;
    private String CnhTipo;
    private Endereco endereco;

    public String getIdClientepf() {
        return idClientepf;
    }

    public void setIdClientepf(String idClientepf) {
        this.idClientepf = idClientepf;
    }

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
