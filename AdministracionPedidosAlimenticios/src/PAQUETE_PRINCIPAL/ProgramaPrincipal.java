package PAQUETE_PRINCIPAL;

import PAQUETE_GUI.MenuPrincipal;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class ProgramaPrincipal {

    public static void main(String[] args) {
        // Conexion a la db
        ProgramaPrincipal conexion = new ProgramaPrincipal();
        Connection connection = null;
        connection = conexion.getConexion();
        System.out.println("Conexion: " + connection);
        
        MenuPrincipal menuPrincipal = new MenuPrincipal();
        menuPrincipal.setVisible(true);
    }
    
    // conecta la aplicación con la db. Retorna el objeto conexión si es que se realiza correctamente
    public Connection getConexion() {
         Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            // leer el archivo .properties
            Properties props = new Properties();
            props.load(new FileInputStream("src/PAQUETE_PRINCIPAL/conexiondb.properties"));
            String dburl = props.getProperty("dburl");
            String user = props.getProperty("databaseuser");
            String password = props.getProperty("databasepassword");
            
            connection = DriverManager.getConnection(dburl, user, password);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return connection;
    }
}
