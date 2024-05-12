package connexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connexion {
    private static final String URL = "jdbc:mysql://localhost:3306/gestion_voiture";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    
    private static Connection conn;

    public static Connection getConn() {
        try {
            if (conn == null || conn.isClosed()) {
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection(URL, USER, PASSWORD);
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Problème de chargement du Driver!");
            System.exit(1);
        } catch (SQLException e) {
            System.err.println("Error opening SQL connection:" + e.getMessage());
        }
        return conn;
    }
}



