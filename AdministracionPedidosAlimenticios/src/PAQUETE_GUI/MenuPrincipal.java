/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PAQUETE_GUI;

import javax.swing.JFrame;

/**
 *
 * @author ASUS
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        setExtendedState(JFrame.MAXIMIZED_BOTH);
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

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu_archivo = new javax.swing.JMenu();
        sub_archivo_salir = new javax.swing.JMenuItem();
        menu_catalogos = new javax.swing.JMenu();
        submenu_cliente = new javax.swing.JMenu();
        sub_cliente_crear = new javax.swing.JMenuItem();
        sub_cliente_consultar = new javax.swing.JMenuItem();
        sub_cliente_actualizar = new javax.swing.JMenuItem();
        sub_cliente_eliminar = new javax.swing.JMenuItem();
        submenu_establecimiento = new javax.swing.JMenu();
        sub_establecimiento_crear = new javax.swing.JMenuItem();
        sub_establecimiento_consultar = new javax.swing.JMenuItem();
        sub_establecimiento_actualizar = new javax.swing.JMenuItem();
        sub_establecimiento_eliminar = new javax.swing.JMenuItem();
        submenu_producto = new javax.swing.JMenu();
        sub_producto_crear = new javax.swing.JMenuItem();
        sub_producto_consultar = new javax.swing.JMenuItem();
        sub_producto_actualizar = new javax.swing.JMenuItem();
        sub_producto_eliminar = new javax.swing.JMenuItem();
        menu_procesos = new javax.swing.JMenu();
        submenu_entrega = new javax.swing.JMenu();
        sub_entrega_crear = new javax.swing.JMenuItem();
        sub_entrega_consultar = new javax.swing.JMenuItem();
        sub_entrega_actualizar = new javax.swing.JMenuItem();
        sub_entrega_eliminar = new javax.swing.JMenuItem();
        submenu_notificacion = new javax.swing.JMenu();
        sub_notificacion_crear = new javax.swing.JMenuItem();
        sub_notificacion_consultar = new javax.swing.JMenuItem();
        sub_notificacion_actualizar = new javax.swing.JMenuItem();
        sub_notificacion_eliminar = new javax.swing.JMenuItem();
        submenu_pedido = new javax.swing.JMenu();
        sub_pedido_crear = new javax.swing.JMenuItem();
        sub_pedido_consultar = new javax.swing.JMenuItem();
        sub_pedido_actualizar = new javax.swing.JMenuItem();
        sub_pedido_eliminar = new javax.swing.JMenuItem();
        menu_ayuda = new javax.swing.JMenu();
        sub_ayuda_acercade = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 677, Short.MAX_VALUE)
        );

        menu_archivo.setText("Archivo");

        sub_archivo_salir.setText("Salir");
        menu_archivo.add(sub_archivo_salir);

        jMenuBar1.add(menu_archivo);

        menu_catalogos.setText("Catálogos");

        submenu_cliente.setText("Cliente");

        sub_cliente_crear.setText("Crear cliente");
        sub_cliente_crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub_cliente_crearActionPerformed(evt);
            }
        });
        submenu_cliente.add(sub_cliente_crear);

        sub_cliente_consultar.setText("Consultar cliente");
        sub_cliente_consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub_cliente_consultarActionPerformed(evt);
            }
        });
        submenu_cliente.add(sub_cliente_consultar);

        sub_cliente_actualizar.setText("Actualizar cliente");
        submenu_cliente.add(sub_cliente_actualizar);

        sub_cliente_eliminar.setText("Eliminar cliente");
        submenu_cliente.add(sub_cliente_eliminar);

        menu_catalogos.add(submenu_cliente);

        submenu_establecimiento.setText("Establecimiento");

        sub_establecimiento_crear.setText("Crear establecimiento");
        sub_establecimiento_crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub_establecimiento_crearActionPerformed(evt);
            }
        });
        submenu_establecimiento.add(sub_establecimiento_crear);

        sub_establecimiento_consultar.setText("Consultar establecimiento");
        sub_establecimiento_consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub_establecimiento_consultarActionPerformed(evt);
            }
        });
        submenu_establecimiento.add(sub_establecimiento_consultar);

        sub_establecimiento_actualizar.setText("Actualizar establecimiento");
        sub_establecimiento_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub_establecimiento_actualizarActionPerformed(evt);
            }
        });
        submenu_establecimiento.add(sub_establecimiento_actualizar);

        sub_establecimiento_eliminar.setText("Eliminar establecimiento");
        sub_establecimiento_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub_establecimiento_eliminarActionPerformed(evt);
            }
        });
        submenu_establecimiento.add(sub_establecimiento_eliminar);

        menu_catalogos.add(submenu_establecimiento);

        submenu_producto.setText("Producto");
        submenu_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submenu_productoActionPerformed(evt);
            }
        });

        sub_producto_crear.setText("Crear producto");
        sub_producto_crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub_producto_crearActionPerformed(evt);
            }
        });
        submenu_producto.add(sub_producto_crear);

        sub_producto_consultar.setText("Consultar producto");
        sub_producto_consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub_producto_consultarActionPerformed(evt);
            }
        });
        submenu_producto.add(sub_producto_consultar);

        sub_producto_actualizar.setText("Actualizar Producto");
        sub_producto_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub_producto_actualizarActionPerformed(evt);
            }
        });
        submenu_producto.add(sub_producto_actualizar);

        sub_producto_eliminar.setText("Eliminar producto");
        sub_producto_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub_producto_eliminarActionPerformed(evt);
            }
        });
        submenu_producto.add(sub_producto_eliminar);

        menu_catalogos.add(submenu_producto);

        jMenuBar1.add(menu_catalogos);

        menu_procesos.setText("Procesos");

        submenu_entrega.setText("Entrega");

        sub_entrega_crear.setText("Crear entrega");
        submenu_entrega.add(sub_entrega_crear);

        sub_entrega_consultar.setText("Consultar entrega");
        submenu_entrega.add(sub_entrega_consultar);

        sub_entrega_actualizar.setText("Actualizar entrega");
        submenu_entrega.add(sub_entrega_actualizar);

        sub_entrega_eliminar.setText("Eliminar entrega");
        submenu_entrega.add(sub_entrega_eliminar);

        menu_procesos.add(submenu_entrega);

        submenu_notificacion.setText("Notificación");

        sub_notificacion_crear.setText("Crear notificación");
        submenu_notificacion.add(sub_notificacion_crear);

        sub_notificacion_consultar.setText("Consultar notificación");
        submenu_notificacion.add(sub_notificacion_consultar);

        sub_notificacion_actualizar.setText("Actualizar notificación");
        submenu_notificacion.add(sub_notificacion_actualizar);

        sub_notificacion_eliminar.setText("Eliminar notificación");
        submenu_notificacion.add(sub_notificacion_eliminar);

        menu_procesos.add(submenu_notificacion);

        submenu_pedido.setText("Pedido");

        sub_pedido_crear.setText("Crear pedido");
        submenu_pedido.add(sub_pedido_crear);

        sub_pedido_consultar.setText("Consultar pedido");
        submenu_pedido.add(sub_pedido_consultar);

        sub_pedido_actualizar.setText("Actualizar pedido");
        submenu_pedido.add(sub_pedido_actualizar);

        sub_pedido_eliminar.setText("Eliminar pedido");
        submenu_pedido.add(sub_pedido_eliminar);

        menu_procesos.add(submenu_pedido);

        jMenuBar1.add(menu_procesos);

        menu_ayuda.setText("Ayuda");

        sub_ayuda_acercade.setText("Acerca de");
        menu_ayuda.add(sub_ayuda_acercade);

        jMenuBar1.add(menu_ayuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sub_cliente_consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub_cliente_consultarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sub_cliente_consultarActionPerformed

    private void sub_establecimiento_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub_establecimiento_eliminarActionPerformed
        VentanaEstablecimiento_eliminar ventanaEstablecimiento_eliminar = new VentanaEstablecimiento_eliminar();
        escritorio.add(ventanaEstablecimiento_eliminar);
        ventanaEstablecimiento_eliminar.show();
    }//GEN-LAST:event_sub_establecimiento_eliminarActionPerformed

    private void sub_establecimiento_crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub_establecimiento_crearActionPerformed
        VentanaEstablecimiento_crear ventanaEstablecimiento_crear = new VentanaEstablecimiento_crear();
        escritorio.add(ventanaEstablecimiento_crear);
        ventanaEstablecimiento_crear.show();        
    }//GEN-LAST:event_sub_establecimiento_crearActionPerformed

    private void sub_establecimiento_consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub_establecimiento_consultarActionPerformed
        VentanaEstablecimiento_consultar ventanaEstablecimiento_consultar = new VentanaEstablecimiento_consultar();
        escritorio.add(ventanaEstablecimiento_consultar);
        ventanaEstablecimiento_consultar.show();
        
    }//GEN-LAST:event_sub_establecimiento_consultarActionPerformed

    private void submenu_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submenu_productoActionPerformed
        
    }//GEN-LAST:event_submenu_productoActionPerformed

    private void sub_producto_crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub_producto_crearActionPerformed
        VentanaProducto_crear ventanaProducto_crear = new VentanaProducto_crear();
        escritorio.add(ventanaProducto_crear);
        ventanaProducto_crear.show();
    }//GEN-LAST:event_sub_producto_crearActionPerformed

    private void sub_cliente_crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub_cliente_crearActionPerformed
        VentanaCliente_crear ventanaCliente_crear = new VentanaCliente_crear();
        escritorio.add(ventanaCliente_crear);
        ventanaCliente_crear.show();
    }//GEN-LAST:event_sub_cliente_crearActionPerformed
    private void sub_producto_consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub_producto_consultarActionPerformed
        VentanaProducto_consultar ventanaProducto_consultar = new VentanaProducto_consultar();
        escritorio.add(ventanaProducto_consultar);
        ventanaProducto_consultar.show();
    }//GEN-LAST:event_sub_producto_consultarActionPerformed

    private void sub_producto_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub_producto_actualizarActionPerformed
        VentanaProducto_actualizar ventanaProducto_actualizar = new VentanaProducto_actualizar();
        escritorio.add(ventanaProducto_actualizar);
        ventanaProducto_actualizar.show();
    }//GEN-LAST:event_sub_producto_actualizarActionPerformed

    private void sub_producto_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub_producto_eliminarActionPerformed
        VentanaProducto_eliminar ventanaProducto_eliminar = new VentanaProducto_eliminar();
        escritorio.add(ventanaProducto_eliminar);
        ventanaProducto_eliminar.show();
    }//GEN-LAST:event_sub_producto_eliminarActionPerformed

    private void sub_establecimiento_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub_establecimiento_actualizarActionPerformed
        VentanaEstablecimiento_actualizar ventanaEstablecimiento_actualizar = new VentanaEstablecimiento_actualizar();
        escritorio.add(ventanaEstablecimiento_actualizar);
        ventanaEstablecimiento_actualizar.show();
    }//GEN-LAST:event_sub_establecimiento_actualizarActionPerformed


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menu_archivo;
    private javax.swing.JMenu menu_ayuda;
    private javax.swing.JMenu menu_catalogos;
    private javax.swing.JMenu menu_procesos;
    private javax.swing.JMenuItem sub_archivo_salir;
    private javax.swing.JMenuItem sub_ayuda_acercade;
    private javax.swing.JMenuItem sub_cliente_actualizar;
    private javax.swing.JMenuItem sub_cliente_consultar;
    private javax.swing.JMenuItem sub_cliente_crear;
    private javax.swing.JMenuItem sub_cliente_eliminar;
    private javax.swing.JMenuItem sub_entrega_actualizar;
    private javax.swing.JMenuItem sub_entrega_consultar;
    private javax.swing.JMenuItem sub_entrega_crear;
    private javax.swing.JMenuItem sub_entrega_eliminar;
    private javax.swing.JMenuItem sub_establecimiento_actualizar;
    private javax.swing.JMenuItem sub_establecimiento_consultar;
    private javax.swing.JMenuItem sub_establecimiento_crear;
    private javax.swing.JMenuItem sub_establecimiento_eliminar;
    private javax.swing.JMenuItem sub_notificacion_actualizar;
    private javax.swing.JMenuItem sub_notificacion_consultar;
    private javax.swing.JMenuItem sub_notificacion_crear;
    private javax.swing.JMenuItem sub_notificacion_eliminar;
    private javax.swing.JMenuItem sub_pedido_actualizar;
    private javax.swing.JMenuItem sub_pedido_consultar;
    private javax.swing.JMenuItem sub_pedido_crear;
    private javax.swing.JMenuItem sub_pedido_eliminar;
    private javax.swing.JMenuItem sub_producto_actualizar;
    private javax.swing.JMenuItem sub_producto_consultar;
    private javax.swing.JMenuItem sub_producto_crear;
    private javax.swing.JMenuItem sub_producto_eliminar;
    private javax.swing.JMenu submenu_cliente;
    private javax.swing.JMenu submenu_entrega;
    private javax.swing.JMenu submenu_establecimiento;
    private javax.swing.JMenu submenu_notificacion;
    private javax.swing.JMenu submenu_pedido;
    private javax.swing.JMenu submenu_producto;
    // End of variables declaration//GEN-END:variables
}
