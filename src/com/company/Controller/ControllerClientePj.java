package com.company.Controller;

import com.company.Excecao.ClientePjException;
import com.company.Excecao.RepositorioClientePjException;
import com.company.Repositorio.RepositorioClientePj;
import com.company.model.ClientePj;

import java.util.ArrayList;

public class ControllerClientePj implements IControllerClientePj {
    private static ControllerClientePj instancia;
    private RepositorioClientePj repositorioClientePj =  RepositorioClientePj.getInstance();


    public ControllerClientePj() throws ClientePjException, RepositorioClientePjException {

    }

    public static ControllerClientePj getInstance() throws ClientePjException, RepositorioClientePjException {
        if (instancia == null){
            instancia = new ControllerClientePj();
        }
        return instancia;
    }

    @Override
    public void adicionarClientePj(ClientePj clientePj) throws ClientePjException, RepositorioClientePjException {
        this.validarCnpj(clientePj);
        this.repositorioClientePj.adicionarClientePj(clientePj);
    }

    @Override
    public void deletarClientePj(ClientePj clientePj) throws ClientePjException, RepositorioClientePjException {
        if(this.repositorioClientePj.pesquisarClientePorCnpj(clientePj.getCnpj()) == null){
            throw new ClientePjException("Impossivel deletar o Cliente, Cliente inexistente");
        }else{
            this.repositorioClientePj.deletarClientePj(clientePj);
        }
    }


    @Override
    public void atualizarClientePj(ClientePj clientePj) throws ClientePjException, RepositorioClientePjException {
        this.repositorioClientePj.atualizarClientePj(clientePj);

    }

    @Override
    public void validarCnpj(ClientePj clientePj) throws ClientePjException, RepositorioClientePjException {
        if(clientePj.getCnpj()==null){
            throw new ClientePjException("Por favor, Informe o Cnpj da enpresa");
        }
    }

    @Override
    public ClientePj pesquisarClientePorNome(String nomeCliente) throws ClientePjException, RepositorioClientePjException {
        return this.repositorioClientePj.pesquisarClientePorNome(nomeCliente);

    }

    @Override
    public ClientePj pesquisarClientePorCnpj(String cnpjCliente) throws ClientePjException, RepositorioClientePjException {
        return this.repositorioClientePj.pesquisarClientePorCnpj(cnpjCliente);

    }

    @Override
    public ArrayList<ClientePj> listarClientes() throws ClientePjException, RepositorioClientePjException {
        return this.repositorioClientePj.listarClientes();

    }
}
