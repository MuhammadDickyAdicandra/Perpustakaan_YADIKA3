/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Admin;

import com.Member.Home_Member;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import koneksi.New_ConnectDB;
import static com.Admin.Trending_Rekomendasi.st1;
import static com.Admin.Trending_Rekomendasi.st3;
import static com.Admin.Trending_Rekomendasi.st2;
import static com.Admin.Trending_Rekomendasi.st4;
import static com.Admin.Trending_Rekomendasi.rk1;
import static com.Admin.Trending_Rekomendasi.rk2;
import static com.Admin.Trending_Rekomendasi.rk3;
import static com.Admin.Trending_Rekomendasi.rk4;

/**
 *
 * @author server
 */
public class Login_Admin extends javax.swing.JFrame {
    private New_ConnectDB conn = new New_ConnectDB();

    /**
     * Creates new form Login
     */
    public Login_Admin() {
        initComponents();
        setLocationRelativeTo(this);
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    }
    
    protected void trending(){
        conn.connect();
        try {
            String sql = "select * from trending";
            Statement stat = conn.connect().createStatement();
            ResultSet rsLogin = stat.executeQuery(sql);
 
            rsLogin.next();
            rsLogin.last(); //mengecek jumlah baris pada hasil query
            if (rsLogin.getRow()==1){
                String strending1 = rsLogin.getString("Sedang_Trending1");
                String strending2 = rsLogin.getString("Sedang_Trending2");
                String strending3 = rsLogin.getString("Sedang_Trending3");
                String strending4 = rsLogin.getString("Sedang_Trending4");
                
                Trending_Rekomendasi b= new Trending_Rekomendasi();
                b.st1.setText(strending1);
                b.st2.setText(strending2);
                b.st3.setText(strending3);
                b.st4.setText(strending4);
                b.setVisible(true);
                dispose();
                
                
                
                //new a().setVisible(true);
            } else {
                //
            }
        } catch (SQLException e) {
        }
    }
    
     protected void rekomendasi(){
        conn.connect();
        try {
            String sql = "select * from rekomendasi";
            Statement stat = conn.connect().createStatement();
            ResultSet rsLogin = stat.executeQuery(sql);
 
            rsLogin.next();
            rsLogin.last(); //mengecek jumlah baris pada hasil query
            if (rsLogin.getRow()==1){
                String srekomendasi1 = rsLogin.getString("Rekomendasi1");
                String srekomendasi2 = rsLogin.getString("Rekomendasi2");
                String srekomendasi3 = rsLogin.getString("Rekomendasi3");
                String srekomendasi4 = rsLogin.getString("Rekomendasi4");
                
                Trending_Rekomendasi b= new Trending_Rekomendasi();
                b.rk1.setText(srekomendasi1);
                b.rk2.setText(srekomendasi2);
                b.rk3.setText(srekomendasi3);
                b.rk4.setText(srekomendasi4);
                b.setVisible(true);
                
                
                
                //new a().setVisible(true);
            } else {
                //
            }
        } catch (SQLException e) {
        }
    }
    
