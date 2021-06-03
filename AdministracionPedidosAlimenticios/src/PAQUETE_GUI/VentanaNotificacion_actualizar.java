/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PAQUETE_GUI;

import PAQUETE_DP.PedidoDP;
import PAQUETE_DP.NotificacionDP;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class VentanaNotificacion_actualizar extends javax.swing.JInternalFrame {

    // atributos
    NotificacionDP notificacionDP;
    boolean existeNotificacion;
    private PedidoDP pedidoDP;
    
    public VentanaNotificacion_actualizar() {
        notificacionDP = new NotificacionDP();
        existeNotificacion = false;
        pedidoDP = new PedidoDP();
        initComponents();
        cargarComboBox();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_actualizarNot = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_actualizarNotCodigo = new javax.swing.JTextField();
        txt_actualizarNotDetalle = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        txt_ActNotParam = new javax.swing.JTextField();
        btn_buscarParamActNot = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cb_CrearNotCodPed = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Actualizar Notificaciones");

        btn_actualizarNot.setText("Actualizar");
        btn_actualizarNot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarNotActionPerformed(evt);
            }
        });

        jLabel1.setText("Código:");

        jLabel2.setText("Detalle:");

        txt_actualizarNotCodigo.setEditable(false);
        txt_actualizarNotCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_actualizarNotCodigoFocusLost(evt);
            }
        });

        txt_actualizarNotDetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_actualizarNotDetalleActionPerformed(evt);
            }
        });

        jLabel4.setText("Buscar por:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Código" }));

        btn_buscarParamActNot.setText("Buscar");
        btn_buscarParamActNot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarParamActNotActionPerformed(evt);
            }
        });

        jLabel5.setText("Número de Pedido:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(4, 4, 4))
                            .addComponent(jLabel5))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_actualizarNotDetalle, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_actualizarNotCodigo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cb_CrearNotCodPed, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txt_ActNotParam, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_buscarParamActNot))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(205, 205, 205))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(285, 285, 285)
                .addComponent(btn_actualizarNot)
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
                    .addComponent(txt_ActNotParam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscarParamActNot))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cb_CrearNotCodPed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_actualizarNotCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_actualizarNotDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_actualizarNot)
                .addGap(115, 115, 115))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_actualizarNotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarNotActionPerformed
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
    }//GEN-LAST:event_btn_actualizarNotActionPerformed

    private void txt_actualizarNotCodigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_actualizarNotCodigoFocusLost
        notificacionDP.setCodigo(txt_actualizarNotCodigo.getText());
        if (notificacionDP.verificarExisteDP()) {
            JOptionPane.showMessageDialog(jPanel1, "La notificación ya existe");
            existeNotificacion = true;
        } else {
            existeNotificacion = false;
        }
    }//GEN-LAST:event_txt_actualizarNotCodigoFocusLost

    private void txt_actualizarNotDetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_actualizarNotDetalleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_actualizarNotDetalleActionPerformed

    private void btn_buscarParamActNotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarParamActNotActionPerformed
        notificacionDP.setCodigo(txt_ActNotParam.getText());

        if (notificacionDP.verificarExisteDP()) {
            notificacionDP.consultarDP();
            cargarProducto();
        } else {
            JOptionPane.showMessageDialog(jPanel1, "La notificación no existe");
        }
    }//GEN-LAST:event_btn_buscarParamActNotActionPerformed
    
    // metodos de la clase
    private void cargarProducto() {
        txt_actualizarNotCodigo.setText(notificacionDP.getCodigo());
        cb_CrearNotCodPed.setSelectedItem(notificacionDP.getNumPedido());
        txt_actualizarNotDetalle.setText(notificacionDP.getDetalle());
    }
    
    private boolean camposCompletos() {
        boolean valido = true;

        String codigo = txt_actualizarNotCodigo.getText().trim();
        String detalle = txt_actualizarNotDetalle.getText().trim();

        if (codigo.equals("") || detalle.equals("")) {
            valido = false;
        }
        return valido;
    }

    private boolean guardarDatos() {
        String codigo = txt_actualizarNotCodigo.getText().trim();
        String numPedido = cb_CrearNotCodPed.getSelectedItem().toString();
        String detalle = txt_actualizarNotDetalle.getText().trim();

        notificacionDP.setCodigo(codigo);
        notificacionDP.setNumPedido(Integer.parseInt(numPedido));
        notificacionDP.setDetalle(detalle);

        return notificacionDP.modificarDP();
    }

    private void limpiarCampos() {
        txt_actualizarNotCodigo.setText("");
        txt_actualizarNotDetalle.setText("");
    }
    
    private void cargarComboBox(){
        ArrayList<PedidoDP> pedidos = new ArrayList<>();
        pedidos = pedidoDP.consultarTodosPedidosDP();
        for (int i=0; i < pedidos.size(); i++){
           cb_CrearNotCodPed.addItem(String.valueOf(pedidos.get(i).getPedidoNumero()));
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizarNot;
    private javax.swing.JButton btn_buscarParamActNot;
    private javax.swing.JComboBox<String> cb_CrearNotCodPed;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_ActNotParam;
    private javax.swing.JTextField txt_actualizarNotCodigo;
    private javax.swing.JTextField txt_actualizarNotDetalle;
    // End of variables declaration//GEN-END:variables
}
