package com.company.Controller;

import com.company.Execao.ClientePjExeption;
import com.company.Execao.RepositorioClientePjExeption;
import com.company.Repositorio.RepositorioClientePj;
import com.company.model.ClientePj;

import java.util.ArrayList;

public class ControllerClientePj implements IControllerClientePj {
    private static ControllerClientePj instancia;
    private RepositorioClientePj repositorioClientePj =  RepositorioClientePj.getInstance();


    public ControllerClientePj() throws ClientePjExeption, RepositorioClientePjExeption{

    }

    public static ControllerClientePj getInstance() throws ClientePjExeption, RepositorioClientePjExeption{
        if (instancia == null){
            instancia = new ControllerClientePj();
        }
        return instancia;
    }

    @Override
    public void adicionarClientePj(ClientePj clientePj) throws ClientePjExeption, RepositorioClientePjExeption {
        this.validarCnpj(clientePj);
        this.repositorioClientePj.adicionarClientePj(clientePj);
    }

    @Override
    public void deletarClientePj(ClientePj clientePj) throws ClientePjExeption, RepositorioClientePjExeption {
        if(this.repositorioClientePj.pesquisarClientePorCnpj(clientePj.getCnpj()) == null){
            throw new ClientePjExeption("Impossivel deletar o Cliente, Cliente inexistente");
        }else{
            this.repositorioClientePj.deletarClientePj(clientePj);
        }
    }


    @Override
    public void atualizarClientePj(ClientePj clientePj) throws ClientePjExeption, RepositorioClientePjExeption {
        this.repositorioClientePj.atualizarClientePj(clientePj);

    }

    @Override
    public void validarCnpj(ClientePj clientePj) throws ClientePjExeption, RepositorioClientePjExeption {
        if(clientePj.getCnpj()==null){
            throw new ClientePjExeption("Por favor, Informe o Cnpj da enpresa");
        }
    }

    @Override
    public ClientePj pesquisarClientePorNome(String nomeCliente) throws ClientePjExeption, RepositorioClientePjExeption {
        return this.repositorioClientePj.pesquisarClientePorNome(nomeCliente);

    }

    @Override
    public ClientePj pesquisarClientePorCnpj(String cnpjCliente) throws ClientePjExeption, RepositorioClientePjExeption {
        return this.repositorioClientePj.pesquisarClientePorCnpj(cnpjCliente);

    }

    @Override
    public ArrayList<ClientePj> listarClientes() throws ClientePjExeption, RepositorioClientePjExeption {
        return this.repositorioClientePj.listarClientes();

    }
}
