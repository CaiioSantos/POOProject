package com.company.Controller;

import com.company.Excecao.LocarException;
import com.company.Excecao.RepositorioLocarException;
import com.company.Repositorio.RepositorioLocar;
import com.company.model.ClientePf;
import com.company.model.ClientePj;
import com.company.model.Locar;
import com.company.model.Veiculo;

import java.util.ArrayList;

public class ControllerLocar implements IControllerLocar {
    private static ControllerLocar instancia;
    private RepositorioLocar repositorioLocar= RepositorioLocar.getInstance();

    public ControllerLocar() throws LocarException, RepositorioLocarException {

    }
    public static ControllerLocar getInstance() throws LocarException, RepositorioLocarException {
        if (instancia == null){
            instancia = new ControllerLocar();
        }
        return instancia;
    }

    @Override
    public void locarCarroPf(Veiculo veiculo, ClientePf clientePf) throws LocarException, RepositorioLocarException {

    }

    @Override
    public void devolverCarroLocadoPf(Veiculo veiculo, ClientePf clientePf) throws LocarException, RepositorioLocarException {

    }

    @Override
    public void locarCarroPj(Veiculo veiculo, ClientePj clientePj) throws LocarException, RepositorioLocarException {

    }

    @Override
    public void devolverCarroLocadoPj(Veiculo veiculo, ClientePj clientePj) throws LocarException, RepositorioLocarException {

    }

    @Override
    public void precoLocacao(Locar locar) throws LocarException, RepositorioLocarException {

    }

    @Override
    public ArrayList<Locar> listarlocacoes() throws LocarException, RepositorioLocarException {
        return null;
    }
}
