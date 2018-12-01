package com.company.Fachada;

import com.company.Controller.ControllerClientePf;
import com.company.Controller.IControllerClientesPf;
import com.company.Excecao.ClientePfException;
import com.company.Excecao.RepositorioClientePfException;
import com.company.model.ClientePf;

import java.util.ArrayList;

public class Fachada implements IControllerClientesPf {
    private static Fachada instancia;
    private IControllerClientesPf iControllerClientesPf = ControllerClientePf.getInstance();
    private IControllerClientesPf controllerClientesPf;
    public static Fachada getInstance() throws ClientePfException, RepositorioClientePfException {
       if (instancia == null){
        instancia= new Fachada();
       }
        return instancia;
    }
    private Fachada() throws ClientePfException,RepositorioClientePfException{
        controllerClientesPf = ControllerClientePf.getInstance();
    }

    @Override
    public void adicionarClientePf(ClientePf clientePf) throws ClientePfException, RepositorioClientePfException {
        this.controllerClientesPf.adicionarClientePf(clientePf);
    }

    @Override
    public void deletarClientePf(ClientePf clientePf) throws ClientePfException, RepositorioClientePfException {

    }

    @Override
    public void atualizarClientePf(ClientePf clientePf) throws ClientePfException, RepositorioClientePfException {

    }

    @Override
    public void validarCpf(ClientePf clientePf) throws ClientePfException, RepositorioClientePfException {

    }

    @Override
    public ClientePf pesquisarClientePorNome(String nomeCliente) throws ClientePfException, RepositorioClientePfException {
        return null;
    }

    @Override
    public ClientePf pesquisarClientePorCpf(String cpfCliente) throws ClientePfException, RepositorioClientePfException {
        return null;
    }

    @Override
    public ArrayList<ClientePf> listarClientes() throws ClientePfException, RepositorioClientePfException {
        return this.controllerClientesPf.listarClientes();
    }
}
