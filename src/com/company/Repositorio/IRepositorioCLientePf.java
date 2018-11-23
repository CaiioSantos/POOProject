package com.company.Repositorio;

import com.company.Execao.ClientePfExeption;
import com.company.Execao.RepositorioClientePfExeption;
import com.company.model.ClientePf;


import java.util.ArrayList;

public interface IRepositorioCLientePf {
    void adicionarClientePf   (ClientePf clientePf) throws ClientePfExeption, RepositorioClientePfExeption;
    void deletarClientePf   (ClientePf clientePf) throws ClientePfExeption, RepositorioClientePfExeption;
    void atualizarClientePf (ClientePf clientePf) throws ClientePfExeption, RepositorioClientePfExeption;
    ClientePf pesquisarClientePorNome (String clienteNome) throws  ClientePfExeption, RepositorioClientePfExeption;
    ClientePf pesquisarClientePorCpf  (String clienteCpf) throws  ClientePfExeption, RepositorioClientePfExeption;
    ArrayList<ClientePf> listarClientes() throws ClientePfExeption, RepositorioClientePfExeption;

}
