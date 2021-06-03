/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PAQUETE_GUI;

import PAQUETE_DP.NotificacionDP;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VentanaNotificacion_eliminar extends javax.swing.JInternalFrame {

    // Atributos
    private NotificacionDP notificacionDP;
    private boolean existeNotificacion;
    
    public VentanaNotificacion_eliminar() {
        // Instanciar atributos de la clase
        notificacionDP = new NotificacionDP();
        existeNotificacion = false;
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_ElimNot = new javax.swing.JTable();
        btn_eliminarNot = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn_ElimNotBuscParam = new javax.swing.JButton();
        txt_ElimNotParam = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Eliminar Notificación");

        tb_ElimNot.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "#Pedido", "Detalle"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tb_ElimNot);
        if (tb_ElimNot.getColumnModel().getColumnCount() > 0) {
            tb_ElimNot.getColumnModel().getColumn(0).setPreferredWidth(5);
            tb_ElimNot.getColumnModel().getColumn(1).setPreferredWidth(5);
            tb_ElimNot.getColumnModel().getColumn(2).setPreferredWidth(500);
        }

        btn_eliminarNot.setText("Eliminar");
        btn_eliminarNot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarNotActionPerformed(evt);
            }
        });

        jLabel1.setText("Buscar por:");

        btn_ElimNotBuscParam.setText("Buscar");
        btn_ElimNotBuscParam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ElimNotBuscParamActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Código" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_ElimNotParam, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_ElimNotBuscParam)))
                .addGap(214, 214, 214))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(269, 269, 269)
                .addComponent(btn_eliminarNot)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ElimNotBuscParam)
                    .addComponent(txt_ElimNotParam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_eliminarNot)
                .addGap(26, 26, 26))
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

    private void btn_eliminarNotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarNotActionPerformed
        if (existeNotificacion) {
            int confirmacion = JOptionPane.showConfirmDialog(jPanel1, "¿Estás seguro de eliminar la notificación?");
            if (confirmacion == 0) {
                if (notificacionDP.eliminarDP()) {
                    limpiarCampos();
                    JOptionPane.showMessageDialog(jPanel1, "¡Eliminación exitosa!");
                    existeNotificacion = false;
                } else {
                    JOptionPane.showMessageDialog(jPanel1, "Eliminación fallida");
                }
            }
        } else {
            JOptionPane.showMessageDialog(jPanel1, "La notificación no existe");
        }
    }//GEN-LAST:event_btn_eliminarNotActionPerformed

    private void btn_ElimNotBuscParamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ElimNotBuscParamActionPerformed
        notificacionDP.setCodigo(txt_ElimNotParam.getText());

        if (notificacionDP.verificarExisteDP()) {
            notificacionDP.consultarDP();
            cargarNotificacion();
            existeNotificacion = true;
        } else {
            existeNotificacion = false;
            JOptionPane.showMessageDialog(jPanel1, "La notificación no existe");
        }
    }//GEN-LAST:event_btn_ElimNotBuscParamActionPerformed
    
    // metodos de la clase
    private void cargarNotificacion() {
        DefaultTableModel model = (DefaultTableModel) tb_ElimNot.getModel();
        model.setRowCount(0);

        model.addRow(new Object[]{notificacionDP.getCodigo(), notificacionDP.getNumPedido(),
            notificacionDP.getDetalle()});
    }

    private void limpiarCampos() {
        DefaultTableModel model = (DefaultTableModel) tb_ElimNot.getModel();
        model.setRowCount(0);
        txt_ElimNotParam.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ElimNotBuscParam;
    private javax.swing.JButton btn_eliminarNot;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_ElimNot;
    private javax.swing.JTextField txt_ElimNotParam;
    // End of variables declaration//GEN-END:variables
}
