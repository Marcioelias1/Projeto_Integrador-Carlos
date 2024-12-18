package domain;

public class PontosTuristicos {
   
    private Integer codPontoTuristico;
    private String endereco;
    private String nomePontoTuristico;
    private Integer classificacaoPontoTuristico;
    private String horarioFuncionamento;
    private Cidade cidade;
    
    public PontosTuristicos(String endereco, String nomePontoTuristico, Integer classificacaoPontoTuristico,
            String horarioFuncionamento, Cidade cidade) {
        this.endereco = endereco;
        this.nomePontoTuristico = nomePontoTuristico;
        this.classificacaoPontoTuristico = classificacaoPontoTuristico;
        this.horarioFuncionamento = horarioFuncionamento;
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "PontosTuristicos [codPontoTuristico=" + codPontoTuristico + ", endereco=" + endereco
                + ", nomePontoTuristico=" + nomePontoTuristico + ", classificacaoPontoTuristico="
                + classificacaoPontoTuristico + ", horarioFuncionamento=" + horarioFuncionamento + ", cidade=" + cidade
                + "]";
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

    public String getHorarioFuncionamento() {
        return horarioFuncionamento;
    }

    public void setHorarioFuncionamento(String horarioFuncionamento) {
        this.horarioFuncionamento = horarioFuncionamento;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    

}
