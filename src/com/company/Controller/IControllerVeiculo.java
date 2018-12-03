package com.company.Controller;

import com.company.Excecao.RepositorioVeiculoException;
import com.company.Excecao.VeiculoException;
import com.company.model.Veiculo;

import java.util.ArrayList;

public interface IControllerVeiculo {
    void adicionarVeiculo (Veiculo veiculo) throws VeiculoException, RepositorioVeiculoException;
    void deletarVeiculo (Veiculo Veiculo) throws VeiculoException, RepositorioVeiculoException;
    void atualizarVeiculo (Veiculo Veiculo) throws VeiculoException, RepositorioVeiculoException;
    Veiculo pesquisarVeiculoPeloModelo (String veiculoModelo) throws VeiculoException, RepositorioVeiculoException;
    ArrayList<Veiculo> listarVeiculos() throws VeiculoException, RepositorioVeiculoException;
}

