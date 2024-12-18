package domain;

import java.util.List;

public class Hospedagem {

    private Integer codHospedagem;
    private Integer estadia;
    private Integer numQuarto;
    private Double precoQuarto;
    private Hotel hotel;
    private TipoHospedagem tipoHospedagem;
    private List<HospedagemCliente> hospedagemCliente;
    
    public Hospedagem(Integer estadia, Integer numQuarto, Double precoQuarto, Hotel hotel,
            TipoHospedagem tipoHospedagem) {
        this.estadia = estadia;
        this.numQuarto = numQuarto;
        this.precoQuarto = precoQuarto;
        this.hotel = hotel;
        this.tipoHospedagem = tipoHospedagem;
    }

    @Override
    public String toString() {
        return "Hospedagem [codHospedagem=" + codHospedagem + ", estadia=" + estadia + ", numQuarto=" + numQuarto
                + ", precoQuarto=" + precoQuarto + ", hotel=" + hotel + ", tipoHospedagem=" + tipoHospedagem + "]";
    }

    public Integer getCodHospedagem() {
        return codHospedagem;
    }

    public void setCodHospedagem(Integer codHospedagem) {
        this.codHospedagem = codHospedagem;
    }

    public Integer getEstadia() {
        return estadia;
    }

    public void setEstadia(Integer estadia) {
        this.estadia = estadia;
    }

    public Integer getNumQuarto() {
        return numQuarto;
    }

    public void setNumQuarto(Integer numQuarto) {
        this.numQuarto = numQuarto;
    }

    public Double getPrecoQuarto() {
        return precoQuarto;
    }

    public void setPrecoQuarto(Double precoQuarto) {
        this.precoQuarto = precoQuarto;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public TipoHospedagem getTipoHospedagem() {
        return tipoHospedagem;
    }

    public void setTipoHospedagem(TipoHospedagem tipoHospedagem) {
        this.tipoHospedagem = tipoHospedagem;
    }

    public List<HospedagemCliente> getHospedagemCliente() {
        return hospedagemCliente;
    }

    public void setHospedagemCliente(List<HospedagemCliente> hospedagemCliente) {
        this.hospedagemCliente = hospedagemCliente;
    }

    

}
