package domain;

public class PontosTuristicos {
    
    private Integer codPontoTuristico;
    private String endereco;
    private String nomePontoTuristico;
    private Integer classificacaoPontoTuristico;
    private String horarioFuncinamento;
    private Cidade codCidade;
   

    public PontosTuristicos(Integer codPontoTuristico, String endereco, String nomePontoTuristico, Integer classificacaoPontoTuristico, String horarioFuncinamento, Cidade codCidade) {
        this.codPontoTuristico = codPontoTuristico;
        this.endereco = endereco;
        this.nomePontoTuristico = nomePontoTuristico;
        this.classificacaoPontoTuristico = classificacaoPontoTuristico;
        this.horarioFuncinamento = horarioFuncinamento;
        this.codCidade = codCidade;
    }

    public Integer getCodPontoTuristico() {
        return codPontoTuristico;
    }

    public void setCodPontoTuristico(Integer codPontoTuristico) {
        this.codPontoTuristico = codPontoTuristico;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNomePontoTuristico() {
        return nomePontoTuristico;
    }

    public void setNomePontoTuristico(String nomePontoTuristico) {
        this.nomePontoTuristico = nomePontoTuristico;
    }

    public Integer getClassificacaoPontoTuristico() {
        return classificacaoPontoTuristico;
    }

    public void setClassificacaoPontoTuristico(Integer classificacaoPontoTuristico) {
        this.classificacaoPontoTuristico = classificacaoPontoTuristico;
    }

    public String getHorarioFuncinamento() {
        return horarioFuncinamento;
    }

    public void setHorarioFuncinamento(String horarioFuncinamento) {
        this.horarioFuncinamento = horarioFuncinamento;
    }

    public Cidade getCodCidade() {
        return codCidade;
    }

    public void setCodCidade(Cidade codCidade) {
        this.codCidade = codCidade;
    }

    @Override
    public String toString() {
        return "PontosTuristicos{" +
               "codPontoTuristico=" + codPontoTuristico +
               ", endereco='" + endereco + '\'' +
               ", nomePontoTuristico='" + nomePontoTuristico + '\'' +
               ", classificacaoPontoTuristico=" + classificacaoPontoTuristico +
               ", horarioFuncinamento='" + horarioFuncinamento + '\'' +
               ", codCidade=" + codCidade +
               '}';
    }
}
