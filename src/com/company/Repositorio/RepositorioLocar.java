package com.company.Repositorio;

import com.company.Excecao.LocarException;
import com.company.Excecao.RepositorioLocarException;
import com.company.model.Locar;

import java.util.ArrayList;

public class RepositorioLocar implements IRepositorioLocar {
    private ArrayList<Locar> locarArrayList;
    private static RepositorioLocar instancia;

    public static RepositorioLocar getInstance() throws LocarException, RepositorioLocarException {
        if (instancia == null){
            instancia =  new RepositorioLocar();
        }
        return instancia;
    }
    public RepositorioLocar() throws LocarException, RepositorioLocarException {
        if (this.locarArrayList == null){
            this.locarArrayList = new ArrayList<>();
        }
    }


    @Override
    public void locarCarro(Locar locar) throws LocarException, RepositorioLocarException {
        this.locarArrayList.add(locar);
    }

    @Override
    public void devolverCarroLocado(Locar locar) throws LocarException, RepositorioLocarException {

    }

    @Override
    public void precoLocacao(Locar locar) throws LocarException, RepositorioLocarException {

    }

    @Override
    public ArrayList<Locar> listarlocacoes() throws LocarException, RepositorioLocarException {
        return null;
    }
}
