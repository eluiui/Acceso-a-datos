/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.mycompany.academiamas;

import java.awt.Dialog;
import javax.swing.DefaultListModel;
import javax.swing.JDialog;
import javax.swing.JLabel;

/**
 *
 * @author a20alejandrofs
 */
public class JDVerAlumno extends javax.swing.JDialog {

    VentanaPrincipal padre = (VentanaPrincipal) this.getParent();
    DefaultListModel<String> listaModel = new DefaultListModel<>();

    /**
     * Creates new form JDVerAlumno
     */
    public JDVerAlumno(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        textoBuscarNombre = new javax.swing.JTextField();
        botonMostrarVerAlumno = new javax.swing.JButton();
        nombreVer = new javax.swing.JLabel();
        localidadVer = new javax.swing.JLabel();
        horasVer = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaModulosVer = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        botonMostrarVerAlumno.setText("Mostrar");
        botonMostrarVerAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMostrarVerAlumnoActionPerformed(evt);
            }
        });

        nombreVer.setText("Nombre");

        localidadVer.setText("Localidad");

        horasVer.setText("Horas");

        listaModulosVer.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "No hay modulos" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(listaModulosVer);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textoBuscarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonMostrarVerAlumno))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(localidadVer)
                            .addComponent(nombreVer)
                            .addComponent(horasVer))
                        .addGap(63, 63, 63)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoBuscarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonMostrarVerAlumno))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(nombreVer)
                        .addGap(18, 18, 18)
                        .addComponent(localidadVer)
                        .addGap(18, 18, 18)
                        .addComponent(horasVer))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(87, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonMostrarVerAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMostrarVerAlumnoActionPerformed
        Alumno alumno = padre.getFromAlumnosByNombre(textoBuscarNombre.getText());
        if (alumno != null) {
            listaModel.clear();
            nombreVer.setText(alumno.getNombre());
            localidadVer.setText(alumno.getLocalidad());
            listaModel.addAll(alumno.getNombreModulos());
            listaModulosVer.setModel(listaModel);
            horasVer.setText(String.valueOf(alumno.getNumeroHoras()));
        } else {
            JDialog errorDialog = new JDialog();
            errorDialog.setTitle("Error de búsqueda");
            errorDialog.setSize(300, 100);
            errorDialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
            errorDialog.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);

            JLabel errorMessage = new JLabel("Alumno no encontrado.");
            errorDialog.add(errorMessage);

            errorDialog.setLocationRelativeTo(null);
            errorDialog.setVisible(true);
        }
    }//GEN-LAST:event_botonMostrarVerAlumnoActionPerformed

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
            java.util.logging.Logger.getLogger(JDVerAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDVerAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDVerAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDVerAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDVerAlumno dialog = new JDVerAlumno(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonMostrarVerAlumno;
    private javax.swing.JLabel horasVer;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listaModulosVer;
    private javax.swing.JLabel localidadVer;
    private javax.swing.JLabel nombreVer;
    private javax.swing.JTextField textoBuscarNombre;
    // End of variables declaration//GEN-END:variables
}
