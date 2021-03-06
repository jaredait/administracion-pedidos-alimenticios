/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PAQUETE_GUI;

import PAQUETE_DP.EstablecimientoDP;
import PAQUETE_DP.ProductoDP;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class VentanaProducto_crear extends javax.swing.JInternalFrame {

    // atributos
    private ProductoDP productoDP;
    private boolean existeProducto;
    private EstablecimientoDP establecimientoDP;

    // constructor
    public VentanaProducto_crear() {
        // instanciar atributos de la clase
        productoDP = new ProductoDP();
        existeProducto = false;
        establecimientoDP = new EstablecimientoDP();
        initComponents();
        cargarComboBox();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_crearProductoGuardar = new javax.swing.JButton();
        txt_crearProductoPrecio = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_crearProductoCodigo = new javax.swing.JTextField();
        txt_crearProductoNombre = new javax.swing.JTextField();
        cb_CrearPrdCodEst = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Crear Producto");

        btn_crearProductoGuardar.setText("Guardar");
        btn_crearProductoGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crearProductoGuardarActionPerformed(evt);
            }
        });

        jLabel1.setText("Código:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Precio:");

        txt_crearProductoCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_crearProductoCodigoFocusLost(evt);
            }
        });

        cb_CrearPrdCodEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_CrearPrdCodEstActionPerformed(evt);
            }
        });

        jLabel4.setText("Cod. Establecimiento:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(279, Short.MAX_VALUE)
                .addComponent(btn_crearProductoGuardar)
                .addGap(271, 271, 271))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cb_CrearPrdCodEst, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_crearProductoCodigo)
                    .addComponent(txt_crearProductoNombre)
                    .addComponent(txt_crearProductoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_CrearPrdCodEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_crearProductoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_crearProductoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_crearProductoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(btn_crearProductoGuardar)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_crearProductoCodigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_crearProductoCodigoFocusLost
        productoDP.setCodigo(txt_crearProductoCodigo.getText());
        if (productoDP.verificarExisteDP()) {
            JOptionPane.showMessageDialog(jPanel1, "El producto ya existe");
            existeProducto = true;
        } else {
            existeProducto = false;
        }
    }//GEN-LAST:event_txt_crearProductoCodigoFocusLost

    private void btn_crearProductoGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crearProductoGuardarActionPerformed
        if (camposCompletos()) {
            if (existeProducto) {
                JOptionPane.showMessageDialog(jPanel1, "El producto ya existe");
            } else {
                if (guardarDatos()) {
                    JOptionPane.showMessageDialog(jPanel1, "¡Creación exitosa!");
                    limpiarCampos();
                } else {
                    JOptionPane.showMessageDialog(jPanel1, "Creación fallida");
                }
            }
        } else {
            JOptionPane.showMessageDialog(jPanel1, "Datos incompletos");
        }
    }//GEN-LAST:event_btn_crearProductoGuardarActionPerformed

    private void cb_CrearPrdCodEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_CrearPrdCodEstActionPerformed
        
    }//GEN-LAST:event_cb_CrearPrdCodEstActionPerformed
// metodos de la clase
    private boolean camposCompletos() {
        boolean valido = true;

        String codigo = txt_crearProductoCodigo.getText().trim();
        String nombre = txt_crearProductoNombre.getText().trim();
        String precio = txt_crearProductoPrecio.getText().trim();

        if (codigo.equals("") || nombre.equals("") || precio.equals("")) {
            valido = false;
        }
        return valido;
    }

    private boolean guardarDatos() {
        String codigo = txt_crearProductoCodigo.getText().trim();
        String codigoEstablecimiento = cb_CrearPrdCodEst.getSelectedItem().toString();
        String nombre = txt_crearProductoNombre.getText().trim();
        String precio = txt_crearProductoPrecio.getText().trim();

        productoDP.setCodigo(codigo);
        productoDP.setCodigoEstablecimiento(codigoEstablecimiento);
        productoDP.setNombre(nombre);
        productoDP.setPrecio(Double.parseDouble(precio));

        return productoDP.insertarDP();
    }

    private void limpiarCampos() {
        txt_crearProductoCodigo.setText("");
        txt_crearProductoNombre.setText("");
        txt_crearProductoPrecio.setText("");
    }
    
    private void cargarComboBox(){
        ArrayList<EstablecimientoDP> establecimientos = new ArrayList<>();
        establecimientos = establecimientoDP.consultarTodosDP();
        for (int i=0; i < establecimientos.size(); i++){
           cb_CrearPrdCodEst.addItem(establecimientos.get(i).getCodigo());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_crearProductoGuardar;
    private javax.swing.JComboBox<String> cb_CrearPrdCodEst;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_crearProductoCodigo;
    private javax.swing.JTextField txt_crearProductoNombre;
    private javax.swing.JTextField txt_crearProductoPrecio;
    // End of variables declaration//GEN-END:variables
}
