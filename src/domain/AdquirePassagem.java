package domain;
import java.sql.Date;

public class AdquirePassagem {

    private Integer codAdquirePassagem;
    private Date dataAquisicao;
    private Double valorPago;
    private Integer pesoBagagem;
    private Cliente cliente;
    private Passagem passagem;
    
    public AdquirePassagem(Date dataAquisicao, Double valorPago, Integer pesoBagagem, Cliente cliente,
            Passagem passagem) {
        this.dataAquisicao = dataAquisicao;
        this.valorPago = valorPago;
        this.pesoBagagem = pesoBagagem;
        this.cliente = cliente;
        this.passagem = passagem;
    }

    @Override
    public String toString() {
        return "AdquirePassagem [codAdquirePassagem=" + codAdquirePassagem + ", dataAquisicao=" + dataAquisicao
                + ", valorPago=" + valorPago + ", pesoBagagem=" + pesoBagagem + ", cliente=" + cliente + ", passagem="
                + passagem + "]";
    }

    public Integer getCodAdquirePassagem() {
        return codAdquirePassagem;
    }

    public void setCodAdquirePassagem(Integer codAdquirePassagem) {
        this.codAdquirePassagem = codAdquirePassagem;
    }

    public Date getDataAquisicao() {
        return dataAquisicao;
    }

    public void setDataAquisicao(Date dataAquisicao) {
        this.dataAquisicao = dataAquisicao;
    }

    public Double getValorPago() {
        return valorPago;
    }

    public void setValorPago(Double valorPago) {
        this.valorPago = valorPago;
    }

    public Integer getPesoBagagem() {
        return pesoBagagem;
    }

    public void setPesoBagagem(Integer pesoBagagem) {
        this.pesoBagagem = pesoBagagem;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Passagem getPassagem() {
        return passagem;
    }

    public void setPassagem(Passagem passagem) {
        this.passagem = passagem;
    }

    

    
}
