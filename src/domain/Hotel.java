package domain;

import java.sql.Time;

public class Hotel {

    private Integer codHotel;
    private String endereco;
    private String nomeHotel;
    private String classificacaoHotel;
    private Time checkIn;
    private Time checkOut;
    private String descricaoGeral;
    private Cidade cidade;

    public Hotel(Integer codHotel, String endereco, String nomeHotel, String classificacaoHotel, Time checkIn, Time checkOut, String descricaoGeral, Cidade cidade) {
        this.codHotel = codHotel;
        this.endereco = endereco;
        this.nomeHotel = nomeHotel;
        this.classificacaoHotel = classificacaoHotel;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.descricaoGeral = descricaoGeral;
        this.cidade = cidade;
    }

    public Integer getCodHotel() {
        return codHotel;
    }

    public void setCodHotel(Integer codHotel) {
        this.codHotel = codHotel;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNomeHotel() {
        return nomeHotel;
    }

    public void setNomeHotel(String nomeHotel) {
        this.nomeHotel = nomeHotel;
    }

    public String getClassificacaoHotel() {
        return classificacaoHotel;
    }

    public void setClassificacaoHotel(String classificacaoHotel) {
        this.classificacaoHotel = classificacaoHotel;
    }

    public Time getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Time checkIn) {
        this.checkIn = checkIn;
    }

    public Time getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(Time checkOut) {
        this.checkOut = checkOut;
    }

    public String getDescricaoGeral() {
        return descricaoGeral;
    }

    public void setDescricaoGeral(String descricaoGeral) {
        this.descricaoGeral = descricaoGeral;
     }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "Hotel{" +
               "codHotel=" + codHotel +
               ", endereco='" + endereco + '\'' +
               ", nomeHotel='" + nomeHotel + '\'' +
               ", classificacaoHotel='" + classificacaoHotel + '\'' +
               ", checkIn=" + checkIn +
               ", checkOut=" + checkOut +
               ", descricaoGeral='" + descricaoGeral + '\'' +
               ", cidade=" + cidade +
               '}';
    }
}