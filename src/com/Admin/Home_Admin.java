/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Admin;

import static com.Admin.PopupTrendingADMIN1.vir_isbn;
import static com.Admin.PopupTrendingADMIN1.vir_judul;
import static com.Admin.PopupTrendingADMIN1.vir_penerbit;
import static com.Admin.PopupTrendingADMIN1.vir_penulis;
import static com.Admin.PopupTrendingADMIN1.vir_stok;
import static com.Admin.PopupTrendingADMIN1.vir_tahun;
import static com.Admin.PopupTrendingADMIN2.vir_isbn2;
import static com.Admin.PopupTrendingADMIN2.vir_judul2;
import static com.Admin.PopupTrendingADMIN2.vir_penerbit2;
import static com.Admin.PopupTrendingADMIN2.vir_penulis2;
import static com.Admin.PopupTrendingADMIN2.vir_stok2;
import static com.Admin.PopupTrendingADMIN2.vir_tahun2;
import static com.Admin.PopupTrendingADMIN3.vir_isbn3;
import static com.Admin.PopupTrendingADMIN3.vir_judul3;
import static com.Admin.PopupTrendingADMIN3.vir_penerbit3;
import static com.Admin.PopupTrendingADMIN3.vir_penulis3;
import static com.Admin.PopupTrendingADMIN3.vir_stok3;
import static com.Admin.PopupTrendingADMIN3.vir_tahun3;
import static com.Admin.PopupTrendingADMIN4.vir_isbn4;
import static com.Admin.PopupTrendingADMIN4.vir_judul4;
import static com.Admin.PopupTrendingADMIN4.vir_penerbit4;
import static com.Admin.PopupTrendingADMIN4.vir_penulis4;
import static com.Admin.PopupTrendingADMIN4.vir_stok4;
import static com.Admin.PopupTrendingADMIN4.vir_tahun4;
import static com.Admin.bukubiru.ala_isbn1;
import static com.Admin.bukubiru.ala_judul1;
import static com.Admin.bukubiru.ala_penerbit1;
import static com.Admin.bukubiru.ala_penulis1;
import static com.Admin.bukubiru.ala_stok1;
import static com.Admin.bukubiru.ala_tahun1;
import static com.Admin.bukumerah.ala_isbn2;
import static com.Admin.bukumerah.ala_judul2;
import static com.Admin.bukumerah.ala_penerbit2;
import static com.Admin.bukumerah.ala_penulis2;
import static com.Admin.bukumerah.ala_stok2;
import static com.Admin.bukumerah.ala_tahun2;
import static com.Admin.majalajpink.ala_isbn3;
import static com.Admin.majalajpink.ala_judul3;
import static com.Admin.majalajpink.ala_penerbit3;
import static com.Admin.majalajpink.ala_penulis3;
import static com.Admin.majalajpink.ala_stok3;
import static com.Admin.majalajpink.ala_tahun3;
import static com.Admin.majalhmerah.ala_isbn4;
import static com.Admin.majalhmerah.ala_judul4;
import static com.Admin.majalhmerah.ala_penerbit4;
import static com.Admin.majalhmerah.ala_penulis4;
import static com.Admin.majalhmerah.ala_stok4;
import static com.Admin.majalhmerah.ala_tahun4;
import static com.Admin.melihatprofileADMIN.Email;
import static com.Admin.melihatprofileADMIN.JenisKelamin;
import static com.Admin.melihatprofileADMIN.Nama;
import static com.Admin.melihatprofileADMIN.NoHP;
import static com.Admin.melihatprofileADMIN.PS_TB;
import static com.Admin.melihatprofileADMIN.TanggalLahir;
import com.Member.Popupaktiv1;
import com.Member.Popupaktiv2;
import com.Member.Popupaktiv3;
import com.Member.Popupaktiv4;
import java.sql.Connection;
import java.sql.ResultSet;
import koneksi.New_ConnectDB;

/**
 *
 * @author server
 */
public class Home_Admin extends javax.swing.JFrame {
    private Connection conn = new New_ConnectDB().connect();

