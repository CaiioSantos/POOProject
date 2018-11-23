package com.company.Repositorio;

import com.company.Execao.RepositorioVeiculoExeption;
import com.company.Execao.VeiculoExeption;
import com.company.model.Veiculo;

import java.util.ArrayList;

public interface IRepositorioVeiculo {
    void adicionarVeiculo (Veiculo veiculo) throws VeiculoExeption, RepositorioVeiculoExeption;
    void deletarVeiculo (Veiculo veiculo) throws VeiculoExeption, RepositorioVeiculoExeption;
    void atualizarVeiculo(Veiculo veiculo) throws  VeiculoExeption,RepositorioVeiculoExeption;
    Veiculo pesquisarVeiculoPelaPlaca (String veiculoPlaca) throws VeiculoExeption,RepositorioVeiculoExeption;
    Veiculo pesquisarVeiculoPelaMarca (String veiculoMarca) throws VeiculoExeption,RepositorioVeiculoExeption;
    ArrayList<Veiculo> listarCarros() throws VeiculoExeption,RepositorioVeiculoExeption;
}
