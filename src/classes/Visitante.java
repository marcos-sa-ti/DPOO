package classes;

import java.sql.Date;

/**
 *
 * @author marcos.sbrito2
 */
public class Visitante extends Pessoa {
    
    private String empresaVisitada;
    private String funcVisitado;
    private String tipoVisita;

    public Visitante() {
    }

    public Visitante(String empresaVisitada, String funcVisitado, String tipoVisita) {
        this.empresaVisitada = empresaVisitada;
        this.funcVisitado = funcVisitado;
        this.tipoVisita = tipoVisita;
    }

   


    public String getEmpresaVisitada() {
        return empresaVisitada;
    }

    public void setEmpresaVisitada(String empresaVisitada) {
        this.empresaVisitada = empresaVisitada;
    }

    public String getFuncVisitado() {
        return funcVisitado;
    }

    public void setFuncVisitado(String funcVisitado) {
        this.funcVisitado = funcVisitado;
    }

    public String getTipoVisita() {
        return tipoVisita;
    }

    public void setTipoVisita(String tipoVisita) {
        this.tipoVisita = tipoVisita;
    }
      
}
