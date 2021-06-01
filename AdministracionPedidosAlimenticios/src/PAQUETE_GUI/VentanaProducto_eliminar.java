/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PAQUETE_GUI;

import PAQUETE_DP.ProductoDP;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class VentanaProducto_eliminar extends javax.swing.JInternalFrame {

    // Atributos
    private ProductoDP productoDP;
    private boolean existeProducto;
    
    public VentanaProducto_eliminar() {
        // Instanciar atributos de la clase
        productoDP = new ProductoDP();
        existeProducto = false;
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_ElimPrd = new javax.swing.JTable();
        btn_eliminarPrd = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn_ElimPrdBuscParam = new javax.swing.JButton();
        txt_ElimPrdParam = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Eliminar Prouctos");

        tb_ElimPrd.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tb_ElimPrd);

        btn_eliminarPrd.setText("Eliminar");
        btn_eliminarPrd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarPrdActionPerformed(evt);
            }
        });

        jLabel1.setText("Buscar por:");

        btn_ElimPrdBuscParam.setText("Buscar");
        btn_ElimPrdBuscParam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ElimPrdBuscParamActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Código" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(327, 327, 327)
                        .addComponent(btn_eliminarPrd)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_ElimPrdParam, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_ElimPrdBuscParam)))
                .addGap(214, 214, 214))
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
                    .addComponent(btn_ElimPrdBuscParam)
                    .addComponent(txt_ElimPrdParam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_eliminarPrd)
                .addGap(33, 33, 33))
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

    private void btn_ElimPrdBuscParamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ElimPrdBuscParamActionPerformed
        productoDP.setCodigo(txt_ElimPrdParam.getText());

        if (productoDP.verificarExisteDP()) {
            productoDP.consultarDP();
            cargarProducto();
            existeProducto = true;
        } else {
            existeProducto = false;
            JOptionPane.showMessageDialog(jPanel1, "El producto no existe");
        }
    }//GEN-LAST:event_btn_ElimPrdBuscParamActionPerformed

    private void btn_eliminarPrdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarPrdActionPerformed
        if (existeProducto) {
            int confirmacion = JOptionPane.showConfirmDialog(jPanel1, "¿Estás seguro de eliminar el producto?");
            if (confirmacion == 0) {
                if (productoDP.eliminarDP()) {
                    limpiarCampos();
                    JOptionPane.showMessageDialog(jPanel1, "¡Eliminación exitosa!");
                    existeProducto = false;
                } else {
                    JOptionPane.showMessageDialog(jPanel1, "Eliminación fallida");
                }
            }
        } else {
            JOptionPane.showMessageDialog(jPanel1, "El producto no existe");
        }
    }//GEN-LAST:event_btn_eliminarPrdActionPerformed
    // metodos de la clase
    private void cargarProducto() {
        DefaultTableModel model = (DefaultTableModel) tb_ElimPrd.getModel();
        model.setRowCount(0);

        model.addRow(new Object[]{productoDP.getCodigo(),
            productoDP.getNombre(), productoDP.getPrecio()});
    }

    private void limpiarCampos() {
        DefaultTableModel model = (DefaultTableModel) tb_ElimPrd.getModel();
        model.setRowCount(0);
        txt_ElimPrdParam.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ElimPrdBuscParam;
    private javax.swing.JButton btn_eliminarPrd;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_ElimPrd;
    private javax.swing.JTextField txt_ElimPrdParam;
    // End of variables declaration//GEN-END:variables
}
