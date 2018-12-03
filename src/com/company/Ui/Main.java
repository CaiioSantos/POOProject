package com.company.Ui;

import com.company.Controller.ControllerClientePf;
import com.company.Excecao.ClientePfException;
import com.company.Excecao.RepositorioClientePfException;
import com.company.Fachada.Fachada;
import com.company.Repositorio.IRepositorioCLientePf;
import com.company.Repositorio.RepositorioClientePf;
import com.company.model.ClientePf;


import java.util.ArrayList;
import java.util.Scanner;

public class Main  {
    static Scanner input = new Scanner(System.in);
    private  RepositorioClientePf repositorioClientePf;

    public static void main(String[] args) throws ClientePfException, RepositorioClientePfException{
        Fachada fachada = Fachada.getInstance();
        int menuPrincipal;
        System.out.println("Digite 1 para cadastro de pessoa fisica");
        menuPrincipal = input.nextInt();
        while (menuPrincipal !=0) {
            switch (menuPrincipal) {
                case 1:
                    showMenuPf(fachada);

            }
        }
    }
    private static void showMenuPf(Fachada fachada) throws ClientePfException, RepositorioClientePfException {
        ClientePf clientePf = new ClientePf("", "", "");
        System.out.println("Digite 1 para adicionar cliente \n Digite 2 para listar o clientes \n Digite 3 para excluir cliente \n Ditite 4 para atualizar clientes");
        int opcao;
        do {
            opcao = input.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do cliente a ser adicionado");
                    clientePf.setNome(input.next());
                    System.out.println("Digite o cpf");
                    clientePf.setCpf(input.next());
                    System.out.println("Digite o Tipo da Cnh");
                    clientePf.setCnhTipo(input.next());
                    try {
                        fachada.adicionarClientePf(clientePf);
                    } catch (ClientePfException | RepositorioClientePfException e) {
                        e.getMessage();
                    }
                    showMenuPf(fachada);
                    break;
                case 2:
                listarClientesPf(fachada.listarClientes());
                showMenuPf(fachada);
                    break;
                case 3:
                    System.out.println("Digite o cpf do Cliente a ser deletado");
                    clientePf.setCpf(input.next());
                    try {
                        fachada.deletarClientePf(clientePf);
                    }catch (ClientePfException| RepositorioClientePfException textExeption){
                        textExeption.getMessage();
                    }
                    showMenuPf(fachada);
                    break;
                case 4:
                    System.out.println("Digite o nome do cliente para atualizar cadastro");
                        clientePf.setNome(input.next());
                    System.out.println("Digite a atualização do tipo de CNH");
                        clientePf.setCnhTipo(input.next());
                        try {
                            fachada.atualizarClientePf(clientePf);
                        }catch (ClientePfException | RepositorioClientePfException e){
                            e.printStackTrace();
                        }
                    showMenuPf(fachada);
                        break;
            }
        }while (opcao !=0);
    }
    private static void listarClientesPf (ArrayList<ClientePf> clientePfArrayList){
        if (clientePfArrayList != null){
            for (int i =0; i< clientePfArrayList.size(); i++){
                System.out.println("Nome : " + clientePfArrayList.get(i).getNome() + "\nCPF: "+ clientePfArrayList.get(i).getCpf() +
                        "\n - Tipo CNH " + clientePfArrayList.get(i).getCnhTipo());
            }
        }
    }
}