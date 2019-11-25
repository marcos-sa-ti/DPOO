package classes;

import java.sql.Date;
import java.sql.Timestamp;

public class Funcionario extends Pessoa {
    
    private String cargo;
    private String setor;
    private String empresa;
    //private Timestamp horaE;
    //private Timestamp horaS;

    public Funcionario(long id, String nome, String numeroDocumento, String numeroCPF, String telefone) {
        super(id, nome, numeroDocumento, numeroCPF, telefone);
    }
    
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    /*
    public Timestamp getHoraE() {
        return horaE;
    }

    public void setHoraE(Timestamp horaE) {
        this.horaE = horaE;
    }

    public Timestamp getHoraS() {
        return horaS;
    }

    public void setHoraS(Timestamp horaS) {
        this.horaS = horaS;
    }
    */
}
