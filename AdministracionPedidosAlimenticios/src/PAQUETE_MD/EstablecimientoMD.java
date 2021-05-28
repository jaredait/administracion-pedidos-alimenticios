package PAQUETE_MD;

import PAQUETE_DP.EstablecimientoDP;
import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.Properties;
import java.util.logging.*;

public class EstablecimientoMD {
    private EstablecimientoDP establecimientoDP;
    private Connection con;
    private Statement stmt;
    private ResultSet result;
    private String cadena;

    // constructor
    public EstablecimientoMD(EstablecimientoDP establecimientoDP) {
        
        
        try {
            // leer el archivo properties para la conexion a la db
            this.establecimientoDP = establecimientoDP;
            Properties props = new Properties();
            props.load(new FileInputStream("src/sql/conexiondb.proprties"));
            String dburl = props.getProperty("dburl");
            
            /*
            // conexion a la db
            DriverManager.deregisterDriver(new org.apache.derby.jdbc.ClientDriver());
            con = DriverManager.getConnection(dburl);
            */
        } catch (IOException ex) {
            Logger.getLogger(EstablecimientoMD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean insertarMD(){
        boolean completado = false;
        try {
            PreparedStatement st = con.prepareStatement("INSERT INTO Establecimiento"
                    + "(codigo, nombre, numTelefono, callePrincipal, "
                    + "calleSecundaria, numDireccion, tipo) values(?,?,?,?,?,?,?");
            st.setString(1, establecimientoDP.getCodigo());
            st.setString(2, establecimientoDP.getNombre());
            st.setString(3, establecimientoDP.getNumTelefono());
            st.setString(4, establecimientoDP.getCallePrincipal());
            st.setString(5, establecimientoDP.getCalleSecundaria());
            st.setString(6, establecimientoDP.getNumDireccion());
            st.setString(7, establecimientoDP.getTipo());
            int a = st.executeUpdate();
            completado = true;
        } catch (SQLException ex) {
            Logger.getLogger(EstablecimientoMD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return completado;
    }    
    
    public boolean consultarMD(){
        
        return false;
    }
    
    public boolean actualizarMD(){
    
        return false;
    }
    
    public boolean eliminarMD(){
        
        return false;
    }
    
    public boolean verificarExisteMD(){
        
        return false;
    }
    
    public ArrayList<EstablecimientoDP> consultarTodosMD(){
        
        return null;
    }
    
    public void cargarDatos(){
        
    }
    
}
