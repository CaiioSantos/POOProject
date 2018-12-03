package com.company.Fachada;

import com.company.Controller.ControllerClientePf;
import com.company.Controller.ControllerVeiculo;
import com.company.Controller.IControllerClientesPf;
import com.company.Controller.IControllerVeiculo;
import com.company.Excecao.ClientePfException;
import com.company.Excecao.RepositorioClientePfException;
import com.company.Excecao.RepositorioVeiculoException;
import com.company.Excecao.VeiculoException;
import com.company.model.ClientePf;
import com.company.model.Veiculo;

import java.util.ArrayList;

public class Fachada implements IControllerClientesPf, IControllerVeiculo {
    private static Fachada instancia;
    private IControllerVeiculo iControllerVeiculo = ControllerVeiculo.getInstance();
    private IControllerClientesPf iControllerClientesPf = ControllerClientePf.getInstance();
    private IControllerClientesPf controllerClientesPf;
    private IControllerVeiculo controllerVeiculo;



    public static Fachada getInstance() throws ClientePfException, RepositorioClientePfException, VeiculoException, RepositorioVeiculoException {
       if (instancia == null){
        instancia= new Fachada();
       }
        return instancia;
    }
    private Fachada() throws ClientePfException, RepositorioClientePfException, VeiculoException, RepositorioVeiculoException {
        controllerClientesPf = ControllerClientePf.getInstance();
    }

    @Override
    public void adicionarClientePf(ClientePf clientePf) throws ClientePfException, RepositorioClientePfException {
        this.controllerClientesPf.adicionarClientePf(clientePf);
    }

    @Override
    public void deletarClientePf(ClientePf clientePf) throws ClientePfException, RepositorioClientePfException {
        this.controllerClientesPf.deletarClientePf(clientePf);
    }

    @Override
    public void atualizarClientePf(ClientePf clientePf) throws ClientePfException, RepositorioClientePfException {
            this.controllerClientesPf.atualizarClientePf(clientePf);
    }

    @Override
    public void validarCpf(ClientePf clientePf) throws ClientePfException, RepositorioClientePfException {
            this.controllerClientesPf.validarCpf(clientePf);
    }

    @Override
    public ClientePf pesquisarClientePorNome(String nomeCliente) throws ClientePfException, RepositorioClientePfException {
        return this.controllerClientesPf.pesquisarClientePorNome(nomeCliente);
    }

    @Override
    public ClientePf pesquisarClientePorCpf(int cpfCliente) throws ClientePfException, RepositorioClientePfException {
        return this.controllerClientesPf.pesquisarClientePorCpf(cpfCliente);
    }

    @Override
    public ArrayList<ClientePf> listarClientes() throws ClientePfException, RepositorioClientePfException {
        return this.controllerClientesPf.listarClientes();
    }

    // --------------------------- Metodos relacionados a Veiculo-------------------------------------//

    @Override
    public void adicionarVeiculo(Veiculo veiculo) throws VeiculoException, RepositorioVeiculoException {
        this.controllerVeiculo.adicionarVeiculo(veiculo);
    }

    @Override
    public void deletarVeiculo(Veiculo veiculo) throws VeiculoException, RepositorioVeiculoException {
        this.controllerVeiculo.deletarVeiculo(veiculo);
    }

    @Override
    public void atualizarVeiculo(Veiculo veiculo) throws VeiculoException, RepositorioVeiculoException {
        this.controllerVeiculo.atualizarVeiculo(veiculo);
    }


    @Override
    public Veiculo pesquisarVeiculoPeloModelo(String veiculoModelo) throws VeiculoException, RepositorioVeiculoException {
        return this.controllerVeiculo.pesquisarVeiculoPeloModelo(veiculoModelo);
    }

    @Override
    public ArrayList<Veiculo> listarVeiculos() throws VeiculoException, RepositorioVeiculoException {
        return this.controllerVeiculo.listarVeiculos();
    }
}
