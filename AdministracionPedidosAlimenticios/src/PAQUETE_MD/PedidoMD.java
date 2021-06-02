package PAQUETE_MD;

import PAQUETE_DP.PedidoDP;
import PAQUETE_DP.ProductoDP;
import PAQUETE_PRINCIPAL.ProgramaPrincipal;
import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PedidoMD {

    // atributos
    private PedidoDP pedidoDP;
    private Connection con;
    private Statement stmt;
    private ResultSet result;
    private String query;

    // constructor
    public PedidoMD(PedidoDP pedidoDP) {
        // conexion a la db
        ProgramaPrincipal conexion = new ProgramaPrincipal();
        con = conexion.getConexion();

        this.pedidoDP = pedidoDP;
    }

    public boolean insertarMD() {
        boolean completado = false;
        try {
            // insertar el encabezado del pedido en tabla PEDIDO
            query = "INSERT INTO PEDIDO (ped_numero) VALUES(?)";
            PreparedStatement st = con.prepareStatement(query);
            st.setInt(1, pedidoDP.getPedidoNumero());
            int a = st.executeUpdate();
            
            // insertar el detalle del pedido en DETALLE_PEDIDO
            ArrayList<ProductoDP> productos = pedidoDP.getProductos();
            query = "INSERT INTO DETALLE_PEDIDO VALUES(?,?)";
            for(ProductoDP temp : productos){
                st = con.prepareStatement(query);
                st.setInt(1, pedidoDP.getPedidoNumero());
                st.setString(2, temp.getCodigo());
                a = st.executeUpdate();
            }
            completado = true;
        } catch (SQLException ex) {
            Logger.getLogger(PedidoMD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return completado;
    }

    public int getNumeroPedido() {
        int numero = 0;
        try {
            // obtener el numero de filas para asignar el numero de pedido
            query = "SELECT COUNT(*) AS rowcount FROM PEDIDO";
            stmt = con.createStatement();
            result = stmt.executeQuery(query);
            result.next();
            numero = result.getInt("rowcount");

        } catch (SQLException ex) {
            Logger.getLogger(PedidoMD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return numero;
    }
}