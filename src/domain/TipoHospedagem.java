package domain;
import java.util.List;

public class TipoHospedagem {

    private Integer NumTipoHospedagem;
    private Integer quantCamas;
    private String nivelQualidade;
    private List <Hospedagem> hospedagens;
    
    public TipoHospedagem(Integer quantCamas, String nivelQualidade) {
        this.quantCamas = quantCamas;
        this.nivelQualidade = nivelQualidade;
    }

    @Override
    public String toString() {
        return "TipoHospedagem [NumTipoHospedagem=" + NumTipoHospedagem + ", quantCamas=" + quantCamas
                + ", nivelQualidade=" + nivelQualidade + "]";
    }

    public Integer getNumTipoHospedagem() {
        return NumTipoHospedagem;
    }

    public void setNumTipoHospedagem(Integer numTipoHospedagem) {
        NumTipoHospedagem = numTipoHospedagem;
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

    public List<Hospedagem> getHospedagens() {
        return hospedagens;
    }

    public void setHospedagens(List<Hospedagem> hospedagens) {
        this.hospedagens = hospedagens;
    }
    
    

}
