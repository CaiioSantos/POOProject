package com.company.Controller;

import com.company.Execao.ClientePfExeption;
import com.company.Execao.RepositorioClientePfExeption;
import com.company.model.Cliente;
import com.company.model.ClientePf;

import java.util.ArrayList;

public interface IControllerClientesPf {
    void adicionarClientePf (ClientePf clientePf) throws ClientePfExeption, RepositorioClientePfExeption;
    void deletarClientePf (ClientePf clientePf) throws  ClientePfExeption, RepositorioClientePfExeption;
    void atualizarClientePf (ClientePf clientePf) throws  ClientePfExeption, RepositorioClientePfExeption;
    void validarCpf (ClientePf clientePf) throws  ClientePfExeption, RepositorioClientePfExeption;
    ClientePf pesquisarClientePorNome (String nomeCliente) throws ClientePfExeption, RepositorioClientePfExeption;
    ClientePf pesquisarClientePorCpf (int cpfCliente) throws  ClientePfExeption, RepositorioClientePfExeption;
    ArrayList<ClientePf> listarClientes() throws  ClientePfExeption, RepositorioClientePfExeption;
}
