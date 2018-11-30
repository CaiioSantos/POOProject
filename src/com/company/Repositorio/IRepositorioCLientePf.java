package com.company.Repositorio;

import com.company.Excecao.ClientePfException;
import com.company.Excecao.RepositorioClientePfException;
import com.company.model.ClientePf;


import java.util.ArrayList;

public interface IRepositorioCLientePf {
    void adicionarClientePf   (ClientePf clientePf) throws ClientePfException, RepositorioClientePfException;
    void deletarClientePf   (ClientePf clientePf) throws ClientePfException, RepositorioClientePfException;
    void atualizarClientePf (ClientePf clientePf) throws ClientePfException, RepositorioClientePfException;
    ClientePf pesquisarClientePorNome (String clienteNome) throws ClientePfException, RepositorioClientePfException;
    ClientePf pesquisarClientePorCpf  (String clienteCpf) throws ClientePfException, RepositorioClientePfException;
    ArrayList listarClientes() throws ClientePfException, RepositorioClientePfException;

}
