package PAQUETE_MD;

import PAQUETE_DP.PedidoDP;
import PAQUETE_DP.ProductoDP;
import PAQUETE_PRINCIPAL.ProgramaPrincipal;
//import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;
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
            for (ProductoDP temp : productos) {
                st = con.prepareStatement(query);
                st.setInt(1, pedidoDP.getPedidoNumero());
                System.out.println(temp.getCodigo());
                st.setString(2, temp.getCodigo());
                a = st.executeUpdate();
            }
            completado = true;

        } catch (SQLException ex) {
            Logger.getLogger(PedidoMD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return completado;
    }

    public boolean actualizarMD() {
        boolean completado = false;
        try {
            query = "DELETE FROM DETALLE_PEDIDO WHERE PED_NUMERO=?";
            PreparedStatement st = con.prepareStatement(query);
            st.setInt(1, pedidoDP.getPedidoNumero());

            int a = st.executeUpdate();
            ArrayList<ProductoDP> productos = pedidoDP.getProductos();          
            query = "INSERT INTO DETALLE_PEDIDO (PED_NUMERO, PRD_CODIGO)"
                    + "VALUES(?, ?) ON DUPLICATE KEY UPDATE PRD_CODIGO = VALUES(PRD_CODIGO)";
            for (ProductoDP temp : productos) {
                st = con.prepareStatement(query);
                st.setInt(1, pedidoDP.getPedidoNumero());
                System.out.println(temp.getCodigo());
                st.setString(2, temp.getCodigo());
                a = st.executeUpdate();
            }
            completado = true;
        } catch (SQLException ex) {
            Logger.getLogger(PedidoMD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return completado;
    }
    
    public boolean eliminarMD(){
        boolean completado = false;
        try {
            query = "DELETE FROM PEDIDO WHERE PED_NUMERO=?";
            PreparedStatement st = con.prepareStatement(query);
            st.setInt(1, pedidoDP.getPedidoNumero());
            int a = st.executeUpdate();
            
            query = "DELETE FROM DETALLE_PEDIDO WHERE PED_NUMERO=?";
            st = con.prepareStatement(query);
            st.setInt(1, pedidoDP.getPedidoNumero());
            a = st.executeUpdate();
            completado = true;
        } catch (SQLException ex) {
            Logger.getLogger(ClienteMD.class.getName()).log(Level.SEVERE, null, ex);
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

    public ArrayList<ProductoDP> consultarDetalleMD() {
        ArrayList<ProductoDP> productos = new ArrayList<>();
        try {
            query = "SELECT prd_codigo FROM DETALLE_PEDIDO WHERE ped_numero="
                    + pedidoDP.getPedidoNumero();
            stmt = con.createStatement();
            result = stmt.executeQuery(query);

            while (result.next()) {
                String codigo = result.getString("prd_codigo");
                ProductoDP temp = new ProductoDP(codigo);
                temp.consultarDP();
                productos.add(temp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PedidoMD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return productos;
    }

    public boolean consultarMD() {
        boolean completado = false;
        try {
            query = "SELECT * FROM PEDIDO WHERE ped_numero=" + pedidoDP.getPedidoNumero();
            stmt = con.createStatement();
            result = stmt.executeQuery(query);
            result.next();

            // controlar la excepcion porque puede retornar un valor null
            try {
                String notifCodigo = result.getString("not_codigo");
                pedidoDP.setNotificacionCodigo(notifCodigo);
            } catch (Exception e) {
                System.out.println(e.toString());
            }
            try {
                int entregaNumero = result.getInt("ent_numero");
                pedidoDP.setEntregaNumero(entregaNumero);
            } catch (Exception e) {
                System.out.println(e.toString());
            }
            try {
                String cliCedula = result.getString("cli_cedula");
                pedidoDP.setClienteCedula(cliCedula);
            } catch (Exception e) {
                System.out.println(e.toString());
            }

            completado = true;
        } catch (SQLException ex) {
            Logger.getLogger(PedidoMD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return completado;
    }

    public ArrayList<PedidoDP> consultarTodosPedidosMD() {
        ArrayList<PedidoDP> pedidos = new ArrayList<>();

        try {
            query = "SELECT * FROM PEDIDO";
            stmt = con.createStatement();
            result = stmt.executeQuery(query);

            while (result.next()) {
                int pedidoNumero = result.getInt("ped_numero");
                PedidoDP temp = new PedidoDP(pedidoNumero);
                temp.consultarDP();
                pedidos.add(temp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PedidoMD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pedidos;
    }
    
    public boolean verificarExisteMD() {
        boolean existe = false;
        try {
            query = "SELECT 1 FROM PEDIDO WHERE PED_NUMERO=? LIMIT 1";
            PreparedStatement st = con.prepareStatement(query);
            st.setInt(1, pedidoDP.getPedidoNumero());
            result = st.executeQuery();

            if (result.next()) {
                existe = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(PedidoMD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return existe;
    }

}
