package domain;
import java.sql.Date;
import java.util.List;

public class Cliente {
    private Integer codCliente;
    private String cpf;
    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    private Date dataNascimento;
    private String sexo;
    private List <AdquirePassagem> adPassagens;
    private List <Hospedagem> hospedagens;

    public Cliente(String cpf, String nome, String endereco, String telefone, String email,
            Date dataNascimento, String sexo) {
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Cliente [codCliente=" + codCliente + ", cpf=" + cpf + ", nome=" + nome + ", endereco=" + endereco
                + ", telefone=" + telefone + ", email=" + email + ", dataNascimento=" + dataNascimento + ", sexo="
                + sexo + "]";
    }

    public Integer getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(Integer codCliente) {
        this.codCliente = codCliente;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setdataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public List<AdquirePassagem> getAdPassagens() {
        return adPassagens;
    }

    public void setAdPassagens(List<AdquirePassagem> adPassagens) {
        this.adPassagens = adPassagens;
    }

    public List<Hospedagem> getHospedagens() {
        return hospedagens;
    }

    public void setHospedagens(List<Hospedagem> hospedagens) {
        this.hospedagens = hospedagens;
    }

}
