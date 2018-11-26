package com.company.Controller;

import com.company.Execao.LocarExeption;
import com.company.Execao.RepositorioLocarExeption;
import com.company.model.*;

import java.util.ArrayList;

public interface IControllerLocar {
    void locarCarroPf (Veiculo veiculo , ClientePf clientePf) throws LocarExeption, RepositorioLocarExeption;
    void devolverCarroLocadoPf (Veiculo veiculo, ClientePf clientePf) throws LocarExeption, RepositorioLocarExeption;
    void locarCarroPj (Veiculo veiculo, ClientePj clientePj) throws LocarExeption, RepositorioLocarExeption;
    void devolverCarroLocadoPj (Veiculo veiculo, ClientePj clientePj) throws LocarExeption, RepositorioLocarExeption;
    void precoLocacao (Locar locar) throws  LocarExeption, RepositorioLocarExeption;
    ArrayList<Locar> listarlocacoes () throws LocarExeption, RepositorioLocarExeption;
}
