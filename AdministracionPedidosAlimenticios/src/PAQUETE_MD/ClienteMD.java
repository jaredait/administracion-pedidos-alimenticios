package PAQUETE_MD;

import PAQUETE_DP.ClienteDP;
import PAQUETE_PRINCIPAL.ProgramaPrincipal;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.*;

public class ClienteMD {

    private ClienteDP clienteDP;
    private Connection con;
    private Statement stmt;
    private ResultSet result;
    private String query;

    // Constructor
    public ClienteMD(ClienteDP clienteDP) {
        ProgramaPrincipal conexion = new ProgramaPrincipal();
        con = conexion.getConexion();

        this.clienteDP = clienteDP;
    }

    public boolean insertarMD() {
        boolean completado = false;
        try {
            PreparedStatement st = con.prepareStatement("INSERT INTO CLIENTE"
                    + "(cli_cedula, cli_nombre, cli_apellido, cli_Celular, cli_correo, cli_password) values(?,?,?,?,?,?)");
            st.setString(1, clienteDP.getCedula());
            st.setString(2, clienteDP.getNombre());
            st.setString(3, clienteDP.getApellido());
            st.setString(4, clienteDP.getNumCelular());
            st.setString(5, clienteDP.getCorreo());
            st.setString(6, clienteDP.getPassword());

            int a = st.executeUpdate();
            completado = true;
        } catch (SQLException ex) {
            Logger.getLogger(ClienteMD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return completado;
    }

    public boolean consultarMD() {
        boolean completado = false;
        try {
            query = "SELECT * FROM CLIENTE WHERE cli_cedula='"+clienteDP.getCedula()+"'";
            stmt = con.createStatement();
            result = stmt.executeQuery(query);
            result.next();

            // Obtener los datos del registro
            String nombre = result.getString("cli_nombre");
            String apellido = result.getString("cli_apellido");
            String numCelular = result.getString("cli_Celular");
            String correo = result.getString("cli_correo");
            String password = result.getString("cli_password");

            // Cargar los datos al objeto ClienteDP
            clienteDP.setNombre(nombre);
            clienteDP.setApellido(apellido);
            clienteDP.setNumCelular(numCelular);
            clienteDP.setCorreo(correo);
            clienteDP.setPassword(password);

            completado = true;
        } catch (SQLException ex) {
            Logger.getLogger(ClienteMD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return completado;
    }

    public boolean actualizarMD() {
        boolean completado = false;
        try {
            query = "UPDATE CLIENTE SET cli_nombre=?, cli_apellido=?, "
                    + " cli_celular=?, cli_correo=?, cli_password=? WHERE cli_cedula=?";
            PreparedStatement st = con.prepareStatement(query);
            st.setString(6, clienteDP.getCedula());
            st.setString(1, clienteDP.getNombre());
            st.setString(2, clienteDP.getApellido());
            st.setString(3, clienteDP.getNumCelular());
            st.setString(4, clienteDP.getCorreo());
            st.setString(5, clienteDP.getPassword());

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
            query = "DELETE FROM CLIENTE WHERE cli_cedula=?";
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1, clienteDP.getCedula());

            int a = st.executeUpdate();
            completado = true;
        } catch (SQLException ex) {
            Logger.getLogger(ClienteMD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return completado;
    }

    public boolean verificarExisteMD() {
        boolean existe = false;
        try {
            query = "SELECT 1 FROM CLIENTE WHERE cli_cedula=? LIMIT 1";
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1, clienteDP.getCedula());
            result = st.executeQuery();

            if (result.next()) {
                existe = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteMD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return existe;
    }

    public ArrayList<ClienteDP> consultarTodosMD() {

        ArrayList<ClienteDP> clientes = new ArrayList<>();
        try {
            query = "SELECT * FROM CLIENTE";
            stmt = con.createStatement();
            result = stmt.executeQuery(query);

            // Llenar el ArrayList de objetos ClienteDP
            while (result.next()) {
                // Obtener los datos del registro
                String cedula = result.getString("cli_cedula");
                String nombre = result.getString("cli_nombre");
                String apellido = result.getString("cli_apellido");
                String numCelular = result.getString("cli_Celular");
                String correo = result.getString("cli_correo");
                String password = result.getString("cli_password");

                clientes.add(new ClienteDP(cedula, nombre, apellido, numCelular, correo, password));

            }

        } catch (SQLException ex) {
            Logger.getLogger(ClienteMD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return clientes;
    }

    public void cargarDatos() {

    }
}
