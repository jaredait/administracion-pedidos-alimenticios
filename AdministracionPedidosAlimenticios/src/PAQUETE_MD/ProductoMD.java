/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PAQUETE_MD;

import PAQUETE_DP.ProductoDP;
import PAQUETE_PRINCIPAL.ProgramaPrincipal;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.*;

public class ProductoMD {
    private ProductoDP productoDP;
    private Connection con;
    private Statement stmt;
    private ResultSet result;
    private String query;

    // constructor
    public ProductoMD(ProductoDP productoDP) {
        //conexion a la db
        ProgramaPrincipal conexion = new ProgramaPrincipal();
        con = conexion.getConexion();
        this.productoDP = productoDP;
    }

    public boolean insertarMD() {
        boolean completado = false;
        try {
            PreparedStatement st = con.prepareStatement("INSERT INTO PRODUCTO"
                    + "(prd_codigo, prd_nombre, prd_precio) values(?,?,?");
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
        boolean completado = false;
        try {
            query = "SELECT prd_nombre, prd_precio"
                    + " FROM PRODUCTO "
                    + " WHERE prd_codigo=?";
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1, productoDP.getCodigo());
            int a = st.executeUpdate();

            query = "SELECT * FROM PRODUCTO";
            stmt = con.createStatement();
            result = stmt.executeQuery(query);

            // obtener los datos del registro
            String nombre = result.getString("prd_nombre");

            // cargar los datos al objeto EstablecimientoDP
            productoDP.setNombre(nombre);

            completado = true;
        } catch (SQLException ex) {
            Logger.getLogger(ProductoMD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return completado;
    }

    public boolean actualizarMD() {
        boolean completado = false;
        try {
            PreparedStatement st = con.prepareStatement("UPDATE PRODUCTO"
                    + "SET prd_nombre=?, prd_precio=?, "
                    + "WHERE prd_codigo=?)");
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
