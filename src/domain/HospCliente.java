package domain;

import java.util.Date;

public class HospCliente {

    private Integer codClienteHospedagem;
    private double valorPago;
    private Date dataInicio;
    private Date dataTermino;
    private Integer qtedDependentes;
    private Cliente cliente;
    private Hospedagem hospedagem;

    public HospCliente(Integer codClienteHospedagem, double valorPago, Date dataInicio, Date dataTermino, Integer qtedDependentes, Cliente cliente, Hospedagem hospedagem) {
        this.codClienteHospedagem = codClienteHospedagem;
        this.valorPago = valorPago;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
        this.qtedDependentes = qtedDependentes;
        this.cliente = cliente;
        this.hospedagem = hospedagem;
    }

    public Integer getCodClienteHospedagem() {
        return codClienteHospedagem;
    }

    public void setCodClienteHospedagem(Integer codClienteHospedagem) {
        this.codClienteHospedagem = codClienteHospedagem;
    }

    public double getValorPago() {
        return valorPago;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(Date dataTermino) {
        this.dataTermino = dataTermino;
    }

    public Integer getQtedDependentes() {
        return qtedDependentes;
    }

    public void setQtedDependentes(Integer qtedDependentes) {
        this.qtedDependentes = qtedDependentes;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Hospedagem getHospedagem() {
        return hospedagem;
    }

    public void setHospedagem(Hospedagem hospedagem) {
        this.hospedagem = hospedagem;
    }

    @Override
    public String toString() {
        return "HospCliente{" +
               "codClienteHospedagem=" + codClienteHospedagem +
               ", valorPago=" + valorPago +
               ", dataInicio=" + dataInicio +
               ", dataTermino=" + dataTermino +
               ", qtedDependentes=" + qtedDependentes +
               ", cliente=" + cliente +
               ", hospedagem=" + hospedagem +
               '}';
    }
}
