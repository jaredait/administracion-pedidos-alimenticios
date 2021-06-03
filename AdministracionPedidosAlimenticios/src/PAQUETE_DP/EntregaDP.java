package PAQUETE_DP;

import PAQUETE_DP.PedidoDP;
import PAQUETE_MD.EntregaMD;

public class EntregaDP {
    private int entregaNumero;
    private String tipo;
    private String comentario;
    private int pedidoNumero;
    private EntregaMD entregaMD;
    private PedidoDP pedidoDP;
    
    // constructores
    public EntregaDP(){
        this.entregaMD = new EntregaMD(this);
    }
    
    public int getEntregaNumero(){
        return entregaNumero;
    }
    
    public void setEntregaNumero(int numero){
        this.entregaNumero = numero;
    }
    
    public String getTipo(){
        return tipo;
    }
    
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    
    public String getComentario(){
        return comentario;
    }
    
    public void setComentario(String comentario){
        this.comentario = comentario;
    }
    
    public int getPedidoNumero(){
        return  pedidoNumero;
    }
    
    public void setPedidoNumero(int pedidoNumero){
        this.pedidoNumero = pedidoNumero;
    }
    
    public boolean insertarDP(){
        //return entregaMD.insertarMD();
        return false;
    }
    
    public boolean consultarDP(){
        //return entregaMD.consultarMD();
        return false;
    }
    
    public boolean modificarDP(){
        return entregaMD.modificarMD();
    }
    
    public boolean eliminarDP(){
        //return entregaMD.eliminarMD();
        return false;
    }
    
    public boolean verificarExisteDP(){
        return entregaMD.verificarExisteMD();
    }
    /*
    public ArrayList<EntregaDP> consultarTodosDP(){
        return entregaMD.consultarTodosMD();
    }
*/
}
