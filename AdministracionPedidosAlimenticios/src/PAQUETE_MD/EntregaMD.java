package PAQUETE_MD;

import PAQUETE_DP.EntregaDP;
import PAQUETE_PRINCIPAL.ProgramaPrincipal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
        return completado;
    }

}
