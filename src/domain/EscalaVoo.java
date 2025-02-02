package domain;

public class EscalaVoo {

    private Integer codEscala;
    private Voo codVoo;
    private Passagem numBilhete;
    private String numeroAssento;

    public EscalaVoo(Integer codEscala, Voo voo, Passagem passagem, String numeroAssento) {
        this.codEscala = codEscala;
        this.codVoo = voo;
        this.numBilhete = passagem;
        this.numeroAssento = numeroAssento;
    }

    public Integer getCodEscala() {
        return codEscala;
    }

    public void setCodEscala(Integer codEscala) {
        this.codEscala = codEscala;
    }

    public Voo getCodVoo() {
        return codVoo;
    }

    public void setCodVoo(Voo codVoo) {
        this.codVoo = codVoo;
    }

    public Passagem getNumBilhete() {
        return numBilhete;
    }

    public void setNumBilhete(Passagem numBilhete) {
        this.numBilhete = numBilhete;
    }

    public String getNumeroAssento() {
        return numeroAssento;
    }

    public void setNumeroAssento(String numeroAssento) {
        this.numeroAssento = numeroAssento;
    }

    @Override
    public String toString() {
        return "EscalaVoo{" +
               "codEscala=" + codEscala +
               ", codVoo=" + codVoo +
               ", numBilhete=" + numBilhete +
               ", numeroAssento='" + numeroAssento + '\'' +
               '}';
    }
}
