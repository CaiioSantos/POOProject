package com.company.Repositorio;

import com.company.Execao.ClientePjExeption;
import com.company.Execao.RepositorioClientePjExeption;
import com.company.model.ClientePj;

import java.util.ArrayList;

public class RepositorioClientePj implements IRepositorioClientePj {
    private ArrayList<ClientePj> clientePjArrayList;
    private static RepositorioClientePj instancia;

    public static RepositorioClientePj getInstance() throws ClientePjExeption, RepositorioClientePjExeption{
        if (instancia == null){
            instancia = new RepositorioClientePj();
        }
        return instancia;
    }
    public RepositorioClientePj() throws ClientePjExeption, RepositorioClientePjExeption{
        if (this.clientePjArrayList ==null){
            this.clientePjArrayList= new ArrayList<>();

        }
    }

    @Override
    public void adicionarClientePj(ClientePj clientePj) throws ClientePjExeption, RepositorioClientePjExeption {
        this.clientePjArrayList.add(clientePj);
    }

    @Override
    public void deletarClientePj(ClientePj clientePj) throws ClientePjExeption, RepositorioClientePjExeption {
        for (int i =0; i<this.clientePjArrayList.size(); i++){
            if (this.clientePjArrayList.get(i).equals(clientePj)){
                this.clientePjArrayList.remove(i);
                break;
            }
        }
        if (clientePj == null){
            throw new RepositorioClientePjExeption("Cliente Não foi removido, Ele não foi encontrado na nossa Lista de clientes.");

        }
    }

    @Override
    public void atualizarClientePj(ClientePj clientePj) throws ClientePjExeption, RepositorioClientePjExeption {
        for (int i =0; i<this.clientePjArrayList.size(); i++){
            if (this.clientePjArrayList.get(i).equals(clientePj)){
                this.clientePjArrayList.set(i,clientePj);
                break;
            }
        }
        if (clientePj == null){
            throw new RepositorioClientePjExeption("Cliente Não Atualizado, Ele não foi encontrado na nossa lista de clientes");
        }
    }


    @Override
    public ClientePj pesquisarClientePorNome(String clientePjNome) throws ClientePjExeption, RepositorioClientePjExeption {
        ClientePj clientePj = null;
        for (int i = 0; i < this.clientePjArrayList.size(); i++) {
            if (((ClientePj) this.clientePjArrayList.get(i)).getNomeCliente().equals(clientePjNome)) {
                clientePj = (ClientePj) this.clientePjArrayList.get(i);

            }
        }
        if (clientePj == null) {
            throw new RepositorioClientePjExeption("Cliente Não encontrado, o Nome não foi encontrado na nossa lista de clientes");
        }else{
            return  clientePj;
        }
    }

    @Override
    public ClientePj pesquisarClientePorCnpj(String clientePjCnpj) throws ClientePjExeption, RepositorioClientePjExeption {
        ClientePj clientePj = null;
        for (int i =0; i<this.clientePjArrayList.size(); i++){
            if (((ClientePj) this.clientePjArrayList.get(i)).getNomeCliente().equals(clientePjCnpj)){
                clientePj = (ClientePj)this.clientePjArrayList.get(i);
                break;

            }
        }
        if (clientePj == null){
            throw  new RepositorioClientePjExeption("Cliente Não encontrado, o CNPJ não foi encontrado na nossa lista de clientes");
        }else{
            return clientePj;
        }
    }

    @Override
    public ArrayList<ClientePj> listarClientes() throws ClientePjExeption, RepositorioClientePjExeption {
        return this.clientePjArrayList;
    }

}
