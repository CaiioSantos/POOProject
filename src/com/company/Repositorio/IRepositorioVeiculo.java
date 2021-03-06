package com.company.Repositorio;

import com.company.Excecao.RepositorioVeiculoException;
import com.company.Excecao.VeiculoException;
import com.company.model.Veiculo;

import java.util.ArrayList;

public interface IRepositorioVeiculo {
    void adicionarVeiculo (Veiculo veiculo) throws VeiculoException, RepositorioVeiculoException;
    void deletarVeiculo (Veiculo veiculo) throws VeiculoException, RepositorioVeiculoException;
    void atualizarVeiculo(Veiculo veiculo) throws VeiculoException, RepositorioVeiculoException;
    Veiculo pesquisarVeiculoPeloModelo (String veiculoModelo) throws VeiculoException, RepositorioVeiculoException;
    ArrayList<Veiculo> listarCarros() throws VeiculoException, RepositorioVeiculoException;
}
