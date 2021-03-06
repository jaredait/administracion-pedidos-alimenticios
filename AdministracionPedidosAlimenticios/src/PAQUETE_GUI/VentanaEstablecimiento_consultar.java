package PAQUETE_GUI;

import PAQUETE_DP.EstablecimientoDP;
import com.sun.prism.j2d.J2DPipeline;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VentanaEstablecimiento_consultar extends javax.swing.JInternalFrame {

    // atributos de la clase
    EstablecimientoDP establecimientoDP;
    boolean existeEstablecimiento;

    // constructor
    public VentanaEstablecimiento_consultar() {
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
        btn_consEstab_individual = new javax.swing.JButton();
        cb_consEstab_parametro = new javax.swing.JComboBox<>();
        tf_consEstab_argumento = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_consEstab_tabla = new javax.swing.JTable();
        btn_consEestab_todos = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Consultar establecimiento");
        setToolTipText("");

        btn_consEstab_individual.setText("Consultar");
        btn_consEstab_individual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consEstab_individualActionPerformed(evt);
            }
        });

        cb_consEstab_parametro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Código" }));

        jLabel1.setText("Buscar por:");

        tb_consEstab_tabla.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tb_consEstab_tabla);

        btn_consEestab_todos.setText("Consultar todos");
        btn_consEestab_todos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consEestab_todosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1040, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(155, 155, 155)
                            .addComponent(btn_consEestab_todos)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 377, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cb_consEstab_parametro, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(tf_consEstab_argumento, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btn_consEstab_individual)))
                            .addGap(68, 68, 68))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1028, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 606, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(cb_consEstab_parametro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(23, 23, 23)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tf_consEstab_argumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_consEstab_individual)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(28, 28, 28)
                            .addComponent(btn_consEestab_todos)))
                    .addGap(18, 18, 18)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(20, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_consEestab_todosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consEestab_todosActionPerformed
        cargarEstablecimiento(establecimientoDP.consultarTodosDP());
    }//GEN-LAST:event_btn_consEestab_todosActionPerformed

    private void btn_consEstab_individualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consEstab_individualActionPerformed
        establecimientoDP.setCodigo(tf_consEstab_argumento.getText());
        
        if (establecimientoDP.verificarExisteDP()) {
            establecimientoDP.consultarDP();
            cargarEstablecimiento();
        } else {
            JOptionPane.showMessageDialog(jPanel1, "El establecimiento no existe");
        }
    }//GEN-LAST:event_btn_consEstab_individualActionPerformed

    // metodos de la clase
    private void cargarEstablecimiento() {
        DefaultTableModel model = (DefaultTableModel) tb_consEstab_tabla.getModel();
        model.setRowCount(0);

        model.addRow(new Object[]{establecimientoDP.getCodigo(),
            establecimientoDP.getNombre(), establecimientoDP.getNumTelefono(),
            establecimientoDP.getCallePrincipal(), establecimientoDP.getCalleSecundaria(),
            establecimientoDP.getNumDireccion(), establecimientoDP.getTipo()});
    }

    private void cargarEstablecimiento(ArrayList<EstablecimientoDP> establecimientos) {
        DefaultTableModel model = (DefaultTableModel) tb_consEstab_tabla.getModel();
        model.setRowCount(0);

        for (EstablecimientoDP temp : establecimientos) {
            model.addRow(new Object[]{temp.getCodigo(), temp.getNombre(), 
                temp.getNumTelefono(), temp.getCallePrincipal(), 
                temp.getCalleSecundaria(), temp.getNumDireccion(), 
                temp.getTipo()});
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_consEestab_todos;
    private javax.swing.JButton btn_consEstab_individual;
    private javax.swing.JComboBox<String> cb_consEstab_parametro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_consEstab_tabla;
    private javax.swing.JTextField tf_consEstab_argumento;
    // End of variables declaration//GEN-END:variables
}
