package com.company.Repositorio;

import com.company.Execao.LocarExeption;
import com.company.Execao.RepositorioLocarExeption;
import com.company.model.Locar;

import java.util.ArrayList;

public interface IRepositorioLocar {
    void locarCarro (Locar locar) throws LocarExeption, RepositorioLocarExeption;
    void devolverCarroLocado (Locar locar) throws LocarExeption, RepositorioLocarExeption;
    void renovarLocacao (Locar locar) throws  LocarExeption, RepositorioLocarExeption;
    ArrayList<Locar> listarlocacoes () throws LocarExeption, RepositorioLocarExeption;
}
