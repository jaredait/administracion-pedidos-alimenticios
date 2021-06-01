package PAQUETE_DP;

import PAQUETE_MD.ClienteMD;
import java.util.ArrayList;

public class ClienteDP {
    //Atributos
    private String cedula;
    private String nombre;
    private String apellido;
    private String numCelular;
    private String correo;
    private String password;
    private ClienteMD clienteMD;

    //Constructores
    public ClienteDP(String cedula, String nombre, String apellido, String numCelular, String correo, String password) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numCelular = numCelular;
        this.correo = correo;
        this.password = password;
    }
    public ClienteDP(){
        clienteMD = new ClienteMD(this);
    }
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
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public boolean insertarDP(){
        return clienteMD.insertarMD();
    }
    
    public boolean consultarDP(){
        return clienteMD.consultarMD();
    }

    public boolean modificarDP(){
        return clienteMD.actualizarMD();
    }
    
    public boolean eliminarDP(){
        return clienteMD.eliminarMD();
    }
    
    public boolean verificarExisteDP(){
        return clienteMD.verificarExisteMD();
    }
    
    public ArrayList<ClienteDP> consultarTodosDP(){
        return clienteMD.consultarTodosMD();
    }
}
