package PAQUETE_DP;

import PAQUETE_MD.ClienteMD;
public class ClienteDP {
    //Atributos
    private String cedula;
    private String nombre;
    private String apellido;
    private String numCelular;
    private String correo;
    private ClienteMD clienteMD;

    public ClienteDP(String cedula, String nombre, String apellido, String numCelular, String correo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numCelular = numCelular;
        this.correo = correo;
    }
    /*public ClienteDP(ClienteMD clienteMD){
        this.clienteMD = clienteMD;
    }*/
    //getters y setters
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNumCelular() {
        return numCelular;
    }

    public void setNumCelular(String numCelular) {
        this.numCelular = numCelular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    public boolean insertarDP(){
        //return clienteMD.insertarMD();
        return false;
    }
    
    public boolean consultarDP(){
        //return clienteMD.consultarMD();
        return false;
    }

    public boolean modificarDP(){
        //return clienteMD.modificarMD();
        return false;
    }
    
    public boolean eliminarDP(){
        //return clienteMD.eliminarMD();
        return false;
    }
    
    public boolean verificarExisteDP(){
        //return clienteMD.verificarExisteMD();
        return false;
    }
    
    /*
    public ArrayList<ClienteDP> consultarTodosDP(){
        return clienteMD.consultarTodosMD();
    }
    */
}
