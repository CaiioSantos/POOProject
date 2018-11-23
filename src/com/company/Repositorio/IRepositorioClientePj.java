package com.company.Repositorio;

import com.company.Execao.ClientePjExeption;
import com.company.Execao.RepositorioClientePjExeption;
import com.company.model.ClientePj;

import java.util.ArrayList;

public interface IRepositorioClientePj {
    void adicionarClientePj   (ClientePj obj) throws ClientePjExeption, RepositorioClientePjExeption;
    void deletarClientePj   (ClientePj obj) throws ClientePjExeption, RepositorioClientePjExeption;
    void atualizarClientePj (ClientePj obj) throws ClientePjExeption, RepositorioClientePjExeption;
    ClientePj pesquisarClientePorNome (String clientePjNome) throws  ClientePjExeption, RepositorioClientePjExeption;
    ClientePj pesquisarClientePorCnpj  (String clientePjCnpj) throws  ClientePjExeption, RepositorioClientePjExeption;
    ArrayList<ClientePj> listarClientes() throws ClientePjExeption, RepositorioClientePjExeption;

}
