package domain;

public class AdquireVoo {

    private Integer codAdquire;
    private Voo voo;
    private AdquireVoo adquireVoo;
    
    public AdquireVoo(Voo voo, AdquireVoo adquireVoo) {
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

    public AdquireVoo getAdquireVoo() {
        return adquireVoo;
    }

    public void setAdquireVoo(AdquireVoo adquireVoo) {
        this.adquireVoo = adquireVoo;
    }
    
    
    
    
}
