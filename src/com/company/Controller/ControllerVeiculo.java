package com.company.Controller;

import com.company.Excecao.RepositorioVeiculoException;
import com.company.Excecao.VeiculoException;
import com.company.Repositorio.RepositorioVeiculo;
import com.company.model.Veiculo;

import java.util.ArrayList;

public class ControllerVeiculo implements IControllerVeiculo {
    private static ControllerVeiculo instancia;
    private RepositorioVeiculo repositorioVeiculo =  RepositorioVeiculo.getInstance();

    public ControllerVeiculo ()throws VeiculoException,RepositorioVeiculoException{

    }
    public static ControllerVeiculo getInstance() throws VeiculoException, RepositorioVeiculoException{
        if(instancia == null){
            instancia = new ControllerVeiculo();
        }
        return instancia;
    }

    @Override
    public void adicionarVeiculo(Veiculo veiculo) throws VeiculoException, RepositorioVeiculoException {
        this.repositorioVeiculo.adicionarVeiculo(veiculo);
    }

    @Override
    public void deletarVeiculo(Veiculo veiculo) throws VeiculoException, RepositorioVeiculoException {
        if(this.repositorioVeiculo.pesquisarVeiculoPeloModelo(veiculo.modelo) == null){
            throw new VeiculoException("Impossivel deletar o Cliente, Cliente inexistente");
        }else{
            this.repositorioVeiculo.deletarVeiculo(veiculo);
        }
    }

    @Override
    public void atualizarVeiculo(Veiculo veiculo) throws VeiculoException, RepositorioVeiculoException {
        this.repositorioVeiculo.atualizarVeiculo(veiculo);
    }

    @Override
    public Veiculo pesquisarVeiculoPeloModelo(String veiculoModelo) throws VeiculoException, RepositorioVeiculoException {
        return this.repositorioVeiculo.pesquisarVeiculoPeloModelo(veiculoModelo);
    }

    @Override
    public ArrayList<Veiculo> listarVeiculos() throws VeiculoException, RepositorioVeiculoException {
        return this.repositorioVeiculo.listarCarros();
    }
}
