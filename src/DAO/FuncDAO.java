package DAO;

import classes.Funcionario;
import conexaoBD.conectarBanco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import javax.swing.JOptionPane;
import Interfaces.Cadastrar;


public abstract class FuncDAO implements Cadastrar {
    
    public static void  cadastrarPessoa (Funcionario novoFuncionario) 
            throws SQLException, Exception {
        
        
         String sql = "INSERT INTO funcionario (nome, numerodocumento,"
         + "numerocpf, telefone,cargo, setor, empresa) VALUES (?,?,?,?,?,?,?)";
         Connection conexao = null;
         PreparedStatement prep = null;
         try {
         
            conexao = conectarBanco.getConnection();
            //prep.setLong(1, novoFuncionario.getId());
            //prep.setString(2, novoFuncionario.getCodigocartao());
            prep.setString(3, novoFuncionario.getNome());
            //prep.setDate(4, novoFuncionario.getDataNascimento());
            prep.setString(5, novoFuncionario.getNumeroDocumento());
            prep.setString(6, novoFuncionario.getNumeroCPF());
            prep.setString(7, novoFuncionario.getTelefone());
            prep.setString(8, novoFuncionario.getCargo());
            prep.setString(9, novoFuncionario.getSetor());
            prep.setString(10, novoFuncionario.getEmpresa());
            //prep.setTimestamp(11, novoFuncionario.getHoraE());
            //prep.setTimestamp(12, novoFuncionario.getHoraS());
            prep.execute();
            
        }
         
            finally {
             
             if (prep != null && !prep.isClosed()){
             prep.close();
             }
            
            if ( conexao != null && ! conexao.isClosed()) {
                 conexao.close();
            }
        }
    } 
    
}
    

