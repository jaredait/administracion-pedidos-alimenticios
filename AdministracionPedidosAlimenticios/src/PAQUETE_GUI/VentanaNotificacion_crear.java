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

public class VentanaNotificacion_crear extends javax.swing.JInternalFrame {

    // atributos
    private NotificacionDP notificacionDP;
    private boolean existeNotificacion;
    private PedidoDP pedidoDP;
    
    public VentanaNotificacion_crear() {
        // instanciar atributos de la clase
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_codNotCrear = new javax.swing.JTextField();
        btn_CrearNotGuardar = new javax.swing.JButton();
        cbCrearNotNumPed = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_detNotCrear = new javax.swing.JTextArea();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Crear Notificacion");

        jLabel1.setText("Código:");

        jLabel2.setText("Detalle:");

        txt_codNotCrear.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_codNotCrearFocusLost(evt);
            }
        });

        btn_CrearNotGuardar.setText("Guardar");
        btn_CrearNotGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CrearNotGuardarActionPerformed(evt);
            }
        });

        jLabel3.setText("Número de pedido:");

        txt_detNotCrear.setColumns(20);
        txt_detNotCrear.setLineWrap(true);
        txt_detNotCrear.setRows(5);
        jScrollPane1.setViewportView(txt_detNotCrear);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(btn_CrearNotGuardar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbCrearNotNumPed, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_codNotCrear)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbCrearNotNumPed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_codNotCrear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_CrearNotGuardar)
                .addContainerGap(49, Short.MAX_VALUE))
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

    private void txt_codNotCrearFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_codNotCrearFocusLost
        notificacionDP.setCodigo(txt_codNotCrear.getText());
        if (notificacionDP.verificarExisteDP()) {
            JOptionPane.showMessageDialog(jPanel1, "La notificación ya existe");
            existeNotificacion = true;
        } else {
            existeNotificacion = false;
        }
    }//GEN-LAST:event_txt_codNotCrearFocusLost

    private void btn_CrearNotGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CrearNotGuardarActionPerformed
        if (camposCompletos()) {
            if (existeNotificacion) {
                JOptionPane.showMessageDialog(jPanel1, "La notificación ya existe");
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
    }//GEN-LAST:event_btn_CrearNotGuardarActionPerformed
    // metodos de la clase
    private boolean camposCompletos() {
        boolean valido = true;

        String codigo = txt_codNotCrear.getText().trim();
        String detalle = txt_detNotCrear.getText().trim();

        if (codigo.equals("") || detalle.equals("")) {
            valido = false;
        }
        return valido;
    }

    private boolean guardarDatos() {
        String codigo = txt_codNotCrear.getText().trim();
        String ped_numero = cbCrearNotNumPed.getSelectedItem().toString();
        String detalle = txt_detNotCrear.getText().trim();

        notificacionDP.setCodigo(codigo);
        notificacionDP.setNumPedido(Integer.parseInt(ped_numero));
        notificacionDP.setDetalle(detalle);

        return notificacionDP.insertarDP();
    }

    private void limpiarCampos() {
        txt_codNotCrear.setText("");
        txt_detNotCrear.setText("");
    }
    
    private void cargarComboBox(){
        ArrayList<PedidoDP> pedidos = new ArrayList<>();
        pedidos = pedidoDP.consultarTodosPedidosDP();
        for (int i=0; i < pedidos.size(); i++){
           cbCrearNotNumPed.addItem(String.valueOf(pedidos.get(i).getPedidoNumero()));
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_CrearNotGuardar;
    private javax.swing.JComboBox<String> cbCrearNotNumPed;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt_codNotCrear;
    private javax.swing.JTextArea txt_detNotCrear;
    // End of variables declaration//GEN-END:variables
}
