package com.company.Repositorio;

import com.company.Execao.ClientePfExeption;
import com.company.Execao.RepositorioClientePfExeption;
import com.company.model.ClientePf;


import java.util.ArrayList;

public interface IRepositorioCLientePf {
    void inserirClientePf   (ClientePf obj) throws ClientePfExeption, RepositorioClientePfExeption;
    void deletarClientePf   (ClientePf obj) throws ClientePfExeption, RepositorioClientePfExeption;
    void atualizarClientePf (ClientePf obj) throws ClientePfExeption, RepositorioClientePfExeption;
    ClientePf pesquisarClientePorNome (String clienteNome) throws  ClientePfExeption, RepositorioClientePfExeption;
    ClientePf pesquisarClientePorCpf  (String clienteCpf) throws  ClientePfExeption, RepositorioClientePfExeption;
    ArrayList<ClientePf> listarClientes() throws ClientePfExeption, RepositorioClientePfExeption;

}
