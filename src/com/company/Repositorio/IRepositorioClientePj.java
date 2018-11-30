package com.company.Repositorio;

import com.company.Excecao.ClientePjException;
import com.company.Excecao.RepositorioClientePjException;
import com.company.model.ClientePj;

import java.util.ArrayList;

public interface IRepositorioClientePj {
    void adicionarClientePj   (ClientePj clientePj) throws ClientePjException, RepositorioClientePjException;
    void deletarClientePj   (ClientePj clientePj) throws ClientePjException, RepositorioClientePjException;
    void atualizarClientePj (ClientePj clientePj) throws ClientePjException, RepositorioClientePjException;
    ClientePj pesquisarClientePorNome (String clientePjNome) throws ClientePjException, RepositorioClientePjException;
    ClientePj pesquisarClientePorCnpj  (String clientePjCnpj) throws ClientePjException, RepositorioClientePjException;
    ArrayList<ClientePj> listarClientes() throws ClientePjException, RepositorioClientePjException;

}
