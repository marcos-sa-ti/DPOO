package conexaoBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conectarBanco {
    
    public static Connection getConexao() throws SQLException, ClassNotFoundException {
        
        try {
            Connection connection = null;
            String driverName = "com.mysql.jdbc.Driver";
            Class.forName(driverName);
            // NOME DO BANCO DE DADOS
            String nomeBD = "controleacesso";
            // COLOCAR A PORTA
            String url = "jdbc:mysql://localhost:3307/" + nomeBD + "?zeroDateTimeBehavior=convertToNull";
            // USUARIO
            String username = "root";
            // SENHA
            String password = "";
            connection = DriverManager.getConnection(url, username, password);
            return connection;

        } catch (SQLException e) {
            System.out.println("Erro na conexão do banco de dados: " + e);
            return null;
        }
    }
    
    
    public void restartConnection() throws SQLException, ClassNotFoundException {
        getConexao().close();
        getConexao();
    }
    

}
