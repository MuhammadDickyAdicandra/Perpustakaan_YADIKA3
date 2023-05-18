/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Admin;

import static com.Admin.Home_Admin.REKOM1;
import static com.Admin.Home_Admin.REKOM2;
import static com.Admin.Home_Admin.REKOM3;
import static com.Admin.Home_Admin.REKOM4;
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
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import koneksi.New_ConnectDB;
import static com.Admin.Home_Admin.trending1;
import static com.Admin.Home_Admin.trending2;
import static com.Admin.Home_Admin.trending3;
import static com.Admin.Home_Admin.trending4;
import static com.Admin.Home_Admin.tumbal_rekomendasi1;
import static com.Admin.Home_Admin.tumbal_rekomendasi2;
import static com.Admin.Home_Admin.tumbal_rekomendasi3;
import static com.Admin.Home_Admin.tumbal_rekomendasi4;
import static com.Admin.Home_Admin.tumbal_trending1;
import static com.Admin.Home_Admin.tumbal_trending2;
import static com.Admin.Home_Admin.tumbal_trending3;
import static com.Admin.Home_Admin.tumbal_trending4;

/**
 *
 * @author Hard JFS
 */
public class Trending_Rekomendasi extends javax.swing.JFrame {
    private Connection conn = new New_ConnectDB().connect();
    private DefaultTableModel tabmode;

    /**
     * Creates new form Trending_Rekomendasi
     */
    public Trending_Rekomendasi() {
        initComponents();
        tampil_buku_terakhir();
        dataTable();
        dataTable1();
        Trending();
        Rekomendasi();
        setLocationRelativeTo(this);
        
        //substring_trending1();
       
    }
    
    
    
    protected void substring_trending1() {
        //data terakhir yang berada di database
        String x=""+tumbal_tr;    //YK-000042
        String y=x.substring(8,9); //42
        int a = Integer.parseInt(""+y); //42
        int b = a-1;
        jLabel12.setText(""+y);
        
        //data yang sedang trending
        String c=""+st1;
        String d=c.substring(8,9);
        int e = Integer.parseInt(""+d);//7
        
        if (e>b){
            jButton5.setEnabled(false);
        }else{
            jButton5.setEnabled(true);
            //virtual_button_update_trending();
        }
    }
    
    
    protected void tampil_buku_terakhir(){
        try {
            //--> melakukan eksekusi query untuk mengambil data dari tabel
            String sql = "SELECT MAX(RIGHT(ISBN,6)) AS NO FROM data_buku";
            PreparedStatement stat = conn.prepareStatement(sql);
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()) {
                if (hasil.first() == false) {
                    tumbal_tr.setText("YK-000001");
                    tumbal_tr1.setText("YK-000001");
                } else {
                    hasil.last();
                    int auto_id = hasil.getInt(1) + 1;
                    String no = String.valueOf(auto_id);
                    int NomorJual = no.length();
                    //MENGATUR jumlah 0
                    for (int j = 0; j < 6 - NomorJual; j++) {
                        no = "0" + no;
                    }
                    tumbal_tr.setText("YK-" + no);
                    tumbal_tr1.setText("YK-" + no);
                }
            }
            hasil.close();
            stat.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "ERROR: \n" + e.toString(),
                    "Kesalahan", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    protected void dataTable() {
        Object[]baris = {"ISBN","Judul","Pengarang","Penerbit","Tahun Terbit","Katagori","Jumlah Buku"};
        tabmode = new DefaultTableModel(null, baris);
        jTable1.setModel(tabmode);
        String sql = "select ISBN,judul,penerbit,pengarang,tahun_terbit,kategori,jumlah from data_buku";//asc paling kecil
        
        try {
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()) {
                String isbn = hasil.getString("ISBN");
                String judul = hasil.getString("judul");
                String penerbit = hasil.getString("penerbit");
                String pengarang = hasil.getString("pengarang");
                String tahun_terbit = hasil.getString("tahun_terbit");
                String katagori = hasil.getString("kategori");
                String jumlah = hasil.getString("jumlah");
                String[] data = {isbn, judul, penerbit, pengarang, tahun_terbit, katagori, jumlah};
                tabmode.addRow(data);

            }
        } catch (Exception e) {
        }
    }
    
