package PAQUETE_DP;


public class EstablecimientoDP {
    // atributos
    private String codigo;
    private String nombre;
    private String numTelefono;
    private String callePrincipal;
    private String calleSecundaria;
    private String numDireccion;
    private String tipo;
    //private EstablecimientoMD establecimientoMD;
    
    //constructor
    public EstablecimientoDP(/*EstablecimientoMD establecimientoMD*/){
        //this.establecimientoMD = establecimientoMD;
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
        //return establecimientoMD.insertarMD();
        return false;
    }
    
    public boolean consultarDP(){
        //return establecimientoMD.consultarMD();
        return false;
    }

    public boolean modificarDP(){
        //return establecimientoMD.modificarMD();
        return false;
    }
    
    public boolean eliminarDP(){
        //return establecimientoMD.eliminarMD();
        return false;
    }
    
    public boolean verificarExisteDP(){
        //return establecimientoMD.verificarExisteMD();
        return false;
    }
    
    /*
    public ArrayList<EstablecimientoDP> consultarTodosDP(){
        return establecimientoMD.consultarTodosMD();
    }
    */
}
