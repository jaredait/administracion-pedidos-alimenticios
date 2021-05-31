package PAQUETE_GUI;

import PAQUETE_DP.EstablecimientoDP;
import javax.swing.JOptionPane;
import javax.swing.plaf.OptionPaneUI;

public class VentanaEstablecimiento_crear extends javax.swing.JInternalFrame {

    // atributos
    private EstablecimientoDP establecimientoDP;
    private boolean existeEstablecimiento;

    // constructor
    public VentanaEstablecimiento_crear() {

        // instanciar atributos de la clase
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btn_crearEstab_guardar = new javax.swing.JButton();
        tf_crearEstab_codigo = new javax.swing.JTextField();
        tf_crearEstab_nombre = new javax.swing.JTextField();
        tf_crearEstab_telefono = new javax.swing.JTextField();
        tf_crearEstab_callePrincipal = new javax.swing.JTextField();
        tf_crearEstab_calleSecundaria = new javax.swing.JTextField();
        tf_crearEstab_numDireccion = new javax.swing.JTextField();
        tf_crearEstab_tipo = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Crear establecimiento");
        setToolTipText("");
        setVisible(true);

        jLabel1.setText("Código:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Calle principal:");

        jLabel4.setText("Teléfono:");

        jLabel5.setText("Número  de dirección:");

        jLabel6.setText("Calle secundaria:");

        jLabel7.setText("Tipo:");

        btn_crearEstab_guardar.setText("Guardar");
        btn_crearEstab_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crearEstab_guardarActionPerformed(evt);
            }
        });

        tf_crearEstab_codigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf_crearEstab_codigoFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tf_crearEstab_codigo)
                        .addComponent(tf_crearEstab_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tf_crearEstab_telefono)
                        .addComponent(tf_crearEstab_callePrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tf_crearEstab_calleSecundaria)
                        .addComponent(tf_crearEstab_numDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tf_crearEstab_tipo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(167, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_crearEstab_guardar)
                .addGap(325, 325, 325))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_crearEstab_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_crearEstab_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tf_crearEstab_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(tf_crearEstab_callePrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tf_crearEstab_calleSecundaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(tf_crearEstab_numDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tf_crearEstab_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(btn_crearEstab_guardar)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_crearEstab_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crearEstab_guardarActionPerformed
        if (camposCompletos()) {
            if (existeEstablecimiento) {
                JOptionPane.showMessageDialog(jPanel1, "El establecimiento ya existe");
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
    }//GEN-LAST:event_btn_crearEstab_guardarActionPerformed

    private void tf_crearEstab_codigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_crearEstab_codigoFocusLost
        establecimientoDP.setCodigo(tf_crearEstab_codigo.getText());
        if (establecimientoDP.verificarExisteDP()) {
            JOptionPane.showMessageDialog(jPanel1, "El establecimiento ya existe");
            existeEstablecimiento = true;
        } else {
            existeEstablecimiento = false;
        }
    }//GEN-LAST:event_tf_crearEstab_codigoFocusLost

    // metodos de la clase
    private boolean camposCompletos() {
        boolean valido = true;

        String codigo = tf_crearEstab_codigo.getText().trim();
        String nombre = tf_crearEstab_nombre.getText().trim();
        String telefono = tf_crearEstab_telefono.getText().trim();
        String calleP = tf_crearEstab_callePrincipal.getText().trim();
        String calleS = tf_crearEstab_calleSecundaria.getText().trim();
        String numDir = tf_crearEstab_numDireccion.getText().trim();
        String tipo = tf_crearEstab_tipo.getText().trim();

        if (codigo.equals("") || nombre.equals("") || telefono.equals("")
                || calleP.equals("") || calleS.equals("") || numDir.equals("")
                || tipo.equals("")) {
            valido = false;
        }
        return valido;
    }

    private boolean guardarDatos() {
        String codigo = tf_crearEstab_codigo.getText().trim();
        String nombre = tf_crearEstab_nombre.getText().trim();
        String telefono = tf_crearEstab_telefono.getText().trim();
        String calleP = tf_crearEstab_callePrincipal.getText().trim();
        String calleS = tf_crearEstab_calleSecundaria.getText().trim();
        String numDir = tf_crearEstab_numDireccion.getText().trim();
        String tipo = tf_crearEstab_tipo.getText().trim();

        establecimientoDP.setCodigo(codigo);
        establecimientoDP.setNombre(nombre);
        establecimientoDP.setNumTelefono(telefono);
        establecimientoDP.setCallePrincipal(calleP);
        establecimientoDP.setCalleSecundaria(calleS);
        establecimientoDP.setNumDireccion(numDir);
        establecimientoDP.setTipo(tipo);

        return establecimientoDP.insertarDP();
    }

    private void limpiarCampos() {
        tf_crearEstab_codigo.setText("");
        tf_crearEstab_nombre.setText("");
        tf_crearEstab_telefono.setText("");
        tf_crearEstab_callePrincipal.setText("");
        tf_crearEstab_calleSecundaria.setText("");
        tf_crearEstab_numDireccion.setText("");
        tf_crearEstab_tipo.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_crearEstab_guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tf_crearEstab_callePrincipal;
    private javax.swing.JTextField tf_crearEstab_calleSecundaria;
    private javax.swing.JTextField tf_crearEstab_codigo;
    private javax.swing.JTextField tf_crearEstab_nombre;
    private javax.swing.JTextField tf_crearEstab_numDireccion;
    private javax.swing.JTextField tf_crearEstab_telefono;
    private javax.swing.JTextField tf_crearEstab_tipo;
    // End of variables declaration//GEN-END:variables
}
