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


public class VentanaProducto_actualizar extends javax.swing.JInternalFrame {

    // atributos
    ProductoDP productoDP;
    boolean existeProducto;
    private EstablecimientoDP establecimientoDP;
    
    public VentanaProducto_actualizar() {
        productoDP = new ProductoDP();
        existeProducto = false;
        establecimientoDP = new EstablecimientoDP();
        initComponents();
        cargarComboBox();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        txt_actualizarPrdPrecio = new javax.swing.JTextField();
        btn_actualizarPrd = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_actualizarPrdCodigo = new javax.swing.JTextField();
        txt_actualizarPrdNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        txt_ActPrdParam = new javax.swing.JTextField();
        btn_buscarParamActPrd = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cb_CrearPrdCodEst = new javax.swing.JComboBox<>();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nombre", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Actualizar Productos");

        btn_actualizarPrd.setText("Actualizar");
        btn_actualizarPrd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarPrdActionPerformed(evt);
            }
        });

        jLabel1.setText("Código:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Precio:");

        txt_actualizarPrdCodigo.setEditable(false);
        txt_actualizarPrdCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_actualizarPrdCodigoFocusLost(evt);
            }
        });

        txt_actualizarPrdNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_actualizarPrdNombreActionPerformed(evt);
            }
        });

        jLabel4.setText("Buscar por:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Código" }));

        btn_buscarParamActPrd.setText("Buscar");
        btn_buscarParamActPrd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarParamActPrdActionPerformed(evt);
            }
        });

        jLabel5.setText("CodEstablecimiento:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(4, 4, 4))
                            .addComponent(jLabel5))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_actualizarPrdNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_actualizarPrdCodigo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_actualizarPrdPrecio)
                            .addComponent(cb_CrearPrdCodEst, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txt_ActPrdParam, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_buscarParamActPrd))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(205, 205, 205))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(288, 288, 288)
                .addComponent(btn_actualizarPrd)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_ActPrdParam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscarParamActPrd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cb_CrearPrdCodEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_actualizarPrdCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_actualizarPrdNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_actualizarPrdPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(btn_actualizarPrd)
                .addGap(58, 58, 58))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_actualizarPrdNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_actualizarPrdNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_actualizarPrdNombreActionPerformed

    private void btn_buscarParamActPrdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarParamActPrdActionPerformed
        productoDP.setCodigo(txt_ActPrdParam.getText());

        if (productoDP.verificarExisteDP()) {
            productoDP.consultarDP();
            cargarProducto();
        } else {
            JOptionPane.showMessageDialog(jPanel1, "El producto no existe");
        }
    }//GEN-LAST:event_btn_buscarParamActPrdActionPerformed

    private void btn_actualizarPrdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarPrdActionPerformed
        if (camposCompletos()) {
            if (guardarDatos()) {
                JOptionPane.showMessageDialog(jPanel1, "¡Actualización exitosa!");
                limpiarCampos();
            } else {
                JOptionPane.showMessageDialog(jPanel1, "Actualización fallida");
            }
        } else {
            JOptionPane.showMessageDialog(jPanel1, "Datos incompletos");
        }
    }//GEN-LAST:event_btn_actualizarPrdActionPerformed

    private void txt_actualizarPrdCodigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_actualizarPrdCodigoFocusLost
        productoDP.setCodigo(txt_actualizarPrdCodigo.getText());
        if (productoDP.verificarExisteDP()) {
            JOptionPane.showMessageDialog(jPanel1, "El producto ya existe");
            existeProducto = true;
        } else {
            existeProducto = false;
        }
    }//GEN-LAST:event_txt_actualizarPrdCodigoFocusLost
// metodos de la clase
    private void cargarProducto() {
        txt_actualizarPrdCodigo.setText(productoDP.getCodigo());
        cb_CrearPrdCodEst.setSelectedItem(productoDP.getCodigoEstablecimiento());
        txt_actualizarPrdNombre.setText(productoDP.getNombre());
        txt_actualizarPrdPrecio.setText(String.valueOf(productoDP.getPrecio()));
    }

    private boolean camposCompletos() {
        boolean valido = true;

        String codigo = txt_actualizarPrdCodigo.getText().trim();
        String nombre = txt_actualizarPrdNombre.getText().trim();
        String precio = txt_actualizarPrdPrecio.getText().trim();

        if (codigo.equals("") || nombre.equals("") || precio.equals("")) {
            valido = false;
        }
        return valido;
    }

    private boolean guardarDatos() {
        String codigo = txt_actualizarPrdCodigo.getText().trim();
        String codigoEstablecimiento = cb_CrearPrdCodEst.getSelectedItem().toString();
        String nombre = txt_actualizarPrdNombre.getText().trim();
        String precio = txt_actualizarPrdPrecio.getText().trim();

        productoDP.setCodigo(codigo);
        productoDP.setCodigoEstablecimiento(codigoEstablecimiento);
        productoDP.setNombre(nombre);
        productoDP.setPrecio(Double.parseDouble(precio));

        return productoDP.modificarDP();
    }

    private void limpiarCampos() {
        txt_actualizarPrdCodigo.setText("");
        txt_actualizarPrdNombre.setText("");
        txt_actualizarPrdPrecio.setText("");
    }
    
    private void cargarComboBox(){
        ArrayList<EstablecimientoDP> establecimientos = new ArrayList<>();
        establecimientos = establecimientoDP.consultarTodosDP();
        for (int i=0; i < establecimientos.size(); i++){
           cb_CrearPrdCodEst.addItem(establecimientos.get(i).getCodigo());
        }
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizarPrd;
    private javax.swing.JButton btn_buscarParamActPrd;
    private javax.swing.JComboBox<String> cb_CrearPrdCodEst;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txt_ActPrdParam;
    private javax.swing.JTextField txt_actualizarPrdCodigo;
    private javax.swing.JTextField txt_actualizarPrdNombre;
    private javax.swing.JTextField txt_actualizarPrdPrecio;
    // End of variables declaration//GEN-END:variables
}
