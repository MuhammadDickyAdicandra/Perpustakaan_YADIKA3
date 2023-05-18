/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import koneksi.New_ConnectDB;

/**
 *
 * @author server
 */
public class PemasukanBuku1 extends javax.swing.JFrame {
    private Connection conn = new New_ConnectDB().connect();

    /**
     * Creates new form DaftarBuku
     */
    public PemasukanBuku1() {
        initComponents();
        setLocationRelativeTo(this);
        code_transaksi();
    }
    protected void kosong(){
        tf_ISBN.setText("");
        tf_judul.setText("");
        tf_penerbit.setText("");
        tf_pengarang.setText("");
        tf_jumlah.setText("");
       
    }
    
    protected void code_transaksi(){
        try {
            //--> melakukan eksekusi query untuk mengambil data dari tabel
            String sql = "SELECT MAX(RIGHT(ISBN,6)) AS NO FROM data_buku";
            PreparedStatement stat = conn.prepareStatement(sql);
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()) {
                if (hasil.first() == false) {
                    tf_ISBN.setText("YK-000001");
                } else {
                    hasil.last();
                    int auto_id = hasil.getInt(1) + 1;
                    String no = String.valueOf(auto_id);
                    int NomorJual = no.length();
                    //MENGATUR jumlah 0
                    for (int j = 0; j < 6 - NomorJual; j++) {
                        no = "0" + no;
                    }
                    tf_ISBN.setText("YK-" + no);
                }
            }
            hasil.close();
            stat.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "ERROR: \n" + e.toString(),
                    "Kesalahan", JOptionPane.WARNING_MESSAGE);
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

        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jumlah = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cb_kategori = new javax.swing.JComboBox<>();
        cb_tahunter = new javax.swing.JComboBox<>();
        tf_penerbit = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tf_jumlah = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tf_judul = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tf_pengarang = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tf_ISBN = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 18)); // NOI18N
        jLabel1.setText("Penerbit");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, 200, 30));

        jumlah.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 18)); // NOI18N
        jumlah.setText("Stok Buku");
        getContentPane().add(jumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 540, 200, 30));

        jLabel4.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 18)); // NOI18N
        jLabel4.setText("Katagori");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 480, -1, 30));

        jLabel5.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 35)); // NOI18N
        jLabel5.setText("PEMASUKAN BUKU");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, -1, -1));

        cb_kategori.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 12)); // NOI18N
        cb_kategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pelajaran", "Majalah", "Novel", "Komik", "Biografi" }));
        cb_kategori.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));
        getContentPane().add(cb_kategori, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 510, 130, 30));

        cb_tahunter.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 12)); // NOI18N
        cb_tahunter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2015", "2016", "2017", "2018", "2019", "2020" }));
        cb_tahunter.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        getContentPane().add(cb_tahunter, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 510, 130, 30));

        tf_penerbit.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 12)); // NOI18N
        tf_penerbit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        tf_penerbit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_penerbitActionPerformed(evt);
            }
        });
        getContentPane().add(tf_penerbit, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 370, 300, 30));

        jLabel2.setFont(new java.awt.Font("Arial Black", 3, 22)); // NOI18N
        jLabel2.setText("PERPUSTAKAAN");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 230, 20));

        tf_jumlah.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 12)); // NOI18N
        tf_jumlah.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));
        tf_jumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_jumlahActionPerformed(evt);
            }
        });
        getContentPane().add(tf_jumlah, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 570, 300, 30));

        jLabel7.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 18)); // NOI18N
        jLabel7.setText("Kode Buku");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 200, 30));

        tf_judul.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 12)); // NOI18N
        tf_judul.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        tf_judul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_judulActionPerformed(evt);
            }
        });
        getContentPane().add(tf_judul, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, 300, 30));

        jLabel8.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 18)); // NOI18N
        jLabel8.setText("Tahun Terbit");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 480, -1, 30));

        jLabel9.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 18)); // NOI18N
        jLabel9.setText("Pengarang/Penulis");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 410, 200, 30));

        tf_pengarang.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 12)); // NOI18N
        tf_pengarang.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        tf_pengarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_pengarangActionPerformed(evt);
            }
        });
        getContentPane().add(tf_pengarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 440, 300, 30));

        jPanel1.setBackground(new java.awt.Color(0, 255, 0));

        jLabel3.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 20)); // NOI18N
        jLabel3.setText("          SIMPAN");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 555, 190, 50));

        jLabel10.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 18)); // NOI18N
        jLabel10.setText("Judul Buku");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, 200, 30));

        tf_ISBN.setEditable(false);
        tf_ISBN.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 12)); // NOI18N
        tf_ISBN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));
        tf_ISBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_ISBNActionPerformed(evt);
            }
        });
        getContentPane().add(tf_ISBN, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, 300, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/arrow left.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 60, 50));

        background.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pengambilan.png"))); // NOI18N
        background.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_penerbitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_penerbitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_penerbitActionPerformed

    private void tf_jumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_jumlahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_jumlahActionPerformed

    private void tf_judulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_judulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_judulActionPerformed

    private void tf_pengarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_pengarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_pengarangActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        String sql = "insert into data_buku (ISBN,judul,penerbit,pengarang,tahun_terbit,kategori,jumlah)values (?,?,?,?,?,?,?);";
        try {
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, tf_ISBN.getText());
            stat.setString(2, tf_judul.getText());
             stat.setString(3, tf_penerbit.getText());
            stat.setString(4, tf_pengarang.getText());
            stat.setString(5, (String) cb_tahunter.getSelectedItem());
            stat.setString(6, (String) cb_kategori.getSelectedItem());
            stat.setString(7, tf_jumlah.getText());
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Berhasil di Simpan");
            kosong();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Gagal di Simpan " + e);
        }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void tf_ISBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_ISBNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_ISBNActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

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
            java.util.logging.Logger.getLogger(PemasukanBuku1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PemasukanBuku1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PemasukanBuku1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PemasukanBuku1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PemasukanBuku1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JComboBox<String> cb_kategori;
    private javax.swing.JComboBox<String> cb_tahunter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel jumlah;
    private javax.swing.JTextField tf_ISBN;
    private javax.swing.JTextField tf_judul;
    private javax.swing.JTextField tf_jumlah;
    private javax.swing.JTextField tf_penerbit;
    private javax.swing.JTextField tf_pengarang;
    // End of variables declaration//GEN-END:variables
}