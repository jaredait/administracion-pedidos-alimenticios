package PAQUETE_PRINCIPAL;

import java.sql.Connection;
import java.sql.DriverManager;

public class ProgramaPrincipal {

    public static void main(String[] args) {
        // Conexion a la db
        ProgramaPrincipal conexion = new ProgramaPrincipal();
        Connection connection = null;
        connection = conexion.getConexion();
        System.out.println("Conexion: " + connection);
    }
    
    // conecta la aplicación con la db. Retorna el objeto conexión si es que se realiza correctamente
    public Connection getConexion() {
         Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://sql10.freesqldatabase.com:3306/sql10415625", "sql10415625", "MEuPnqN9wJ");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return connection;
    }
}
