package PAQUETE_GUI;

import PAQUETE_DP.EstablecimientoDP;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VentanaEstablecimiento_eliminar extends javax.swing.JInternalFrame {

    //atributos
    EstablecimientoDP establecimientoDP;
    boolean existeEstablecimiento;

    public VentanaEstablecimiento_eliminar() {
        establecimientoDP = new EstablecimientoDP();
        existeEstablecimiento = false;

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
        btn_elimEstab_individual = new javax.swing.JButton();
        tf_elimlEstab_argumento = new javax.swing.JTextField();
        cb_elimEstab_parametro = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_elimEstab_tabla = new javax.swing.JTable();
        btn_elimEstab_eliminar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Eliminar establecimiento");

        btn_elimEstab_individual.setText("Buscar");
        btn_elimEstab_individual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_elimEstab_individualActionPerformed(evt);
            }
        });

        cb_elimEstab_parametro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Código" }));

        jLabel1.setText("Buscar por:");

        tb_elimEstab_tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nombre", "Teléfono", "Calle principal", "Calle secundaria", "Número dirección", "Tipo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tb_elimEstab_tabla);

        btn_elimEstab_eliminar.setText("Eliminar");
        btn_elimEstab_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_elimEstab_eliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(345, 345, 345)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cb_elimEstab_parametro, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tf_elimlEstab_argumento, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_elimEstab_individual))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 985, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(447, 447, 447)
                        .addComponent(btn_elimEstab_eliminar)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cb_elimEstab_parametro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_elimlEstab_argumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_elimEstab_individual))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(btn_elimEstab_eliminar)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_elimEstab_individualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_elimEstab_individualActionPerformed
        establecimientoDP.setCodigo(tf_elimlEstab_argumento.getText());

        if (establecimientoDP.verificarExisteDP()) {
            establecimientoDP.consultarDP();
            cargarEstablecimiento();
            existeEstablecimiento = true;
        } else {
            existeEstablecimiento = false;
            JOptionPane.showMessageDialog(jPanel1, "El establecimiento no existe");
        }
    }//GEN-LAST:event_btn_elimEstab_individualActionPerformed

    private void btn_elimEstab_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_elimEstab_eliminarActionPerformed
        if (existeEstablecimiento) {
            int confirmacion = JOptionPane.showConfirmDialog(jLabel1, "¿Estás seguro de eliminar el establecimiento?");
            if (confirmacion == 0) {
                if (establecimientoDP.eliminarDP()) {
                    limpiarCampos();
                    JOptionPane.showMessageDialog(jLabel1, "¡Eliminación exitosa!");
                    existeEstablecimiento = false;
                } else {
                    JOptionPane.showMessageDialog(jLabel1, "Eliminación fallida");
                }
            }
        } else {
            JOptionPane.showMessageDialog(jLabel1, "El establecimiento no existe");
        }
    }//GEN-LAST:event_btn_elimEstab_eliminarActionPerformed

    // metodos de la clase
    private void cargarEstablecimiento() {
        DefaultTableModel model = (DefaultTableModel) tb_elimEstab_tabla.getModel();
        model.setRowCount(0);

        model.addRow(new Object[]{establecimientoDP.getCodigo(),
            establecimientoDP.getNombre(), establecimientoDP.getNumTelefono(),
            establecimientoDP.getCallePrincipal(), establecimientoDP.getCalleSecundaria(),
            establecimientoDP.getNumDireccion(), establecimientoDP.getTipo()});
    }

    private void limpiarCampos() {
        DefaultTableModel model = (DefaultTableModel) tb_elimEstab_tabla.getModel();
        model.setRowCount(0);
        tf_elimlEstab_argumento.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_elimEstab_eliminar;
    private javax.swing.JButton btn_elimEstab_individual;
    private javax.swing.JComboBox<String> cb_elimEstab_parametro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_elimEstab_tabla;
    private javax.swing.JTextField tf_elimlEstab_argumento;
    // End of variables declaration//GEN-END:variables
}
