package PAQUETE_GUI;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import PAQUETE_DP.EntregaDP;

public class VentanaEntrega_actualizar extends javax.swing.JInternalFrame {
    // atributos
    EntregaDP entregaDP;
    
    public VentanaEntrega_actualizar() {
        entregaDP = new EntregaDP();
        
        initComponents();
        cargarTiposEntrega();
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
        btn_consulEntrega_buscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tf_actualEntrega_entNumero = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tf_actualEntrega_argumento1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tf_actualEntrega_pedNumero = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cb_actualEntrega_tipo = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_actualEntrega_comentario = new javax.swing.JTextArea();
        btn_consulEntrega_guardar = new javax.swing.JButton();

        btn_consulEntrega_buscar.setText("Buscar");
        btn_consulEntrega_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consulEntrega_buscarActionPerformed(evt);
            }
        });

        jLabel1.setText("Código de entrega/pedido:");

        tf_actualEntrega_entNumero.setEditable(false);

        jLabel2.setText("Número de entrega:");

        jLabel3.setText("Número de pedido:");

        tf_actualEntrega_pedNumero.setEditable(false);

        jLabel4.setText("Tipo:");

        jLabel5.setText("Comentario:");

        ta_actualEntrega_comentario.setColumns(20);
        ta_actualEntrega_comentario.setRows(5);
        jScrollPane1.setViewportView(ta_actualEntrega_comentario);

        btn_consulEntrega_guardar.setText("Guardar");
        btn_consulEntrega_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consulEntrega_guardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tf_actualEntrega_argumento1)
                                .addComponent(tf_actualEntrega_entNumero))
                            .addGap(18, 18, 18)
                            .addComponent(btn_consulEntrega_buscar))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(cb_actualEntrega_tipo, javax.swing.GroupLayout.Alignment.LEADING, 0, 196, Short.MAX_VALUE)
                        .addComponent(tf_actualEntrega_pedNumero, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(172, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_consulEntrega_guardar)
                .addGap(314, 314, 314))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tf_actualEntrega_entNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tf_actualEntrega_pedNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(60, 60, 60))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(156, 156, 156)
                                        .addComponent(jLabel4))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btn_consulEntrega_buscar)
                                        .addComponent(jLabel1)
                                        .addComponent(tf_actualEntrega_argumento1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cb_actualEntrega_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(btn_consulEntrega_guardar)
                .addContainerGap(110, Short.MAX_VALUE))
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

    private void btn_consulEntrega_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consulEntrega_guardarActionPerformed
        guardarNuevosDatos();
        entregaDP.modificarDP();
    }//GEN-LAST:event_btn_consulEntrega_guardarActionPerformed

    private void btn_consulEntrega_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consulEntrega_buscarActionPerformed
        
    }//GEN-LAST:event_btn_consulEntrega_buscarActionPerformed

    // metodos de la clase
    public void  cargarEntrega
    
    public void guardarNuevosDatos(){
        String nuevoTipo = cb_actualEntrega_tipo.getItemAt(cb_actualEntrega_tipo.getSelectedIndex());
        String nuevoComentario = ta_actualEntrega_comentario.getText();
        
        entregaDP.setTipo(nuevoTipo);
        entregaDP.setComentario(nuevoComentario);
    }
    
    public void cargarTiposEntrega() {
        try {
            Properties props = new Properties();
            props.load(new FileInputStream("src/PAQUETE_PRINCIPAL/parametros.properties"));
            String[] tipos = props.getProperty("tiposEntrega").split(",");

            for (String temp : tipos) {
                cb_actualEntrega_tipo.addItem(temp);
            }
        } catch (IOException ex) {
            Logger.getLogger(VentanaEntrega_actualizar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_consulEntrega_buscar;
    private javax.swing.JButton btn_consulEntrega_guardar;
    private javax.swing.JComboBox<String> cb_actualEntrega_tipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea ta_actualEntrega_comentario;
    private javax.swing.JTextField tf_actualEntrega_argumento1;
    private javax.swing.JTextField tf_actualEntrega_entNumero;
    private javax.swing.JTextField tf_actualEntrega_pedNumero;
    // End of variables declaration//GEN-END:variables
}
