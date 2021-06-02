/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PAQUETE_MD;

import PAQUETE_DP.NotificacionDP;
import PAQUETE_PRINCIPAL.ProgramaPrincipal;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.*;

public class NotificacionMD {
    private NotificacionDP notificacionDP;
    private Connection con;
    private Statement stmt;
    private ResultSet result;
    private String query;

    // constructor
    public NotificacionMD(NotificacionDP notificacionDP) {
        //conexion a la db
        ProgramaPrincipal conexion = new ProgramaPrincipal();
        con = conexion.getConexion();
        this.notificacionDP = notificacionDP;
    }

    public boolean insertarMD() {
        boolean completado = false;
        try {
            PreparedStatement st = con.prepareStatement("INSERT INTO NOTIFICACION"
                    + "(not_codigo, ped_numero, not_detalle) values(?,?,?)");
            st.setString(1, notificacionDP.getCodigo());
            st.setInt(2, notificacionDP.getNumPedido());
            st.setString(3, notificacionDP.getDetalle());

            int a = st.executeUpdate();
            completado = true;
        } catch (SQLException ex) {
            Logger.getLogger(NotificacionMD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return completado;
    }

    public boolean consultarMD() {
        boolean completado = false;
        try {
            query = "SELECT * FROM NOTIFICACION WHERE not_codigo='"+notificacionDP.getCodigo()+"'";
            stmt = con.createStatement();
            result = stmt.executeQuery(query);
            result.next();

            // obtener los datos del registro
            int numPedido = result.getInt("ped_numero");
            String detalle = result.getString("not_detalle");

            // cargar los datos al objeto NotificacionDP
            notificacionDP.setNumPedido(numPedido);
            notificacionDP.setDetalle(detalle);

            completado = true;
        } catch (SQLException ex) {
            Logger.getLogger(NotificacionMD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return completado;
    }

    public boolean actualizarMD() {
        boolean completado = false;
        try {
            query = "UPDATE NOTIFICACION SET ped_numero=?, not_detalle=? WHERE not_codigo=?";
            PreparedStatement st = con.prepareStatement(query);
            st.setString(3, notificacionDP.getCodigo());
            st.setInt(1, notificacionDP.getNumPedido()); 
            st.setString(2, notificacionDP.getDetalle());

            int a = st.executeUpdate();
            completado = true;
        } catch (SQLException ex) {
            Logger.getLogger(NotificacionMD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return completado;
    }

    public boolean eliminarMD() {
        boolean completado = false;
        try {
            query = "DELETE FROM NOTIFICACION WHERE not_codigo=?";
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1, notificacionDP.getCodigo());

            int a = st.executeUpdate();
            completado = true;
        } catch (SQLException ex) {
            Logger.getLogger(NotificacionMD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return completado;
    }

    // MODIFICAR LA FORMA DE CONSULTAR SI ES QUE EXISTE EL REGISTRO! NO FUNCIONA!
    public boolean verificarExisteMD() {
        boolean existe = false;
        try {
            query = "SELECT 1 FROM NOTIFICACION WHERE not_codigo=? LIMIT 1";
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1, notificacionDP.getCodigo());
            result = st.executeQuery();

            if (result.next()) {
                existe = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(NotificacionMD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return existe;
    }

    public ArrayList<NotificacionDP> consultarTodosMD() {

        ArrayList<NotificacionDP> notificaciones = new ArrayList<>();
        try {
            query = "SELECT * FROM NOTIFICACION";
            stmt = con.createStatement();
            result = stmt.executeQuery(query);

            // llenar el ArrayList de objetos NotificacionDP
            while (result.next()) {
                // obtener los datos del registro
                String codigo = result.getString("not_codigo");
                int numPedido = result.getInt("ped_numero");
                String detalle = result.getString("not_detalle");

                notificaciones.add(new NotificacionDP(codigo, numPedido, detalle));

            }

        } catch (SQLException ex) {
            Logger.getLogger(ProductoMD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return notificaciones;
    }

    public void cargarDatos() {

    }
}
