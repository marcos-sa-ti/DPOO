/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicos;

import DAO.FuncDAO;
import classes.Funcionario;

/**
 *
 * @author CASA
 */
public class ServicosFuncionario {

    public static void cadastrarFuncionario(Funcionario funcionario) throws Exception {

        FuncDAO dao = new FuncDAO();
        dao.cadastrarPessoa(funcionario);
    }
    
    

}
