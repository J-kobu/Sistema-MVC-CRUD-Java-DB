package vista;

import java.util.ArrayList;
import modelo.Persona;

public class SistemaDePersona extends javax.swing.JFrame {
    
    ArrayList<Persona> lista=new ArrayList();

    public SistemaDePersona() {
        initComponents();
        this.setLocationRelativeTo(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        mbPrincipal = new javax.swing.JMenuBar();
        meMantenedor = new javax.swing.JMenu();
        miIngresar = new javax.swing.JMenuItem();
        miConsultar = new javax.swing.JMenuItem();
        miModificar = new javax.swing.JMenuItem();
        miEliminar = new javax.swing.JMenuItem();
        meProcesos = new javax.swing.JMenu();
        miListar = new javax.swing.JMenuItem();
        meFinalizar = new javax.swing.JMenu();
        miSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 392, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 291, Short.MAX_VALUE)
        );

        meMantenedor.setText("Mantenedor");

        miIngresar.setText("Ingresar");
        miIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miIngresarActionPerformed(evt);
            }
        });
        meMantenedor.add(miIngresar);

        miConsultar.setText("Consultar");
        miConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miConsultarActionPerformed(evt);
            }
        });
        meMantenedor.add(miConsultar);

        miModificar.setText("Modificar");
        miModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miModificarActionPerformed(evt);
            }
        });
        meMantenedor.add(miModificar);

        miEliminar.setText("Eliminar");
        miEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miEliminarActionPerformed(evt);
            }
        });
        meMantenedor.add(miEliminar);

        mbPrincipal.add(meMantenedor);

        meProcesos.setText("Procesos");

        miListar.setText("Reporte de Personas");
        miListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miListarActionPerformed(evt);
            }
        });
        meProcesos.add(miListar);

        mbPrincipal.add(meProcesos);

        meFinalizar.setText("Finalizar");

        miSalir.setText("Salir");
        miSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSalirActionPerformed(evt);
            }
        });
        meFinalizar.add(miSalir);

        mbPrincipal.add(meFinalizar);

        setJMenuBar(mbPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(escritorio)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(escritorio)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miIngresarActionPerformed
        // TODO add your handling code here:
        IngresarPersona ip=new IngresarPersona(lista);
        escritorio.add(ip);
        ip.show();
    }//GEN-LAST:event_miIngresarActionPerformed

    private void miConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miConsultarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_miConsultarActionPerformed

    private void miModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_miModificarActionPerformed

    private void miEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_miEliminarActionPerformed

    private void miListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miListarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_miListarActionPerformed

    private void miSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_miSalirActionPerformed

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
            java.util.logging.Logger.getLogger(SistemaDePersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SistemaDePersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SistemaDePersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SistemaDePersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SistemaDePersona().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuBar mbPrincipal;
    private javax.swing.JMenu meFinalizar;
    private javax.swing.JMenu meMantenedor;
    private javax.swing.JMenu meProcesos;
    private javax.swing.JMenuItem miConsultar;
    private javax.swing.JMenuItem miEliminar;
    private javax.swing.JMenuItem miIngresar;
    private javax.swing.JMenuItem miListar;
    private javax.swing.JMenuItem miModificar;
    private javax.swing.JMenuItem miSalir;
    // End of variables declaration//GEN-END:variables
}
