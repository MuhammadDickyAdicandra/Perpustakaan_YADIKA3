/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Member;

import com.Admin.Home_Admin;

/**
 *
 * @author Hard JFS
 */
public class bukubirumember extends javax.swing.JFrame {

    /**
     * Creates new form bukubiru
     */
    public bukubirumember() {
        initComponents();
        setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ala_isbnMember1 = new javax.swing.JLabel();
        ala_stokMember1 = new javax.swing.JLabel();
        ala_judulMember1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        ala_penulisMember1 = new javax.swing.JLabel();
        ala_penerbitMember1 = new javax.swing.JLabel();
        ala_tahunMember1 = new javax.swing.JLabel();
        Penulis4 = new javax.swing.JLabel();
        Penerbit4 = new javax.swing.JLabel();
        Tahun_Terbit4 = new javax.swing.JLabel();
        Isbn4 = new javax.swing.JLabel();
        popup = new javax.swing.JLabel();

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bintang 1.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/arrow left.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, 50));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/book 1.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 20, 80, 90));

        jLabel6.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 14)); // NOI18N
        jLabel6.setText("Rating");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 143, -1, 20));

        ala_isbnMember1.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 18)); // NOI18N
        ala_isbnMember1.setText("?");
        getContentPane().add(ala_isbnMember1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 295, 30));

        ala_stokMember1.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 14)); // NOI18N
        ala_stokMember1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ala_stokMember1.setText("00000");
        getContentPane().add(ala_stokMember1, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 172, -1, 30));

        ala_judulMember1.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 18)); // NOI18N
        ala_judulMember1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ala_judulMember1.setText("Judul Buku");
        getContentPane().add(ala_judulMember1, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 110, 323, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bintang 1.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 140, 130, -1));

        jLabel11.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 14)); // NOI18N
        jLabel11.setText("Stok Buku ");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 172, -1, 30));

        ala_penulisMember1.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 18)); // NOI18N
        ala_penulisMember1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ala_penulisMember1.setText("?");
        getContentPane().add(ala_penulisMember1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 295, 30));

        ala_penerbitMember1.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 18)); // NOI18N
        ala_penerbitMember1.setText("?");
        getContentPane().add(ala_penerbitMember1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 295, 30));

        ala_tahunMember1.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 18)); // NOI18N
        ala_tahunMember1.setText("?");
        getContentPane().add(ala_tahunMember1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 295, 30));

        Penulis4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Penulis4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Penulis4.setText("Penulis :");
        getContentPane().add(Penulis4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 225, -1, -1));

        Penerbit4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Penerbit4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Penerbit4.setText("Penerbit :");
        getContentPane().add(Penerbit4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        Tahun_Terbit4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Tahun_Terbit4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Tahun_Terbit4.setText("Tahun Terbit :");
        getContentPane().add(Tahun_Terbit4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        Isbn4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Isbn4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Isbn4.setText("ISBN :");
        getContentPane().add(Isbn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));

        popup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pop up tr1.png"))); // NOI18N
        popup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                popupMouseExited(evt);
            }
        });
        getContentPane().add(popup, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void popupMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_popupMouseExited
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_popupMouseExited

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
            java.util.logging.Logger.getLogger(bukubirumember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bukubirumember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bukubirumember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bukubirumember.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bukubirumember().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Isbn4;
    private javax.swing.JLabel Penerbit4;
    private javax.swing.JLabel Penulis4;
    private javax.swing.JLabel Tahun_Terbit4;
    public static javax.swing.JLabel ala_isbnMember1;
    public static javax.swing.JLabel ala_judulMember1;
    public static javax.swing.JLabel ala_penerbitMember1;
    public static javax.swing.JLabel ala_penulisMember1;
    public static javax.swing.JLabel ala_stokMember1;
    public static javax.swing.JLabel ala_tahunMember1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel popup;
    // End of variables declaration//GEN-END:variables
}
