/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package gui;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Annisa Olga Z
 */
public class MenuAwal extends javax.swing.JFrame {

    /**
     * Creates new form MenuAwal
     */
    public MenuAwal() {
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

        btnCekDokter = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        btnPasien = new javax.swing.JButton();
        btnCekDokter2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCekDokter.setBackground(new java.awt.Color(254, 241, 239));
        btnCekDokter.setText("Data Dokter");
        btnCekDokter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCekDokterActionPerformed(evt);
            }
        });
        getContentPane().add(btnCekDokter, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 146, 40));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Resepsionis Rumah Sakit");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        btnPasien.setBackground(new java.awt.Color(254, 241, 239));
        btnPasien.setText("Data Pasien");
        btnPasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPasienActionPerformed(evt);
            }
        });
        getContentPane().add(btnPasien, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 146, 40));

        btnCekDokter2.setBackground(new java.awt.Color(254, 241, 239));
        btnCekDokter2.setText("Pembayaran");
        btnCekDokter2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCekDokter2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCekDokter2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 146, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/halu_1.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCekDokterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCekDokterActionPerformed
        // TODO add your handling code here:
         this.dispose();
        TDokter fd = null;
        try {
            fd = new TDokter();
        } catch (Exception ex) {
            Logger.getLogger(MenuAwal.class.getName()).log(Level.SEVERE, null, ex);
        }
        fd.setVisible(true);
    }//GEN-LAST:event_btnCekDokterActionPerformed

    private void btnPasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPasienActionPerformed
        // TODO add your handling code here:
        this.dispose();
        TPasien fpsn = null;
        try {
            fpsn = new TPasien();
        } catch (Exception ex) {
            Logger.getLogger(MenuAwal.class.getName()).log(Level.SEVERE, null, ex);
        }
        fpsn.setVisible(true);
    }//GEN-LAST:event_btnPasienActionPerformed

    private void btnCekDokter2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCekDokter2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        TPembayaran pmb = null;
        try{
            pmb = new TPembayaran();
        } catch (Exception ex) {
            Logger.getLogger(MenuAwal.class.getName()).log(Level.SEVERE, null, ex);
        }
        pmb.setVisible(true);
    }//GEN-LAST:event_btnCekDokter2ActionPerformed

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
            java.util.logging.Logger.getLogger(MenuAwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAwal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAwal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCekDokter;
    private javax.swing.JButton btnCekDokter2;
    private javax.swing.JButton btnPasien;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    // End of variables declaration//GEN-END:variables
}