package PAQUETE_DP;

import PAQUETE_MD.PedidoMD;
import java.util.ArrayList;

public class PedidoDP {

    // atributos
    private int pedidoNumero;
    private String notificacionCodigo;  // asignar la pk del objeto notificacion
    private int entregaNumero;          //igual
    private String clienteCedula;       //igual
    private ProductoDP productoDP;
    private ArrayList<ProductoDP> productos;
    private PedidoMD pedidoMD;
    //private NotificacionMD notificacionMD;
    //private EntregaMD entregaMD;
    //private ClienteDP clienteDP;

    // constructores
    public PedidoDP() {
        productoDP = new ProductoDP();
        productos = new ArrayList<>();
        pedidoMD = new PedidoMD(this);
        //notificacionMD = new NotificacionMD();
        //entregaMD = new EntregaMD();
        //clienteDP = new ClienteDP();
        
        //asignar un numero de pedido al objeto
        pedidoNumero = 0;
        pedidoMD = new PedidoMD(this);
        setNumeroPedido();
        
        getPedidoNumero();
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
        boolean resultado = pedidoMD.insertarMD();
        setNumeroPedido();
        return resultado;
    }

    public boolean consultarDP() {
        return false;
        //return pedidoMD.consultarMD();
    }

    public ArrayList<PedidoDP> consultarTodosDP(){
        return pedidoMD.consultarTodosMD();
    }
    
    public ArrayList<ProductoDP> consultarDetalleDP(){
        return pedidoMD.consultarDetalleMD();
    }
     
    public boolean verificarExisteDP() {
        return false;
        //return pedidoMD.verificarExisteMD();
    }

    public ProductoDP getProductoDP() {
        return productoDP;
    }

    public boolean addProductoDP(ProductoDP nuevoProducto) {
        productos.add(nuevoProducto);
        return false;
        //return pedidoMD.addProducto(codigoProducto);
    }
    
    public void reiniciarLista(){
        productos.clear();
    }

    public ArrayList<ProductoDP> getProductos(){
        return productos;
    }
    
    public void setNumeroPedido(){
        pedidoNumero = pedidoMD.getNumeroPedido() + 1;
    }
}
