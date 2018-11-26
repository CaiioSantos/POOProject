package com.company.Controller;

import com.company.Execao.ClientePjExeption;
import com.company.Execao.RepositorioClientePjExeption;
import com.company.model.ClientePj;

import java.util.ArrayList;

public interface IControllerClientePj {
    void adicionarClientePj (ClientePj clientePj) throws ClientePjExeption, RepositorioClientePjExeption;
    void deletarClientePj (ClientePj clientePj) throws  ClientePjExeption, RepositorioClientePjExeption;
    void atualizarClientePj (ClientePj clientePj) throws  ClientePjExeption, RepositorioClientePjExeption;
    void validarCnpj (ClientePj clientePj) throws  ClientePjExeption, RepositorioClientePjExeption;
    ClientePj pesquisarClientePorNome (String nomeCliente) throws ClientePjExeption, RepositorioClientePjExeption;
    ClientePj pesquisarClientePorCnpj (String cnpjCliente) throws  ClientePjExeption, RepositorioClientePjExeption;
    ArrayList<ClientePj> listarClientes() throws  ClientePjExeption, RepositorioClientePjExeption;
}
