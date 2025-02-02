package domain;

import java.util.Objects;

public class Cidade {
    
    private Integer codCidade;
    private String nomeCidade;
    private String coordenadas;

    public Cidade(Integer codCidade, String nomeCidade, String coordenadas) {
        this.codCidade = codCidade;
        this.nomeCidade = nomeCidade;
        this.coordenadas = coordenadas;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cidade cidade = (Cidade) o;
        return Objects.equals(codCidade, cidade.codCidade) && Objects.equals(nomeCidade, cidade.nomeCidade) && Objects.equals(coordenadas, cidade.coordenadas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codCidade, nomeCidade, coordenadas);
    }

    @Override
    public String toString() {
        return "Cidade{" +
                "codCidade=" + codCidade +
                ", nomeCidade='" + nomeCidade + '\'' +
                ", coordenadas='" + coordenadas + '\'' +
                '}';
    }
}