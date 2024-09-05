package com.mycompany.academiamas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JDialog;

/**
 *
 * @author a20alejandrofs
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    private List<Alumno> listaAlumnos = new ArrayList<>();

    public List<Alumno> getListaAlumnos() {
        return listaAlumnos;
    }

    public List<Modulo> getListaModulos() {
        return listaModulos;
    }
    private List<Modulo> listaModulos = new ArrayList<>();

    public void addAlumnoLista(Alumno alumno) {
        this.listaAlumnos.add(alumno);
    }

    public void addModuloLista(Modulo modulo) {
        this.listaModulos.add(modulo);
    }

    public Alumno getFromAlumnosByNombre(String nombre) {
        Iterator<Alumno> iter = listaAlumnos.iterator();
        Alumno alumno;
        while (iter.hasNext()) {
            alumno = iter.next();
            if (alumno.getNombre().equals(nombre)) {
                return alumno;
            }
        }
        return null;
    }

    public Modulo getFromModulosByNombre(String nombre) {
        Iterator<Modulo> iter = listaModulos.iterator();
        Modulo modulo;
        while (iter.hasNext()) {
            modulo = iter.next();
            if (modulo.getNombre().equals(nombre)) {
                return modulo;
            }
        }
        return null;
    }

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
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

        addAlumno = new javax.swing.JButton();
        addModulo = new javax.swing.JButton();
        verAlumno = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        addAlumno.setText("Añadir Alumno");
        addAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAlumnoActionPerformed(evt);
            }
        });

        addModulo.setText("Añadir Modulo");
        addModulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addModuloActionPerformed(evt);
            }
        });

        verAlumno.setText("Ver Alumno");
        verAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verAlumnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(verAlumno)
                    .addComponent(addModulo)
                    .addComponent(addAlumno))
                .addContainerGap(234, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(addAlumno)
                .addGap(18, 18, 18)
                .addComponent(addModulo)
                .addGap(18, 18, 18)
                .addComponent(verAlumno)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAlumnoActionPerformed
        JDialog addAlumno = new JDAddAlumno(this, true);
        addAlumno.setSize(300, 400);
        addAlumno.show();
    }//GEN-LAST:event_addAlumnoActionPerformed

    private void addModuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addModuloActionPerformed
        JDialog addModulo = new JDAddModulo(this, true);
        addModulo.setSize(300, 400);
        addModulo.show();
    }//GEN-LAST:event_addModuloActionPerformed

    private void verAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verAlumnoActionPerformed
        JDialog verAlumno = new JDVerAlumno(this, true);
        verAlumno.setSize(400, 300);
        verAlumno.show();
    }//GEN-LAST:event_verAlumnoActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addAlumno;
    private javax.swing.JButton addModulo;
    private javax.swing.JButton verAlumno;
    // End of variables declaration//GEN-END:variables
}
