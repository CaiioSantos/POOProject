package com.company.Execao;

import com.company.Repositorio.RepositorioClientePf;

public class RepositorioClientePfExeption extends Exception {
    public RepositorioClientePfExeption (String textExeption){
        super(textExeption);
    }
}
