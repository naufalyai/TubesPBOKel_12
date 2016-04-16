/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.List;
import java.awt.event.ActionListener;
import java.util.Date;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

/**
 *
 * @author rannypa
 */
public class MenuMahasiswa extends javax.swing.JFrame {

    /**
     * Creates new form MenuMahasiswa
     */
    public MenuMahasiswa() {
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

        buttonGroup3 = new javax.swing.ButtonGroup();
        TPMahasiswa = new javax.swing.JTabbedPane();
        PDaftar = new javax.swing.JPanel();
        DaftarLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        CBBulan = new javax.swing.JComboBox<>();
        RBLaki = new javax.swing.JRadioButton();
        RBPerempuan = new javax.swing.JRadioButton();
        CBTanggal = new javax.swing.JComboBox<>();
        CBTahun = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TFNamadpn = new javax.swing.JTextField();
        TFNamablk = new javax.swing.JTextField();
        TFTelepon = new javax.swing.JTextField();
        TFAlamat = new javax.swing.JTextField();
        TFipk = new javax.swing.JTextField();
        TFnim = new javax.swing.JTextField();
        BSimpan = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        PPilihLokasi = new javax.swing.JPanel();
        ListLokasi = new java.awt.List();
        BKembali1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        TFULokasi = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        PPilihKelompok = new javax.swing.JPanel();
        ListKelompok = new java.awt.List();
        jLabel8 = new javax.swing.JLabel();
        BKembali2 = new javax.swing.JButton();
        TFIDK = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        TFgetNIMMhs = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        PView = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        TFInsLokasi = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        TFInsKelompok = new javax.swing.JTextField();
        BCari = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TPMahasiswa.setBackground(new java.awt.Color(204, 204, 204));

        PDaftar.setBackground(new java.awt.Color(102, 102, 102));

        DaftarLabel.setFont(new java.awt.Font("Market Deco", 0, 11)); // NOI18N
        DaftarLabel.setForeground(new java.awt.Color(255, 255, 255));
        DaftarLabel.setText("Daftar Geladi");

        jLabel1.setText("Nama Depan");

        jLabel2.setText("Nama Belakang");

        jLabel3.setText("Jenis Kelamin");

        jLabel4.setText("Tanggal Lahir");

        CBBulan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember" }));
        CBBulan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBBulanActionPerformed(evt);
            }
        });

        buttonGroup3.add(RBLaki);
        RBLaki.setText("Laki-laki");

        buttonGroup3.add(RBPerempuan);
        RBPerempuan.setText("Perempuan");

        CBTanggal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        CBTanggal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBTanggalActionPerformed(evt);
            }
        });

        CBTahun.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001" }));

        jLabel5.setText("Nomor Telepon");

        jLabel6.setText("Alamat");

        jLabel7.setText("IPK");

        TFNamadpn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFNamadpnActionPerformed(evt);
            }
        });

        BSimpan.setText("Simpan");

        jLabel9.setText("NIM");

        javax.swing.GroupLayout PDaftarLayout = new javax.swing.GroupLayout(PDaftar);
        PDaftar.setLayout(PDaftarLayout);
        PDaftarLayout.setHorizontalGroup(
            PDaftarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PDaftarLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(PDaftarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PDaftarLayout.createSequentialGroup()
                        .addGroup(PDaftarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PDaftarLayout.createSequentialGroup()
                                .addGroup(PDaftarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(PDaftarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(TFNamadpn, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                    .addComponent(TFNamablk)))
                            .addGroup(PDaftarLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(CBTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CBBulan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CBTahun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PDaftarLayout.createSequentialGroup()
                                .addGroup(PDaftarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PDaftarLayout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addGroup(PDaftarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel9))
                                        .addGap(51, 51, 51))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PDaftarLayout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)))
                                .addGroup(PDaftarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PDaftarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(TFipk, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(TFAlamat)
                                        .addGroup(PDaftarLayout.createSequentialGroup()
                                            .addComponent(TFTelepon, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                                            .addGap(121, 121, 121)))
                                    .addGroup(PDaftarLayout.createSequentialGroup()
                                        .addComponent(TFnim, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                                        .addComponent(BSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PDaftarLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(DaftarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(359, 359, 359))
                    .addGroup(PDaftarLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(RBLaki)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RBPerempuan)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        PDaftarLayout.setVerticalGroup(
            PDaftarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PDaftarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DaftarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(PDaftarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(TFNamadpn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PDaftarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TFNamablk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PDaftarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(RBLaki)
                    .addComponent(RBPerempuan))
                .addGap(6, 6, 6)
                .addGroup(PDaftarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(CBTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBBulan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBTahun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PDaftarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFTelepon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PDaftarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(TFAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(PDaftarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PDaftarLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addContainerGap(24, Short.MAX_VALUE))
                    .addGroup(PDaftarLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(TFipk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(PDaftarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PDaftarLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFnim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PDaftarLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BSimpan)
                                .addGap(19, 19, 19))))))
        );

        TPMahasiswa.addTab("Daftar Geladi", PDaftar);

        PPilihLokasi.setBackground(new java.awt.Color(102, 102, 102));

        ListLokasi.setBackground(new java.awt.Color(204, 204, 204));
        ListLokasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListLokasiActionPerformed(evt);
            }
        });

        BKembali1.setText("Pilih");

        jLabel10.setText("Pilih Lokasi : ");

        jLabel15.setText("Masukkan Nama Lokasi");

        javax.swing.GroupLayout PPilihLokasiLayout = new javax.swing.GroupLayout(PPilihLokasi);
        PPilihLokasi.setLayout(PPilihLokasiLayout);
        PPilihLokasiLayout.setHorizontalGroup(
            PPilihLokasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PPilihLokasiLayout.createSequentialGroup()
                .addGroup(PPilihLokasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PPilihLokasiLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel10))
                    .addGroup(PPilihLokasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PPilihLokasiLayout.createSequentialGroup()
                            .addGap(70, 70, 70)
                            .addGroup(PPilihLokasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ListLokasi, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel15))
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PPilihLokasiLayout.createSequentialGroup()
                            .addContainerGap(70, Short.MAX_VALUE)
                            .addGroup(PPilihLokasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PPilihLokasiLayout.createSequentialGroup()
                                    .addComponent(TFULokasi, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(108, 108, 108))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PPilihLokasiLayout.createSequentialGroup()
                                    .addComponent(BKembali1)
                                    .addGap(18, 18, 18))))))
                .addGap(58, 58, 58))
        );
        PPilihLokasiLayout.setVerticalGroup(
            PPilihLokasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PPilihLokasiLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ListLokasi, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TFULokasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BKembali1)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        TPMahasiswa.addTab("Pilih Lokasi", PPilihLokasi);

        PPilihKelompok.setBackground(new java.awt.Color(102, 102, 102));

        ListKelompok.setBackground(new java.awt.Color(204, 204, 204));
        ListKelompok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListKelompokActionPerformed(evt);
            }
        });

        jLabel8.setText("Pilih Kelompok: ");

        BKembali2.setText("Pilih");

        TFIDK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFIDKActionPerformed(evt);
            }
        });

        jLabel14.setText("Masukkan ID Kelompok");

        TFgetNIMMhs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFgetNIMMhsActionPerformed(evt);
            }
        });

        jLabel16.setText("Masukkan NIM");

        javax.swing.GroupLayout PPilihKelompokLayout = new javax.swing.GroupLayout(PPilihKelompok);
        PPilihKelompok.setLayout(PPilihKelompokLayout);
        PPilihKelompokLayout.setHorizontalGroup(
            PPilihKelompokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PPilihKelompokLayout.createSequentialGroup()
                .addGroup(PPilihKelompokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PPilihKelompokLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel8))
                    .addGroup(PPilihKelompokLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(PPilihKelompokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addGroup(PPilihKelompokLayout.createSequentialGroup()
                                .addGroup(PPilihKelompokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(TFgetNIMMhs, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                                    .addComponent(TFIDK, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(93, 93, 93)
                                .addComponent(BKembali2))
                            .addComponent(jLabel16)
                            .addComponent(ListKelompok, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        PPilihKelompokLayout.setVerticalGroup(
            PPilihKelompokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PPilihKelompokLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ListKelompok, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TFIDK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel16)
                .addGap(2, 2, 2)
                .addGroup(PPilihKelompokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFgetNIMMhs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BKembali2))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        TPMahasiswa.addTab("Pilih Kelompok", PPilihKelompok);

        PView.setBackground(new java.awt.Color(102, 102, 102));

        jLabel11.setText("Masukan Lokasi      : ");

        jLabel12.setText("LIHAT KELOMPOK DAN LOKASI");

        jLabel13.setText("Masukan Kelompok : ");

        BCari.setText("Cari");

        javax.swing.GroupLayout PViewLayout = new javax.swing.GroupLayout(PView);
        PView.setLayout(PViewLayout);
        PViewLayout.setHorizontalGroup(
            PViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PViewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PViewLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(PViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(PViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PViewLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(TFInsLokasi, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(TFInsKelompok))
                .addGap(171, 171, 171))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PViewLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BCari)
                .addGap(72, 72, 72))
        );
        PViewLayout.setVerticalGroup(
            PViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PViewLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel12)
                .addGap(23, 23, 23)
                .addGroup(PViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(TFInsLokasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(TFInsKelompok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(BCari)
                .addContainerGap(177, Short.MAX_VALUE))
        );

        TPMahasiswa.addTab("Lihat Kelompok dan Lokasi", PView);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TPMahasiswa)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TPMahasiswa)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CBBulanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBBulanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBBulanActionPerformed

    private void CBTanggalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBTanggalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBTanggalActionPerformed

    private void TFNamadpnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFNamadpnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFNamadpnActionPerformed

    private void TFIDKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFIDKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFIDKActionPerformed

    private void ListLokasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListLokasiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ListLokasiActionPerformed

    private void TFgetNIMMhsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFgetNIMMhsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFgetNIMMhsActionPerformed

    private void ListKelompokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListKelompokActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ListKelompokActionPerformed

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
            java.util.logging.Logger.getLogger(MenuMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuMahasiswa().setVisible(true);
            }
        });
    }
    public void addlistener(ActionListener a){
        BSimpan.addActionListener(a);
        BCari.addActionListener(a);
        BKembali1.addActionListener(a);
        BKembali2.addActionListener(a);
    }

    public JButton getBSimpan() {
        return BSimpan;
    }

    public JTextField getTFNamadpn() {
        return TFNamadpn;
    }

    public JTextField getTFNamablk() {
        return TFNamablk;
    }

    public JButton getBCari() {
        return BCari;
    }

    public JButton getBKembali1() {
        return BKembali1;
    }

    public JButton getBKembali2() {
        return BKembali2;
    }

    public JComboBox<String> getCBBulan() {
        return CBBulan;
    }

    public JComboBox<String> getCBTahun() {
        return CBTahun;
    }

    public JComboBox<String> getCBTanggal() {
        return CBTanggal;
    }

    public JLabel getDaftarLabel() {
        return DaftarLabel;
    }

    public List getListKelompok() {
        return ListKelompok;
    }

    public List getListLokasi() {
        return ListLokasi;
    }

    public JPanel getPDaftar() {
        return PDaftar;
    }

    public JPanel getPPilihKelompok() {
        return PPilihKelompok;
    }

    public JPanel getPPilihLokasi() {
        return PPilihLokasi;
    }

    public JPanel getPView() {
        return PView;
    }

    public JRadioButton getRBLaki() {
        return RBLaki;
    }

    public JRadioButton getRBPerempuan() {
        return RBPerempuan;
    }

    public JTextField getTFAlamat() {
        return TFAlamat;
    }

    public JTextField getTFInsKelompok() {
        return TFInsKelompok;
    }

    public JTextField getTFInsLokasi() {
        return TFInsLokasi;
    }

    public JTextField getTFTelepon() {
        return TFTelepon;
    }

    public JTextField getTFipk() {
        return TFipk;
    }

    public JTextField getTFnim() {
        return TFnim;
    }

    public JTabbedPane getTPMahasiswa() {
        return TPMahasiswa;
    }

    public ButtonGroup getButtonGroup3() {
        return buttonGroup3;
    }

    public JTextField getTFIDK() {
        return TFIDK;
    }

    public JTextField getTFULokasi() {
        return TFULokasi;
    }

    public JTextField getTFgetNIMMhs() {
        return TFgetNIMMhs;
    }
    
    public void rDaftarGeladi(){
        TFNamadpn.setText("");
        TFNamablk.setText("");
        TFAlamat.setText("");
        TFTelepon.setText("");
        TFipk.setText("");
        TFnim.setText("");
    }
    /*public String convertTanggal(JComboBox<String> n){
        if (n.getSelectedItem()=="1"){
            return "01";
        } else if(n.getSelectedItem().toString()=="2"){
            return "02";
        } else if(n.getSelectedItem().toString()=="3"){
            return "03";
        } else if(n.getSelectedItem().toString()=="4"){
            return "04";
        } else if(n.getSelectedItem().toString()=="5"){
            return "05";
        } else if(n.getSelectedItem().toString()=="6"){
            return "06";
        } else if(n.getSelectedItem().toString()=="7"){
            return "07";
        } else if (n.getSelectedItem().toString()=="8"){
            return "08";
        } else if (n.getSelectedItem().toString()=="9"){
            return "09";
        } else {
            return n.getSelectedItem().toString();
        }
    }
    public String convertBulan(JComboBox<String> x){
        String s = null;
        if (x.getSelectedItem().toString() == "Januari"){
             s="01";
        } else if(x.getSelectedItem().toString()=="Februari"){
            s="02";
        } else if(x.getSelectedItem().toString() == "Maret"){
            s="03";
        } else if (x.getSelectedItem().toString() == "April"){
            s="04";
        } else if (x.getSelectedItem().toString() == "Mei"){
            s="05";
        } else if (x.getSelectedItem().toString() == "Juni"){
            s="06";
        } else if (x.getSelectedItem().toString() == "Juli"){
            s="07";
        } else if (x.getSelectedItem().toString() == "Agustus"){
            s="08";
        } else if (x.getSelectedItem().toString() == "September"){
            s="09";
        } else if (x.getSelectedItem().toString()=="Oktober"){
            s="10";
        } else if (x.getSelectedItem().toString() == "November"){
            s="11";
        } else {
            s="12";
        }
        return s;
    }*/
    public Date getBirth(){
        Date b = new Date();
        b.setDate(CBTanggal.getSelectedIndex()+1);
        b.setMonth(CBBulan.getSelectedIndex()+1);
        b.setYear(CBTahun.getSelectedIndex()+1989);
        return b;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BCari;
    private javax.swing.JButton BKembali1;
    private javax.swing.JButton BKembali2;
    private javax.swing.JButton BSimpan;
    private javax.swing.JComboBox<String> CBBulan;
    private javax.swing.JComboBox<String> CBTahun;
    private javax.swing.JComboBox<String> CBTanggal;
    private javax.swing.JLabel DaftarLabel;
    private java.awt.List ListKelompok;
    private java.awt.List ListLokasi;
    private javax.swing.JPanel PDaftar;
    private javax.swing.JPanel PPilihKelompok;
    private javax.swing.JPanel PPilihLokasi;
    private javax.swing.JPanel PView;
    private javax.swing.JRadioButton RBLaki;
    private javax.swing.JRadioButton RBPerempuan;
    private javax.swing.JTextField TFAlamat;
    private javax.swing.JTextField TFIDK;
    private javax.swing.JTextField TFInsKelompok;
    private javax.swing.JTextField TFInsLokasi;
    private javax.swing.JTextField TFNamablk;
    private javax.swing.JTextField TFNamadpn;
    private javax.swing.JTextField TFTelepon;
    private javax.swing.JTextField TFULokasi;
    private javax.swing.JTextField TFgetNIMMhs;
    private javax.swing.JTextField TFipk;
    private javax.swing.JTextField TFnim;
    private javax.swing.JTabbedPane TPMahasiswa;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
