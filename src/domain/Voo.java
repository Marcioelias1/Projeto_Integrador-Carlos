package domain;
import java.time.LocalDateTime;
import java.util.List;

public class Voo {
    
    private Integer codVoo;
    private Integer numeroVoo;
    private Integer numeroAssento;
    private LocalDateTime dataHoraEmbarque;
    private LocalDateTime dataHoraDesembarque;
    private String localEmbarque;
    private String localDesembarque;
    private Cidade cidade;
    private List<EscalaVoo> adquirevoo;
    
    public Voo(Integer numeroVoo, Integer numeroAssento, LocalDateTime dataHoraEmbarque, LocalDateTime dataHoraDesembarque,
            String localEmbarque, String localDesembarque, Cidade cidade) {
        this.numeroVoo = numeroVoo;
        this.numeroAssento = numeroAssento;
        this.dataHoraEmbarque = dataHoraEmbarque;
        this.dataHoraDesembarque = dataHoraDesembarque;
        this.localEmbarque = localEmbarque;
        this.localDesembarque = localDesembarque;
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "Voo [codVoo=" + codVoo + ", numeroVoo=" + numeroVoo + ", numeroAssento=" + numeroAssento
                + ", dataHoraEmbarque=" + dataHoraEmbarque + ", dataHoraDesembarque=" + dataHoraDesembarque
                + ", localEmbarque=" + localEmbarque + ", localDesembarque=" + localDesembarque + ", cidade=" + cidade
                + "]";
    }

    public Integer getCodVoo() {
        return codVoo;
    }

    public void setCodVoo(Integer codVoo) {
        this.codVoo = codVoo;
    }

    public Integer getNumeroVoo() {
        return numeroVoo;
    }

    public void setNumeroVoo(Integer numeroVoo) {
        this.numeroVoo = numeroVoo;
    }

    public Integer getNumeroAssento() {
        return numeroAssento;
    }

    public void setNumeroAssento(Integer numeroAssento) {
        this.numeroAssento = numeroAssento;
    }

    public LocalDateTime getDataHoraEmbarque() {
        return dataHoraEmbarque;
    }

    public void setDataHoraEmbarque(LocalDateTime dataHoraEmbarque) {
        this.dataHoraEmbarque = dataHoraEmbarque;
    }

    public LocalDateTime getDataHoraDesembarque() {
        return dataHoraDesembarque;
    }

    public void setDataHoraDesembarque(LocalDateTime dataHoraDesembarque) {
        this.dataHoraDesembarque = dataHoraDesembarque;
    }

    public String getLocalEmbarque() {
        return localEmbarque;
    }

    public void setLocalEmbarque(String localEmbarque) {
        this.localEmbarque = localEmbarque;
    }

    public String getLocalDesembarque() {
        return localDesembarque;
    }

    public void setLocalDesembarque(String localDesembarque) {
        this.localDesembarque = localDesembarque;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public List<EscalaVoo> getAdquirevoo() {
        return adquirevoo;
    }

    public void setAdquirevoo(List<EscalaVoo> adquirevoo) {
        this.adquirevoo = adquirevoo;
    }

    
}
