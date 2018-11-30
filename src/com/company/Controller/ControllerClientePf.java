package com.company.Controller;

import com.company.Excecao.ClientePfException;
import com.company.Excecao.RepositorioClientePfException;
import com.company.Repositorio.RepositorioClientePf;
import com.company.model.ClientePf;

import java.util.ArrayList;

public class ControllerClientePf implements IControllerClientesPf {
    private static ControllerClientePf instancia;
    private RepositorioClientePf repositorioClientePf =  RepositorioClientePf.getInstance();

    public ControllerClientePf() throws ClientePfException, RepositorioClientePfException {

    }

    public static ControllerClientePf getInstance() throws ClientePfException, RepositorioClientePfException {
        if (instancia == null){
            instancia = new ControllerClientePf();
        }
        return instancia;
    }
    @Override
    public void adicionarClientePf(ClientePf clientePf) throws ClientePfException, RepositorioClientePfException {
        this.validarCpf(clientePf);
        this.repositorioClientePf.adicionarClientePf(clientePf);
    }

    @Override
    public void deletarClientePf(ClientePf clientePf) throws ClientePfException, RepositorioClientePfException {
        if(this.repositorioClientePf.pesquisarClientePorCpf(clientePf.getCpf()) == null){
            throw new ClientePfException("Impossivel deletar o Cliente, Cliente inexistente");
        }else{
            this.repositorioClientePf.deletarClientePf(clientePf);
        }
    }

    @Override
    public void atualizarClientePf(ClientePf clientePf) throws ClientePfException, RepositorioClientePfException {
        this.repositorioClientePf.atualizarClientePf(clientePf);

    }

    @Override
    public void validarCpf(ClientePf clientePf) throws ClientePfException, RepositorioClientePfException {
        if(clientePf.getCpf()==null){
            throw new ClientePfException("Por favor, Informe o CPF");
        }
    }

    @Override
    public ClientePf pesquisarClientePorNome(String nomeCliente) throws ClientePfException, RepositorioClientePfException {
        return this.repositorioClientePf.pesquisarClientePorNome(nomeCliente);

    }

    @Override
    public ClientePf pesquisarClientePorCpf(String cpfCliente) throws ClientePfException, RepositorioClientePfException {
        return this.repositorioClientePf.pesquisarClientePorCpf(cpfCliente);

    }

    @Override
    public ArrayList<ClientePf> listarClientes() throws ClientePfException, RepositorioClientePfException {
        return this.repositorioClientePf.listarClientes();

    }
}
