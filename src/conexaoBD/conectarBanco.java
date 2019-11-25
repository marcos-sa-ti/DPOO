package conexaoBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class conectarBanco {
    
    public static Connection getConnection() throws SQLException, ClassNotFoundException {
       
        Connection conexao = null;
        String dbURL = "jdbc:mysql://localhost:3306/controleacesso";
        Properties prop = new Properties();
        prop.put("user","root");
        prop.put("password", "1234");
        prop.put("ServerTimezone", "UTC");
        conexao = DriverManager.getConnection(dbURL,prop);
    
        return conexao;
}
    
}
