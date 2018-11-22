package com.company.model;

public class EmpresaLocacar extends Veiculo {
    private String nome;
    private String cnpj;
    private Endereco endereco;
    private String regiao;

    public EmpresaLocacar(){

        super(precoLocacao);
    }

    public EmpresaLocacar(String nome, String cnpj, Endereco endereco, String regiao) {
        super(precoLocacao);
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.regiao = regiao;
    }

    public EmpresaLocacar(String marca, String modelo, String placa, String tipo, boolean arCondicionado, boolean direçãoHidraulica, boolean cambioAutomatico, String nome, String cnpj, Endereco endereco, String regiao) {
        super(marca, modelo, placa, tipo, arCondicionado, direçãoHidraulica, cambioAutomatico, precoLocacao);
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.regiao = regiao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    @Override
    public String toString() {
        return "EmpresaLocacar{" +
                "nome='" + nome + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", endereco=" + endereco +
                ", regiao='" + regiao + '\'' +
                '}';
    }
}
