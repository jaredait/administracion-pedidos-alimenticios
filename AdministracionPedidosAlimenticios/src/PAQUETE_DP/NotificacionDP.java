/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PAQUETE_DP;

import PAQUETE_MD.NotificacionMD;
import java.util.ArrayList;

/**
 *
 * @author Quito
 */
public class NotificacionDP {
    //atributos
    private String codigo;
    private String detalle;
    private int numPedido;
    private NotificacionMD notificacionMD;
    
    //constructor
    public NotificacionDP(){
        this.notificacionMD = new NotificacionMD(this);
    }

    public NotificacionDP(String codigo, int numPedido, String detalle) {
        this.codigo = codigo;
        this.numPedido = numPedido;
        this.detalle = detalle;
    }
    
    public NotificacionDP(String codigo){
        this.codigo = codigo;
        this.notificacionMD = new NotificacionMD(this);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public int getNumPedido() {
        return numPedido;
    }

    public void setNumPedido(int numPedido) {
        this.numPedido = numPedido;
    }
    
    public boolean insertarDP(){
        return notificacionMD.insertarMD();
    }
    
    public boolean consultarDP(){
        return notificacionMD.consultarMD();
    }

    public boolean modificarDP(){
        return notificacionMD.actualizarMD();
    }
    
    public boolean eliminarDP(){
        return notificacionMD.eliminarMD();
    }
    
    public boolean verificarExisteDP(){
        return notificacionMD.verificarExisteMD();
    }
    
    
    public ArrayList<NotificacionDP> consultarTodosDP(){
        return notificacionMD.consultarTodosMD();
    }
}
