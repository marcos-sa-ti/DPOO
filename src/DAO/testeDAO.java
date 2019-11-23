/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import classes.Funcionario;
import conexaoBD.conectarBanco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author marcos.sbrito2
 */
public class testeDAO {
    
    public void  cadastrarFuncionario (Funcionario novoFuncionario) throws SQLException, ClassNotFoundException 
            {
        
         Connection conexao = conectarBanco.getConexao();
         PreparedStatement prep = null;
         
         try {
         prep = conexao.prepareStatement("INSERT INTO funcionario (id, nome, numerodocumento,"
         + "numerocpf, telefone,cargo, setor, empresa) VALUES (?,?,?,?,?,?,?,?)");
         
         // Mudar os parametros 
        
            prep.setLong(1, novoFuncionario.getId());
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
            prep.executeUpdate();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
            
            
            
        }
         
         catch ( SQLException ex){
                    JOptionPane.showMessageDialog(null, "Erro ao salvar");
                    }
            
            finally {
            
            if ( conexao != null && ! conexao.isClosed()) {
                 conexao.close();
            }
        }
    
            }
}

    

