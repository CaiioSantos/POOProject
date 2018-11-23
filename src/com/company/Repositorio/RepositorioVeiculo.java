package com.company.Repositorio;

import com.company.Execao.RepositorioVeiculoExeption;
import com.company.Execao.VeiculoExeption;
import com.company.model.Veiculo;

import java.util.ArrayList;

public class RepositorioVeiculo implements IRepositorioVeiculo {
    private ArrayList<Veiculo> veiculoArrayList;
    private static RepositorioVeiculo instancia;

    public static RepositorioVeiculo getInstance() throws VeiculoExeption, RepositorioVeiculoExeption{
        if(instancia == null){
            instancia = new RepositorioVeiculo();
        }
        return instancia;
    }

    public RepositorioVeiculo() throws VeiculoExeption, RepositorioVeiculoExeption{
        this.veiculoArrayList = new ArrayList<>();
    }

    @Override
    public void adicionarVeiculo(Veiculo veiculo) throws VeiculoExeption, RepositorioVeiculoExeption {
        this.veiculoArrayList.add(veiculo);
    }

    @Override
    public void deletarVeiculo(Veiculo veiculo) throws VeiculoExeption, RepositorioVeiculoExeption {
        for (int i =0;i<this.veiculoArrayList.size(); i++){
            if (this.veiculoArrayList.get(i) == veiculo){
                this.veiculoArrayList.remove(i);
                break;
            }
        }
        if (veiculo == null){
            throw  new RepositorioVeiculoExeption("Carro Não foi removido, Ele não foi encontrado na nossa Lista de carros cadastrados");
        }
    }

    @Override
    public void atualizarVeiculo(Veiculo veiculo) throws VeiculoExeption, RepositorioVeiculoExeption {
        for (int i =0;i<this.veiculoArrayList.size();i++){
            if (this.veiculoArrayList.get(i).equals(veiculo)){
                this.veiculoArrayList.set(i,veiculo);
                break;
            }
        }
        if (veiculo == null){
            throw new RepositorioVeiculoExeption("Carro Não foi atualizado, ELe nao foi encontrado na nossa lista de carros cadastrados");
        }
    }

    @Override
    public Veiculo pesquisarVeiculoPelaPlaca(String veiculoPlaca) throws VeiculoExeption, RepositorioVeiculoExeption {
        Veiculo veiculo = null;
        for (int i =0;i<this.veiculoArrayList.size();i++){
            if (((Veiculo) this.veiculoArrayList.get(i)).getPlaca().equals(veiculoPlaca)){
                veiculo = (Veiculo)this.veiculoArrayList.get(i);
            }
        }
        if (veiculo == null){
            throw new RepositorioVeiculoExeption("Carro não encontrado, ele não foi encontrado na nossa lista de carros cadastrados");
        }else{
            return veiculo;
        }
    }

    @Override
    public Veiculo pesquisarVeiculoPelaMarca(String veiculoMarca) throws VeiculoExeption, RepositorioVeiculoExeption {
        Veiculo veiculo = null;
        for (int i=0;i<this.veiculoArrayList.size(); i++){
            if(((Veiculo)this.veiculoArrayList.get(i)).getMarca().equals(veiculoMarca)){
                veiculo = (Veiculo)this.veiculoArrayList.get(i);
            }
        }
        if (veiculo == null){
            throw new RepositorioVeiculoExeption("Carro não encontrado, ele não foi encontrado na nossa lista de carros cadastrados");
        }else {
            return veiculo;
        }
    }

    @Override
    public ArrayList<Veiculo> listarCarros() throws VeiculoExeption, RepositorioVeiculoExeption {
        return this.veiculoArrayList;
    }
}
