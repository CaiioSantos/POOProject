package com.company.model;

public class Filial extends EmpresaLocacar {

    public Filial(String nome, String cnpj, Endereco endereco, String regiao) {
        super(nome, cnpj, endereco, regiao);
    }

    public Filial(String marca, String modelo, String placa, String tipo, boolean arCondicionado, boolean direçãoHidraulica, boolean cambioAutomatico, String nome, String cnpj, Endereco endereco, String regiao) {
        super(marca, modelo, placa, tipo, arCondicionado, direçãoHidraulica, cambioAutomatico, nome, cnpj, endereco, regiao);
    }
}
