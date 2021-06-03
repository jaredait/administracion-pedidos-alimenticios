package PAQUETE_MD;

import PAQUETE_DP.EntregaDP;
import PAQUETE_PRINCIPAL.ProgramaPrincipal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EntregaMD {

    // atributos
    EntregaDP entregaDP;
    private Connection con;
    private Statement stmt;
    private ResultSet result;
    private String query;

    // constructor
    public EntregaMD(EntregaDP entregaDP) {
        // conexion a la db
        ProgramaPrincipal conexion = new ProgramaPrincipal();
        con = conexion.getConexion();

        this.entregaDP = new EntregaDP();
    }

    public boolean insertarMD() {
        boolean completado = false;
        try {
            PreparedStatement st = con.prepareStatement("INSERT INTO ENTREGA"
                    + "(ENT_NUMERO, PED_NUMERO, ENT_TIPO, ENT_COMENTARIO) values(?,?,?,?)");
            st.setInt(1, entregaDP.getEntregaNumero());
            st.setInt(2, entregaDP.getPedidoNumero());
            st.setString(3, entregaDP.getTipo());
            st.setString(4, entregaDP.getComentario());

            int a = st.executeUpdate();
            completado = true;
        } catch (SQLException ex) {
            Logger.getLogger(ClienteMD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return completado;
    }

    public boolean modificarMD() {
        boolean completado = false;
        try {
            query = "UPDATE ENTREGA SET ent_tipo=?, ent_comentario=? WHERE ent_numero=?";
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1, entregaDP.getTipo());
            st.setString(2, entregaDP.getComentario());
            st.setInt(3, entregaDP.getEntregaNumero());
            int a = st.executeUpdate();

            completado = true;
        } catch (SQLException ex) {
            Logger.getLogger(EntregaMD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return completado;
    }

    public boolean eliminarMD() {
        boolean completado = false;
        try {
            query = "delete from ENTREGA where ent_numero=?";
            PreparedStatement st = con.prepareStatement(query);
            st.setInt(1, entregaDP.getEntregaNumero());
            int a = st.executeUpdate();
            completado = true;
        } catch (SQLException ex) {
            Logger.getLogger(EntregaMD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return completado;
    }

    public boolean verificarExisteMD() {
        boolean existe = false;
        try {
            query = "SELECT 1 FROM ENTREGA WHERE ENT_NUMERO=? LIMIT 1";
            PreparedStatement st = con.prepareStatement(query);
            st.setInt(1, entregaDP.getEntregaNumero());
            result = st.executeQuery();

            if (result.next()) {
                existe = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(EntregaMD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return existe;
    }

    public boolean consultarMD() {
        boolean completado = false;
        try {
            query = "SELECT * FROM ENTREGA WHERE ent_numero='" + entregaDP.getEntregaNumero() + "'";
            stmt = con.createStatement();
            result = stmt.executeQuery(query);
            result.next();

            // obtener los datos del registro
            int numPedido = result.getInt("ped_numero");
            String entTipo = result.getString("ent_tipo");
            String comentario = result.getString("ent_comentario");

            // cargar los datos al objeto EntregaDP
            entregaDP.setPedidoNumero(numPedido);
            entregaDP.setTipo(entTipo);
            entregaDP.setComentario(comentario);

            completado = true;
        } catch (SQLException ex) {
            Logger.getLogger(EntregaMD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return completado;
    }

    public ArrayList<EntregaDP> consultarTodosMD() {

        ArrayList<EntregaDP> entregas = new ArrayList<EntregaDP>();
        try {
            query = "SELECT * FROM ENTREGA";
            stmt = con.createStatement();
            result = stmt.executeQuery(query);

            // llenar el ArrayList de objetos EntregaDP
            while (result.next()) {
                // obtener los datos del registro
                int numEntrega = result.getInt("ent_numero");
                int numPedido = result.getInt("ped_numero");
                String entTipo = result.getString("ent_tipo");
                String comentario = result.getString("ent_comentario");

                entregas.add(new EntregaDP(numEntrega, numPedido, entTipo, comentario));

            }

        } catch (SQLException ex) {
            Logger.getLogger(EntregaMD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return entregas;
    }

}
