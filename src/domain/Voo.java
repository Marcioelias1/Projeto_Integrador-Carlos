package domain;

import java.time.LocalDateTime;

public class Voo {
    private Integer codVoo;
    private String prefixoVoo;
    private String companhiaAerea;
    private LocalDateTime dataHoraEmbarque;
    private LocalDateTime dataHoraDesembarque;
    private String aviao;
    private Integer cidadeEmbarque;
    private Integer cidadeDesembarque;

    public Voo(Integer codVoo, String prefixoVoo, String companhiaAerea, LocalDateTime dataHoraEmbarque, LocalDateTime dataHoraDesembarque, String aviao, Integer cidadeEmbarque, Integer cidadeDesembarque) {
        this.codVoo = codVoo;
        this.prefixoVoo = prefixoVoo;
        this.companhiaAerea = companhiaAerea;
        this.dataHoraEmbarque = dataHoraEmbarque;
        this.dataHoraDesembarque = dataHoraDesembarque;
        this.aviao = aviao;
        this.cidadeEmbarque = cidadeEmbarque;
        this.cidadeDesembarque = cidadeDesembarque;
    }

    public Voo(String string, String string2, LocalDateTime of, LocalDateTime of2, Integer codCidade,
            Integer codCidade2, String string3) {
        //TODO Auto-generated constructor stub
    }

    public Integer getCodVoo() {
        return codVoo;
    }

    public void setCodVoo(Integer codVoo) {
        this.codVoo = codVoo;
    }

    public String getPrefixoVoo() {
        return prefixoVoo;
    }

    public void setPrefixoVoo(String prefixoVoo) {
        this.prefixoVoo = prefixoVoo;
    }

    public String getCompanhiaAerea() {
        return companhiaAerea;
    }

    public void setCompanhiaAerea(String companhiaAerea) {
        this.companhiaAerea = companhiaAerea;
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

    public String getAviao() {
        return aviao;
    }

    public void setAviao(String aviao) {
        this.aviao = aviao;
    }

    public Integer getCidadeEmbarque() {
        return cidadeEmbarque;
    }

    public void setCidadeEmbarque(Integer cidadeEmbarque) {
        this.cidadeEmbarque = cidadeEmbarque;
    }

    public Integer getCidadeDesembarque() {
        return cidadeDesembarque;
    }

    public void setCidadeDesembarque(Integer cidadeDesembarque) {
        this.cidadeDesembarque = cidadeDesembarque;
    }

    @Override
    public String toString() {
        return "Voo{" +
                "codVoo=" + codVoo +
                ", prefixoVoo='" + prefixoVoo + '\'' +
                ", companhiaAerea='" + companhiaAerea + '\'' +
                ", dataHoraEmbarque=" + dataHoraEmbarque +
                ", dataHoraDesembarque=" + dataHoraDesembarque +
                ", aviao='" + aviao + '\'' +
                ", cidadeEmbarque=" + cidadeEmbarque +
                ", cidadeDesembarque=" + cidadeDesembarque +
                '}';
    }
}