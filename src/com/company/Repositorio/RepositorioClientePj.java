package com.company.Repositorio;

import com.company.Excecao.ClientePjException;
import com.company.Excecao.RepositorioClientePjException;
import com.company.model.ClientePj;

import java.util.ArrayList;

public class RepositorioClientePj implements IRepositorioClientePj {
    private ArrayList<ClientePj> clientePjArrayList;
    private static RepositorioClientePj instancia;

    public static RepositorioClientePj getInstance() throws ClientePjException, RepositorioClientePjException {
        if (instancia == null){
            instancia = new RepositorioClientePj();
        }
        return instancia;
    }
    public RepositorioClientePj() throws ClientePjException, RepositorioClientePjException {
        if (this.clientePjArrayList ==null){
            this.clientePjArrayList= new ArrayList<>();

        }
    }

    @Override
    public void adicionarClientePj(ClientePj clientePj) throws ClientePjException, RepositorioClientePjException {
        this.clientePjArrayList.add(clientePj);
    }

    @Override
    public void deletarClientePj(ClientePj clientePj) throws ClientePjException, RepositorioClientePjException {
        for (int i =0; i<this.clientePjArrayList.size(); i++){
            if (this.clientePjArrayList.get(i).equals(clientePj)){
                this.clientePjArrayList.remove(i);
                break;
            }
        }
        if (clientePj == null){
            throw new RepositorioClientePjException("Cliente Não foi removido, Ele não foi encontrado na nossa Lista de clientes.");

        }
    }

    @Override
    public void atualizarClientePj(ClientePj clientePj) throws ClientePjException, RepositorioClientePjException {
        for (int i =0; i<this.clientePjArrayList.size(); i++){
            if (this.clientePjArrayList.get(i).equals(clientePj)){
                this.clientePjArrayList.set(i,clientePj);
                break;
            }
        }
        if (clientePj == null){
            throw new RepositorioClientePjException("Cliente Não Atualizado, Ele não foi encontrado na nossa lista de clientes");
        }
    }

    @Override
    public ClientePj pesquisarClientePorNome(String clientePjNome) throws ClientePjException, RepositorioClientePjException {
        return null;
    }

    @Override
    public ClientePj pesquisarClientePorCnpj(String clientePjCnpj) throws ClientePjException, RepositorioClientePjException {
        return null;
    }


    @Override
    public ArrayList<ClientePj> listarClientes() throws ClientePjException, RepositorioClientePjException {
        return this.clientePjArrayList;
    }

}