    protected void dataTable1() {
        Object[]baris = {"ISBN","Judul","Pengarang","Penerbit","Tahun Terbit","Katagori","Jumlah Buku"};
        tabmode = new DefaultTableModel(null, baris);
        jTable2.setModel(tabmode);
        String sql = "select ISBN,judul,penerbit,pengarang,tahun_terbit,kategori,jumlah from data_buku";//asc paling kecil
        
        try {
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()) {
                String isbn = hasil.getString("ISBN");
                String judul = hasil.getString("judul");
                String penerbit = hasil.getString("penerbit");
                String pengarang = hasil.getString("pengarang");
                String tahun_terbit = hasil.getString("tahun_terbit");
                String katagori = hasil.getString("kategori");
                String jumlah = hasil.getString("jumlah");
                String[] data = {isbn, judul, penerbit, pengarang, tahun_terbit, katagori, jumlah};
                tabmode.addRow(data);

            }
        } catch (Exception e) {
        }
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
                
                st1.setText(""+strending1);
                st2.setText(""+strending2);
                st3.setText(""+strending3);
                st4.setText(""+strending4);
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
                
                rk1.setText(""+srekomendasi1);
                rk2.setText(""+srekomendasi2);
                rk3.setText(""+srekomendasi3);
                rk4.setText(""+srekomendasi4);
            }
        } catch (Exception e) {
        }
    }
     
     protected void update_rekomendasi1() {
        
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
     
     protected void UBAH_tren1() {
        String sql = "select * from data_buku where ISBN  = '"+ st1.getText() + "' ";
        try {
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()) {
                String snis = hasil.getString("judul");
                String sisbn = hasil.getString("ISBN");
                trending1.setText(snis);
                tumbal_trending1.setText(sisbn);
                //tabmode.addRow(data);

            }
        } catch (Exception e) {
        }
    }
     
     
     protected void UBAH_tren2() {
        String sql = "select * from data_buku where ISBN  = '"+ st2.getText() + "' ";
        try {
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()) {
                String snis = hasil.getString("judul");
                String sisbn = hasil.getString("ISBN");
                //String[] data = {no_hp,nama, tanggal_lahir, email, jenis_kelamin};
                trending2.setText(snis);
                tumbal_trending2.setText(sisbn);
                //tabmode.addRow(data);

            }
        } catch (Exception e) {
        }
    }
     
     protected void UBAH_tren3() {
        String sql = "select * from data_buku where ISBN  = '"+ st3.getText() + "' ";
        try {
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()) {
                String snis = hasil.getString("judul");
                String sisbn = hasil.getString("ISBN");
                //String[] data = {no_hp,nama, tanggal_lahir, email, jenis_kelamin};
                trending3.setText(snis);
                tumbal_trending3.setText(sisbn);
                //tabmode.addRow(data);

            }
        } catch (Exception e) {
        }
    }
     
     
     protected void UBAH_tren4() {
        String sql = "select * from data_buku where ISBN  = '"+ st4.getText() + "' ";
        try {
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()) {
                String snis = hasil.getString("judul");
                String sisbn = hasil.getString("ISBN");
                //String[] data = {no_hp,nama, tanggal_lahir, email, jenis_kelamin};
                trending4.setText(snis);
                tumbal_trending4.setText(sisbn);
                //tabmode.addRow(data);

            }
        } catch (Exception e) {
        }
    }
     
     
     
      protected void UBAH_REKOM1() {
        String sql = "select * from data_buku where ISBN  = '"+ rk1.getText() + "' ";
        try {
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()) {
                String snis = hasil.getString("judul");
                String sisbn = hasil.getString("ISBN");
                //String[] data = {no_hp,nama, tanggal_lahir, email, jenis_kelamin};
                REKOM1.setText(snis);
                tumbal_rekomendasi1.setText(sisbn);
                
                //tabmode.addRow(data);

            }
        } catch (Exception e) {
        }
        
    }
      
      
       protected void UBAH_REKOM2() {
        String sql = "select * from data_buku where ISBN  = '"+ rk2.getText() + "' ";
        try {
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()) {
                String snis = hasil.getString("judul");
                String sisbn = hasil.getString("ISBN");
                //String[] data = {no_hp,nama, tanggal_lahir, email, jenis_kelamin};
                REKOM2.setText(snis);
                tumbal_rekomendasi2.setText(sisbn);
                //tabmode.addRow(data);

            }
        } catch (Exception e) {
        }
    }
       
       
       
        protected void UBAH_REKOM3() {
        String sql = "select * from data_buku where ISBN  = '"+ rk3.getText() + "' ";
        try {
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()) {
                String snis = hasil.getString("judul");
                String sisbn = hasil.getString("ISBN");
                //String[] data = {no_hp,nama, tanggal_lahir, email, jenis_kelamin};
                REKOM3.setText(snis);
                tumbal_rekomendasi3.setText(sisbn);
                //tabmode.addRow(data);

            }
        } catch (Exception e) {
        }
    }
        
        
        
         protected void UBAH_REKOM4() {
        String sql = "select * from data_buku where ISBN  = '"+ rk4.getText() + "' ";
        try {
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()) {
                String snis = hasil.getString("judul");
                String sisbn = hasil.getString("ISBN");
                //String[] data = {no_hp,nama, tanggal_lahir, email, jenis_kelamin};
                REKOM4.setText(snis);
                tumbal_rekomendasi4.setText(sisbn);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        st2 = new javax.swing.JTextField();
        st3 = new javax.swing.JTextField();
        st4 = new javax.swing.JTextField();
        rk2 = new javax.swing.JTextField();
        rk1 = new javax.swing.JTextField();
        rk3 = new javax.swing.JTextField();
        rk4 = new javax.swing.JTextField();
        st1 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        catatan_trending = new javax.swing.JLabel();
        catatan_rekomendasi = new javax.swing.JLabel();
        tumbal_tr = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        tumbal_tr1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 239, 197));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBackground(new java.awt.Color(0, 255, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ISBN", "Judul", "Penerbit", "Pengarang", "Tahun Terbit", "Katagori", "Jumlah/Stok"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 800, 90));

        jTable2.setBackground(new java.awt.Color(0, 255, 204));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ISBN", "Judul", "Penerbit", "Pengarang", "Tahun Terbit", "Katagori", "Jumlah/Stok"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 315, 800, 90));

        jButton4.setBackground(new java.awt.Color(0, 255, 204));
        jButton4.setText("Perbarui");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 410, 80, 25));

        st2.setBackground(new java.awt.Color(0, 255, 204));
        st2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                st2ActionPerformed(evt);
            }
        });
        getContentPane().add(st2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 80, 25));

        st3.setBackground(new java.awt.Color(0, 255, 204));
        st3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                st3ActionPerformed(evt);
            }
        });
        getContentPane().add(st3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 175, 80, 25));

        st4.setBackground(new java.awt.Color(0, 255, 204));
        st4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                st4ActionPerformed(evt);
            }
        });
        getContentPane().add(st4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 80, 25));

        rk2.setBackground(new java.awt.Color(0, 255, 204));
        rk2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rk2ActionPerformed(evt);
            }
        });
        getContentPane().add(rk2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 460, 80, 25));

        rk1.setBackground(new java.awt.Color(0, 255, 204));
        rk1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rk1ActionPerformed(evt);
            }
        });
        getContentPane().add(rk1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, 80, 25));

        rk3.setBackground(new java.awt.Color(0, 255, 204));
        rk3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rk3ActionPerformed(evt);
            }
        });
        getContentPane().add(rk3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 410, 80, 25));

        rk4.setBackground(new java.awt.Color(0, 255, 204));
        rk4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rk4ActionPerformed(evt);
            }
        });
        getContentPane().add(rk4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 455, 80, 25));

        st1.setBackground(new java.awt.Color(0, 255, 204));
        st1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                st1ActionPerformed(evt);
            }
        });
        getContentPane().add(st1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 175, 80, 25));

        jButton5.setBackground(new java.awt.Color(0, 255, 204));
        jButton5.setText("Perbarui");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 175, 80, 25));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 204));
        jLabel1.setText("Sedang Trending 2");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, 25));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 204));
        jLabel2.setText("Sedang Trending 3");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 175, -1, 25));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 204));
        jLabel3.setText("Sedang Trending 4");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, -1, 25));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 255, 204));
        jLabel4.setText("Rekomendasi 3");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 410, -1, 25));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 255, 204));
        jLabel5.setText("Update Buku");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 5, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 255, 204));
        jLabel6.setText("Rekomendasi 2");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, -1, 25));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 255, 204));
        jLabel7.setText("Rekomendasi 4");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 455, -1, 25));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 255, 204));
        jLabel8.setText("Rekomendasi 1");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, -1, 25));
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 370, 60, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/arrow_update.png"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 50));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 255, 204));
        jLabel11.setText("Sedang Trending 1");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 175, -1, 25));

        catatan_trending.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tren.png"))); // NOI18N
        getContentPane().add(catatan_trending, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 175, -1, -1));

        catatan_rekomendasi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/rekom.png"))); // NOI18N
        getContentPane().add(catatan_rekomendasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 410, -1, -1));

        tumbal_tr.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 12)); // NOI18N
        tumbal_tr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tumbal_tr.setText("jLabel12");
        getContentPane().add(tumbal_tr, new org.netbeans.lib.awtextra.AbsoluteConstraints(715, 490, 100, 30));

        jLabel12.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 12)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Batas Buku :");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 490, 90, 30));

        jLabel15.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("  -1");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 490, 30, 30));

        jLabel17.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 12)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel17.setText("Batas Buku :");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 260, 90, 30));

        jLabel16.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("  -1");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 260, 30, 30));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Rectangle 3.png"))); // NOI18N
        jLabel14.setText("jLabel13");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 490, 250, 30));

        tumbal_tr1.setFont(new java.awt.Font("Open Sans ExtraBold", 1, 12)); // NOI18N
        tumbal_tr1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tumbal_tr1.setText("jLabel12");
        getContentPane().add(tumbal_tr1, new org.netbeans.lib.awtextra.AbsoluteConstraints(715, 260, 100, 30));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Rectangle 3.png"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 260, 250, 30));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bckgrnd.png"))); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void st2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_st2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_st2ActionPerformed

    private void st4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_st4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_st4ActionPerformed

    private void rk2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rk2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rk2ActionPerformed

    private void st3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_st3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_st3ActionPerformed

    private void rk1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rk1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rk1ActionPerformed

    private void rk3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rk3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rk3ActionPerformed

    private void rk4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rk4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rk4ActionPerformed

    private void st1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_st1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_st1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
