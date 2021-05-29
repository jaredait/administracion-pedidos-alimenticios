/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PAQUETE_MD;

import PAQUETE_DP.ProductoDP;
import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.Properties;
import java.util.logging.*;

public class ProductoMD {
    private ProductoDP productoDP;
    private Connection con;
    private Statement stmt;
    private ResultSet result;
    private String cadena;

    // constructor
    public ProductoMD(ProductoDP productoDP) {

        try {
            // leer el archivo properties para la conexion a la db
            this.productoDP = productoDP;
            Properties props = new Properties();
            props.load(new FileInputStream("src/sql/conexiondb.properties"));
            String dburl = props.getProperty("dburl");

            /*
            // conexion a la db
            DriverManager.deregisterDriver(new org.apache.derby.jdbc.ClientDriver());
            con = DriverManager.getConnection(dburl);
             */
        } catch (IOException ex) {
            Logger.getLogger(ProductoMD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean insertarMD() {
        boolean completado = false;
        try {
            PreparedStatement st = con.prepareStatement("INSERT INTO Producto"
                    + "(codigo, nombre, precio, callePrincipal) values(?,?,?");
            st.setString(1, productoDP.getCodigo());
            st.setString(2, productoDP.getNombre());
            st.setString(3, String.valueOf(productoDP.getPrecio()));

            int a = st.executeUpdate();
            completado = true;
        } catch (SQLException ex) {
            Logger.getLogger(ProductoMD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return completado;
    }

    public boolean consultarMD() {

        return false;
    }

    public boolean actualizarMD() {
        boolean completado = false;
        try {
            PreparedStatement st = con.prepareStatement("UPDATE Producto"
                    + "SET pro_nombre=?, pro_precio=?, est_callePrincipal=?, "
                    + "WHERE pro_codigo=?)");
            st.setString(3, productoDP.getCodigo());
            st.setString(1, productoDP.getNombre());
            st.setString(2, String.valueOf(productoDP.getPrecio()));

            int a = st.executeUpdate();
            completado = true;
        } catch (SQLException ex) {
            Logger.getLogger(ProductoMD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return completado;
    }

    public boolean eliminarMD() {
        boolean completado = false;
        try {
            PreparedStatement st = con.prepareStatement("DELETE FROM Producto"
                    + " WHERE pro_codigo=?");
            st.setString(1, productoDP.getCodigo());

            int a = st.executeUpdate();
            completado = true;
        } catch (SQLException ex) {
            Logger.getLogger(ProductoMD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return completado;
    }

    // MODIFICAR LA FORMA DE CONSULTAR SI ES QUE EXISTE EL REGISTRO! NO FUNCIONA!
    public boolean verificarExisteMD() {
        boolean existe = false;
        try {
            PreparedStatement st = con.prepareStatement("SELECT 1 "
                    + "FROM Producto WHERE pro_codigo=? LIMIT 1");
            st.setString(1, productoDP.getCodigo());
            
            int a = st.executeUpdate();
            existe = true;
        } catch (SQLException ex) {
            Logger.getLogger(ProductoMD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return existe;
    }

    public ArrayList<ProductoDP> consultarTodosMD() {

        return null;
    }

    public void cargarDatos() {

    }
}
