package com.company.model;

public class Motorista extends ClientePj {
    private String nome;
    private String idade;
    private String cnhTipo;

    public Motorista(){

    }

    public Motorista(String nome, String idade, String cnhTipo) {
        this.nome = nome;
        this.idade = idade;
        this.cnhTipo = cnhTipo;
    }

    public Motorista(String cnpj, Motorista motorista, String nome, String idade, String cnhTipo) {
        super(cnpj, motorista);
        this.nome = nome;
        this.idade = idade;
        this.cnhTipo = cnhTipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getCnhTipo() {
        return cnhTipo;
    }

    public void setCnhTipo(String cnhTipo) {
        this.cnhTipo = cnhTipo;
    }

    @Override
    public String toString() {
        return "Motorista{" +
                "nome='" + nome + '\'' +
                ", idade='" + idade + '\'' +
                ", cnhTipo='" + cnhTipo + '\'' +
                '}';
    }
}
