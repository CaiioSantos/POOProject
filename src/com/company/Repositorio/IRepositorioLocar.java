package com.company.Repositorio;

import com.company.Excecao.LocarException;
import com.company.Excecao.RepositorioLocarException;
import com.company.model.ClientePf;
import com.company.model.Locar;

import java.util.ArrayList;

public interface IRepositorioLocar {
    void locarCarro (Locar locar) throws LocarException, RepositorioLocarException;
    void devolverCarroLocado (Locar locar) throws LocarException, RepositorioLocarException;
    void precoLocacao (Locar locar) throws LocarException, RepositorioLocarException;
    ArrayList<Locar> listarlocacoes () throws LocarException, RepositorioLocarException;
}
