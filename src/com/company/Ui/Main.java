package com.company.Ui;

import com.company.Excecao.ClientePfException;
import com.company.Excecao.RepositorioClientePfException;
import com.company.Fachada.Fachada;
import com.company.Repositorio.IRepositorioCLientePf;
import com.company.model.ClientePf;


import java.util.Scanner;

public class Main {
    Scanner impu = new Scanner(System.in);
    public static void main(String[] args) throws ClientePfException, RepositorioClientePfException{
        Fachada fachada = Fachada.getInstance();

        showMenu();



    }

    private static void showMenu() {
        Scanner impu = new Scanner(System.in);
        System.out.println("Digite 1 para adicionar o cliente ou 2 para listar o cliente");
        int opcao = impu.nextInt();

        switch (opcao){
            case 1:


        }


    }
}