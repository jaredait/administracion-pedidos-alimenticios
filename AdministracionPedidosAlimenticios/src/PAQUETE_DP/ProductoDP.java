/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PAQUETE_DP;


public class ProductoDP {
    //atributos
    private String codigo;
    private String nombre;
    private double precio;
    //private ProductoMD productoMD;
    //constructor
    public ProductoDP(/*ProductoMD productoMD*/){
        //this.productoMD = productoMD;
    }

    public ProductoDP(String codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
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
        //return productoMD.insertarMD();
        return false;
    }
    
    public boolean consultarDP(){
        //return productoMD.consultarMD();
        return false;
    }

    public boolean modificarDP(){
        //return productoMD.modificarMD();
        return false;
    }
    
    public boolean eliminarDP(){
        //return productoMD.eliminarMD();
        return false;
    }
    
    public boolean verificarExisteDP(){
        //return productoMD.verificarExisteMD();
        return false;
    }
    
    /*
    public ArrayList<ProductoDP> consultarTodosDP(){
        return productoMD.consultarTodosMD();
    }
    */
}
