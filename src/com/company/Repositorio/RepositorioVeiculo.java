package com.company.Repositorio;

import com.company.Excecao.RepositorioVeiculoException;
import com.company.Excecao.VeiculoException;
import com.company.model.Veiculo;

import java.util.ArrayList;

public class RepositorioVeiculo implements IRepositorioVeiculo {
    private ArrayList<Veiculo> veiculoArrayList;
    private static RepositorioVeiculo instancia;

    public static RepositorioVeiculo getInstance() throws VeiculoException, RepositorioVeiculoException {
        if(instancia == null){
            instancia = new RepositorioVeiculo();
        }
        return instancia;
    }

    public RepositorioVeiculo() throws VeiculoException, RepositorioVeiculoException {
        this.veiculoArrayList = new ArrayList<>();
    }

    @Override
    public void adicionarVeiculo(Veiculo veiculo) throws VeiculoException, RepositorioVeiculoException {
        this.veiculoArrayList.add(veiculo);
    }

    @Override
    public void deletarVeiculo(Veiculo veiculo) throws VeiculoException, RepositorioVeiculoException {
        for (int i =0;i<this.veiculoArrayList.size(); i++){
            if (this.veiculoArrayList.get(i).equals(veiculo)){
                this.veiculoArrayList.remove(i);
                break;
            }
        }
        if (veiculo == null){
            throw  new RepositorioVeiculoException("Carro Não foi removido, Ele não foi encontrado na nossa Lista de carros cadastrados");
        }
    }

    @Override
    public void atualizarVeiculo(Veiculo veiculo) throws VeiculoException, RepositorioVeiculoException {
        for (int i =0;i<this.veiculoArrayList.size();i++){
            if (this.veiculoArrayList.get(i).equals(veiculo)){
                this.veiculoArrayList.set(i,veiculo);
                break;
            }
        }
        if (veiculo == null){
            throw new RepositorioVeiculoException("Carro Não foi atualizado, ELe nao foi encontrado na nossa lista de carros cadastrados");
        }
    }

    @Override
    public Veiculo pesquisarVeiculoPelaPlaca(String veiculoPlaca) throws VeiculoException, RepositorioVeiculoException {
     return null;
    }

    @Override
    public Veiculo pesquisarVeiculoPelaMarca(String veiculoMarca) throws VeiculoException, RepositorioVeiculoException {
        return  null;
    }

    @Override
    public ArrayList<Veiculo> listarCarros() throws VeiculoException, RepositorioVeiculoException {
        return this.veiculoArrayList;
    }
}
