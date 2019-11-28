/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import classes.Funcionario;
import java.sql.SQLException;

/**
 *
 * @author CASA
 */
public interface Cadastrar {
    
    public void cadastrarPessoa(Funcionario novoFuncionario)  throws SQLException, Exception;
    
    
    //public void excluirPessoa();
    
    //public void atualizarPessoa();
    
    //public void buscarPessoa();
    
    //public void relatorioPessoa();
    
}
