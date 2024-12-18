package domain;
import java.util.List;

public class Cidade {

    private Integer codCidade;
    private String nomeCidade;
    private String coordenadas;
    private List<Hotel> hoteis;
    private List<PontosTuristicos> pontosTuristicos;
    private List<Voo> voos;

    public Cidade(String nomeCidade, String coordenadas) {
        this.nomeCidade = nomeCidade;
        this.coordenadas = coordenadas;
    }

    @Override
    public String toString() {
        return "Cidade [codCidade=" + codCidade + ", nomeCidade=" + nomeCidade + ", coordenadas=" + coordenadas + "]";
    }

    public Integer getCodCidade() {
        return codCidade;
    }
    public void setCodCidade(Integer codCidade) {
        this.codCidade = codCidade;
    }
    public String getNomeCidade() {
        return nomeCidade;
    }
    public void setNomeCidade(String nomeCidade) {
        this.nomeCidade = nomeCidade;
    }
    public String getCoordenadas() {
        return coordenadas;
    }
    public void setCoordenadas(String coordenadas) {
        this.coordenadas = coordenadas;
    }
    public List<Hotel> getHoteis() {
        return hoteis;
    }
    public void setHoteis(List<Hotel> hoteis) {
        this.hoteis = hoteis;
    }
    public List<PontosTuristicos> getPontosTuristicos() {
        return pontosTuristicos;
    }
    public void setPontosTuristicos(List<PontosTuristicos> pontosTuristicos) {
        this.pontosTuristicos = pontosTuristicos;
    }
    public List<Voo> getVoos() {
        return voos;
    }
    public void setVoos(List<Voo> voos) {
        this.voos = voos;
    }
    
}