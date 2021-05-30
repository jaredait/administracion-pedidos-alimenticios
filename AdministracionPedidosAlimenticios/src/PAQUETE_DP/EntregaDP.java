package PAQUETE_DP;

//import PAQUETE_DP.PedidoDP;

public class EntregaDP {
    private int numero;
    private String tipo;
    private String comentario;
    //private EntregaMD entregaMD()
    //private PedidoDP pedidoDP;
    
    // constructores
    public EntregaDP(){
        //pedidoDP = new PedidoDP(this);
    }
    
    public int getNumero(){
        return numero;
    }
    
    public void setNumero(int numero){
        this.numero = numero;
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
    
    public boolean insertarDP(){
        //return entregaMD.insertarMD();
        return false;
    }
    
    public boolean consultarDP(){
        //return entregaMD.consultarMD();
        return false;
    }
    
    public boolean modificarDP(){
        // return entregaMD.modificarMD();
        return false;
    }
    
    public boolean eliminarDP(){
        //return entregaMD.eliminarMD();
        return false;
    }
    
    public boolean verificarExiste(){
        //return entregaMD.verificarExisteMD();
        return false;
    }
    /*
    public ArrayList<EntregaDP> consultarTodosDP(){
        return entregaMD.consultarTodosMD();
    }
*/
}
