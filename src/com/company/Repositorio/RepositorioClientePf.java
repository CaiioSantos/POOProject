package com.company.Repositorio;

import com.company.Excecao.ClientePfException;
import com.company.Excecao.RepositorioClientePfException;
import com.company.model.ClientePf;

import java.util.ArrayList;

public class RepositorioClientePf implements IRepositorioCLientePf {
    private ArrayList<ClientePf> clientePfArrayList;
    private static RepositorioClientePf instancia;

    public static RepositorioClientePf getInstance() throws ClientePfException, RepositorioClientePfException {
        if (instancia ==null){
            instancia = new RepositorioClientePf();
        }

        return instancia;
    }

    public RepositorioClientePf() throws ClientePfException, RepositorioClientePfException {
        if(this.clientePfArrayList == null){
            this.clientePfArrayList = new ArrayList<>();
        }
    }
    @Override
    public void adicionarClientePf(ClientePf clientePf) throws ClientePfException, RepositorioClientePfException {
        this.clientePfArrayList.add(clientePf);
    }
    @Override
    public void deletarClientePf(ClientePf clientePf) throws ClientePfException, RepositorioClientePfException {
        for (int i=0; i< this.clientePfArrayList.size(); i++){
            if(this.clientePfArrayList.get(i).getCpf()== clientePf.getCpf()) {
                clientePfArrayList.remove(i);
            }
        }
        if (clientePf == null){
            throw new RepositorioClientePfException("Cliente Não foi removido, Ele não foi encontrado na nossa Lista de clientes.");
        }
    }
    @Override
    public void atualizarClientePf(ClientePf clientePf) throws ClientePfException, RepositorioClientePfException {
        for(int i =0; i<this.clientePfArrayList.size(); i++){
            if (this.clientePfArrayList.get(i).getNome().equals(clientePf)){
                this.clientePfArrayList.set(i, clientePf);
                break;
            }
        }
        if (clientePf == null){
            throw new RepositorioClientePfException("Cliente Não Atualizado, Ele não foi encontrado na nossa lista de clientes");
        }
    }
    @Override
    public ClientePf pesquisarClientePorNome(String clienteNome) throws ClientePfException, RepositorioClientePfException {
        ClientePf clientePf = null;
        for (int i = 0; i < this.clientePfArrayList.size(); i++) {
            if ((this.clientePfArrayList.get(i)).getNome().equals(clienteNome)){
                clientePf = this.clientePfArrayList.get(i);
                break;
            }
        }
        if (clientePf == null){
            throw new RepositorioClientePfException("Cliente não encontrado, o nome do cliente não existe na nossa lista de clientes ");
        }else {
            return clientePf;
        }
    }

    @Override
    public ClientePf pesquisarClientePorCpf(int clienteCpf) throws ClientePfException, RepositorioClientePfException {
        ClientePf  clientePf = null;

        for (int i=0; i<this.clientePfArrayList.size(); i++){
            if ((this.clientePfArrayList.get(i)).getCpf() == (clienteCpf)){
                clientePf = this.clientePfArrayList.get(i);
            }
        }
        if (clientePf == null){
            throw new RepositorioClientePfException("Cliente não encontrado, o CPF do cliente não existe na nossa lista de clientes");
        }else{
            return clientePf;
        }
    }

    @Override
    public ArrayList listarClientes() throws ClientePfException, RepositorioClientePfException {
        return this.clientePfArrayList;
    }


}
