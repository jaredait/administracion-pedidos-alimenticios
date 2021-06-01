package PAQUETE_DP;

import java.util.ArrayList;

public class PedidoDP {

    // atributos
    private int pedidoNumero;
    private String notificacionCodigo;  // asignar la pk del objeto notificacion
    private int entregaNumero;          //igual
    private String clienteCedula;       //igual
    private ProductoDP productoDP;
    private ArrayList<ProductoDP> productos;
    //private PedidoMD pedidoMD;
    //private NotificacionMD notificacionMD;
    //private EntregaMD entregaMD;
    //private ClienteDP clienteDP;

    // constructores
    public PedidoDP() {
        productoDP = new ProductoDP();
        productos = new ArrayList<>();
        //pedidoMD = new PedidoMD();
        //notificacionMD = new NotificacionMD();
        //entregaMD = new EntregaMD();
        //clienteDP = new ClienteDP();
    }

    public PedidoDP(int pedidoNumero, String notificacionCodigo, int entregaNumero,
            String clienteCedula) {
        this.pedidoNumero = pedidoNumero;
        this.notificacionCodigo = notificacionCodigo;
        this.entregaNumero = entregaNumero;
        this.clienteCedula = clienteCedula;
        productos = new ArrayList<>();
    }

    // metodos de la clase
    public int getPedidoNumero() {
        return pedidoNumero;
    }

    public void setPedidoNumero(int pedidoNumero) {
        this.pedidoNumero = pedidoNumero;
    }

    public String getNotificacionCodigo() {
        return notificacionCodigo;
    }

    public void setNotificacionCodigo(String notificacionCodigo) {
        this.notificacionCodigo = notificacionCodigo;
    }

    public int getEntregaNumero() {
        return entregaNumero;
    }

    public void setEntregaNumero(int entregaNumero) {
        this.entregaNumero = entregaNumero;
    }

    public String getClienteCedula() {
        return clienteCedula;
    }

    public void setClienteCedula(String clienteCedula) {
        this.clienteCedula = clienteCedula;
    }

    public boolean insertarDP() {
        return false;
        //return pedidoMD.insertarMD();
    }

    public boolean consultarDP() {
        return false;
        //return pedidoMD.consultarMD();
    }

    /*
    public ArrayList<PedidoMD> consultarTodosDP(){
        return pedidoMD.consultarTodosMD();
    }
     */
    public boolean verificarExisteDP() {
        return false;
        //return pedidoMD.verificarExisteMD();
    }

    public ProductoDP getProductoDP() {
        return productoDP;
    }

    public boolean addProductoDP(String codigoProducto) {
        return false;
        //return pedidoMD.addProducto(codigoProducto);
    }
}
