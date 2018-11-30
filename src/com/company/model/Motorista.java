package com.company.model;

public class Motorista extends Funcionario {

    public String getCnhTipo() {
        return cnhTipo;
    }
    public void setCnhTipo(String cnhTipo){ this.cnhTipo=cnhTipo; }
    public String getCpf(){ return cpf; }
    public void setCpf(String cpf){
        this.cnhTipo=cnhTipo;
    }
    public String getRg(){
        return rg;
    }
    public void setRg(String rg){
        this.rg=rg;
    }
}
