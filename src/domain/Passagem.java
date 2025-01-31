package domain;
import java.sql.Date;
import java.util.List;

public class Passagem {
    
    private Integer numBilhete;
    private Double preco;
    private Date dataIda;
    private Date dataVolta;
    private String localIda;
    private String localVolta;
    private TipoPassagem tipoPassagem;
    private AdquirePassagem adquirePassagem;
    private List<EscalaVoo> adquireVoo;
    
    public Passagem(Double preco, Date dataIda, Date dataVolta, String localIda, String localVolta,
            TipoPassagem tipoPassagem, AdquirePassagem adquirePassagem) {
        this.preco = preco;
        this.dataIda = dataIda;
        this.dataVolta = dataVolta;
        this.localIda = localIda;
        this.localVolta = localVolta;
        this.tipoPassagem = tipoPassagem;
        this.adquirePassagem = adquirePassagem;
    }

    @Override
    public String toString() {
        return "Passagem [numBilhete=" + numBilhete + ", preco=" + preco + ", dataIda=" + dataIda + ", dataVolta="
                + dataVolta + ", localIda=" + localIda + ", localVolta=" + localVolta + ", tipoPassagem=" + tipoPassagem
                + ", adquirePassagem=" + adquirePassagem + "]";
    }

    public Integer getNumBilhete() {
        return numBilhete;
    }

    public void setNumBilhete(Integer numBilhete) {
        this.numBilhete = numBilhete;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Date getDataIda() {
        return dataIda;
    }

    public void setDataIda(Date dataIda) {
        this.dataIda = dataIda;
    }

    public Date getDataVolta() {
        return dataVolta;
    }

    public void setDataVolta(Date dataVolta) {
        this.dataVolta = dataVolta;
    }

    public String getLocalIda() {
        return localIda;
    }

    public void setLocalIda(String localIda) {
        this.localIda = localIda;
    }

    public String getLocalVolta() {
        return localVolta;
    }

    public void setLocalVolta(String localVolta) {
        this.localVolta = localVolta;
    }

    public TipoPassagem getTipoPassagem() {
        return tipoPassagem;
    }

    public void setTipoPassagem(TipoPassagem tipoPassagem) {
        this.tipoPassagem = tipoPassagem;
    }

    public AdquirePassagem getAdquirePassagem() {
        return adquirePassagem;
    }

    public void setAdquirePassagem(AdquirePassagem adquirePassagem) {
        this.adquirePassagem = adquirePassagem;
    }

    public List<EscalaVoo> getAdquireVoo() {
        return adquireVoo;
    }

    public void setAdquireVoo(List<EscalaVoo> adquireVoo) {
        this.adquireVoo = adquireVoo;
    }

    
    

}
