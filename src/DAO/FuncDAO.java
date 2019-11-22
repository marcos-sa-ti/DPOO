package DAO;

import classes.Funcionario;
import classes.Gerenciador;
import conexaoBD.conectarBanco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;

public abstract class FuncDAO implements  Gerenciador {
    
    
    public static void cadastrarFuncionario (Funcionario novoFuncionario) 
            throws SQLException, Exception {
        
        
         // Mudar os parametros 
         String sql = "INSERT INTO funcionario () VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
        Connection conexao = null;
        PreparedStatement prep = null;
        long millis = System.currentTimeMillis();
        try {
            conexao = conectarBanco.getConexao();
            prep =  conexao.prepareStatement(sql);
            prep.setLong(1, novoFuncionario.getId());
            prep.setInt(2, novoFuncionario.getCodigocartao());
            prep.setString(3, novoFuncionario.getNome());
            prep.setDate(4, novoFuncionario.getDataNascimento());
            prep.setInt(5, novoFuncionario.getNumeroDocumento());
            prep.setInt(6, novoFuncionario.getNumeroCPF());
            prep.setLong(7, novoFuncionario.getTelefone());
            prep.setString(8, novoFuncionario.getCargo());
            prep.setString(9, novoFuncionario.getSetor());
            prep.setString(10, novoFuncionario.getEmpresa());
            prep.setTimestamp(11, novoFuncionario.getHoraE());
            prep.setTimestamp(12, novoFuncionario.getHoraS());
            prep.execute();
        } finally {
            if (prep != null && !prep.isClosed()) {
                prep.close();
            }
            if ( conexao != null && ! conexao.isClosed()) {
                 conexao.close();
            }
        }
        
    
    }
    
    
}
