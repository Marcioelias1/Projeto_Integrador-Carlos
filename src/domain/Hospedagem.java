package domain;

import java.util.Objects;

public class Hospedagem {

    private Integer codHospedagem;
    private Integer numQuarto;
    private double precoQuarto;
    private TipoHosp tipoHosp;
    private Hotel hotel;

    public Hospedagem(int i, double d, int j, Integer integer) {
    }

    public Hospedagem(Integer codHospedagem, Integer numQuarto, double precoQuarto, TipoHosp tipoHosp, Hotel hotel) {
        this.codHospedagem = codHospedagem;
        this.numQuarto = numQuarto;
        this.precoQuarto = precoQuarto;
        this.tipoHosp = tipoHosp;
        this.hotel = hotel;
    }

    public Integer getCodHospedagem() {
        return codHospedagem;
    }

    public void setCodHospedagem(Integer codHospedagem) {
        this.codHospedagem = codHospedagem;
    }

    public Integer getNumQuarto() {
        return numQuarto;
    }

    public void setNumQuarto(Integer numQuarto) {
        this.numQuarto = numQuarto;
    }

    public double getPrecoQuarto() {
        return precoQuarto;
    }

    public void setPrecoQuarto(double precoQuarto) {
        this.precoQuarto = precoQuarto;
    }

    public TipoHosp getTipoHosp() {
        return tipoHosp;
    }

    public void setTipoHosp(TipoHosp tipoHosp) {
        this.tipoHosp = tipoHosp;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hospedagem that = (Hospedagem) o;
        return codHospedagem == that.codHospedagem && numQuarto == that.numQuarto && Double.compare(that.precoQuarto, precoQuarto) == 0 && Objects.equals(tipoHosp, that.tipoHosp) && Objects. equals(hotel, that.hotel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codHospedagem, numQuarto, precoQuarto, tipoHosp, hotel);
    }

    @Override
    public String toString() {
        return "Hospedagem{" +
               "codHospedagem=" + codHospedagem +
               ", numQuarto=" + numQuarto +
               ", precoQuarto=" + precoQuarto +
               ", tipoHosp=" + tipoHosp +
               ", hotel=" + hotel +
               '}';
    }
}
