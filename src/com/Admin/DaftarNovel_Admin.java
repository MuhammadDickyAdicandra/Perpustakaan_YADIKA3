/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Admin;

import com.Member.*;
import com.Admin.*;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import koneksi.New_ConnectDB;

/**
 *
 * @author server
 */
public class DaftarNovel_Admin extends javax.swing.JFrame {
     private Connection conn = new New_ConnectDB().connect();
    private DefaultTableModel tabmode;

    /**
     * Creates new form DaftarBuku
     */
    public DaftarNovel_Admin() {
        initComponents();
          dataTable();
          setLocationRelativeTo(this);
    }
    
     protected void dataTable() {
        Object[]baris = {"Judul","Pengarang","Penerbit","Tahun Terbit","Jumlah Buku"};
        tabmode = new DefaultTableModel(null, baris);
        tableout.setModel(tabmode);
        String sql = "select judul,penerbit,pengarang,tahun_terbit,jumlah from data_buku where kategori='Novel'";//asc paling kecil
        
        try {
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()) {
                String stanggal = hasil.getString("judul");
                String no_hp = hasil.getString("penerbit");
                String jenis_sampah = hasil.getString("pengarang");
                String berat_sampah = hasil.getString("tahun_terbit");
                String verif = hasil.getString("jumlah");
                String[] data = {stanggal,no_hp, jenis_sampah, berat_sampah, verif};
                tabmode.addRow(data);

            }
        } catch (Exception e) {
        }
    }
     
     
//     protected void tampilkan_data(){
//    DefaultTableModel model = new DefaultTableModel();
//        model.addColumn("judul");
//        model.addColumn("penerbit");
//        model.addColumn("pengarang");
//        model.addColumn("tahun_terbit");
//        model.addColumn("katagori");
//        model.addColumn("jumlah");
//        
//            String tampilkan_data = txtcari.getText();
//            try {
//            //int judul = 0;
//            String sql = "select * from data_buku where judul ='"+tampilkan_data+"'" ;
//            
//            java.sql.Statement stat = conn.createStatement();
//            ResultSet hasil = stat.executeQuery(sql);
//            while (hasil.next()) {
//               model.addRow(new Object[]{hasil.getString(2),hasil.getString(3),hasil.getString(4),hasil.getString(5),hasil.getString(6),hasil.getString(7)});
//               
//               tableout.setModel(model);
//            }
//        } catch (Exception e) {
//        }
//        
//}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtcari = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableout = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtcari.setBackground(new java.awt.Color(153, 153, 153));
        txtcari.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 12)); // NOI18N
        txtcari.setText("Masukkan Judul");
        txtcari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtcariMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtcariMouseExited(evt);
            }
        });
        txtcari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcariActionPerformed(evt);
            }
        });
        txtcari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcariKeyReleased(evt);
            }
        });
        getContentPane().add(txtcari, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 145, 530, 30));

        jLabel1.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 35)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Novel");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(615, 85, -1, -1));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        tableout.setBackground(new java.awt.Color(255, 255, 102));
        tableout.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        tableout.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 12)); // NOI18N
        tableout.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "JUDUL", "PENGARANG", "PENERBIT", "TAHUN TERBIT", "KATEGORI", "JUMLAH BUKU"
            }
        ));
        tableout.setEnabled(false);
        jScrollPane1.setViewportView(tableout);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 190, 830, 185));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/serch (2).png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/arrow left.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 60, 50));

        jLabel6.setFont(new java.awt.Font("Arial Black", 3, 22)); // NOI18N
        jLabel6.setText("PERPUSTAKAAN");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 6, 230, 20));

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/daftar buku ADMIN.png"))); // NOI18N
        getContentPane().add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcariActionPerformed
        // TODO add your handling code here:
        Object[]baris = {"Judul","Pengarang","Penerbit","Tahun Terbit","Jumlah Buku"};
        tabmode = new DefaultTableModel(null, baris);
        tableout.setModel(tabmode);
       String sql = "select * from data_buku where judul = '"+txtcari.getText()+"' and kategori='novel'";
        try {
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()) {
                String sjudul = hasil.getString("judul");
                String spengarang = hasil.getString("pengarang");
                String spenerbit = hasil.getString("penerbit");
                String stahun_terbit = hasil.getString("tahun_terbit");
                String sjumlah_barang = hasil.getString("jumlah");
                String[] data = {sjudul,spengarang,spenerbit,stahun_terbit,sjumlah_barang};
                tabmode.addRow(data);

            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_txtcariActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void txtcariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcariKeyReleased
        // TODO add your handling code here:
        Object[]baris = {"Judul","Pengarang","Penerbit","Tahun Terbit","Jumlah Buku"};
        tabmode = new DefaultTableModel(null, baris);
        tableout.setModel(tabmode);
        String sql = "select * from data_buku where judul like '%"+txtcari.getText()+"%' and kategori='novel'";
        try {
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()) {
                String sjudul = hasil.getString("judul");
                String spengarang = hasil.getString("pengarang");
                String spenerbit = hasil.getString("penerbit");
                String stahun_terbit = hasil.getString("tahun_terbit");
                String sjumlah_barang = hasil.getString("jumlah");
                String[] data = {sjudul,spengarang,spenerbit,stahun_terbit,sjumlah_barang};
                tabmode.addRow(data);

            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_txtcariKeyReleased

    private void txtcariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcariMouseClicked
        // TODO add your handling code here:
         txtcari.setText("");
    }//GEN-LAST:event_txtcariMouseClicked

    private void txtcariMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcariMouseExited
        // TODO add your handling code here:
         txtcari.setText("Masukkan Judul");
    }//GEN-LAST:event_txtcariMouseExited

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
            java.util.logging.Logger.getLogger(DaftarNovel_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DaftarNovel_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DaftarNovel_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DaftarNovel_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DaftarNovel_Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableout;
    private javax.swing.JTextField txtcari;
    // End of variables declaration//GEN-END:variables
}
