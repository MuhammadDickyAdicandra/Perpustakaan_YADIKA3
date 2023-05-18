/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Member;

import com.Admin.Home_Admin;
import static com.Admin.melihatprofileADMIN.Email;
import static com.Admin.melihatprofileADMIN.JenisKelamin;
import static com.Admin.melihatprofileADMIN.TanggalLahir;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import koneksi.New_ConnectDB;

/**
 *
 * @author Hard JFS
 */
public class melihatprofile extends javax.swing.JFrame {
    private Connection conn = new New_ConnectDB().connect();

    /**
     * Creates new form melihatprofile
     */
    public melihatprofile() {
        initComponents();
        setLocationRelativeTo(this);
         Member();
    }
    
    protected void kosong(){
        UP_kelas.setText("");
        UP_email.setText("");
        tf_pass.setText("");
        UP_sandibaru.setText("");
        tf_pass2.setText("");
    }
    
    
    
    protected void Member() {
        String sql = "select nis, kelas, tanggal_lahir, jenis_kelamin, email  where nama  = '"+tf_nama.getText() + "' ";
        try {
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()) {
                String snis = hasil.getString("nis");
                String skelas = hasil.getString("kelas");
                String stanggal_lahir = hasil.getString("tanggal_lahir");
                String sjeniskel = hasil.getString("jenis_kelamin");
                String smail = hasil.getString("email");
                //String[] data = {no_hp,nama, tanggal_lahir, email, jenis_kelamin};
                tf_NIS.setText(snis);
                tf_kelas.setText(skelas);
                TanggalLahir.setText(stanggal_lahir);
                JenisKelamin.setText(sjeniskel);
                Email.setText(smail);
                //tabmode.addRow(data);

            }
        } catch (Exception e) {
        }
        
    }
     
     
     protected void UBAH() {
        String sql = "select email, kelas from member where nis  = '"+ tf_NIS.getText() + "' ";
        try {
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()) {
                String snis = hasil.getString("email");
                String skelas = hasil.getString("kelas");
                //String[] data = {no_hp,nama, tanggal_lahir, email, jenis_kelamin};
                tf_email.setText(snis);
                tf_kelas.setText(skelas);
                //tabmode.addRow(data);

            }
        } catch (Exception e) {
        }
    }
    
     protected void sandi() {
        String sql = "select password from member where nis  = '"+ PS_TB.getText() + "' ";
        try {
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()) {
                String sPASS = hasil.getString("password");
                PS_TB.setText(sPASS);
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

        tf_email = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tf_kelas = new javax.swing.JLabel();
        tf_TTL = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        UP_kelas = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        UP_email = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        tf_pass = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        UP_sandibaru = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        tf_pass2 = new javax.swing.JTextField();
        Jenis_Kelamin = new javax.swing.JLabel();
        tf_nama = new javax.swing.JLabel();
        tf_NIS = new javax.swing.JLabel();
        bgpopupaktivitas = new javax.swing.JLabel();
        PS_TB = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tf_email.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 12)); // NOI18N
        tf_email.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tf_email.setText("Email");
        getContentPane().add(tf_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 230, 40));

        jLabel12.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("SIMPAN");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 400, 160, 34));

        tf_kelas.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 12)); // NOI18N
        tf_kelas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tf_kelas.setText("Kelas");
        getContentPane().add(tf_kelas, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 230, 40));

        tf_TTL.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 12)); // NOI18N
        tf_TTL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tf_TTL.setText("Tanggal Lahir");
        getContentPane().add(tf_TTL, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 230, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/profile-user 1 (1) 1.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 30, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/RecAKTIV1.png"))); // NOI18N
        jLabel3.setAlignmentY(25.0F);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 260, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/RecAKTIV1.png"))); // NOI18N
        jLabel8.setAlignmentY(25.0F);
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/RecAKTIV1.png"))); // NOI18N
        jLabel4.setAlignmentY(25.0F);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 260, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/RectAKTIV2.png"))); // NOI18N
        jLabel6.setAlignmentY(25.0F);
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 400, 170, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/arrow left.png"))); // NOI18N
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, 50));

        UP_kelas.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 12)); // NOI18N
        UP_kelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UP_kelasActionPerformed(evt);
            }
        });
        getContentPane().add(UP_kelas, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 290, 30));

        jLabel18.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 14)); // NOI18N
        jLabel18.setText("Ubah Kelas :   ");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 130, 20));

        jLabel19.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 14)); // NOI18N
        jLabel19.setText("Ubah Email :");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 120, 20));

        UP_email.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 12)); // NOI18N
        getContentPane().add(UP_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 290, 30));

        jLabel20.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 14)); // NOI18N
        jLabel20.setText("Masukkan kata sandi lama :");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, -1, 20));

        tf_pass.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 12)); // NOI18N
        tf_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_passActionPerformed(evt);
            }
        });
        getContentPane().add(tf_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, 290, 30));

        jLabel21.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 14)); // NOI18N
        jLabel21.setText("Buat kata sandi baru:");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, -1, 20));

        UP_sandibaru.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 12)); // NOI18N
        UP_sandibaru.setEnabled(false);
        getContentPane().add(UP_sandibaru, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, 290, 30));

        jLabel17.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 14)); // NOI18N
        jLabel17.setText("Konfirmasi kata sandi:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, -1, 20));

        tf_pass2.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 12)); // NOI18N
        tf_pass2.setEnabled(false);
        getContentPane().add(tf_pass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, 290, 30));

        Jenis_Kelamin.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 12)); // NOI18N
        Jenis_Kelamin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Jenis_Kelamin.setText("Jenis kelamin");
        getContentPane().add(Jenis_Kelamin, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 100, -1));

        tf_nama.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 25)); // NOI18N
        tf_nama.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tf_nama.setText("Nama Pengguna");
        getContentPane().add(tf_nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 95, 320, -1));

        tf_NIS.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 15)); // NOI18N
        tf_NIS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tf_NIS.setText("NIS");
        getContentPane().add(tf_NIS, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 132, 100, -1));

        bgpopupaktivitas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tp akun.png"))); // NOI18N
        getContentPane().add(bgpopupaktivitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, -1));

        PS_TB.setText("jLabel1");
        getContentPane().add(PS_TB, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jLabel15MouseClicked

    private void UP_kelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UP_kelasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UP_kelasActionPerformed

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
        if(UP_kelas.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Column Tidak Boleh Kosong / Column Kurang Lengkap"); 
            }else if (UP_email.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Column Tidak Boleh Kosong"); 
            }else if (tf_pass.getText().equals("")){
                 JOptionPane.showMessageDialog(null,"Column Tidak Boleh Kosong");
            }else if (UP_sandibaru.getText().equals("")){
                 JOptionPane.showMessageDialog(null,"Column Tidak Boleh Kosong");
            }else if (tf_pass2.getText().equals("")){
                 JOptionPane.showMessageDialog(null,"Column Tidak Boleh Kosong");
            }else {
        
         try {
            String sql = "update member set kelas=?, email=?, password=? where nis='"+tf_NIS.getText()+"'";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, UP_kelas.getText());
            stat.setString(2, UP_email.getText());
            stat.setString(3, UP_sandibaru.getText());
            stat.executeUpdate();
            UBAH();
            JOptionPane.showMessageDialog(null,
                    "Data berhasil di ubah");
            kosong();
            
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null,
                    "Data gagal diubah" +e);
        }
            }
    }//GEN-LAST:event_jLabel12MouseClicked

    private void tf_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_passActionPerformed
        // TODO add your handling code here:
         if(tf_pass.getText().equals(""+PS_TB.getText())){
                UP_sandibaru.setEnabled(true);
                tf_pass2.setEnabled(true);
            }else {
                JOptionPane.showMessageDialog(null,"Password Tidak Sesuai"); 
                UP_sandibaru.setEnabled(false);
                tf_pass2.setEnabled(false);
            }
    }//GEN-LAST:event_tf_passActionPerformed

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
            java.util.logging.Logger.getLogger(melihatprofile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(melihatprofile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(melihatprofile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(melihatprofile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new melihatprofile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel Jenis_Kelamin;
    public static javax.swing.JLabel PS_TB;
    private javax.swing.JTextField UP_email;
    private javax.swing.JTextField UP_kelas;
    private javax.swing.JTextField UP_sandibaru;
    private javax.swing.JLabel bgpopupaktivitas;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    public static javax.swing.JLabel tf_NIS;
    public static javax.swing.JLabel tf_TTL;
    public static javax.swing.JLabel tf_email;
    public static javax.swing.JLabel tf_kelas;
    public static javax.swing.JLabel tf_nama;
    private javax.swing.JTextField tf_pass;
    private javax.swing.JTextField tf_pass2;
    // End of variables declaration//GEN-END:variables
}