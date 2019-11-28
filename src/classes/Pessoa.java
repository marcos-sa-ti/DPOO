package classes;

import java.sql.Date;
import java.time.LocalDate;

public abstract class Pessoa {

    protected long id;
    protected String codigocartao;
    protected String nome;
    protected LocalDate dataNascimento;
    protected String numeroDocumento;
    protected String numeroCPF;
    protected String telefone;

    public Pessoa(){
        
    }
    
    public Pessoa(long id, String codigocartao, String nome, LocalDate dataNascimento, String numeroDocumento, String numeroCPF, String telefone) {
        this.id = id;
        this.codigocartao = codigocartao;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.numeroDocumento = numeroDocumento;
        this.numeroCPF = numeroCPF;
        this.telefone = telefone;
    }



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCodigocartao() {
        return codigocartao;
    }

    public void setCodigocartao(String codigocartao) {
        this.codigocartao = codigocartao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getNumeroCPF() {
        return numeroCPF;
    }

    public void setNumeroCPF(String numeroCPF) {
        this.numeroCPF = numeroCPF;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
