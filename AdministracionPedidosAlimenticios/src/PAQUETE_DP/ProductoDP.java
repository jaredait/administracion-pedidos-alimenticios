/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PAQUETE_DP;
import PAQUETE_MD.ProductoMD;
import java.util.ArrayList;

public class ProductoDP {
    //atributos
    private String codigo;
    private String nombre;
    private double precio;
    private ProductoMD productoMD;
    
    //constructor
    public ProductoDP(){
        this.productoMD = new ProductoMD(this);
    }

    public ProductoDP(String codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }
    
    public ProductoDP(String codigo){
        this.codigo = codigo;
        this.productoMD = new ProductoMD(this);
    }
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public boolean insertarDP(){
        return productoMD.insertarMD();
    }
    
    public boolean consultarDP(){
        return productoMD.consultarMD();
    }

    public boolean modificarDP(){
        return productoMD.actualizarMD();
    }
    
    public boolean eliminarDP(){
        return productoMD.eliminarMD();
    }
    
    public boolean verificarExisteDP(){
        return productoMD.verificarExisteMD();
    }
    
    
    public ArrayList<ProductoDP> consultarTodosDP(){
        return productoMD.consultarTodosMD();
    }
    
}
