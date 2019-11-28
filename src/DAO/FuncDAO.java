package DAO;

import classes.Funcionario;
import conexaoBD.conectarBanco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Interfaces.Cadastrar;
import java.sql.Date;
import java.time.LocalDate;

public class FuncDAO implements Cadastrar {

    /**
     *
     * @param novoFuncionario
     * @throws SQLException
     * @throws Exception
     */
    @Override
    public void cadastrarPessoa(Funcionario novoFuncionario)
            throws SQLException, Exception {

        String sql = "INSERT INTO funcionario (nome, numerodocumento,"
                + "numerocpf, telefone,cargo, setor, empresa,datanascimento,codigocartao) VALUES (?,?,?,?,?,?,?,?,?)";

        Connection conexao = null;
        PreparedStatement prep = null;
        conexao = conectarBanco.getConnection();
        try {

            prep = conexao.prepareStatement(sql);
            prep.setString(1, novoFuncionario.getNome());
            prep.setString(2, novoFuncionario.getNumeroDocumento());
            prep.setString(3, novoFuncionario.getNumeroCPF());
            prep.setString(4, novoFuncionario.getTelefone());
            prep.setString(5, novoFuncionario.getCargo());
            prep.setString(6, novoFuncionario.getSetor());
            prep.setString(7, novoFuncionario.getEmpresa());
            prep.setDate(8, Date.valueOf(novoFuncionario.getDataNascimento()));
            prep.setString(9, novoFuncionario.getCodigocartao());

            prep.executeUpdate();

        } finally {

            if (prep != null && !prep.isClosed()) {
                prep.close();
            }

            if (conexao != null && !conexao.isClosed()) {
                conexao.close();
            }
        }
    }

}
