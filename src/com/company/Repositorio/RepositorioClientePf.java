package com.company.Repositorio;

import com.company.Execao.ClientePfExeption;
import com.company.Execao.RepositorioClientePfExeption;
import com.company.model.ClientePf;

import java.util.ArrayList;

public class RepositorioClientePf implements IRepositorioCLientePf {
    private ArrayList<ClientePf> clientePfArrayList;
    private static RepositorioClientePf instancia;

    public static RepositorioClientePf getInstance() throws ClientePfExeption, RepositorioClientePfExeption {
        if (instancia ==null){
            instancia = new RepositorioClientePf();
        }

        return instancia;
    }

    public RepositorioClientePf() throws ClientePfExeption, RepositorioClientePfExeption{
        if(this.clientePfArrayList == null){
            this.clientePfArrayList = new ArrayList<>();
        }
    }
    @Override
    public void adicionarClientePf(ClientePf clientePf) throws ClientePfExeption, RepositorioClientePfExeption {
        this.clientePfArrayList.add(clientePf);
    }
    @Override
    public void deletarClientePf(ClientePf clientePf) throws ClientePfExeption, RepositorioClientePfExeption {
        for (int i=0; i< this.clientePfArrayList.size(); i++){
            if(this.clientePfArrayList.get(i).equals(clientePf)) {
                this.clientePfArrayList.set(i, clientePf);
                break;
            }
        }
        if (clientePf == null){
            throw new RepositorioClientePfExeption("Cliente Não foi removido, Ele não foi encontrado na nossa Lista de clientes.");
        }
    }
    @Override
    public void atualizarClientePf(ClientePf clientePf) throws ClientePfExeption, RepositorioClientePfExeption {
        for(int i =0; i<this.clientePfArrayList.size(); i++){
            if (this.clientePfArrayList.get(i).equals(clientePf)){
                this.clientePfArrayList.set(i, clientePf);
                break;
            }
        }
        if (clientePf == null){
            throw new RepositorioClientePfExeption("Cliente Não Atualizado, Ele não foi encontrado na nossa lista de clientes");
        }
    }
    @Override
    public ClientePf pesquisarClientePorNome(String clienteNome) throws ClientePfExeption, RepositorioClientePfExeption {
        ClientePf clientePf = null;
        for (int i = 0; i < this.clientePfArrayList.size(); i++) {
            if ((this.clientePfArrayList.get(i)).getNomeCliente().equals(clienteNome)){
                clientePf = this.clientePfArrayList.get(i);
                break;
            }
        }
        if (clientePf == null){
            throw new RepositorioClientePfExeption("Cliente não encontrado, o nome do cliente não existe na nossa lista de clientes ");
        }else {
            return clientePf;
        }
    }

    @Override
    public ClientePf pesquisarClientePorCpf(String clienteCpf) throws ClientePfExeption, RepositorioClientePfExeption {
        ClientePf  clientePf = null;

        for (int i=0; i<this.clientePfArrayList.size(); i++){
            if ((this.clientePfArrayList.get(i)).getCpf().equals(clienteCpf)){
                clientePf = this.clientePfArrayList.get(i);
            }
        }
        if (clientePf == null){
            throw new RepositorioClientePfExeption("Cliente não encontrado, o CPF do cliente não existe na nossa lista de clientes");
        }else{
            return clientePf;
        }
    }



    @Override
    public ArrayList listarClientes() throws ClientePfExeption, RepositorioClientePfExeption {
        return this.clientePfArrayList;
    }


}
