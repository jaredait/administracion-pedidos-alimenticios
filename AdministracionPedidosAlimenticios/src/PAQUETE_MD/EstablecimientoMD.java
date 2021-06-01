package PAQUETE_MD;

import PAQUETE_DP.EstablecimientoDP;
import PAQUETE_PRINCIPAL.ProgramaPrincipal;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.*;

public class EstablecimientoMD {

    private EstablecimientoDP establecimientoDP;
    private Connection con;
    private Statement stmt;
    private ResultSet result;
    private String query;

    // constructor
    public EstablecimientoMD(EstablecimientoDP establecimientoDP) {
        // conexion a la db
        ProgramaPrincipal conexion = new ProgramaPrincipal();
        con = conexion.getConexion();

        this.establecimientoDP = establecimientoDP;
    }

    public boolean insertarMD() {
        boolean completado = false;
        try {
            PreparedStatement st = con.prepareStatement("INSERT INTO ESTABLECIMIENTO"
                    + " (est_codigo, est_nombre, est_num_telefono, est_calle_principal, "
                    + " est_calle_secundaria, est_num_direccion, est_tipo, est_password) values(?,?,?,?,?,?,?,?)");
            st.setString(1, establecimientoDP.getCodigo());
            st.setString(2, establecimientoDP.getNombre());
            st.setString(3, establecimientoDP.getNumTelefono());
            st.setString(4, establecimientoDP.getCallePrincipal());
            st.setString(5, establecimientoDP.getCalleSecundaria());
            st.setString(6, establecimientoDP.getNumDireccion());
            st.setString(7, establecimientoDP.getTipo());
            st.setString(8, establecimientoDP.getPassword());

            int a = st.executeUpdate();
            completado = true;
        } catch (SQLException ex) {
            Logger.getLogger(EstablecimientoMD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return completado;
    }

    public boolean consultarMD() {
        boolean completado = false;
        try {
            query = "SELECT * FROM ESTABLECIMIENTO WHERE est_codigo='"+establecimientoDP.getCodigo()+"'";
            stmt = con.createStatement();
            result = stmt.executeQuery(query);
            result.next();

            // obtener los datos del registro
            String nombre = result.getString("est_nombre");
            String numTelefono = result.getString("est_num_telefono");
            String callePrincipal = result.getString("est_calle_principal");
            String calleSecundaria = result.getString("est_calle_secundaria");
            String numDireccion = result.getString("est_num_direccion");
            String tipo = result.getString("est_tipo");
            String password = result.getString("est_password");

            // cargar los datos al objeto EstablecimientoDP
            establecimientoDP.setNombre(nombre);
            establecimientoDP.setNumTelefono(numTelefono);
            establecimientoDP.setCallePrincipal(callePrincipal);
            establecimientoDP.setCalleSecundaria(calleSecundaria);
            establecimientoDP.setNumDireccion(numDireccion);
            establecimientoDP.setTipo(tipo);
            establecimientoDP.setPassword(password);

            completado = true;
        } catch (SQLException ex) {
            Logger.getLogger(EstablecimientoMD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return completado;
    }

    public boolean actualizarMD() {
        boolean completado = false;
        try {
            query = "UPDATE ESTABLECIMIENTO SET est_nombre=?, est_num_telefono=?, "
                    + " est_calle_principal=?, est_calle_secundaria=?, "
                    + " est_num_direccion=?, est_tipo=?, est_password WHERE est_codigo=?";
            PreparedStatement st = con.prepareStatement(query);
            st.setString(8, establecimientoDP.getCodigo());
            st.setString(1, establecimientoDP.getNombre());
            st.setString(2, establecimientoDP.getNumTelefono());
            st.setString(3, establecimientoDP.getCallePrincipal());
            st.setString(4, establecimientoDP.getCalleSecundaria());
            st.setString(5, establecimientoDP.getNumDireccion());
            st.setString(6, establecimientoDP.getTipo());
            st.setString(7, establecimientoDP.getPassword());

            int a = st.executeUpdate();
            completado = true;
        } catch (SQLException ex) {
            Logger.getLogger(EstablecimientoMD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return completado;
    }

    public boolean eliminarMD() {
        boolean completado = false;
        try {
            query = "DELETE FROM ESTABLECIMIENTO WHERE est_codigo=?";
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1, establecimientoDP.getCodigo());

            int a = st.executeUpdate();
            completado = true;
        } catch (SQLException ex) {
            Logger.getLogger(EstablecimientoMD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return completado;
    }

    // MODIFICAR LA FORMA DE CONSULTAR SI ES QUE EXISTE EL REGISTRO! NO FUNCIONA!
    public boolean verificarExisteMD() {
        boolean existe = false;
        try {
            query = "SELECT 1 FROM ESTABLECIMIENTO WHERE est_codigo=? LIMIT 1";
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1, establecimientoDP.getCodigo());
            result = st.executeQuery();

            if (result.next()) {
                existe = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(EstablecimientoMD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return existe;
    }

    public ArrayList<EstablecimientoDP> consultarTodosMD() {
        ArrayList<EstablecimientoDP> establecimientos = new ArrayList<>();
        try {
            query = "SELECT * FROM ESTABLECIMIENTO";
            stmt = con.createStatement();
            result = stmt.executeQuery(query);

            // llenar el ArrayList de objetos EstablecimientoDP
            while (result.next()) {
                // obtener los datos del registro
                String codigo = result.getString("est_codigo");
                String nombre = result.getString("est_nombre");
                String numTelefono = result.getString("est_num_telefono");
                String callePrincipal = result.getString("est_calle_principal");
                String calleSecundaria = result.getString("est_calle_secundaria");
                String numDireccion = result.getString("est_num_direccion");
                String tipo = result.getString("est_tipo");
                String password = result.getString("est_password");

                establecimientos.add(new EstablecimientoDP(codigo, nombre, 
                        numTelefono, callePrincipal, calleSecundaria, 
                        numDireccion, tipo, password));
            }

        } catch (SQLException ex) {
            Logger.getLogger(EstablecimientoMD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return establecimientos;
    }

    public void cargarDatos() {

    }
}
