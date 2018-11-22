package com.company.model;

import java.util.Set;

public class Locar {
        private int idLocacao;
        private String dataInicio;
        private String dataFim;
        private boolean formaPg;
        private Set<Veiculo> veiculos;
        private Cliente cliente;


        public Locar(int idLocacao, String dataInicio, String dataFim, boolean formaPg, Set<Veiculo> veiculos, Cliente cliente) {
                this.idLocacao = idLocacao;
                this.dataInicio = dataInicio;
                this.dataFim = dataFim;
                this.formaPg = formaPg;
                this.veiculos = veiculos;
                this.cliente = cliente;
        }

        public int getIdLocacao() {
                return idLocacao;
        }

        public void setIdLocacao(int idLocacao) {
                this.idLocacao = idLocacao;
        }

        public String getDataInicio() {
                return dataInicio;
        }

        public void setDataInicio(String dataInicio) {
                this.dataInicio = dataInicio;
        }

        public String getDataFim() {
                return dataFim;
        }

        public void setDataFim(String dataFim) {
                this.dataFim = dataFim;
        }

        public boolean isFormaPg() {
                return formaPg;
        }

        public void setFormaPg(boolean formaPg) {
                this.formaPg = formaPg;
        }

        public Set<Veiculo> getVeiculos() {
                return veiculos;
        }

        public void setVeiculos(Set<Veiculo> veiculos) {
                this.veiculos = veiculos;
        }

        public Cliente getCliente() {
                return cliente;
        }

        public void setCliente(Cliente cliente) {
                this.cliente = cliente;
        }
}
