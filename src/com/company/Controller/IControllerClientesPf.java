package com.company.Controller;

import com.company.Excecao.ClientePfException;
import com.company.Excecao.RepositorioClientePfException;
import com.company.model.ClientePf;

import java.util.ArrayList;

public interface IControllerClientesPf {
    void adicionarClientePf (ClientePf clientePf) throws ClientePfException, RepositorioClientePfException;
    void deletarClientePf (ClientePf clientePf) throws ClientePfException, RepositorioClientePfException;
    void atualizarClientePf (ClientePf clientePf) throws ClientePfException, RepositorioClientePfException;
    void validarCpf (ClientePf clientePf) throws ClientePfException, RepositorioClientePfException;
    ClientePf pesquisarClientePorNome (String nomeCliente) throws ClientePfException, RepositorioClientePfException;
    ClientePf pesquisarClientePorCpf (String cpfCliente) throws ClientePfException, RepositorioClientePfException;
    ArrayList<ClientePf> listarClientes() throws ClientePfException, RepositorioClientePfException;
}
