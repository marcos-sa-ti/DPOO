package classes;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDateTime;

public class Funcionario extends Pessoa {

    private String cargo;
    private String setor;
    private String empresa;
    private LocalDateTime horaE;
    private LocalDateTime horaS;

    public Funcionario() {
    }

    public Funcionario(String cargo, String setor, String empresa) {
        this.cargo = cargo;
        this.setor = setor;
        this.empresa = empresa;
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
    
    public LocalDateTime getHoraE() {
        return horaE;
    }

    public void setHoraE(LocalDateTime horaE) {
        this.horaE = horaE;
    }

    public LocalDateTime getHoraS() {
        return horaS;
    }

    public void setHoraS(LocalDateTime horaS) {
        this.horaS = horaS;
    }
     
}
