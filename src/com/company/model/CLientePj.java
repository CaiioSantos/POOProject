package com.company.model;

public class CLientePj extends Cliente {

    private String cnpj;
    private String ramoEmpresa;


    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRamoEmpresa() {
        return ramoEmpresa;
    }

    public void setRamoEmpresa(String ramoEmpresa) {
        this.ramoEmpresa = ramoEmpresa;
    }

    public CLientePj(String nome, String email, String cnpj) {
        super(nome, email);
        this.cnpj = cnpj;
    }

    public CLientePj(String nome, String email) {
        super(nome, email);
    }
}
