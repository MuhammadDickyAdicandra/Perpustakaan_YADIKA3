/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Admin;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import koneksi.New_ConnectDB;

/**
 *
 * @author server
 */
public class PendaftaranAkun_Admin extends javax.swing.JFrame {
    private Connection conn = new New_ConnectDB().connect();

    /**
     * Creates new form PendaftaranAkun_Admin
     */
    public PendaftaranAkun_Admin() {
        initComponents();
        tf_ttl.setForeground(Color.gray);
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

        tf_nama1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        tf_ttl = new javax.swing.JTextField();
        tf_email = new javax.swing.JTextField();
        tf_pass = new javax.swing.JTextField();
        tf_pass2 = new javax.swing.JTextField();
        tf_nohp = new javax.swing.JTextField();
        cb_jeniskelamin = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        tf_KEY = new javax.swing.JTextField();
        key = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tf_nama1.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 12)); // NOI18N
        tf_nama1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));
        tf_nama1.setEnabled(false);
        tf_nama1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_nama1MouseClicked(evt);
            }
        });
        tf_nama1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_nama1ActionPerformed(evt);
            }
        });
        getContentPane().add(tf_nama1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 220, 330, 30));

        jPanel2.setBackground(new java.awt.Color(0, 255, 0));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 20)); // NOI18N
        jLabel22.setText("          SIMPAN");
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 550, 190, 50));

        tf_ttl.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 12)); // NOI18N
        tf_ttl.setForeground(new java.awt.Color(153, 153, 153));
        tf_ttl.setText("Tanggal/Bulan/Tahun");
        tf_ttl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));
        tf_ttl.setEnabled(false);
        tf_ttl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_ttlMouseClicked(evt);
            }
        });
        tf_ttl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_ttlActionPerformed(evt);
            }
        });
        getContentPane().add(tf_ttl, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 260, 330, 30));

        tf_email.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 12)); // NOI18N
        tf_email.setForeground(new java.awt.Color(153, 153, 153));
        tf_email.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));
        tf_email.setEnabled(false);
        tf_email.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_emailMouseClicked(evt);
            }
        });
        tf_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_emailActionPerformed(evt);
            }
        });
        getContentPane().add(tf_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 340, 330, 30));

        tf_pass.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 12)); // NOI18N
        tf_pass.setForeground(new java.awt.Color(153, 153, 153));
        tf_pass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));
        tf_pass.setEnabled(false);
        tf_pass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_passMouseClicked(evt);
            }
        });
        tf_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_passActionPerformed(evt);
            }
        });
        getContentPane().add(tf_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 420, 330, 30));

        tf_pass2.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 12)); // NOI18N
        tf_pass2.setForeground(new java.awt.Color(153, 153, 153));
        tf_pass2.setText("Konfirmasi kata sandi");
        tf_pass2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));
        tf_pass2.setEnabled(false);
        tf_pass2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_pass2MouseClicked(evt);
            }
        });
        tf_pass2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_pass2ActionPerformed(evt);
            }
        });
        getContentPane().add(tf_pass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 460, 330, 30));

        tf_nohp.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 12)); // NOI18N
        tf_nohp.setForeground(new java.awt.Color(153, 153, 153));
        tf_nohp.setText("08xx-xxxx-xxxx");
        tf_nohp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));
        tf_nohp.setEnabled(false);
        tf_nohp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_nohpMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tf_nohpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tf_nohpMouseExited(evt);
            }
        });
        tf_nohp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_nohpActionPerformed(evt);
            }
        });
        getContentPane().add(tf_nohp, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 380, 330, 30));

        cb_jeniskelamin.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 12)); // NOI18N
        cb_jeniskelamin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki-Laki", "Perempuan" }));
        cb_jeniskelamin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        cb_jeniskelamin.setEnabled(false);
        cb_jeniskelamin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_jeniskelaminActionPerformed(evt);
            }
        });
        getContentPane().add(cb_jeniskelamin, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 300, 120, 30));

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 20)); // NOI18N
        jLabel15.setText("         KELUAR");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 550, 190, 50));

        jLabel1.setFont(new java.awt.Font("Arial Black", 3, 22)); // NOI18N
        jLabel1.setText("PERPUSTAKAAN");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 5, 230, 20));

        jLabel16.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 35)); // NOI18N
        jLabel16.setText("PENDAFTARAN AKUN");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, -1, -1));

        jLabel13.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 20)); // NOI18N
        jLabel13.setText("Konfirmasi kata sandi");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 460, -1, -1));

        jLabel14.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 20)); // NOI18N
        jLabel14.setText("Tanggal lahir");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, -1, -1));

        jLabel17.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 20)); // NOI18N
        jLabel17.setText("Nama");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, -1, -1));

        jLabel18.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 20)); // NOI18N
        jLabel18.setText("Jenis kelamin");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, -1, -1));

        jLabel19.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 20)); // NOI18N
        jLabel19.setText("Email");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 340, -1, -1));

        jLabel20.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 20)); // NOI18N
        jLabel20.setText("No handphone");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, -1, -1));

        jLabel21.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 20)); // NOI18N
        jLabel21.setText("Masukkan kata sandi");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 420, -1, -1));

        jLabel23.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 18)); // NOI18N
        jLabel23.setText("Activation Key");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 160, 30));

        tf_KEY.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 12)); // NOI18N
        tf_KEY.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));
        tf_KEY.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tf_KEYMouseClicked(evt);
            }
        });
        tf_KEY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_KEYActionPerformed(evt);
            }
        });
        getContentPane().add(tf_KEY, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, 150, 30));

        key.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 12)); // NOI18N
        key.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));
        key.setEnabled(false);
        key.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                keyMouseClicked(evt);
            }
        });
        key.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyActionPerformed(evt);
            }
        });
        getContentPane().add(key, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 500, 330, 30));

        jLabel24.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 20)); // NOI18N
        jLabel24.setText("Buat Activation Key");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 500, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pendaptaran admin.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_nama1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_nama1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_nama1ActionPerformed

    private void tf_ttlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_ttlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_ttlActionPerformed

    private void tf_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_emailActionPerformed

    private void tf_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_passActionPerformed

    private void tf_pass2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_pass2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_pass2ActionPerformed

    private void tf_nohpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_nohpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_nohpActionPerformed

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        // TODO add your handling code here:
         dispose();
         new Login_Admin().setVisible(true);
    }//GEN-LAST:event_jPanel2MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        // TODO add your handling code here:
        dispose();
        new Login_Admin().setVisible(true);
    }//GEN-LAST:event_jLabel15MouseClicked

    private void tf_nohpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_nohpMouseClicked
        // TODO add your handling code here:
         tf_nohp.setText("");
         tf_nohp.setForeground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_tf_nohpMouseClicked

    private void tf_nama1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_nama1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_nama1MouseClicked

    private void tf_ttlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_ttlMouseClicked
        // TODO add your handling code here:
        tf_ttl.setText("");
        tf_ttl.setForeground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_tf_ttlMouseClicked

    private void tf_emailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_emailMouseClicked
        // TODO add your handling code here:
        tf_email.setText("");
         tf_email.setForeground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_tf_emailMouseClicked

    private void tf_passMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_passMouseClicked
        // TODO add your handling code here:
        tf_pass.setText("");
         tf_pass.setForeground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_tf_passMouseClicked

    private void tf_pass2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_pass2MouseClicked
        // TODO add your handling code here:
        tf_pass2.setText("");
         tf_pass2.setForeground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_tf_pass2MouseClicked

    private void tf_nohpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_nohpMouseEntered
        // TODO add your handling code here:
        tf_nohp.setText("");
        
    }//GEN-LAST:event_tf_nohpMouseEntered

    private void tf_nohpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_nohpMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_nohpMouseExited

    private void cb_jeniskelaminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_jeniskelaminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_jeniskelaminActionPerformed

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        // TODO add your handling code here:
         if(tf_nohp.getText().equals("")){
                JOptionPane.showMessageDialog(null,"No HP Tidak Boleh Kosong / No HP Kurang Lengkap"); 
            }else if (tf_nama1.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Nama Tidak Boleh Kosong"); 
            }else if (tf_ttl.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Kolom Tidak Boleh Kosong, Mohon di isi dengan Benar");
            }else if (tf_email.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Email Tidak Boleh Kososng / Email Kurang Tepat");
            }else if(tf_pass.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Password Tidak Boleh Kosong");
            } else if (tf_pass2.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Password Tidak Boleh Kosong");
            } else {
        String sql = "insert into admin (no_handphone,nama,tanggal_lahir,email,Jenis_Kelamin,password,aktivation_key)values (?,?,?,?,?,?,?);";
        try {
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, tf_nohp.getText());
            stat.setString(2, tf_nama1.getText());
            stat.setString(3, tf_ttl.getText());
            stat.setString(4, tf_email.getText());
            stat.setString(5, (String) cb_jeniskelamin.getSelectedItem());
            stat.setString(6, tf_pass.getText());
            stat.setString(7, key.getText());
           
            stat.executeUpdate();
            //update_kwh();
            JOptionPane.showMessageDialog(null, "Akun Berhasil di Buat");
            dispose();
            new Login_Admin().setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Akun Gagal di Buat " + e);
        }
            }
    }//GEN-LAST:event_jLabel22MouseClicked

    private void tf_KEYMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tf_KEYMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_KEYMouseClicked

    private void tf_KEYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_KEYActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "select * from admin where aktivation_key = '"+tf_KEY.getText()+"'";
            Statement stat = conn.createStatement();
            ResultSet rsLogin = stat.executeQuery(sql);

            rsLogin.next();
            //rsLogin.last(); //mengecek jumlah baris pada hasil query
            if (rsLogin.getRow()==1){
                JOptionPane.showMessageDialog(null, "Akses Dashboard Admin!");
                tf_nama1.setEnabled(true);
                tf_ttl.setEnabled(true);
                cb_jeniskelamin.setEnabled(true);
                tf_email.setEnabled(true);
                tf_nohp.setEnabled(true);
                tf_pass.setEnabled(true);
                tf_pass2.setEnabled(true);
                key.setEnabled(true);

            } else {
                JOptionPane.showMessageDialog(null, "PIN yang anda masukan salah");

            }
        } catch (SQLException e) {
        }
    }//GEN-LAST:event_tf_KEYActionPerformed

    private void keyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_keyMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_keyMouseClicked

    private void keyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_keyActionPerformed

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
            java.util.logging.Logger.getLogger(PendaftaranAkun_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PendaftaranAkun_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PendaftaranAkun_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PendaftaranAkun_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PendaftaranAkun_Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JComboBox<String> cb_jeniskelamin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField key;
    private javax.swing.JTextField tf_KEY;
    private javax.swing.JTextField tf_email;
    private javax.swing.JTextField tf_nama1;
    private javax.swing.JTextField tf_nohp;
    private javax.swing.JTextField tf_pass;
    private javax.swing.JTextField tf_pass2;
    private javax.swing.JTextField tf_ttl;
    // End of variables declaration//GEN-END:variables
}
