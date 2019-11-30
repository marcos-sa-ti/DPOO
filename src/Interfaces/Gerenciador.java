package Interfaces;

import classes.Funcionario;
import classes.Visitante;
import java.sql.SQLException;

public interface Gerenciador {
    
    public void cadastrarPessoa(Funcionario novoFuncionario)  throws SQLException, Exception;
    
    public void cadastrarPessoa (Visitante novoVisitante) throws SQLException, Exception;
    
    public void buscarPessoa(Funcionario novoFuncionario) throws SQLException, Exception;
    
    public void buscarPessoa(Visitante novoVisitante) throws SQLException, Exception;
    
    //public void excluirPessoa(Funcionario novoFuncionario) throws SQLException, Exception;
    
    //public void excluirPessoa(Visitante novoVisitante)throws SQLException, Exception;
 
}
