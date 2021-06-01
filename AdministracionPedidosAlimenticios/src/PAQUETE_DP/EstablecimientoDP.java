package PAQUETE_DP;
import PAQUETE_MD.EstablecimientoMD;
import java.util.ArrayList;


public class EstablecimientoDP {
    // atributos
    private String codigo;
    private String nombre;
    private String numTelefono;
    private String callePrincipal;
    private String calleSecundaria;
    private String numDireccion;
    private String tipo;
    private EstablecimientoMD establecimientoMD;
    private String password;
    
    //constructores
    public EstablecimientoDP(){
        establecimientoMD = new EstablecimientoMD(this);
    }
    public EstablecimientoDP(String codigo, String nombre, String numTelefono,
             String callePrincipal,  String calleSecundaria, 
             String numDireccion, String tipo, String password){
        this.codigo = codigo;
        this.nombre = nombre;
        this.numTelefono = numTelefono;
        this.callePrincipal = callePrincipal;
        this.calleSecundaria = calleSecundaria;
        this.numDireccion = numDireccion;
        this.tipo = tipo;
        this.password = password;
    }
    
    public String getCodigo(){
        return codigo;
    }
    
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNumTelefono(){
        return numTelefono;
    }
    
    public void setNumTelefono(String numTelefono){
        this.numTelefono = numTelefono;
    }
    
    public String getCallePrincipal(){
        return callePrincipal;
    }
    
    public void setCallePrincipal(String callePrincipal){
        this.callePrincipal = callePrincipal;
    }
    
    public String getCalleSecundaria(){
        return calleSecundaria;
    }
    
    public void setCalleSecundaria(String calleSecundaria){
        this.calleSecundaria = calleSecundaria;
    }
    
    public String getNumDireccion(){
        return numDireccion;
    }
    
    public void setNumDireccion(String numDireccion){
        this.numDireccion = numDireccion;
    }
    
    public String getTipo(){
        return tipo;
    }
    
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    
    public boolean insertarDP(){
        return establecimientoMD.insertarMD();
    }
    
    public boolean consultarDP(){
        return establecimientoMD.consultarMD();
    }

    public boolean modificarDP(){
        return establecimientoMD.actualizarMD();
    }
    
    public boolean eliminarDP(){
        return establecimientoMD.eliminarMD();
    }
    
    public boolean verificarExisteDP(){
        return establecimientoMD.verificarExisteMD();
    }
    
    public ArrayList<EstablecimientoDP> consultarTodosDP(){
        return establecimientoMD.consultarTodosMD();
    }
    
    public String getPassword(){
        return password;
    }    
    
    public void setPassword(String password){
        this.password = password;
    }
}
