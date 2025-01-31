package domain;

public class EscalaVoo {

    private Integer codAdquire;
    private Voo voo;
    private EscalaVoo adquireVoo;
    
    public EscalaVoo(Voo voo, EscalaVoo adquireVoo) {
        this.voo = voo;
        this.adquireVoo = adquireVoo;
    }

    @Override
    public String toString() {
        return "AdquireVoo [codAdquire=" + codAdquire + ", voo=" + voo + ", adquireVoo=" + adquireVoo + "]";
    }

    public Integer getCodAdquire() {
        return codAdquire;
    }

    public void setCodAdquire(Integer codAdquire) {
        this.codAdquire = codAdquire;
    }

    public Voo getVoo() {
        return voo;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }

    public EscalaVoo getAdquireVoo() {
        return adquireVoo;
    }

    public void setAdquireVoo(EscalaVoo adquireVoo) {
        this.adquireVoo = adquireVoo;
    }
    
    
    
    
}
