/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import koneksi.New_ConnectDB;

/**
 *
 * @author server
 */
public class LupaPassword_Member extends javax.swing.JFrame {
     private Connection conn = new New_ConnectDB().connect();

    /**
     * Creates new form NewJFrame
     */
    public LupaPassword_Member() {
        initComponents();
        setLocationRelativeTo(this);
        Member(); 
    }
    
    
    protected void kosong(){
        tf_NIS.setText("");
        tf_nama.setText("");
        tf_kelas.setText("");
        tf_ttl.setText("");
        tf_pass.setText("");
        tf_pass2.setText("");
    }
    
    
     protected void Member() {
        String sql = "select nama, kelas, tanggal_lahir, password where nis  = '"+tf_NIS.getText() + "' ";
        try {
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()) {
                String snama = hasil.getString("nama");
                String skelas = hasil.getString("kelas");
                String stanggal_lahir = hasil.getString("tanggal_lahir");
                String spassword = hasil.getString("password");
                //String[] data = {no_hp,nama, tanggal_lahir, email, jenis_kelamin};
                tf_nama.setText(snama);
                tf_kelas.setText(skelas);
                tf_ttl.setText(stanggal_lahir);
                tf_pass.setText(spassword);
                //tabmode.addRow(data);

            }
        } catch (Exception e) {
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tf_NIS = new javax.swing.JTextField();
        tf_nama = new javax.swing.JTextField();
        tf_ttl = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        tf_kelas = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        tf_pass = new javax.swing.JPasswordField();
        tf_pass2 = new javax.swing.JPasswordField();
        backgroud = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tf_NIS.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 18)); // NOI18N
        tf_NIS.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));
        tf_NIS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_NISActionPerformed(evt);
            }
        });
        tf_NIS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_NISKeyReleased(evt);
            }
        });
        getContentPane().add(tf_NIS, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 220, 380, 40));

        tf_nama.setEditable(false);
        tf_nama.setBackground(new java.awt.Color(255, 255, 255));
        tf_nama.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 18)); // NOI18N
        tf_nama.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));
        tf_nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_namaActionPerformed(evt);
            }
        });
        getContentPane().add(tf_nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 270, 380, 40));

        tf_ttl.setEditable(false);
        tf_ttl.setBackground(new java.awt.Color(255, 255, 255));
        tf_ttl.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 18)); // NOI18N
        tf_ttl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));
        tf_ttl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_ttlActionPerformed(evt);
            }
        });
        getContentPane().add(tf_ttl, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 370, 380, 40));

        jTextField17.setBackground(new java.awt.Color(240, 240, 240));
        jTextField17.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextField17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));
        jTextField17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField17ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 220, 380, 40));

        jTextField13.setBackground(new java.awt.Color(240, 240, 240));
        jTextField13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextField13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));
        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 270, 380, 40));

        tf_kelas.setEditable(false);
        tf_kelas.setBackground(new java.awt.Color(255, 255, 255));
        tf_kelas.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 18)); // NOI18N
        tf_kelas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));
        tf_kelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_kelasActionPerformed(evt);
            }
        });
        getContentPane().add(tf_kelas, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 320, 380, 40));

        jTextField19.setBackground(new java.awt.Color(240, 240, 240));
        jTextField19.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTextField19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));
        jTextField19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField19ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 320, 380, 40));

        jPanel2.setBackground(new java.awt.Color(0, 255, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 20)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("SIMPAN");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 550, 180, 50));

        jLabel12.setFont(new java.awt.Font("Arial Black", 3, 22)); // NOI18N
        jLabel12.setText("PERPUSTAKAAN");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 230, 20));

        jLabel13.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 35)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("LUPA KATA SANDI ?");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, -1, -1));

        jLabel6.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 20)); // NOI18N
        jLabel6.setText("NIS");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 240, 40));

        jLabel14.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 20)); // NOI18N
        jLabel14.setText("Konfirmasi kata sandi");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 470, -1, 40));

        jLabel15.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 20)); // NOI18N
        jLabel15.setText("Nama");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 240, 40));

        jLabel16.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 20)); // NOI18N
        jLabel16.setText("Kelas");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, 240, 40));

        jLabel17.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 20)); // NOI18N
        jLabel17.setText("Tanggal lahir");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 370, 240, 40));

        jLabel18.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 20)); // NOI18N
        jLabel18.setText("Buat kata sandi baru");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 420, 240, 40));

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 20)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("KEMBALI");
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 550, 180, 50));

        tf_pass.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 12)); // NOI18N
        tf_pass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));
        tf_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_passActionPerformed(evt);
            }
        });
        tf_pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf_passKeyPressed(evt);
            }
        });
        getContentPane().add(tf_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 420, 380, 40));

        tf_pass2.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 12)); // NOI18N
        tf_pass2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));
        tf_pass2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_pass2ActionPerformed(evt);
            }
        });
        tf_pass2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf_pass2KeyPressed(evt);
            }
        });
        getContentPane().add(tf_pass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 470, 380, 40));

        backgroud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Lupa Password.png"))); // NOI18N
        getContentPane().add(backgroud, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_ttlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_ttlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_ttlActionPerformed

    private void jTextField17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField17ActionPerformed

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13ActionPerformed

    private void tf_kelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_kelasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_kelasActionPerformed

    private void jTextField19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField19ActionPerformed

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel13MouseClicked

    private void tf_NISActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_NISActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_NISActionPerformed

    private void tf_namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_namaActionPerformed

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        if(tf_NIS.getText().equals("")){
                JOptionPane.showMessageDialog(null,"NIS Tidak Boleh Kosong / NIS Kurang Lengkap"); 
            }else if (tf_nama.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Nama Tidak Boleh Kosong"); 
            }else if (tf_kelas.getText().equals("")){
                 JOptionPane.showMessageDialog(null,"Nama Tidak Boleh Kosong");
            }else if (tf_ttl.getText().equals("")){
                 JOptionPane.showMessageDialog(null,"Nama Tidak Boleh Kosong");
            }else if (tf_pass.getText().equals("")){
                 JOptionPane.showMessageDialog(null,"Nama Tidak Boleh Kosong");
            }else if (tf_pass2.getText().equals("")){
                 JOptionPane.showMessageDialog(null,"Nama Tidak Boleh Kosong");
            }else {
        
         try {
            String sql = "update member set password=? where nis='"+tf_NIS.getText()+"'";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, tf_pass.getText());
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null,
                    "Data berhasil di ubah");
            kosong();
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null,
                    "Data gagal diubah" +e);
        }
            }
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        // TODO add your handling code here:
        dispose();
        new LoginSiswa().setVisible(true);
    }//GEN-LAST:event_jLabel19MouseClicked

    private void tf_NISKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_NISKeyReleased
        // TODO add your handling code here:
        try {
            String sql = "select nama,kelas,tanggal_lahir from member where nis = '" + tf_NIS.getText()+"'";
            PreparedStatement stat = conn.prepareStatement(sql);
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()) {
                String snama = hasil.getString("nama");
                String skelas = hasil.getString("kelas");
                String stanggallahir = hasil.getString("tanggal_lahir");
                tf_nama.setText(snama);
                tf_kelas.setText(skelas);
                tf_ttl.setText(stanggallahir);
            }
        } catch (SQLException e) {
        }
    }//GEN-LAST:event_tf_NISKeyReleased

    private void tf_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_passActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_tf_passActionPerformed

    private void tf_passKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_passKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_passKeyPressed

    private void tf_pass2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_pass2ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_tf_pass2ActionPerformed

    private void tf_pass2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_pass2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_pass2KeyPressed

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
            java.util.logging.Logger.getLogger(LupaPassword_Member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LupaPassword_Member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LupaPassword_Member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LupaPassword_Member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LupaPassword_Member().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroud;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField tf_NIS;
    private javax.swing.JTextField tf_kelas;
    private javax.swing.JTextField tf_nama;
    private javax.swing.JPasswordField tf_pass;
    private javax.swing.JPasswordField tf_pass2;
    private javax.swing.JTextField tf_ttl;
    // End of variables declaration//GEN-END:variables
}