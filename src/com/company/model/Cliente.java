package com.company.model;

public abstract class Cliente {
    protected String nome;
    protected String email;
    protected int telefone;


    public abstract void pagar ();
    public abstract void pagar (String codBoleto);
    public abstract void pagar (int numeroCartao);
    public abstract void pagar (String codBoleto , int numeroCartao);
}
