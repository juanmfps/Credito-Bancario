/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package grafica;

import dto.Prestamo;
import dto.Usuario;
import javax.swing.JOptionPane;
import logica.GestorPrestamos;

/**
 *
 * @author acer
 */
public class Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    public Ventana() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cjNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cjIdentificacion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cjDinerop = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cjMeses = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("CREDITO BANCARIO");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(200, 10, 190, 22);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Nombre Completo:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 60, 110, 15);
        getContentPane().add(cjNombre);
        cjNombre.setBounds(170, 60, 120, 19);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Numero Identificacion:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 100, 130, 15);

        cjIdentificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cjIdentificacionActionPerformed(evt);
            }
        });
        getContentPane().add(cjIdentificacion);
        cjIdentificacion.setBounds(170, 100, 120, 19);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Dinero a prestamo: ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 150, 120, 15);

        cjDinerop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cjDineropActionPerformed(evt);
            }
        });
        getContentPane().add(cjDinerop);
        cjDinerop.setBounds(170, 150, 120, 19);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Cantidad de meses al prestamo:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(360, 50, 180, 20);

        cjMeses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cjMesesActionPerformed(evt);
            }
        });
        getContentPane().add(cjMeses);
        cjMeses.setBounds(380, 80, 130, 19);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 3, 10)); // NOI18N
        jButton1.setText("APROXIMAR CREDITO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(380, 150, 150, 20);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Times New Roman", 3, 10)); // NOI18N
        jButton2.setText("INFO USUARIOS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(380, 180, 150, 20);

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Times New Roman", 3, 10)); // NOI18N
        jButton3.setText("CREAR CREDITO");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(380, 120, 150, 20);

        setBounds(0, 0, 606, 274);
    }// </editor-fold>//GEN-END:initComponents

    private void cjIdentificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cjIdentificacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cjIdentificacionActionPerformed

    private void cjDineropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cjDineropActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cjDineropActionPerformed

    private void cjMesesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cjMesesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cjMesesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        crearPrestamo();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
       
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cjDinerop;
    private javax.swing.JTextField cjIdentificacion;
    private javax.swing.JTextField cjMeses;
    private javax.swing.JTextField cjNombre;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables

    public void crearPrestamo(){
      
        String nombre = cjNombre.getText();
        String identificacion = cjIdentificacion.getText();
        String dinerop = cjDinerop.getText();
        String fechaPrestamo = cjMeses.getText();
    
          GestorPrestamos g = new GestorPrestamos();
        Prestamo c = g.crearPrestamo(nombre, identificacion, fechaPrestamo, dinerop);
        
            JOptionPane.showMessageDialog(this, "Prestamo creado - "+c);
        
    }
    

}
