package com.company.Controller;

import com.company.Excecao.LocarException;
import com.company.Excecao.RepositorioLocarException;
import com.company.model.*;

import java.util.ArrayList;

public interface IControllerLocar {
    void locarCarroPf (Veiculo veiculo , ClientePf clientePf) throws LocarException, RepositorioLocarException;
    void devolverCarroLocadoPf (Veiculo veiculo, ClientePf clientePf) throws LocarException, RepositorioLocarException;
    void locarCarroPj (Veiculo veiculo, ClientePj clientePj) throws LocarException, RepositorioLocarException;
    void devolverCarroLocadoPj (Veiculo veiculo, ClientePj clientePj) throws LocarException, RepositorioLocarException;
    void precoLocacao (Locar locar) throws LocarException, RepositorioLocarException;
    ArrayList<Locar> listarlocacoes () throws LocarException, RepositorioLocarException;
}
