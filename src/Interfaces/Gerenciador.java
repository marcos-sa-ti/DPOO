package Interfaces;

import classes.Funcionario;
import classes.Visitante;
import java.sql.SQLException;

public interface Gerenciador {
    
    public void cadastrarPessoa(Funcionario novoFuncionario)  throws SQLException, Exception;
    
    public void cadastrarVisitante (Visitante novoVisitante) throws SQLException, Exception;
    
    public boolean buscarPessoa(String cpf) throws SQLException, Exception;
    
    public String obterNome(String cpf) throws SQLException, Exception;
    
    public boolean buscaVisitante(String cpf) throws SQLException, Exception;
    
    public void permitirAcessoFuncionario(String cpf) throws SQLException, Exception;
    
     public void saidaAcessoFuncionario(String cpf) throws SQLException, Exception;
    
    public void excluiAcessoFuncionario(String cpf) throws SQLException, Exception;
    
     public void permitirAcessoVisitante(String cpf) throws SQLException, Exception;
    
     public void saidaAcessoVisitante(String cpf) throws SQLException, Exception;
    
    public void excluiAcessoVisitante(String cpf) throws SQLException, Exception;
    
    //public void excluirPessoa(Visitante novoVisitante)throws SQLException, Exception;
 
}
