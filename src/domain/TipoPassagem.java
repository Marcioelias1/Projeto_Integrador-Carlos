package domain;
import java.util.List;

public class TipoPassagem {

    private Integer codTipoPassagem;
    private String nomeTipoPassagem;
    private List<Passagem> passagens;
    public TipoPassagem(String nomeTipoPassagem) {
        this.nomeTipoPassagem = nomeTipoPassagem;
    }
    
    @Override
    public String toString() {
        return "TipoPassagem [codTipoPassagem=" + codTipoPassagem + ", nomeTipoPassagem=" + nomeTipoPassagem + "]";
    }

    public Integer getcodTipoPassagem() {
        return codTipoPassagem;
    }
    public void setcodTipoPassagem(Integer codTipoPassagem) {
        this.codTipoPassagem = codTipoPassagem;
    }
    public String getnomeTipoPassagem() {
        return nomeTipoPassagem;
    }
    public void setnomeTipoPassagem(String nomeTipoPassagem) {
        this.nomeTipoPassagem = nomeTipoPassagem;
    }
    public List<Passagem> getPassagens() {
        return passagens;
    }
    public void setPassagens(List<Passagem> passagens) {
        this.passagens = passagens;
    }
    

}
