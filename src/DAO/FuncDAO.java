package DAO;

import classes.Funcionario;
import conexaoBD.conectarBanco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import classes.Visitante;
import Interfaces.Gerenciador;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class FuncDAO implements Gerenciador {

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

    @Override
    public void cadastrarVisitante(Visitante novoVisitante)
            throws SQLException, Exception {

        String sql = "INSERT INTO visitante (nome, numerodocumento,"
                + "numerocpf, telefone,datanascimento,codigocartao, empresaVisitada, funcVisitado, tipoVisita) VALUES (?,?,?,?,?,?,?,?,?)";

        Connection conexao = null;
        PreparedStatement prep = null;
        conexao = conectarBanco.getConnection();
        try {

            prep = conexao.prepareStatement(sql);
            prep.setString(1, novoVisitante.getNome());
            prep.setString(2, novoVisitante.getNumeroDocumento());
            prep.setString(3, novoVisitante.getNumeroCPF());
            prep.setString(4, novoVisitante.getTelefone());
            prep.setDate(5, Date.valueOf(novoVisitante.getDataNascimento()));
            prep.setString(6, novoVisitante.getCodigocartao());
            prep.setString(7, novoVisitante.getEmpresaVisitada());
            prep.setString(8, novoVisitante.getFuncVisitado());
            prep.setString(9, novoVisitante.getTipoVisita());
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

    @Override
    public String obterNome(String cpf) throws SQLException, Exception {

        String sql = "SELECT *  FROM funcionario WHERE numerocpf =  ?";

        Funcionario funcionario = new Funcionario();

        Connection conexao = null;
        PreparedStatement prep = null;
        conexao = conectarBanco.getConnection();
        ResultSet rs = null;

        try {

            prep = conexao.prepareStatement(sql);
            prep.setString(1, cpf);
            rs = prep.executeQuery();

            if (rs.next()) {

                funcionario.setNome(rs.getString("nome"));

                return funcionario.getNome();

            }

        } finally {

            if (prep != null && !prep.isClosed()) {
                prep.close();
            }

            if (conexao != null && !conexao.isClosed()) {
                conexao.close();
            }
        }
        return null;
    }

    @Override
    public boolean buscarPessoa(String cpf)
            throws SQLException, Exception {

        String sql = "SELECT *  FROM funcionario WHERE numerocpf =  ?";

        Connection conexao = null;
        PreparedStatement prep = null;
        conexao = conectarBanco.getConnection();
        ResultSet rs = null;

        try {

            prep = conexao.prepareStatement(sql);
            prep.setString(1, cpf);
            rs = prep.executeQuery();

            if (rs.next()) {

                return true;

            } else {

                return false;

            }

        } finally {

            if (prep != null && !prep.isClosed()) {
                prep.close();
            }

            if (conexao != null && !conexao.isClosed()) {
                conexao.close();
            }
        }

    }

    
   
    

    @Override
    public void permitirAcessoFuncionario(String cpf) throws SQLException, Exception {

        String sql = "UPDATE funcionario SET  horaE = ? where numerocpf = ?";

        Connection conexao = null;
        PreparedStatement prep = null;
        conexao = conectarBanco.getConnection();

        Timestamp dataDeHoje = new Timestamp(System.currentTimeMillis());

        prep = conexao.prepareStatement(sql);
        prep.setTimestamp(1, dataDeHoje);
        prep.setString(2, cpf);
        prep.executeUpdate();

    }

    @Override
    public void saidaAcessoFuncionario(String cpf) throws SQLException, Exception {

        String sql = "UPDATE funcionario SET  horaS = ? where numerocpf = ?";

        Connection conexao = null;
        PreparedStatement prep = null;
        conexao = conectarBanco.getConnection();

        Timestamp dataDeHoje = new Timestamp(System.currentTimeMillis());

        prep = conexao.prepareStatement(sql);
        prep.setTimestamp(1, dataDeHoje);
        prep.setString(2, cpf);
        prep.executeUpdate();

    }

    @Override
    public void excluiAcessoFuncionario(String cpf) throws SQLException, Exception {

        String sql = "DELETE FROM funcionario where numerocpf = ?";

        Connection conexao = null;
        PreparedStatement prep = null;
        conexao = conectarBanco.getConnection();

        
        prep = conexao.prepareStatement(sql);
        prep.setString(1,cpf);
        prep.executeUpdate();

    }
    
    
      @Override
    public void permitirAcessoVisitante(String cpf) throws SQLException, Exception {

        String sql = "UPDATE visitante SET  horaE = ? where numerocpf = ?";

        Connection conexao = null;
        PreparedStatement prep = null;
        conexao = conectarBanco.getConnection();

        Timestamp dataDeHoje = new Timestamp(System.currentTimeMillis());

        prep = conexao.prepareStatement(sql);
        prep.setTimestamp(1, dataDeHoje);
        prep.setString(2, cpf);
        prep.executeUpdate();

    }

    @Override
    public void saidaAcessoVisitante(String cpf) throws SQLException, Exception {

        String sql = "UPDATE visitante SET  horaS = ? where numerocpf = ?";

        Connection conexao = null;
        PreparedStatement prep = null;
        conexao = conectarBanco.getConnection();

        Timestamp dataDeHoje = new Timestamp(System.currentTimeMillis());

        prep = conexao.prepareStatement(sql);
        prep.setTimestamp(1, dataDeHoje);
        prep.setString(2, cpf);
        prep.executeUpdate();

    }

    @Override
    public void excluiAcessoVisitante(String cpf) throws SQLException, Exception {

        String sql = "DELETE FROM visitante where numerocpf = ?";

        Connection conexao = null;
        PreparedStatement prep = null;
        conexao = conectarBanco.getConnection();

        
        prep = conexao.prepareStatement(sql);
        prep.setString(1,cpf);
        prep.executeUpdate();

    }

    @Override
    public boolean buscaVisitante(String cpf) throws SQLException, Exception {
           String sql = "SELECT *  FROM visitante WHERE numerocpf =  ?";

        Connection conexao = null;
        PreparedStatement prep = null;
        conexao = conectarBanco.getConnection();
        ResultSet rs = null;

        try {

            prep = conexao.prepareStatement(sql);
            prep.setString(1, cpf);
            rs = prep.executeQuery();

            if (rs.next()) {

                return true;

            } else {

                return false;

            }

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
