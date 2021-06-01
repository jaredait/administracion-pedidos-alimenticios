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
                    + "(prd_codigo, est_codigo, prd_nombre, prd_precio) values(?,?,?,?)");
            st.setString(1, productoDP.getCodigo());
            st.setString(2, "e002");
            st.setString(3, productoDP.getNombre());
            st.setDouble(4, productoDP.getPrecio());

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
            query = "SELECT * FROM PRODUCTO WHERE prd_codigo='"+productoDP.getCodigo()+"'";
            stmt = con.createStatement();
            result = stmt.executeQuery(query);
            result.next();

            // obtener los datos del registro
            String nombre = result.getString("prd_nombre");
            double precio = result.getDouble("prd_precio");

            // cargar los datos al objeto ProductoDP
            productoDP.setNombre(nombre);
            productoDP.setPrecio(precio);

            completado = true;
        } catch (SQLException ex) {
            Logger.getLogger(ProductoMD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return completado;
    }

    public boolean actualizarMD() {
        boolean completado = false;
        try {
            query = "UPDATE PRODUCTO SET prd_nombre=?, prd_precio=? WHERE prd_codigo=?";
            PreparedStatement st = con.prepareStatement(query);
            st.setString(3, productoDP.getCodigo());
            st.setString(1, productoDP.getNombre());
            st.setDouble(2, productoDP.getPrecio());

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
            query = "DELETE FROM PRODUCTO WHERE prd_codigo=?";
            PreparedStatement st = con.prepareStatement(query);
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
            query = "SELECT 1 FROM PRODUCTO WHERE prd_codigo=? LIMIT 1";
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1, productoDP.getCodigo());
            result = st.executeQuery();

            if (result.next()) {
                existe = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductoMD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return existe;
    }

    public ArrayList<ProductoDP> consultarTodosMD() {

        ArrayList<ProductoDP> productos = new ArrayList<>();
        try {
            query = "SELECT * FROM PRODUCTO";
            stmt = con.createStatement();
            result = stmt.executeQuery(query);

            // llenar el ArrayList de objetos ProductoDP
            while (result.next()) {
                // obtener los datos del registro
                String codigo = result.getString("prd_codigo");
                String nombre = result.getString("prd_nombre");
                double precio = result.getDouble("prd_precio");

                productos.add(new ProductoDP(codigo, nombre, precio));

            }

        } catch (SQLException ex) {
            Logger.getLogger(ProductoMD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return productos;
    }

    public void cargarDatos() {

    }
}
