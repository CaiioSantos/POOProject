package com.company.Repositorio;

import com.company.Execao.LocarExeption;
import com.company.Execao.RepositorioLocarExeption;
import com.company.model.Locar;

import java.util.ArrayList;

public class RepositorioLocar implements IRepositorioLocar {
    private ArrayList<Locar> locarArrayList;
    private static RepositorioLocar instancia;

    public static RepositorioLocar getInstance() throws LocarExeption, RepositorioLocarExeption{
        if (instancia == null){
            instancia =  new RepositorioLocar();
        }
        return instancia;
    }
    public RepositorioLocar() throws LocarExeption, RepositorioLocarExeption{
        if (this.locarArrayList == null){
            this.locarArrayList = new ArrayList<>();
        }
    }


    @Override
    public void locarCarro(Locar locar) throws LocarExeption, RepositorioLocarExeption {

    }

    @Override
    public void devolverCarroLocado(Locar locar) throws LocarExeption, RepositorioLocarExeption {

    }

    @Override
    public void renovarLocacao(Locar locar) throws LocarExeption, RepositorioLocarExeption {

    }

    @Override
    public ArrayList<Locar> listarlocacoes() throws LocarExeption, RepositorioLocarExeption {
        return null;
    }
}
