package domain;
import java.sql.Date;

public class HospedagemCliente {
    
    private Integer codHospedagemCliente;
    private Double valorPago;
    private Date dataInicio;
    private Date dataTermino;
    private Integer qtedDependentes;
    private Cliente cliente;
    private Hospedagem hospedagem;
    
    public HospedagemCliente(Double valorPago, Date dataInicio, Date dataTermino, Integer qtedDependentes,
            Cliente cliente, Hospedagem hospedagem) {
        this.valorPago = valorPago;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
        this.qtedDependentes = qtedDependentes;
        this.cliente = cliente;
        this.hospedagem = hospedagem;
    }

    @Override
    public String toString() {
        return "HospedagemCliente [codHospedagemCliente=" + codHospedagemCliente + ", valorPago=" + valorPago
                + ", dataInicio=" + dataInicio + ", dataTermino=" + dataTermino + ", qtedDependentes=" + qtedDependentes
                + ", cliente=" + cliente + ", hospedagem=" + hospedagem + "]";
    }

    public Integer getCodHospedagemCliente() {
        return codHospedagemCliente;
    }

    public void setCodHospedagemCliente(Integer codHospedagemCliente) {
        this.codHospedagemCliente = codHospedagemCliente;
    }

    public Double getValorPago() {
        return valorPago;
    }

    public void setValorPago(Double valorPago) {
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
    
    

    

}
