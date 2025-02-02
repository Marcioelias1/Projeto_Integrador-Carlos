package domain;

import java.util.Date;

public class Cliente {

    private Integer codCliente;
    private String cpf;
    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    private Date dataNasc;
    private String sexo;

    public Cliente(Integer codCliente, String cpf, String nome, String endereco, String telefone, String email, Date dataNasc, String sexo) {
        this.codCliente = codCliente;
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.dataNasc = dataNasc;
        this.sexo = sexo;
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

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Cliente{" +
               "codCliente=" + codCliente +
               ", cpf='" + cpf + '\'' +
               ", nome='" + nome + '\'' +
               ", endereco='" + endereco + '\'' +
               ", telefone='" + telefone + '\'' +
               ", email='" + email + '\'' +
               ", dataNasc=" + dataNasc +
               ", sexo=" + sexo +
               '}';
    }

    public Cliente getCidade() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCidade'");
    }
}
