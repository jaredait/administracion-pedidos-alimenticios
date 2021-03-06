package PAQUETE_GUI;

import PAQUETE_DP.EntregaDP;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VentanaEntrega_eliminar extends javax.swing.JInternalFrame {

    // atributos
    private EntregaDP entregaDP;
    private boolean entregaExiste;

    public VentanaEntrega_eliminar() {
        entregaDP = new EntregaDP();
        entregaExiste = false;

        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tf_elimEntrega_argumento = new javax.swing.JTextField();
        btn_elimEntrega_buscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_elimEntrega_tabla = new javax.swing.JTable();
        btn_elimEntrega_eliminar = new javax.swing.JButton();

        jLabel1.setText("Código de entrega/pedido:");

        btn_elimEntrega_buscar.setText("Buscar");
        btn_elimEntrega_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_elimEntrega_buscarActionPerformed(evt);
            }
        });

        tb_elimEntrega_tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Número de entrega", "Número de pedido", "Tipo de entrega", "Comentario"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tb_elimEntrega_tabla);

        btn_elimEntrega_eliminar.setText("Eliminar");
        btn_elimEntrega_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_elimEntrega_eliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(tf_elimEntrega_argumento)
                .addGap(51, 51, 51)
                .addComponent(btn_elimEntrega_buscar)
                .addGap(238, 238, 238))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_elimEntrega_eliminar)
                .addGap(375, 375, 375))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 746, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_elimEntrega_buscar)
                    .addComponent(jLabel1)
                    .addComponent(tf_elimEntrega_argumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btn_elimEntrega_eliminar)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_elimEntrega_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_elimEntrega_buscarActionPerformed
        try {
            int numero = Integer.parseInt(tf_elimEntrega_argumento.getText());
            entregaDP.setEntregaNumero(numero);
            if (entregaDP.verificarExisteDP()) {
                entregaDP.consultarDP();
                cargarDatos();
                entregaExiste = true;
            } else {
                JOptionPane.showMessageDialog(jPanel1, "Entrega no existe");
                entregaExiste = false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(jPanel1, "Número no válido");
            entregaExiste = false;
        }
    }//GEN-LAST:event_btn_elimEntrega_buscarActionPerformed

    private void btn_elimEntrega_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_elimEntrega_eliminarActionPerformed
        if (entregaExiste) {
            int confirmacion = JOptionPane.showConfirmDialog(jLabel1, "¿Estás seguro de eliminar la entrega?");
            if (confirmacion == 0) {
                if (entregaDP.eliminarDP()) {
                    limpiarCampos();
                    JOptionPane.showMessageDialog(jLabel1, "¡Eliminación exitosa!");
                    entregaExiste = false;
                } else {
                    JOptionPane.showMessageDialog(jLabel1, "Eliminación fallida");
                }
            }
        } else {
            JOptionPane.showMessageDialog(jLabel1, "La entrega no existe");
        }
    }//GEN-LAST:event_btn_elimEntrega_eliminarActionPerformed

    // metodos de la clase
    public void cargarDatos() {
        int numeroEntrega = entregaDP.getEntregaNumero();
        int numeroPedido = entregaDP.getPedidoNumero();
        String tipo = entregaDP.getTipo();
        String comentario = entregaDP.getComentario();

        DefaultTableModel model = (DefaultTableModel) tb_elimEntrega_tabla.getModel();
        model.setRowCount(0);
        model.addRow(new Object[]{numeroEntrega, numeroPedido, tipo, comentario});
    }
    
    public void limpiarCampos(){
        DefaultTableModel model = (DefaultTableModel) tb_elimEntrega_tabla.getModel();
        model.setRowCount(0);
        tf_elimEntrega_argumento.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_elimEntrega_buscar;
    private javax.swing.JButton btn_elimEntrega_eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_elimEntrega_tabla;
    private javax.swing.JTextField tf_elimEntrega_argumento;
    // End of variables declaration//GEN-END:variables
}
