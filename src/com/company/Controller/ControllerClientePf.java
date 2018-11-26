package com.company.Controller;

import com.company.Execao.ClientePfExeption;
import com.company.Execao.RepositorioClientePfExeption;
import com.company.Repositorio.RepositorioClientePf;
import com.company.model.ClientePf;

import java.util.ArrayList;

public class ControllerClientePf implements IControllerClientesPf {
    private static ControllerClientePf instancia;
    private RepositorioClientePf repositorioClientePf =  RepositorioClientePf.getInstance();

    public ControllerClientePf() throws ClientePfExeption, RepositorioClientePfExeption{

    }

    public static ControllerClientePf getInstance() throws ClientePfExeption, RepositorioClientePfExeption{
        if (instancia == null){
            instancia = new ControllerClientePf();
        }
        return instancia;
    }
    @Override
    public void adicionarClientePf(ClientePf clientePf) throws ClientePfExeption, RepositorioClientePfExeption {
        this.validarCpf(clientePf);
        this.repositorioClientePf.adicionarClientePf(clientePf);
    }

    @Override
    public void deletarClientePf(ClientePf clientePf) throws ClientePfExeption, RepositorioClientePfExeption {
        if(this.repositorioClientePf.pesquisarClientePorCpf(clientePf.getCpf()) == null){
            throw new ClientePfExeption("Impossivel deletar o Cliente, Cliente inexistente");
        }else{
            this.repositorioClientePf.deletarClientePf(clientePf);
        }
    }

    @Override
    public void atualizarClientePf(ClientePf clientePf) throws ClientePfExeption, RepositorioClientePfExeption {
        this.repositorioClientePf.atualizarClientePf(clientePf);

    }

    @Override
    public void validarCpf(ClientePf clientePf) throws ClientePfExeption, RepositorioClientePfExeption {
        if(clientePf.getCpf()==null){
            throw new ClientePfExeption("Por favor, Informe o CPF");
        }
    }

    @Override
    public ClientePf pesquisarClientePorNome(String nomeCliente) throws ClientePfExeption, RepositorioClientePfExeption {
        return this.repositorioClientePf.pesquisarClientePorNome(nomeCliente);

    }

    @Override
    public ClientePf pesquisarClientePorCpf(String cpfCliente) throws ClientePfExeption, RepositorioClientePfExeption {
        return this.repositorioClientePf.pesquisarClientePorCpf(cpfCliente);

    }

    @Override
    public ArrayList<ClientePf> listarClientes() throws ClientePfExeption, RepositorioClientePfExeption {
        return this.repositorioClientePf.listarClientes();

    }
}
