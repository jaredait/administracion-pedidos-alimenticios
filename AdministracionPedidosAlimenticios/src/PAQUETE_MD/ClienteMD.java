package PAQUETE_MD;

import PAQUETE_DP.ClienteDP;
import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.Properties;
import java.util.logging.*;

public class ClienteMD {

    private ClienteDP clienteDP;
    private Connection con;
    private Statement stmt;
    private ResultSet result;
    private String cadena;

    // constructor
    public ClienteMD(ClienteDP clienteDP) {

        try {
            // leer el archivo properties para la conexion a la db
            this.clienteDP = clienteDP;
            Properties props = new Properties();
            props.load(new FileInputStream("src/sql/conexiondb.properties"));
            String dburl = props.getProperty("dburl");

            /*
            // conexion a la db
            DriverManager.deregisterDriver(new org.apache.derby.jdbc.ClientDriver());
            con = DriverManager.getConnection(dburl);
             */
        } catch (IOException ex) {
            Logger.getLogger(ClienteMD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean insertarMD() {
        boolean completado = false;
        try {
            PreparedStatement st = con.prepareStatement("INSERT INTO Cliente"
                    + "(cedula, nombre, apellido, numCelular, correo) values(?,?,?,?,?)");
            st.setString(1, clienteDP.getCedula());
            st.setString(2, clienteDP.getNombre());
            st.setString(3, clienteDP.getApellido());
            st.setString(4, clienteDP.getNumCelular());
            st.setString(5, clienteDP.getCorreo());

            int a = st.executeUpdate();
            completado = true;
        } catch (SQLException ex) {
            Logger.getLogger(ClienteMD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return completado;
    }

    public boolean consultarMD() {

        return false;
    }

    public boolean actualizarMD() {
        boolean completado = false;
        try {
            PreparedStatement st = con.prepareStatement("UPDATE Cliente"
                    + "SET cli_nombre=?, cli_apellido=?, cli_numCelular=?, cli_correo=?"
                    + "WHERE cli_cedula=?)");
            st.setString(5, clienteDP.getCedula());
            st.setString(1, clienteDP.getNombre());
            st.setString(2, clienteDP.getApellido());
            st.setString(3, clienteDP.getNumCelular());
            st.setString(4, clienteDP.getCorreo());

            int a = st.executeUpdate();
            completado = true;
        } catch (SQLException ex) {
            Logger.getLogger(ClienteMD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return completado;
    }

    public boolean eliminarMD() {
        boolean completado = false;
        try {
            PreparedStatement st = con.prepareStatement("DELETE FROM Cliente"
                    + " WHERE cli_cedula=?");
            st.setString(1, clienteDP.getCedula());

            int a = st.executeUpdate();
            completado = true;
        } catch (SQLException ex) {
            Logger.getLogger(ClienteMD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return completado;
    }

    // MODIFICAR LA FORMA DE CONSULTAR SI ES QUE EXISTE EL REGISTRO! NO FUNCIONA!
    public boolean verificarExisteMD() {
        boolean existe = false;
        try {
            PreparedStatement st = con.prepareStatement("SELECT 1 "
                    + "FROM Cliente WHERE cli_cedula=? LIMIT 1");
            st.setString(1, clienteDP.getCedula());

            int a = st.executeUpdate();
            existe = true;
        } catch (SQLException ex) {
            Logger.getLogger(ClienteMD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return existe;
    }

    public ArrayList<ClienteDP> consultarTodosMD() {

        return null;
    }

    public void cargarDatos() {

    }
}
