package domain;

public class TipoHosp {

    private Integer numTipoHospedagem;
    private Integer quantCamas;
    private String nivelQualidade;

    public TipoHosp(Integer numTipoHospedagem, Integer quantCamas, String nivelQualidade) {
        this.numTipoHospedagem = numTipoHospedagem;
        this.quantCamas = quantCamas;
        this.nivelQualidade = nivelQualidade;
    }

    public Integer getNumTipoHospedagem() {
        return numTipoHospedagem;
    }

    public void setNumTipoHospedagem(Integer numTipoHospedagem) {
        this.numTipoHospedagem = numTipoHospedagem;
    }

    public Integer getQuantCamas() {
        return quantCamas;
    }

    public void setQuantCamas(Integer quantCamas) {
        this.quantCamas = quantCamas;
    }

    public String getNivelQualidade() {
        return nivelQualidade;
    }

    public void setNivelQualidade(String nivelQualidade) {
        this.nivelQualidade = nivelQualidade;
    }

    @Override
    public String toString() {
        return "TipoHosp{" +
                "numTipoHospedagem=" + numTipoHospedagem +
                ", quantCamas=" + quantCamas +
                ", nivelQualidade='" + nivelQualidade + '\'' +
                '}';
    }
}