    /**
     * Creates new form Home_Admin
     */
    public Home_Admin() {
        initComponents();
        setLocationRelativeTo(this);
        Trending();
        trending1();
        trending2();
        trending3();
        trending4();
        Rekomendasi();
        rekomendasi1();
        rekomendasi2();
        rekomendasi3();
        rekomendasi4();
    }
    
    
    
    
    protected void Trending() {
        
        String sql = "select * from trending";//asc paling kecil
        
        try {
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()) {
                String strending1 = hasil.getString("Sedang_Trending1");
                String strending2 = hasil.getString("Sedang_Trending2");
                String strending3 = hasil.getString("Sedang_Trending3");
                String strending4 = hasil.getString("Sedang_Trending4");
                
                tumbal_trending1.setText(""+strending1);
                tumbal_trending2.setText(""+strending2);
                tumbal_trending3.setText(""+strending3);
                tumbal_trending4.setText(""+strending4);
            }
        } catch (Exception e) {
        }
    }
    
    protected void trending1(){
        String sql = "select * from data_buku where ISBN='"+tumbal_trending1.getText()+"'";//asc paling kecil
        
        try {
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()) {
                String sjudul = hasil.getString("judul");
                String sstok = hasil.getString("jumlah");
                String spenulis = hasil.getString("pengarang");
                String spenerbit = hasil.getString("penerbit");
                String stahun = hasil.getString("tahun_terbit");
                String sISBN = hasil.getString("ISBN");
                
                trending1.setText(""+sjudul);
                vir_judul.setText(""+sjudul);
                vir_stok.setText(""+sstok);
                vir_penulis.setText(""+spenulis);
                vir_penerbit.setText(""+spenerbit);
                vir_tahun.setText(""+stahun);
                vir_isbn.setText(""+sISBN);
                
                
                
            }
        } catch (Exception e) {
        }
        
    }
    
    protected void trending2(){
        String sql = "select * from data_buku where ISBN='"+tumbal_trending2.getText()+"'";//asc paling kecil
        
        try {
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()) {
                String sjudul = hasil.getString("judul");
                String sstok = hasil.getString("jumlah");
                String spenulis = hasil.getString("pengarang");
                String spenerbit = hasil.getString("penerbit");
                String stahun = hasil.getString("tahun_terbit");
                String sISBN = hasil.getString("ISBN");
                
                trending2.setText(""+sjudul);
                vir_judul2.setText(""+sjudul);
                vir_stok2.setText(""+sstok);
                vir_penulis2.setText(""+spenulis);
                vir_penerbit2.setText(""+spenerbit);
                vir_tahun2.setText(""+stahun);
                vir_isbn2.setText(""+sISBN);
                
            }
        } catch (Exception e) {
        }
    }
    protected void trending3(){
        String sql = "select * from data_buku where ISBN='"+tumbal_trending3.getText()+"'";//asc paling kecil
        
        try {
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()) {
                String sjudul = hasil.getString("judul");
                String sstok = hasil.getString("jumlah");
                String spenulis = hasil.getString("pengarang");
                String spenerbit = hasil.getString("penerbit");
                String stahun = hasil.getString("tahun_terbit");
                String sISBN = hasil.getString("ISBN");
                
                trending3.setText(""+sjudul);
                vir_judul3.setText(""+sjudul);
                vir_stok3.setText(""+sstok);
                vir_penulis3.setText(""+spenulis);
                vir_penerbit3.setText(""+spenerbit);
                vir_tahun3.setText(""+stahun);
                vir_isbn3.setText(""+sISBN);
                
            }
        } catch (Exception e) {
        }
        
    }
    
     protected void trending4(){
        String sql = "select * from data_buku where ISBN='"+tumbal_trending4.getText()+"'";//asc paling kecil
        
        try {
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()) {
                String sjudul = hasil.getString("judul");
                String sstok = hasil.getString("jumlah");
                String spenulis = hasil.getString("pengarang");
                String spenerbit = hasil.getString("penerbit");
                String stahun = hasil.getString("tahun_terbit");
                String sISBN = hasil.getString("ISBN");
                
                trending4.setText(""+sjudul);
                vir_judul4.setText(""+sjudul);
                vir_stok4.setText(""+sstok);
                vir_penulis4.setText(""+spenulis);
                vir_penerbit4.setText(""+spenerbit);
                vir_tahun4.setText(""+stahun);
                vir_isbn4.setText(""+sISBN);
                
            }
        } catch (Exception e) {
        }
        
    }
    
     protected void Rekomendasi() {
        
        String sql = "select * from rekomendasi";//asc paling kecil
        
        try {
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()) {
                String srekomendasi1 = hasil.getString("Rekomendasi1");
                String srekomendasi2 = hasil.getString("Rekomendasi2");
                String srekomendasi3 = hasil.getString("Rekomendasi3");
                String srekomendasi4 = hasil.getString("Rekomendasi4");
                
                tumbal_rekomendasi1.setText(""+srekomendasi1);
                tumbal_rekomendasi2.setText(""+srekomendasi2);
                tumbal_rekomendasi3.setText(""+srekomendasi3);
                tumbal_rekomendasi4.setText(""+srekomendasi4);
            }
        } catch (Exception e) {
        }
    }
    
     protected void rekomendasi1(){
        String sql = "select * from data_buku where ISBN='"+tumbal_rekomendasi1.getText()+"'";//asc paling kecil
        
        try {
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()) {
                String sjudul = hasil.getString("judul");
                String sstok = hasil.getString("jumlah");
                String spenulis = hasil.getString("pengarang");
                String spenerbit = hasil.getString("penerbit");
                String stahun = hasil.getString("tahun_terbit");
                String sISBN = hasil.getString("ISBN");
                
                REKOM1.setText(""+sjudul);
                ala_judul1.setText(""+sjudul);
                ala_stok1.setText(""+sstok);
                ala_penulis1.setText(""+spenulis);
                ala_penerbit1.setText(""+spenerbit);
                ala_tahun1.setText(""+stahun);
                ala_isbn1.setText(""+sISBN);
                
            }
        } catch (Exception e) {
        }
        
    }
     
     protected void rekomendasi2(){
        String sql = "select * from data_buku where ISBN='"+tumbal_rekomendasi2.getText()+"'";//asc paling kecil
        
        try {
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()) {
                String sjudul = hasil.getString("judul");
                String sstok = hasil.getString("jumlah");
                String spenulis = hasil.getString("pengarang");
                String spenerbit = hasil.getString("penerbit");
                String stahun = hasil.getString("tahun_terbit");
                String sISBN = hasil.getString("ISBN");
                
                REKOM2.setText(""+sjudul);
                ala_judul2.setText(""+sjudul);
                ala_stok2.setText(""+sstok);
                ala_penulis2.setText(""+spenulis);
                ala_penerbit2.setText(""+spenerbit);
                ala_tahun2.setText(""+stahun);
                ala_isbn2.setText(""+sISBN);
                
            }
        } catch (Exception e) {
        }
        
    }
     
     protected void rekomendasi3(){
        String sql = "select * from data_buku where ISBN='"+tumbal_rekomendasi3.getText()+"'";//asc paling kecil
        
        try {
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()) {
                String sjudul = hasil.getString("judul");
                String sstok = hasil.getString("jumlah");
                String spenulis = hasil.getString("pengarang");
                String spenerbit = hasil.getString("penerbit");
                String stahun = hasil.getString("tahun_terbit");
                String sISBN = hasil.getString("ISBN");
                
                REKOM3.setText(""+sjudul);
                ala_judul3.setText(""+sjudul);
                ala_stok3.setText(""+sstok);
                ala_penulis3.setText(""+spenulis);
                ala_penerbit3.setText(""+spenerbit);
                ala_tahun3.setText(""+stahun);
                ala_isbn3.setText(""+sISBN);
                
            }
        } catch (Exception e) {
        }
        
    }

      protected void rekomendasi4(){
        String sql = "select * from data_buku where ISBN='"+tumbal_rekomendasi4.getText()+"'";//asc paling kecil
        
        try {
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()) {
                String sjudul = hasil.getString("judul");
                String sstok = hasil.getString("jumlah");
                String spenulis = hasil.getString("pengarang");
                String spenerbit = hasil.getString("penerbit");
                String stahun = hasil.getString("tahun_terbit");
                String sISBN = hasil.getString("ISBN");
                
                REKOM4.setText(""+sjudul);
                ala_judul4.setText(""+sjudul);
                ala_stok4.setText(""+sstok);
                ala_penulis4.setText(""+spenulis);
                ala_penerbit4.setText(""+spenerbit);
                ala_tahun4.setText(""+stahun);
                ala_isbn4.setText(""+sISBN);
                
            }
        } catch (Exception e) {
        }
        
    }
      
      protected void email_refresh(){
        String sql = "select * from admin where no_handphone='"+Tumbal_nohp.getText()+"'";//asc paling kecil
        
        try {
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()) {
                String sjudul = hasil.getString("email");
                
                Email.setText(""+sjudul);
                
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        peminjaman = new javax.swing.JLabel();
        pengembalian = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        novel = new javax.swing.JLabel();
        denda = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        trending2 = new javax.swing.JLabel();
        trending3 = new javax.swing.JLabel();
        trending4 = new javax.swing.JLabel();
        trending1 = new javax.swing.JLabel();
        Tomboltrending1 = new javax.swing.JLabel();
        Tomboltrending2 = new javax.swing.JLabel();
        Tomboltrending3 = new javax.swing.JLabel();
        Tomboltrending4 = new javax.swing.JLabel();
        riwayatlabel = new javax.swing.JLabel();
        dendalebel = new javax.swing.JLabel();
        pengembalianlabel = new javax.swing.JLabel();
        peminjamanlabel = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        Tombolaktivis1 = new javax.swing.JLabel();
        Tombolaktivis2 = new javax.swing.JLabel();
        Tombolaktivis3 = new javax.swing.JLabel();
        Tombolaktivis4 = new javax.swing.JLabel();
        REKOM4 = new javax.swing.JLabel();
        REKOM1 = new javax.swing.JLabel();
        REKOM2 = new javax.swing.JLabel();
        REKOM3 = new javax.swing.JLabel();
        TombolRekom1 = new javax.swing.JLabel();
        TombolRekom2 = new javax.swing.JLabel();
        TombolRekom3 = new javax.swing.JLabel();
        TombolRekom4 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        riwayat = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        Pendidikan = new javax.swing.JLabel();
        komik = new javax.swing.JLabel();
        biografi = new javax.swing.JLabel();
        Majalah = new javax.swing.JLabel();
        panelkatagori1 = new javax.swing.JLabel();
        panelkatagori2 = new javax.swing.JLabel();
        panelkatagori3 = new javax.swing.JLabel();
        panelkatagori4 = new javax.swing.JLabel();
        panelkatagori5 = new javax.swing.JLabel();
        bgpanel2 = new javax.swing.JLabel();
        bgpanel3 = new javax.swing.JLabel();
        bgpanel4 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();
        tumbal_rekomendasi4 = new javax.swing.JLabel();
        tumbal_rekomendasi3 = new javax.swing.JLabel();
        tumbal_rekomendasi2 = new javax.swing.JLabel();
        tumbal_rekomendasi1 = new javax.swing.JLabel();
        tumbal_trending4 = new javax.swing.JLabel();
        tumbal_trending3 = new javax.swing.JLabel();
        tumbal_trending2 = new javax.swing.JLabel();
        tumbal_trending1 = new javax.swing.JLabel();
        PS_TB_HOME = new javax.swing.JLabel();
        Tumbal_nohp = new javax.swing.JLabel();
        Tumbal_email = new javax.swing.JLabel();
        Tumbal_TTL = new javax.swing.JLabel();
        Tumbal_jenisKel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 25)); // NOI18N
        jLabel1.setText("Katagori :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 120, -1, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/study.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 185, 80, 70));

        peminjaman.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        peminjaman.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        peminjaman.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/borrow 1.png"))); // NOI18N
        peminjaman.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                peminjamanMouseClicked(evt);
            }
        });
        getContentPane().add(peminjaman, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 355, -1, 90));

        pengembalian.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pengembalian.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pengembalian.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/return(1).png"))); // NOI18N
        pengembalian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pengembalianMouseClicked(evt);
            }
        });
        getContentPane().add(pengembalian, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 355, -1, 90));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/book 1.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 550, 80, 90));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/book 2.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 550, 80, 90));

        jLabel7.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 15)); // NOI18N
        jLabel7.setText("Nama Pengguna");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 20, 170, 40));

        jLabel9.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 18)); // NOI18N
        jLabel9.setText("Aktivitas ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/profile-user 1 (1) 1.png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 10, 60, -1));

        jLabel11.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 18)); // NOI18N
        jLabel11.setText("Rekomendasi");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 510, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/open-book(2).png"))); // NOI18N
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel14MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel14MouseExited(evt);
            }
        });
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 185, 80, 70));

        novel.setBackground(new java.awt.Color(255, 255, 255));
        novel.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 18)); // NOI18N
        novel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        novel.setText("Novel");
        novel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                novelMouseClicked(evt);
            }
        });
        getContentPane().add(novel, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 280, 140, 30));

        denda.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        denda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        denda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/money.png"))); // NOI18N
        denda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dendaMouseClicked(evt);
            }
        });
        getContentPane().add(denda, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 355, -1, 90));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/book 3.png"))); // NOI18N
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 550, 80, 90));

        trending2.setBackground(new java.awt.Color(255, 255, 255));
        trending2.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 12)); // NOI18N
        trending2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        trending2.setText("Judul Buku");
        trending2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                trending2MouseClicked(evt);
            }
        });
        getContentPane().add(trending2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 270, 140, 20));

        trending3.setBackground(new java.awt.Color(255, 255, 255));
        trending3.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 12)); // NOI18N
        trending3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        trending3.setText("Judul Buku");
        trending3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                trending3MouseClicked(evt);
            }
        });
        getContentPane().add(trending3, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 270, 140, 20));

        trending4.setBackground(new java.awt.Color(255, 255, 255));
        trending4.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 12)); // NOI18N
        trending4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        trending4.setText("Judul Buku");
        trending4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                trending4MouseClicked(evt);
            }
        });
        getContentPane().add(trending4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 270, 140, 20));

        trending1.setBackground(new java.awt.Color(255, 255, 255));
        trending1.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 12)); // NOI18N
        trending1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        trending1.setText("Judul Buku");
        trending1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                trending1MouseClicked(evt);
            }
        });
        getContentPane().add(trending1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 140, 20));

        Tomboltrending1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Rectangle 2 (1).png"))); // NOI18N
        getContentPane().add(Tomboltrending1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 160, 40));

        Tomboltrending2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Rectangle 2 (1).png"))); // NOI18N
        getContentPane().add(Tomboltrending2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, 160, 40));

        Tomboltrending3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Rectangle 2 (1).png"))); // NOI18N
        getContentPane().add(Tomboltrending3, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 260, 160, 40));

        Tomboltrending4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Rectangle 2 (1).png"))); // NOI18N
        getContentPane().add(Tomboltrending4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 260, 160, 40));

        riwayatlabel.setBackground(new java.awt.Color(255, 255, 255));
        riwayatlabel.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 14)); // NOI18N
        riwayatlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        riwayatlabel.setText("Pemasukan Buku");
        riwayatlabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                riwayatlabelMouseClicked(evt);
            }
        });
        getContentPane().add(riwayatlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 582, 140, 20));

        dendalebel.setBackground(new java.awt.Color(255, 255, 255));
        dendalebel.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 12)); // NOI18N
        dendalebel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dendalebel.setText("Denda");
        dendalebel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dendalebelMouseClicked(evt);
            }
        });
        getContentPane().add(dendalebel, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 455, 140, 20));

        pengembalianlabel.setBackground(new java.awt.Color(255, 255, 255));
        pengembalianlabel.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 12)); // NOI18N
        pengembalianlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pengembalianlabel.setText("Pengembalian");
        pengembalianlabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pengembalianlabelMouseClicked(evt);
            }
        });
        getContentPane().add(pengembalianlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 455, 140, 20));

        peminjamanlabel.setBackground(new java.awt.Color(255, 255, 255));
        peminjamanlabel.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 12)); // NOI18N
        peminjamanlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        peminjamanlabel.setText("Peminjaman");
        peminjamanlabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                peminjamanlabelMouseClicked(evt);
            }
        });
        getContentPane().add(peminjamanlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 455, 140, 20));

        jLabel24.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 12)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Update Buku");
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 455, 140, 20));

        Tombolaktivis1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Rectangle 2 (1).png"))); // NOI18N
        getContentPane().add(Tombolaktivis1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 445, 160, 40));

        Tombolaktivis2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Rectangle 2 (1).png"))); // NOI18N
        getContentPane().add(Tombolaktivis2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 445, 160, 40));

        Tombolaktivis3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Rectangle 2 (1).png"))); // NOI18N
        getContentPane().add(Tombolaktivis3, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 445, 160, 40));

        Tombolaktivis4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Rectangle 2 (1).png"))); // NOI18N
        getContentPane().add(Tombolaktivis4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 445, 160, 40));

        REKOM4.setBackground(new java.awt.Color(255, 255, 255));
        REKOM4.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 12)); // NOI18N
        REKOM4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        REKOM4.setText("Judul Buku");
        REKOM4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                REKOM4MouseClicked(evt);
            }
        });
        getContentPane().add(REKOM4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 642, 140, 20));

        REKOM1.setBackground(new java.awt.Color(255, 255, 255));
        REKOM1.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 12)); // NOI18N
        REKOM1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        REKOM1.setText("Judul Buku");
        REKOM1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                REKOM1MouseClicked(evt);
            }
        });
        getContentPane().add(REKOM1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 642, 140, 20));

        REKOM2.setBackground(new java.awt.Color(255, 255, 255));
        REKOM2.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 12)); // NOI18N
        REKOM2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        REKOM2.setText("Judul Buku");
        REKOM2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                REKOM2MouseClicked(evt);
            }
        });
        getContentPane().add(REKOM2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 642, 140, 20));

        REKOM3.setBackground(new java.awt.Color(255, 255, 255));
        REKOM3.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 12)); // NOI18N
        REKOM3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        REKOM3.setText("Judul Buku");
        REKOM3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                REKOM3MouseClicked(evt);
            }
        });
        getContentPane().add(REKOM3, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 642, 140, 20));

        TombolRekom1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Rectangle 2 (1).png"))); // NOI18N
        getContentPane().add(TombolRekom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 632, 160, 40));

        TombolRekom2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Rectangle 2 (1).png"))); // NOI18N
        getContentPane().add(TombolRekom2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 632, 160, 40));

        TombolRekom3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Rectangle 2 (1).png"))); // NOI18N
        getContentPane().add(TombolRekom3, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 632, 160, 40));

        TombolRekom4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Rectangle 2 (1).png"))); // NOI18N
        getContentPane().add(TombolRekom4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 632, 160, 40));

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/open-book(3).png"))); // NOI18N
        jLabel33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel33MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel33MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel33MouseExited(evt);
            }
        });
        getContentPane().add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(1055, 185, 80, 70));

        riwayat.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        riwayat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        riwayat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/update buku.png"))); // NOI18N
        riwayat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                riwayatMouseClicked(evt);
            }
        });
        getContentPane().add(riwayat, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 355, -1, 90));

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/book 4.png"))); // NOI18N
        jLabel35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel35MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(1055, 550, 80, 90));

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/open-book.png"))); // NOI18N
        jLabel36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel36MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel36MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel36MouseExited(evt);
            }
        });
        getContentPane().add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 185, 80, 70));

        jLabel37.setBackground(new java.awt.Color(255, 255, 255));
        jLabel37.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 18)); // NOI18N
        jLabel37.setText("Sedang Trending");
        getContentPane().add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, -1, -1));

        Pendidikan.setBackground(new java.awt.Color(255, 255, 255));
        Pendidikan.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 18)); // NOI18N
        Pendidikan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Pendidikan.setText("Pendidikan");
        Pendidikan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PendidikanMouseClicked(evt);
            }
        });
        getContentPane().add(Pendidikan, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 200, 140, 30));

        komik.setBackground(new java.awt.Color(255, 255, 255));
        komik.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 18)); // NOI18N
        komik.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        komik.setText("Komik");
        komik.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                komikMouseClicked(evt);
            }
        });
        getContentPane().add(komik, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 240, 140, 30));

        biografi.setBackground(new java.awt.Color(255, 255, 255));
        biografi.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 18)); // NOI18N
        biografi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        biografi.setText("Biografi");
        biografi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                biografiMouseClicked(evt);
            }
        });
        getContentPane().add(biografi, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 320, 140, 30));

        Majalah.setBackground(new java.awt.Color(255, 255, 255));
        Majalah.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 18)); // NOI18N
        Majalah.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Majalah.setText("Majalah");
        Majalah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MajalahMouseClicked(evt);
            }
        });
        getContentPane().add(Majalah, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 160, 140, 30));

        panelkatagori1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Rectangle 2 (1).png"))); // NOI18N
        getContentPane().add(panelkatagori1, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 160, 160, 30));

        panelkatagori2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Rectangle 2 (1).png"))); // NOI18N
        getContentPane().add(panelkatagori2, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 200, 160, 30));

        panelkatagori3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Rectangle 2 (1).png"))); // NOI18N
        getContentPane().add(panelkatagori3, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 240, 160, 30));

        panelkatagori4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Rectangle 2 (1).png"))); // NOI18N
        getContentPane().add(panelkatagori4, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 280, 160, 30));

        panelkatagori5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Rectangle 2 (1).png"))); // NOI18N
        getContentPane().add(panelkatagori5, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 320, 160, 30));

        bgpanel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lisst.png"))); // NOI18N
        getContentPane().add(bgpanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 1000, 150));

        bgpanel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lisst.png"))); // NOI18N
        getContentPane().add(bgpanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 540, 1000, 130));

        bgpanel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lisst.png"))); // NOI18N
        bgpanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bgpanel4MouseEntered(evt);
            }
        });
        getContentPane().add(bgpanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 1000, 140));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fire.png"))); // NOI18N
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 40, 40));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/activity.png"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, 30, 40));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/quality.png"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 500, 40, 40));

        jLabel21.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 30)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("SELAMAT DATANG DIPERPUSTAKAAN ");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 640, 40));

        jLabel20.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 27)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("SMK YADIKA 3");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 40, 220, 30));

        jLabel22.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 12)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Jl. Kamal Raya No.42, RT.1/RW.6, Tegal Alur, Kecamatan Kalideres, ");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 70, 470, 20));

        jLabel8.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Kota Jakarta Barat, Daerah Khusus Ibukota Jakarta 11820");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 90, 410, 20));

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("KELUAR");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 25));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 80, 100, 25));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/info-button 1 (1).png"))); // NOI18N
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 645, -1, -1));

        jLabel23.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 14)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Tentang Kami");
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 650, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/history buku.png"))); // NOI18N
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 611, -1, -1));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pemasukan buku.png"))); // NOI18N
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 577, -1, -1));

        jLabel26.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 14)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("History Login");
        jLabel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel26MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 616, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home   AD.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 680));

        tumbal_rekomendasi4.setText("jLabel3");
        getContentPane().add(tumbal_rekomendasi4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 580, -1, -1));

        tumbal_rekomendasi3.setText("jLabel3");
        getContentPane().add(tumbal_rekomendasi3, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 570, -1, -1));

        tumbal_rekomendasi2.setText("jLabel3");
        getContentPane().add(tumbal_rekomendasi2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 570, -1, -1));

        tumbal_rekomendasi1.setText("jLabel3");
        getContentPane().add(tumbal_rekomendasi1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 570, -1, -1));

        tumbal_trending4.setText("jLabel26");
        getContentPane().add(tumbal_trending4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 210, -1, -1));

        tumbal_trending3.setText("jLabel25");
        getContentPane().add(tumbal_trending3, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 210, -1, -1));

        tumbal_trending2.setText("jLabel4");
        getContentPane().add(tumbal_trending2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 220, -1, -1));

        tumbal_trending1.setText("jLabel3");
        getContentPane().add(tumbal_trending1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, -1, -1));

        PS_TB_HOME.setText("jLabel1");
        getContentPane().add(PS_TB_HOME, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, -1, -1));

        Tumbal_nohp.setText("jLabel3");
        getContentPane().add(Tumbal_nohp, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 90, -1, -1));

        Tumbal_email.setText("jLabel4");
        getContentPane().add(Tumbal_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 90, -1, -1));

        Tumbal_TTL.setText("jLabel17");
        getContentPane().add(Tumbal_TTL, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 130, -1, -1));

        Tumbal_jenisKel.setText("jLabel24");
        getContentPane().add(Tumbal_jenisKel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 130, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MajalahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MajalahMouseClicked
        // TODO add your handling code here:
        new DaftarMajalah_Admin().setVisible(true);
    }//GEN-LAST:event_MajalahMouseClicked

    private void PendidikanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PendidikanMouseClicked
        // TODO add your handling code here:
        new DaftarBukuPendidikanAdmin().setVisible(true);
    }//GEN-LAST:event_PendidikanMouseClicked

    private void komikMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_komikMouseClicked
        // TODO add your handling code here:
        new DaftarKomik_Admin().setVisible(true);
    }//GEN-LAST:event_komikMouseClicked

    private void novelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_novelMouseClicked
        // TODO add your handling code here:
        new DaftarNovel_Admin().setVisible(true);
    }//GEN-LAST:event_novelMouseClicked

    private void biografiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_biografiMouseClicked
        // TODO add your handling code here:
        new DaftarBiografiAdmin().setVisible(true);
    }//GEN-LAST:event_biografiMouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        // TODO add your handling code here:
        dispose();
        new Login_Admin().setVisible(true);
    }//GEN-LAST:event_jLabel15MouseClicked

    private void peminjamanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_peminjamanMouseClicked
        // TODO add your handling code here
        new Peminjaman1().setVisible(true);
    }//GEN-LAST:event_peminjamanMouseClicked

    private void peminjamanlabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_peminjamanlabelMouseClicked
        // TODO add your handling code here:
        new Peminjaman1().setVisible(true);
    }//GEN-LAST:event_peminjamanlabelMouseClicked

    private void pengembalianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pengembalianMouseClicked
        // TODO add your handling code here:
        new Pengembalian_Buku_Admin().setVisible(true);
    }//GEN-LAST:event_pengembalianMouseClicked

    private void pengembalianlabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pengembalianlabelMouseClicked
        // TODO add your handling code here:
        new Pengembalian_Buku_Admin().setVisible(true);
    }//GEN-LAST:event_pengembalianlabelMouseClicked

    private void dendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dendaMouseClicked
        // TODO add your handling code here:
        new PopupaktivADMIN3().setVisible(true);
    }//GEN-LAST:event_dendaMouseClicked

    private void dendalebelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dendalebelMouseClicked
        // TODO add your handling code here:
        new PopupaktivADMIN3().setVisible(true);
    }//GEN-LAST:event_dendalebelMouseClicked

    private void riwayatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_riwayatMouseClicked
        // TODO add your handling code here:
        new Trending_Rekomendasi().setVisible(true);
    }//GEN-LAST:event_riwayatMouseClicked

    private void riwayatlabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_riwayatlabelMouseClicked
        // TODO add your handling code here:
        new PemasukanBuku1().setVisible(true);
    }//GEN-LAST:event_riwayatlabelMouseClicked

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        // TODO add your handling code here:
        new tentangkamiAD().setVisible(true);
    }//GEN-LAST:event_jLabel23MouseClicked

    private void jLabel36MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel36MouseClicked
        // TODO add your handling code here:
        new PopupTrendingADMIN1().setVisible(true);
        trending1();
    }//GEN-LAST:event_jLabel36MouseClicked

    private void trending1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_trending1MouseClicked
        // TODO add your handling code here:
        new PopupTrendingADMIN1().setVisible(true);
        trending1();
    }//GEN-LAST:event_trending1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        new PopupTrendingADMIN2().setVisible(true);
        trending2();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void trending2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_trending2MouseClicked
        // TODO add your handling code here:
        new PopupTrendingADMIN2().setVisible(true);
        trending2();
    }//GEN-LAST:event_trending2MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        // TODO add your handling code here:
        new PopupTrendingADMIN3().setVisible(true);
        trending3();
    }//GEN-LAST:event_jLabel14MouseClicked

    private void trending3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_trending3MouseClicked
        // TODO add your handling code here:
        new PopupTrendingADMIN3().setVisible(true);
        trending3();
    }//GEN-LAST:event_trending3MouseClicked

    private void jLabel33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel33MouseClicked
        // TODO add your handling code here:
        new PopupTrendingADMIN4().setVisible(true);
        trending4();
    }//GEN-LAST:event_jLabel33MouseClicked

    private void trending4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_trending4MouseClicked
        // TODO add your handling code here:
        new PopupTrendingADMIN4().setVisible(true);
        trending4();
    }//GEN-LAST:event_trending4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        new bukubiru().setVisible(true);
        rekomendasi1();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void REKOM1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_REKOM1MouseClicked
        // TODO add your handling code here:
        new bukubiru().setVisible(true);
        rekomendasi1();
    }//GEN-LAST:event_REKOM1MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        new bukumerah().setVisible(true);
        rekomendasi2();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void REKOM2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_REKOM2MouseClicked
        // TODO add your handling code here:
        new bukumerah().setVisible(true);
        rekomendasi2();
    }//GEN-LAST:event_REKOM2MouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        // TODO add your handling code here:
        new majalajpink().setVisible(true);
        rekomendasi3();
    }//GEN-LAST:event_jLabel18MouseClicked

    private void REKOM3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_REKOM3MouseClicked
        // TODO add your handling code here:
        new majalajpink().setVisible(true);
        rekomendasi3();
    }//GEN-LAST:event_REKOM3MouseClicked

    private void jLabel35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel35MouseClicked
        // TODO add your handling code here:
        new majalhmerah().setVisible(true);
        rekomendasi4();
    }//GEN-LAST:event_jLabel35MouseClicked

    private void REKOM4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_REKOM4MouseClicked
        // TODO add your handling code here:
        new majalhmerah().setVisible(true);
        rekomendasi4();
    }//GEN-LAST:event_REKOM4MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        new melihatprofileADMIN().setVisible(true);
        Nama.setText(""+jLabel7.getText());
        NoHP.setText(""+Tumbal_nohp.getText());
        Email.setText(""+Tumbal_email.getText());
        TanggalLahir.setText(""+Tumbal_TTL.getText());
        JenisKelamin.setText(""+Tumbal_jenisKel.getText());
        PS_TB.setText(""+PS_TB_HOME.getText());
        email_refresh();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
        // TODO add your handling code here:
        new Trending_Rekomendasi().setVisible(true);
        
    }//GEN-LAST:event_jLabel24MouseClicked

    private void jLabel36MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel36MouseEntered
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jLabel36MouseEntered

    private void jLabel36MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel36MouseExited
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jLabel36MouseExited

    private void jLabel14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseExited
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jLabel14MouseExited

    private void jLabel14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseEntered
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jLabel14MouseEntered

    private void jLabel33MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel33MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel33MouseExited

    private void bgpanel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bgpanel4MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_bgpanel4MouseEntered

    private void jLabel33MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel33MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel33MouseEntered

    private void jLabel26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseClicked
        // TODO add your handling code here:
        new HistoryLogin_Admin().setVisible(true);
    }//GEN-LAST:event_jLabel26MouseClicked

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
            java.util.logging.Logger.getLogger(Home_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home_Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Majalah;
    public static javax.swing.JLabel PS_TB_HOME;
    private javax.swing.JLabel Pendidikan;
    public static javax.swing.JLabel REKOM1;
    public static javax.swing.JLabel REKOM2;
    public static javax.swing.JLabel REKOM3;
    public static javax.swing.JLabel REKOM4;
    private javax.swing.JLabel TombolRekom1;
    private javax.swing.JLabel TombolRekom2;
    private javax.swing.JLabel TombolRekom3;
    private javax.swing.JLabel TombolRekom4;
    private javax.swing.JLabel Tombolaktivis1;
    private javax.swing.JLabel Tombolaktivis2;
    private javax.swing.JLabel Tombolaktivis3;
    private javax.swing.JLabel Tombolaktivis4;
    private javax.swing.JLabel Tomboltrending1;
    private javax.swing.JLabel Tomboltrending2;
    private javax.swing.JLabel Tomboltrending3;
    private javax.swing.JLabel Tomboltrending4;
    public static javax.swing.JLabel Tumbal_TTL;
    public static javax.swing.JLabel Tumbal_email;
    public static javax.swing.JLabel Tumbal_jenisKel;
    public static javax.swing.JLabel Tumbal_nohp;
    private javax.swing.JLabel background;
    private javax.swing.JLabel bgpanel2;
    private javax.swing.JLabel bgpanel3;
    private javax.swing.JLabel bgpanel4;
    private javax.swing.JLabel biografi;
    private javax.swing.JLabel denda;
    private javax.swing.JLabel dendalebel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    public static javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    public static javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    public static javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    public static javax.swing.JLabel jLabel33;
    public static javax.swing.JLabel jLabel35;
    public static javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    public static javax.swing.JLabel jLabel5;
    public static javax.swing.JLabel jLabel6;
    public static javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel komik;
    private javax.swing.JLabel novel;
    private javax.swing.JLabel panelkatagori1;
    private javax.swing.JLabel panelkatagori2;
    private javax.swing.JLabel panelkatagori3;
    private javax.swing.JLabel panelkatagori4;
    private javax.swing.JLabel panelkatagori5;
    private javax.swing.JLabel peminjaman;
    private javax.swing.JLabel peminjamanlabel;
    private javax.swing.JLabel pengembalian;
    private javax.swing.JLabel pengembalianlabel;
    private javax.swing.JLabel riwayat;
    private javax.swing.JLabel riwayatlabel;
    public static javax.swing.JLabel trending1;
    public static javax.swing.JLabel trending2;
    public static javax.swing.JLabel trending3;
    public static javax.swing.JLabel trending4;
    public static javax.swing.JLabel tumbal_rekomendasi1;
    public static javax.swing.JLabel tumbal_rekomendasi2;
    public static javax.swing.JLabel tumbal_rekomendasi3;
    public static javax.swing.JLabel tumbal_rekomendasi4;
    public static javax.swing.JLabel tumbal_trending1;
    public static javax.swing.JLabel tumbal_trending2;
    public static javax.swing.JLabel tumbal_trending3;
    public static javax.swing.JLabel tumbal_trending4;
    // End of variables declaration//GEN-END:variables
}
