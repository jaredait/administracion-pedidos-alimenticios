package administracionpedidosalimenticios;

import java.sql.Connection;
import java.sql.DriverManager;

public class AdministracionPedidosAlimenticios {

    public static void main(String[] args) {
        // Conexion a la db
        AdministracionPedidosAlimenticios conexion = new AdministracionPedidosAlimenticios();
        Connection connection = null;
        connection = conexion.get_connection();
        System.out.println("Conexion: " + connection);
    }
    
    public Connection get_connection() {
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
