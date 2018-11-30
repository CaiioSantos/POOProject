package com.company.Controller;

import com.company.Excecao.ClientePjException;
import com.company.Excecao.RepositorioClientePjException;
import com.company.model.ClientePj;

import java.util.ArrayList;

public interface IControllerClientePj {
    void adicionarClientePj (ClientePj clientePj) throws ClientePjException, RepositorioClientePjException;
    void deletarClientePj (ClientePj clientePj) throws ClientePjException, RepositorioClientePjException;
    void atualizarClientePj (ClientePj clientePj) throws ClientePjException, RepositorioClientePjException;
    void validarCnpj (ClientePj clientePj) throws ClientePjException, RepositorioClientePjException;
    ClientePj pesquisarClientePorNome (String nomeCliente) throws ClientePjException, RepositorioClientePjException;
    ClientePj pesquisarClientePorCnpj (String cnpjCliente) throws ClientePjException, RepositorioClientePjException;
    ArrayList<ClientePj> listarClientes() throws ClientePjException, RepositorioClientePjException;
}
