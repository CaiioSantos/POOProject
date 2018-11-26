package com.company.Controller;

import com.company.Execao.LocarExeption;
import com.company.Execao.RepositorioLocarExeption;
import com.company.Repositorio.RepositorioLocar;
import com.company.model.ClientePf;
import com.company.model.ClientePj;
import com.company.model.Locar;
import com.company.model.Veiculo;

import java.util.ArrayList;

public class ControllerLocar implements IControllerLocar {
    private static ControllerLocar instancia;
    private RepositorioLocar repositorioLocar= RepositorioLocar.getInstance();

    public ControllerLocar() throws LocarExeption , RepositorioLocarExeption{

    }
    public static ControllerLocar getInstance() throws LocarExeption,RepositorioLocarExeption{
        if (instancia == null){
            instancia = new ControllerLocar();
        }
        return instancia;
    }

    @Override
    public void locarCarroPf(Veiculo veiculo, ClientePf clientePf) throws LocarExeption, RepositorioLocarExeption {

    }

    @Override
    public void devolverCarroLocadoPf(Veiculo veiculo, ClientePf clientePf) throws LocarExeption, RepositorioLocarExeption {

    }

    @Override
    public void locarCarroPj(Veiculo veiculo, ClientePj clientePj) throws LocarExeption, RepositorioLocarExeption {

    }

    @Override
    public void devolverCarroLocadoPj(Veiculo veiculo, ClientePj clientePj) throws LocarExeption, RepositorioLocarExeption {

    }

    @Override
    public void precoLocacao(Locar locar) throws LocarExeption, RepositorioLocarExeption {

    }

    @Override
    public ArrayList<Locar> listarlocacoes() throws LocarExeption, RepositorioLocarExeption {
        return null;
    }
}
