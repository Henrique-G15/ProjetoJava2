package sl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDB {
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/tdelino?useSSL=false";
    private static final String USER = "root";
    private static final String PASSWORD = "senha";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName(DRIVER);
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
