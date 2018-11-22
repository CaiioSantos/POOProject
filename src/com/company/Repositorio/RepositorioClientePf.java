package com.company.Repositorio;

import com.company.Execao.ClientePfExeption;
import com.company.Execao.RepositorioClientePfExeption;
import com.company.model.ClientePf;

import java.util.ArrayList;

public class RepositorioClientePf {
    private ArrayList clientePfArrayList;
    private static RepositorioClientePf instancia;

    public static RepositorioClientePf getInstance() throws ClientePfExeption, RepositorioClientePfExeption {
        if (instancia ==null){
            instancia = new RepositorioClientePf();
        }

        return instancia;
    }

    public RepositorioClientePf() throws ClientePfExeption, RepositorioClientePfExeption{
        if(this.clientePfArrayList == null){
            this.clientePfArrayList = new ArrayList();
        }
    }

    public void inserirClientePf(ClientePf clientePf) throws ClientePfExeption,RepositorioClientePfExeption{
        this.clientePfArrayList.add(clientePf);
    }
    public void deletarClientePf(ClientePf clientePf) throws ClientePfExeption, RepositorioClientePfExeption{
        for (int i=0; i< this.clientePfArrayList.size(); i++){
            if(this.clientePfArrayList.get(i) == clientePf ){
                this.clientePfArrayList.set(i, clientePf);
                break;
            }
        }

        if (clientePf == null){
            throw new RepositorioClientePfExeption("Cliente Não foi removido, Ele nao foi encontrado na nossa Lista de clientes.");
        }
    }
}