try {
            String sql = "update rekomendasi set Rekomendasi1=?, Rekomendasi2=?, Rekomendasi3=?, Rekomendasi4=?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, rk1.getText());
            stat.setString(2, rk2.getText());
            stat.setString(3, rk3.getText());
            stat.setString(4, rk4.getText());
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null,
                    "Data berhasil di ubah");
            UBAH_REKOM1();
            UBAH_REKOM2();
            UBAH_REKOM3();
            UBAH_REKOM4();
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null,
                    "Data gagal diubah" +e);
        }

// TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here
        try {
            String sql = "update trending set Sedang_Trending1=?,Sedang_Trending2=?, Sedang_Trending3=?, Sedang_Trending4=?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, st1.getText());
            stat.setString(2, st2.getText());
            stat.setString(3, st3.getText());
            stat.setString(4, st4.getText());
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null,
                    "Data berhasil di ubah");
            UBAH_tren1();
            UBAH_tren2();
            UBAH_tren3();
            UBAH_tren4();
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null,
                    "Data gagal diubah" +e);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
//        Rekomendasi();
//        UBAH_REKOM1();
//        
//        UBAH_REKOM2();
//        
//        UBAH_REKOM3();
//        
//        UBAH_REKOM4();
//        
//        update_rekomendasi1();
    }//GEN-LAST:event_jButton4MouseClicked

   
    
    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // TODO add your handling code here:
            //Trending();
//        UBAH_tren1();
//        UBAH_tren2();
//        UBAH_tren3();
//        UBAH_tren4();
    }//GEN-LAST:event_jButton5MouseClicked

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
            java.util.logging.Logger.getLogger(Trending_Rekomendasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Trending_Rekomendasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Trending_Rekomendasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Trending_Rekomendasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Trending_Rekomendasi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JLabel catatan_rekomendasi;
    private javax.swing.JLabel catatan_trending;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    public static javax.swing.JTextField rk1;
    public static javax.swing.JTextField rk2;
    public static javax.swing.JTextField rk3;
    public static javax.swing.JTextField rk4;
    public static javax.swing.JTextField st1;
    public static javax.swing.JTextField st2;
    public static javax.swing.JTextField st3;
    public static javax.swing.JTextField st4;
    private javax.swing.JLabel tumbal_tr;
    private javax.swing.JLabel tumbal_tr1;
    // End of variables declaration//GEN-END:variables
}
