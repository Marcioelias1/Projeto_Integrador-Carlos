package domain;

import java.time.LocalDate;

public class Passagem {

    private Integer numBilhete;
    private Double preco;
    private LocalDate dataCompra;
    private LocalDate dataIda;
    private LocalDate dataVolta;
    private Cliente cliente;
    private Cidade cidadeEmbarque;
    private Cidade cidadeDesembarque;
    private Integer pesoBagagem;

    public Passagem(Integer numBilhete, Double preco, LocalDate dataCompra, LocalDate dataIda, LocalDate dataVolta, Cliente cliente, Cidade cidadeEmbarque, Cidade cidadeDesembarque, Integer pesoBagagem) {
        this.numBilhete = numBilhete;
        this.preco = preco;
        this.dataCompra = dataCompra;
        this.dataIda = dataIda;
        this.dataVolta = dataVolta;
        this.cliente = cliente;
        this.cidadeEmbarque = cidadeEmbarque;
        this.cidadeDesembarque = cidadeDesembarque;
        this.pesoBagagem = pesoBagagem;
    }

    public Integer getNumBilhete() {
        return numBilhete;
    }

    public void setNumBilhete(Integer numBilhete) {
        this.numBilhete = numBilhete;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public LocalDate getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(LocalDate dataCompra) {
        this.dataCompra = dataCompra;
    }

    public LocalDate getDataIda() {
        return dataIda;
    }

    public void setDataIda(LocalDate dataIda) {
        this.dataIda = dataIda;
    }

    public LocalDate getDataVolta() {
        return dataVolta;
    }

    public void setDataVolta(LocalDate dataVolta) {
        this.dataVolta = dataVolta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cidade getCidadeEmbarque() {
        return cidadeEmbarque;
    }

    public void setCidadeEmbarque(Cidade cidadeEmbarque) {
        this.cidadeEmbarque = cidadeEmbarque;
    }

    public Cidade getCidadeDesembarque() {
        return cidadeDesembarque;
    }

    public void setCidadeDesembarque(Cidade cidadeDesembarque) {
        this.cidadeDesembarque = cidadeDesembarque;
    }

    public Integer getPesoBagagem() {
        return pesoBagagem;
    }

    public void setPesoBagagem(Integer pesoBagagem) {
        this.pesoBagagem = pesoBagagem;
    }

    @Override
    public String toString() {
        return "Passagem{" +
               "numBilhete=" + numBilhete +
               ", preco=" + preco +
               ", dataCompra=" + dataCompra +
               ", dataIda=" + dataIda +
               ", dataVolta=" + dataVolta +
               ", cliente=" + cliente +
               ", cidadeEmbarque=" + cidadeEmbarque +
               ", cidadeDesembarque=" + cidadeDesembarque +
               ", pesoBagagem=" + pesoBagagem +
               '}';
    }
}