    protected void kosong() {
        NoHP.setText("");
        PWADMIN.setText("");
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
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        NoHP = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        PWADMIN = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 3, 22)); // NOI18N
        jLabel1.setText("PERPUSTAKAAN ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 230, 20));

        jLabel2.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 50)); // NOI18N
        jLabel2.setText("LOGIN");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 170, -1, 50));

        jLabel3.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 15)); // NOI18N
        jLabel3.setText("MASUKAN SANDI");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 400, 150, 20));

        jLabel5.setFont(new java.awt.Font("Open Sans ExtraBold", 3, 20)); // NOI18N
        jLabel5.setText("Selamat Datang di Perpustakaan Kami!");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, -1, -1));

        jLabel6.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 15)); // NOI18N
        jLabel6.setText("NO HANDPHONE");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 310, 140, 20));

        NoHP.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 12)); // NOI18N
        NoHP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));
        NoHP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                NoHPKeyPressed(evt);
            }
        });
        getContentPane().add(NoHP, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 330, 300, 30));

        jPanel2.setBackground(new java.awt.Color(0, 255, 0));
        jPanel2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jPanel2AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel2MouseEntered(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 20)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("MASUK");
        jLabel7.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel7AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1, 190, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 555, 190, 50));

        jLabel8.setFont(new java.awt.Font("Open Sans ExtraBold", 3, 20)); // NOI18N
        jLabel8.setText("Buat Akun");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 465, -1, -1));

        PWADMIN.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 12)); // NOI18N
        PWADMIN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));
        PWADMIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PWADMINActionPerformed(evt);
            }
        });
        PWADMIN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PWADMINKeyPressed(evt);
            }
        });
        getContentPane().add(PWADMIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 420, 300, 30));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/arrow left.png"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 60, 50));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/login admin.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jPanel2AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel2AncestorAdded

    private void jLabel7AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel7AncestorAdded
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jLabel7AncestorAdded

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
       try {
            String sql = "select * from admin where no_handphone = '" + NoHP.getText() + "' and Password = '" + PWADMIN.getText() + "'";
            Statement stat = conn.connect().createStatement();
            ResultSet rsLogin = stat.executeQuery(sql);
 
            rsLogin.next();
            rsLogin.last(); //mengecek jumlah baris pada hasil query
            if (rsLogin.getRow()==1){
                JOptionPane.showMessageDialog(null, "Login Berhasil!");
                dispose();
                //new Dashboard_Member().setVisible(true); //<-- BILA MAU DIARAHKAN KE Frame Menu Utama
                //String a=tfusername.getText();
                
                String snama = rsLogin.getString("nama");
                String no_hp = rsLogin.getString("no_handphone");
                String tanggal_lahir = rsLogin.getString("tanggal_lahir");
                String email = rsLogin.getString("email");
                String jenis_kelamin = rsLogin.getString("jenis_kelamin");
                String password = rsLogin.getString("password");
               
                
                /*DaftarMajalah_Admin c= new DaftarMajalah_Admin();
                c.jLabel6.setText(snama);
                c.setVisible(true);
                dispose();*/
                
                Home_Admin b= new Home_Admin();
                b.jLabel7.setText(snama);
                b.Tumbal_nohp.setText(""+no_hp);
                b.Tumbal_email.setText(""+email);
                b.Tumbal_TTL.setText(""+tanggal_lahir);
                b.Tumbal_jenisKel.setText(""+jenis_kelamin);
                b.PS_TB_HOME.setText(password);
                //jLabel6.
                b.setVisible(true);
                //new a().setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Maaf, Username / Password anda salah!");
                //kosong();
                NoHP.requestFocus();
            }
        } catch (SQLException e) {
        }
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
         dispose();
         new PendaftaranAkun_Admin().setVisible(true);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jPanel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseEntered
        // TODO add your handling code here:
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));
        
    }//GEN-LAST:event_jPanel2MouseEntered

    private void NoHPKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NoHPKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == evt.VK_ENTER){
            PWADMIN.requestFocus();
        }
    }//GEN-LAST:event_NoHPKeyPressed

    private void PWADMINKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PWADMINKeyPressed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_PWADMINKeyPressed

    private void PWADMINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PWADMINActionPerformed
        // TODO add your handling code here:
       try {
            String sql = "select * from admin where no_handphone = '" + NoHP.getText() + "' and Password = '" + PWADMIN.getText() + "'";
            Statement stat = conn.connect().createStatement();
            ResultSet rsLogin = stat.executeQuery(sql);
 
            rsLogin.next();
            rsLogin.last(); //mengecek jumlah baris pada hasil query
            if (rsLogin.getRow()==1){
                JOptionPane.showMessageDialog(null, "Login Berhasil!");
                dispose();
                //new Dashboard_Member().setVisible(true); //<-- BILA MAU DIARAHKAN KE Frame Menu Utama
                //String a=tfusername.getText();
                
                String snama = rsLogin.getString("nama");
                String no_hp = rsLogin.getString("no_handphone");
                String tanggal_lahir = rsLogin.getString("tanggal_lahir");
                String email = rsLogin.getString("email");
                String jenis_kelamin = rsLogin.getString("jenis_kelamin");
                String password = rsLogin.getString("password");
               
                
                /*DaftarMajalah_Admin c= new DaftarMajalah_Admin();
                c.jLabel6.setText(snama);
                c.setVisible(true);
                dispose();*/
                
                Home_Admin b= new Home_Admin();
                b.jLabel7.setText(snama);
                b.Tumbal_nohp.setText(""+no_hp);
                b.Tumbal_email.setText(""+email);
                b.Tumbal_TTL.setText(""+tanggal_lahir);
                b.Tumbal_jenisKel.setText(""+jenis_kelamin);
                b.PS_TB_HOME.setText(password);
                //jLabel6.
                b.setVisible(true);
                //new a().setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Maaf, Username / Password anda salah!");
                //kosong();
                NoHP.requestFocus();
            }
        } catch (SQLException e) {
        }
    }//GEN-LAST:event_PWADMINActionPerformed

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
        dispose();
        new TampilanAwal().setVisible(true);
    }//GEN-LAST:event_jLabel11MouseClicked

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
            java.util.logging.Logger.getLogger(Login_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField NoHP;
    private javax.swing.JPasswordField PWADMIN;
    private javax.swing.JLabel background;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
