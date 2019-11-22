package classes;

import java.sql.Date;

public abstract class Pessoa {
    
    private long id;
    private int codigocartao;
    private String nome;
    private Date dataNascimento;
    private int numeroDocumento;
    private int numeroCPF;
    private int telefone;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getCodigocartao() {
        return codigocartao;
    }

    public void setCodigocartao(int codigocartao) {
        this.codigocartao = codigocartao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(int numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public int getNumeroCPF() {
        return numeroCPF;
    }

    public void setNumeroCPF(int numeroCPF) {
        this.numeroCPF = numeroCPF;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
  
}
